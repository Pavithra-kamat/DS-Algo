package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.QueuePage;
import util.ConfigReader;

public class QueueStep {
	
	QueuePage qp=new QueuePage(DriverFactory.getDriver());
	ConfigReader configReader;
	
	
	@Given("The user successfully logins to home page")
	public void the_user_successfully_logins_to_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		qp.signInpPageLogin();
	    
	}

	@Given("The user clicks on Getstarted")
	public void the_user_clicks_on_getstarted() {
		qp.getStartedButton();
	   
	}

	@When("The user tests the functionality of Implementation of Queue in Python module")
	public void the_user_tests_the_functionality_of_implementation_of_queue_in_python_module() {
		qp.clickImpQueInPython();
		qp.scrollDown();
		qp.clickTryHere();
		qp.sendTextInEditor();
		qp.clickRunButton();
		qp.navigateToQueuePage();
	    
	}

	@When("The user tests the functionality of Implementation of collections.deque")
	public void the_user_tests_the_functionality_of_implementation_of_collections_deque() {
		qp.clickImpCollection();
		qp.scrollDown();
		qp.clickTryHere();
		qp.sendTextInEditor();
		qp.clickRunButton();
		qp.navigateToQueuePage();
	    
	}

	@When("The user tests the functionality of Implementation using Array")
	public void the_user_tests_the_functionality_of_implementation_using_array() {
		qp.clickImpArray();
		qp.scrollDown();
		qp.clickTryHere();
		qp.sendTextInEditor();
		qp.clickRunButton();
		qp.navigateToQueuePage();
	    
	}

	@When("The user tests the functionality of Queue Operations")
	public void the_user_tests_the_functionality_of_queue_operations() {
		qp.clickQueOps();
		qp.scrollDown();
		qp.clickTryHere();
		qp.sendTextInEditor();
		qp.clickRunButton();
		qp.navigateToQueuePage();
	    
	}

	@Then("The user navigates back-Home Page")
	public void the_user_navigates_back_home_page() {
		qp.navigateToHomePage();
	    
	}

}
