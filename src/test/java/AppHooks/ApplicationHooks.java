package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.ConfigReader;

//this is a base test class using annotations
//preconditions to enter the url and launch the browser will be handled in this class
public class ApplicationHooks {
	//private because these are specific to application hooks only
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	//gives access via public wrappers 
	//browser provided by config.properties file
	@Before(order=0)
	public void getProperty() {
		configReader =new ConfigReader();
		prop=configReader.init_prop();		
	}
	@Before(order=1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverfactory =new DriverFactory();
		driver = driverfactory.init_driver(browserName);
	}
	//to close the browser after every scenario
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	//incase any scenario fails, this method is used to take the screenshot
	@After(order=1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			//take screenshot by converting the driver to take screenshot interface
			String screenshotName =scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}
