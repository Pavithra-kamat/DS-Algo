package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.StackPage;

public class StackStep {
	
	private StackPage sp=new StackPage(DriverFactory.getDriver());
	
	@Given("The user successfully logins into home page")
	public void the_user_successfully_logins_into_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		sp.signInpPageLogin();
	}

	@Given("The user clicks on GetStarted")
	public void the_user_clicks_on_get_started() {
		sp.getStartedButton();
    
	}

	@When("The user tests the functionality of the Operations in Stack")
	public void the_user_tests_the_functionality_of_the_operations_in_stack() {
		sp.clickOperationsInStack();
		sp.scrollDown();
		sp.clickTryHere();
		sp.sendTextInEditor();
		sp.clickRunButton();
		sp.navigateToStackPage();
    
	}

	@When("The user tests the functionality of Implementation")
	public void the_user_tests_the_functionality_of_implementation() {
		sp.clickImplementation();
		sp.scrollDown();
		sp.clickTryHere();
		sp.sendTextInEditor();
		sp.clickRunButton();
		sp.navigateToStackPage();
    
	}

	@When("The user tests the functionality of Applications")
	public void the_user_tests_the_functionality_of_applications() {
		sp.clickApplications();
		sp.scrollDown();
		sp.clickTryHere();
		sp.sendTextInEditor();
		sp.clickRunButton();
		sp.navigateToStackPage();
    
	}

	@Then("The user navigates back to Home Page")
	public void the_user_navigates_back_to_home_page() {
		sp.navigateToHomePage();
	}

}
