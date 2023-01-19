package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ConfigReader;

public class StackPage {
	
	private WebDriver driver;
	ConfigReader configReader;
	
	public StackPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By getStart=By.xpath("//a[@href='stack']");
	private By opInStack=By.xpath("//a[@href='operations-in-stack']");
	private By implementation=By.xpath("//a[@href='implementation']");
	private By application=By.xpath("//a[@href='stack-applications']");
	private By tryHere=By.xpath("//a[@href='/tryEditor']");
	private By runButton=By.xpath("//button[@type='button']");
	
	private By username = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@type='submit']");
	
	public void signInpPageLogin() {
		configReader = new ConfigReader();
		configReader.init_prop();
		driver.findElement(username).sendKeys(configReader.uName());
		driver.findElement(password).sendKeys(configReader.pWord());
		driver.findElement(login).click();
	}
	
	public void getStartedButton() {
		driver.findElement(getStart).click();
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		configReader.getImplicitlyWait();
	}
	
	public void clickOperationsInStack() {
		driver.findElement(opInStack).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickTryHere() {
		driver.findElement(tryHere).click();
	}
	
	public void sendTextInEditor() {
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print(\'Hello World\')");
		configReader.getImplicitlyWait();
	}
	
	public void navigateToStackPage() {
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
	}
	
	public void clickImplementation() {
		driver.findElement(implementation).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickApplications() {
		driver.findElement(application).click();
		configReader.getImplicitlyWait();
	}
	public void navigateToHomePage() {
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
	}
	
	public void clickRunButton() {
		driver.findElement(runButton).click();
	}
}
