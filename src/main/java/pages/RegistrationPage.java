package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}

	private By uName= By.xpath("//input[@name='username']");
	private By password= By.xpath("//input[@name='password1']");
	private By confPassword= By.xpath("//input[@name='password2']");
	private By regButton= By.xpath("//input[@type='submit']");
	private By passMismatch= By.xpath("//div[@class='alert alert-primary']");
	private By accountCreatedAlert= By.xpath("//div[@class='alert alert-primary']");
	private By signOutLink=By.xpath("//a[@href='/logout']");
	
	public String getPageTitle()
	{
		return driver.getTitle().toString();
	}
	public void enterRegisterationData(String uname,String pass,String confpass) {
		driver.findElement(uName).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(confPassword).sendKeys(confpass);
	}
	public void clickRegister() {
		driver.findElement(regButton).click();
	}
	public String getAlertMsg() {
		return driver.findElement(passMismatch).getText();
	}
	public String getSuccessMsg() {
		return driver.findElement(accountCreatedAlert).getText();
	}
	public void clickSignout() {
		driver.findElement(signOutLink).click();
	}

}
