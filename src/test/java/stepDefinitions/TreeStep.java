package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.TreePage;

public class TreeStep {
	private TreePage tp = new TreePage(DriverFactory.getDriver());

	@Given("The User Successfully Login into home page")
	public void the_user_successfully_login_into_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		tp.signInpPageLogin();
	}

	@Given("The User clicks on Get Started")
	public void the_user_clicks_on_get_started() {
		tp.getStartedButton();
	}

	@Then("The user tests the functionality of Overview of Trees")
	public void the_user_tests_the_functionality_of_overview_of_trees() throws InterruptedException {
		tp.clickOverviewOfTrees();
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		Thread.sleep(1000);
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Terminologies")
	public void the_user_tests_the_functionality_of_terminologies() throws InterruptedException {
		tp.clickterminologies();
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		Thread.sleep(1000);
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Types of Trees")
	public void the_user_tests_the_functionality_of_types_of_trees() throws InterruptedException {
		tp.clickTypesOfTrees();
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		Thread.sleep(1000);
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Tree Traversals")
	public void the_user_tests_the_functionality_of_tree_traversals() throws InterruptedException {
		tp.clickTreeTraversals();
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		Thread.sleep(1000);
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Traversals-Illustration")
	public void the_user_tests_the_functionality_of_traversals_illustration() throws InterruptedException {
		tp.clickTraversals();
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		Thread.sleep(1000);
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Binary Trees")
	public void the_user_tests_the_functionality_of_binary_trees() throws InterruptedException {
		tp.clickBinaryTrees();
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		Thread.sleep(1000);
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Types of Binary Trees")
	public void the_user_tests_the_functionality_of_types_of_binary_trees() throws InterruptedException {
		tp.clickTypesOfBinaryTrees();
		tp.scrollDown();
		Thread.sleep(1000);
		tp.clickTryHere();
		tp.sendTextInEditor();
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Implementation in Python")
	public void the_user_tests_the_functionality_of_implementation_in_python() throws InterruptedException {
		tp.clickImplementation();
		tp.scrollDown();
		Thread.sleep(1000);
		tp.clickTryHere();
		tp.sendTextInEditor();
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Binary Tree Traversals")
	public void the_user_tests_the_functionality_of_binary_tree_traversals() throws InterruptedException {
		tp.clickBinaryTreeTraversals();
		Thread.sleep(1000);
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Implementation of Binary Trees")
	public void the_user_tests_the_functionality_of_implementation_of_binary_trees() throws InterruptedException {
		tp.clickImplementationOfBinaryTrees();
		Thread.sleep(1000);
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Applications of Binary trees")
	public void the_user_tests_the_functionality_of_applications_of_binary_trees() throws InterruptedException {
		tp.clickApplOfBinaryTrees();
		Thread.sleep(1000);
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Binary Search Trees")
	public void the_user_tests_the_functionality_of_binary_search_trees() throws InterruptedException {
		tp.clickBinarySerachTrees();
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		Thread.sleep(1000);
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The user tests the functionality of Implementation Of BST")
	public void the_user_tests_the_functionality_of_implementation_of_bst() throws InterruptedException {
		tp.clickImpOfBst();
		tp.scrollDown();
		tp.clickTryHere();
		tp.sendTextInEditor();
		Thread.sleep(1000);
		tp.clickRunButton();
		Thread.sleep(1000);
		tp.navigateToTreePage();
	}

	@Then("The User navigates Back to Home Page")
	public void the_user_navigates_back_to_home_page() throws InterruptedException {
		tp.navigateToHomePage();
		Thread.sleep(3000);
	}

}
