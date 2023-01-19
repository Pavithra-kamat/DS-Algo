package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ConfigReader;

public class QueuePage {
	
	private WebDriver driver;
	ConfigReader configReader;
	
	public QueuePage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By getStart=By.xpath("//a[@href='queue']");
	private By imp_que_pyth=By.xpath("//a[@href='implementation-lists']");
	private By imp_using_coll=By.xpath("//a[@href='implementation-collections']");
	private By imp_using_array=By.xpath("//a[@href='Implementation-array']");
	private By que_op=By.xpath("//a[@href='QueueOp']");
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
	
	public void clickImpQueInPython() {
		driver.findElement(imp_que_pyth).click();
		configReader.getImplicitlyWait();
	}
	
	public void clickImpCollection() {
		driver.findElement(imp_using_coll).click();
		configReader.getImplicitlyWait();
	}
	public void clickImpArray() {
		driver.findElement(imp_using_array).click();
		configReader.getImplicitlyWait();
	}
	public void clickQueOps() {
		driver.findElement(que_op).click();
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
	
	public void navigateToQueuePage() {
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
	
	public void clickRunButton() {
		driver.findElement(runButton).click();
		configReader.getImplicitlyWait();
	}

}
