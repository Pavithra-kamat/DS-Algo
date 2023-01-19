package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	private WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By username = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@type='submit']");
	
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pword) {
		driver.findElement(password).sendKeys(pword);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}

}
