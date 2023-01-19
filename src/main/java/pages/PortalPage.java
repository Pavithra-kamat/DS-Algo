package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalPage {
	
	private WebDriver driver;
	
	//1.By locators
	private By getStart=By.xpath("//button[@class=\"btn\"]");
	
	//2.Constructor of page class
	public PortalPage(WebDriver driver) {
	  this.driver =driver; 
	}
	
	//3.page actions
	 public void getStarted() {
	      driver.findElement(getStart).click();
	 }
	public String getHomeTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	 }
	}
			

