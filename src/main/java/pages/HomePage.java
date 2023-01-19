package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	 public HomePage(WebDriver driver) {
		this.driver =driver;
	}
	
	private By ds=By.xpath("//a[@data-toggle='dropdown']");
	private By panes=By.xpath("//div[@class='col']");
	private By getStartedButton=By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	private By alert=By.xpath("//div[@role='alert']");
	private By dropElements=By.xpath("//a[@class='nav-link dropdown-toggle']");
	//private By dropElements=By.xpath("//a[@class='dropdown-item']");
	private By register=By.xpath("//a[@href='/register']");
	private By signIn=By.xpath("//a[@href='/login']");
	
	@SuppressWarnings("unused")
	private String getHomePageTitle() {
		return driver.getTitle();
	}
	public  void clickDS() {
		driver.findElement(ds).click();	
	}
	 public  int paneSize() {
		 int paneCount=driver.findElements(panes).size();
		 return paneCount;
	 }
	public  void clickGetStartedButton() {
		driver.findElement(getStartedButton).click();
	}
	public  void clickDropElements() {
		driver.findElement(dropElements).click();
	}
	public  void displayAlert() {
		String alertMessage=driver.findElement(alert).getText();
		System.out.println(alertMessage);
	}
	public void clickregister() {
		driver.findElement(register).click();
	}
	 
	public void navigateToRegisterPage() {
		driver.get("https://dsportalapp.herokuapp.com/register");
	}
	
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}
	public void navigateToSignInPage() {
		driver.get("https://dsportalapp.herokuapp.com/login");
	}
	
	public void goToPreviousPage() {
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.history.go(-1)");
	}
}
