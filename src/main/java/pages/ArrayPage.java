package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ConfigReader;

public class ArrayPage {
	private WebDriver driver;
	ConfigReader configReader;

	private By getStart = By.xpath("//a[@href='array']");
	private By arrayInPython = By.xpath("//a[@href='arrays-using-list']");
	private By arrayUsingList = By.xpath("//a[@href='arrays-using-list']");
	private By basicOperationList = By.xpath("//a[@href='basic-operations-in-lists']");
	private By applicationOfArray = By.xpath("//a[@href='applications-of-array']");
	private By practiceQuestion = By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	private By question1 = By.xpath("(//a[@class='list-group-item'])[1]");
	private By clickSubmit = By.xpath("//input[@type='submit']");
	private By question2 = By.xpath("(//a[@class='list-group-item'])[2]");
	private By question3 = By.xpath("(//a[@class='list-group-item'])[3]");
	private By question4 = By.xpath("(//a[@class='list-group-item'])[4]");
	private By tryHere = By.xpath("//a[@href='/tryEditor']");
	private By runButton = By.xpath("//button[@type='button']");

	private By username = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By login = By.xpath("//input[@type='submit']");

	public ArrayPage(WebDriver driver) {
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

	public void navigateToArrayPage() {
		driver.navigate().back();
		configReader.getImplicitlyWait();
		driver.navigate().back();
		configReader.getImplicitlyWait();
	}

	public void navigateToQuestionPage() {
		driver.navigate().back();
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

	public void clickArrayInPython() {
		driver.findElement(arrayInPython).click();
	}

	public void clickArrayUsingList() {
		driver.findElement(arrayUsingList).click();
	}

	public void clickBasicOperationInList() {
		driver.findElement(basicOperationList).click();
	}

	public void clickApplicationOfArray() {
		driver.findElement(applicationOfArray).click();
	}

	public void clickPracticeQuestion() {
		driver.findElement(practiceQuestion).click();
	}

	public void clickQuestionOne() {
		driver.findElement(question1).click();
	}

	public void clickQuestionTwo() {
		driver.findElement(question2).click();
	}

	public void clickQuestionThree() {
		driver.findElement(question3).click();
	}

	public void clickQuestionFour() {
		driver.findElement(question4).click();
	}

	public void clickSubmit() {
		driver.findElement(clickSubmit).click();
	}

	public void clickQuestions() throws InterruptedException {
		clickPracticeQuestion();
		for (int i = 1; i <= 4; i++) {
			switch (i) {
			case 1:
				clickQuestionOne();
				clickRunButton();
				Thread.sleep(1000);
				ClickAlert();
				clickSubmit();
				Thread.sleep(1000);
				navigateToQuestionPage();
				Thread.sleep(1000);
				break;
			case 2:
				clickQuestionTwo();
				clickRunButton();
				Thread.sleep(1000);
				ClickAlert();
				clickSubmit();
				Thread.sleep(1000);
				navigateToQuestionPage();
				Thread.sleep(1000);
				break;
			case 3:
				clickQuestionThree();
				clickRunButton();
				Thread.sleep(1000);
				ClickAlert();
				clickSubmit();
				Thread.sleep(1000);
				navigateToQuestionPage();
				Thread.sleep(1000);
				break;
			case 4:
				clickQuestionFour();
				clickRunButton();
				Thread.sleep(1000);
				ClickAlert();
				clickSubmit();
				Thread.sleep(1000);
				navigateToQuestionPage();
				Thread.sleep(1000);
				break;
			}
		}
	}

	public void ClickAlert() {
		driver.switchTo().alert().accept();
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
