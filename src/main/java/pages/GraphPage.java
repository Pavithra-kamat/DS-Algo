package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ConfigReader;

public class GraphPage {
	private WebDriver driver;
	ConfigReader configReader;
	//private Properties prop;

	private By getStart = By.xpath("//a[@href='graph']");
	private By graph = By.xpath("//a[@href='graph']");
    private By tryHere = By.xpath("//a[@href='/tryEditor']");
    private By runButton = By.xpath("//button[@type='button']");
    private By graphRep = By.xpath("//a[@href='graph-representations']"); 
   
    
    private By username = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@type='submit']");

	public GraphPage(WebDriver driver) {
		this.driver = driver;
	}
    
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
	
	public void clickGraph() {
		driver.findElement(graph).click();
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
	}

	public void clickRunButtn() {
		driver.findElement(runButton).click();
		configReader.getImplicitlyWait();
	}

	public void navigatetoGraphPage() {
		
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
	}
	
	public void clickGraphRepresentation() {
		driver.findElement(graphRep).click();
		configReader.getImplicitlyWait();
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		configReader.getImplicitlyWait();
	}
public void navigatetoHomPage() {
		
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
	}
	
	
}
