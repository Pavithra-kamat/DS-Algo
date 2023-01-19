package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	
	//helpful for parallel browser testing
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	
	//this method is used to initialize the threadlocal driver based on the browser instance - returns tldriver
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("The browser is: "+browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please pass the correct browser value"+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();	
		
	}
	//if 5 browsers are running, they all call tldriver, so they should in sync, hence keyword synchronization
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
		
	}
}
