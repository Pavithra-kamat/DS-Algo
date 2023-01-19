	package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageold {
private WebDriver driver;
	
	public RegistrationPageold(WebDriver driver) {
		this.driver=driver;
	}

	private By uName= By.xpath("//input[@name='username']");
	private By pWord1= By.xpath("//input[@name='password1']");
	private By pWord2= By.xpath("//input[@name='password2']");
	private By regButton= By.xpath("//input[@type='submit']");
	private By passMismatch= By.xpath("//div[@class='alert alert-primary']");
	private By accountCreatedAlert= By.xpath("//div[@class='alert alert-primary']");
	
	
	public void userName(String name) {
		driver.findElement(uName).sendKeys(name);
	}
	public void password1(String pass1) {
		driver.findElement(pWord1).sendKeys(pass1);
	}
	public void password2(String pass2) {
		driver.findElement(pWord2).sendKeys(pass2);
	}
	public void registerButton() {
		driver.findElement(regButton).click();
	}
	public String missmatchAlert() {
	   String alert= driver.findElement(passMismatch).getText();
		return alert;
	}
	public String newAccountAlert() {
		String logAlert=driver.findElement(accountCreatedAlert).getText();
		return logAlert;
	}
}
