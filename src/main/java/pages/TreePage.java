package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ConfigReader;

public class TreePage {
	private WebDriver driver;
	ConfigReader configReader;

	private By getStart = By.xpath("//a[@href='tree']");
	private By overviewOfTrees = By.xpath("//a[@href='overview-of-trees']");
	private By terminologies = By.xpath("//a[@href='terminologies']");
	private By typesOfTrees=By.xpath("//a[@href='types-of-trees']");
	private By treeTraversals = By.xpath("//a[@href='tree-traversals']");
	private By traversals = By.xpath("//a[@href='traversals-illustration']");
	private By binaryTrees = By.xpath("//a[@href='binary-trees']");
	private By typesOfBinaryTrees = By.xpath("//a[@href='types-of-binary-trees']");
	private By implementation = By.xpath("//a[@href='implementation-in-python']");
	private By binaryTreeTraversals = By.xpath("//a[@href='binary-tree-traversals']");
	private By applOfBinaryTrees = By.xpath("//a[@href='applications-of-binary-trees']");
	private By binarySerachTrees = By.xpath("//a[@href='binary-search-trees']");
	private By implementationOfBinaryTrees=By.xpath("//a[@href='implementation-of-binary-trees']");
	private By impOfBst = By.xpath("//a[@href='implementation-of-bst']");
	private By tryHere = By.xpath("//a[@href='/tryEditor']");
	private By runButton = By.xpath("//button[@type='button']");

	private By username = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@type='submit']");

	public TreePage(WebDriver driver) {
		this.driver = driver;
	}

	public void signInpPageLogin() {
		configReader = new ConfigReader();
		configReader.init_prop();
		driver.findElement(username).sendKeys(configReader.uName());
		driver.findElement(password).sendKeys(configReader.pWord());
		driver.findElement(login).click();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		configReader.getImplicitlyWait();
	}

	public void getStartedButton() {
		driver.findElement(getStart).click();
	}

	public void clickRunButton() {
		driver.findElement(runButton).click();
	}

	public void clickTryHere() {
		driver.findElement(tryHere).click();
	}
	public void navigateToHomePage() {
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
	}
	public void navigateToTreePage() {
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
	}
	public void clickApplOfBinaryTrees() {
		driver.findElement(applOfBinaryTrees).click();
	}
	public void clickTypesOfTrees() {
		driver.findElement(typesOfTrees).click();
	}
	public void clickBinarySerachTrees() {
		driver.findElement(binarySerachTrees).click();
	}
	public void clickBinaryTrees() {
		driver.findElement(binaryTrees).click();
	}
	public void clickTypesOfBinaryTrees() {
		driver.findElement(typesOfBinaryTrees).click();
	}
	public void clickBinaryTreeTraversals() {
		driver.findElement(binaryTreeTraversals).click();
	}
	public void clickImplementation() {
		driver.findElement(implementation).click();
	}
	public void clickImplementationOfBinaryTrees() {
		driver.findElement(implementationOfBinaryTrees).click();
	}
	public void clickImpOfBst() {
		driver.findElement(impOfBst).click();
	}
	public void clickOverviewOfTrees() {
		driver.findElement(overviewOfTrees).click();
	}
	public void clickterminologies() {
		driver.findElement(terminologies).click();
	}
	public void clickTraversals() {
		driver.findElement(traversals).click();
	}
	public void clickTreeTraversals() {
		driver.findElement(treeTraversals).click();
	}
	public void sendTextInEditor() {
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print(\'Hello World\')");
		configReader.getImplicitlyWait();
	}
}
