package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.LinkedListPage;

public class LinkedListStep {
	
	private LinkedListPage lp=new LinkedListPage(DriverFactory.getDriver());
	
	@Given("The user logins to home page successfully")
	public void the_user_logins_to_home_page_successfully() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		lp.signInpPageLogin();	    
	}

	@Given("The user clicks-Getstarted")
	public void the_user_clicks_getstarted() {
		lp.getStartedButton();	    
	}

	@When("The user tests Introduction link")
	public void the_user_tests_introduction_link() {
		lp.clickIntroduction();
		lp.scrollDown();
		lp.clickTryHere();
		lp.sendTextInEditor();
		lp.clickRunButton();
		lp.navigateToLinkedListPage();	    
	}

	@When("The user tests the functionality of Creating Linked Lists")
	public void the_user_tests_the_functionality_of_creating_linked_lists() {
		lp.clickCreateLL();
		lp.scrollDown();
		lp.clickTryHere();
		lp.sendTextInEditor();
		lp.clickRunButton();
		lp.navigateToLinkedListPage();	    
	}

	@When("The user tests Types of Linked list")
	public void the_user_tests_types_of_linked_list() {
		lp.clickTypesOfLL();
		lp.scrollDown();
		lp.clickTryHere();
		lp.sendTextInEditor();
		lp.clickRunButton();
		lp.navigateToLinkedListPage();	    
	}

	@When("The user tests Implement Linked List in Python")
	public void the_user_tests_implement_linked_list_in_python() {
		lp.clickImpLLPyth();
		lp.scrollDown();
		lp.clickTryHere();
		lp.sendTextInEditor();
		lp.clickRunButton();
		lp.navigateToLinkedListPage();	   
	}

	@When("The user tests the functionality of Traversal")
	public void the_user_tests_the_functionality_of_traversal() {
	   lp.clickTraversal();
	   lp.scrollDown();
	   lp.clickTryHere();
	   lp.sendTextInEditor();
	   lp.clickRunButton();
	   lp.navigateToLinkedListPage();
	}

	@When("The user tests the functionality of insertion")
	public void the_user_tests_the_functionality_of_insertion() {
	   lp.clickInsertion();
	   lp.scrollDown();
	   lp.clickTryHere();
	   lp.sendTextInEditor();
	   lp.clickRunButton();
	   lp.navigateToLinkedListPage();
	}

	@When("The user tests the functionality of Deletion")
	public void the_user_tests_the_functionality_of_deletion() {
	    lp.clickDeletion();
	    lp.scrollDown();
		lp.clickTryHere();
		lp.sendTextInEditor();
		lp.clickRunButton();
		lp.navigateToLinkedListPage();
	}

	@Then("The user navigates to Home Page")
	public void the_user_navigates_to_home_page() {
		lp.navigateToHomePage();
	    
	}

}
