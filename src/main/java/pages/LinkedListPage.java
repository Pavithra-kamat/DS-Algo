package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ConfigReader;

public class LinkedListPage {
	
	private WebDriver driver;
	ConfigReader configReader;
	
	public LinkedListPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By getStart=By.xpath("//a[@href='linked-list']");
	private By introduction=By.xpath("//a[@href='introduction']");
	private By createLL=By.xpath("//a[@href='creating-linked-list']");
	private By typesOfLL=By.xpath("//a[@href='types-of-linked-list']");
	private By impLLPyt=By.xpath("//a[@href='implement-linked-list-in-python']");
	private By traversal=By.xpath("//a[@href='traversal']");
	private By insertion=By.xpath("//a[@href='insertion-in-linked-list']");
	private By deletion=By.xpath("//a[@href='deletion-in-linked-list']");
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
		configReader.getImplicitlyWait();
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		configReader.getImplicitlyWait();
	}
	
	public void clickIntroduction() {
		driver.findElement(introduction).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickCreateLL() {
		driver.findElement(createLL).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickTypesOfLL() {
		driver.findElement(typesOfLL).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickImpLLPyth() {
		driver.findElement(impLLPyt).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickTraversal() {
		driver.findElement(traversal).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickInsertion() {
		driver.findElement(insertion).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickDeletion() {
		driver.findElement(deletion).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickTryHere() {
		driver.findElement(tryHere).click();
		configReader.getImplicitlyWait();
	}
	
	public void sendTextInEditor() {
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print(\'Hello World\')");
		configReader.getImplicitlyWait();
	}
	
	public void clickRunButton() {
		driver.findElement(runButton).click();
		configReader.getImplicitlyWait();
	}
	
	public void navigateToLinkedListPage() {
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
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
}
