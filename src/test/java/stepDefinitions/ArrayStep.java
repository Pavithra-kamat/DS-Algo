package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.ArrayPage;

public class ArrayStep {
	private ArrayPage ap=new ArrayPage(DriverFactory.getDriver());
	
	@Given("The User Successfully logins into home page")
	public void the_user_successfully_logins_into_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		ap.signInpPageLogin();
	}

	@Given("The User clicks on GetStarted")
	public void the_user_clicks_on_get_started() {
		ap.getStartedButton();
	}

	@Then("The user tests the functionality of Arrays in Python")
	public void the_user_tests_the_functionality_of_arrays_in_python() throws InterruptedException {
		ap.clickArrayInPython();
		ap.scrollDown();
		ap.clickTryHere();
		ap.sendTextInEditor();
		Thread.sleep(3000);
		ap.clickRunButton();
		Thread.sleep(3000);
		ap.navigateToArrayPage();

	}

	@Then("The user tests the functionality of Arrays using List")
	public void the_user_tests_the_functionality_of_arrays_using_list() throws InterruptedException {
		ap.clickArrayUsingList();
		ap.scrollDown();
		ap.clickTryHere();
		ap.sendTextInEditor();
		Thread.sleep(2000);
		ap.clickRunButton();
		Thread.sleep(2000);
		ap.navigateToArrayPage();
		Thread.sleep(2000);
	}

	@Then("The user tests the functionality of Basic operations in Lists")
	public void the_user_tests_the_functionality_of_basic_operations_in_lists() throws InterruptedException {
		ap.clickBasicOperationInList();
		ap.scrollDown();
		ap.clickTryHere();
		ap.sendTextInEditor();
		ap.clickRunButton();
		Thread.sleep(1000);
		ap.navigateToArrayPage();
		Thread.sleep(1000);
	}

	@Then("The user tests the functionality of Applications of Array")
	public void the_user_tests_the_functionality_of_applications_of_array() throws InterruptedException {
		ap.clickApplicationOfArray();
		ap.scrollDown();
		ap.clickTryHere();
		ap.sendTextInEditor();
		ap.clickRunButton();
		Thread.sleep(2000);
		ap.navigateToQuestionPage();
		Thread.sleep(3000);

	}

	@Then("The user tests the functionality of Practice Questions")
	public void the_user_tests_the_functionality_of_practice_questions() throws InterruptedException {
		ap.clickQuestions();
	}

	@Then("The User navigates back to Home Page")
	public void the_user_navigates_back_to_home_page() throws InterruptedException {
		ap.navigateToHomePage();
		Thread.sleep(3000);
	}

}
