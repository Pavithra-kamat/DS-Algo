package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ConfigReader;

public class DataStructurePage {
	private WebDriver driver;
	ConfigReader configReader;

	private By getStart = By.xpath("//a[@href='data-structures-introduction']");
	private By timeComp = By.xpath("//a[@href='time-complexity']");
	private By tryHere = By.xpath("//a[@href='/tryEditor']");
	// private By editor=By.xpath("//div[@class='CodeMirror-lines']");
	// private By editor = By.cssSelector("//div[class='CodeMirror']");
	private By runButton = By.xpath("//button[@type='button']");

	private By username = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@type='submit']");

	public DataStructurePage(WebDriver driver) {
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
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void clickTimeComplexity() {
		driver.findElement(timeComp).click();
	}

	public void clickTryHere() {
		driver.findElement(tryHere).click();
	}

	public void sendTextInEditor() {
		// var editor = CodeMirror.fromTextArea(document.getElementById("editor")
		// driver.findElement(editor).sendKeys("print(\"Hello World!\")");
		/* getting codemirror element */
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));

		/*
		 * getting the first line of code inside codemirror and clicking it to bring it
		 * in focus
		 */
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();

		/* sending keystokes to textarea once codemirror is in focus */
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print(\'Hello World\')");
	}

	public void clickRunButton() {
		driver.findElement(runButton).click();
	}

	public void navigatetoHomePage() {
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.history.go(-3)");
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
	}
}
