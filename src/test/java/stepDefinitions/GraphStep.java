package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GraphPage;


public class GraphStep {
	private GraphPage gp = new GraphPage(DriverFactory.getDriver());

@Given("The User successfully logins in to Home Page")
public void the_user_successfully_logins_in_to_home_page() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
	gp.signInpPageLogin();
}

@Given("The User clicks on Get started button")
public void the_user_clicks_on_get_started_button() {
	gp.getStartedButton();   
}

@When("The User tests the functionality of Graph")
public void the_user_tests_the_functionality_of_graph() {
   gp.clickGraph();
   gp.scrollDown();
   gp.clickTryHere();
   gp.sendTextInEditor();
   gp.clickRunButtn();
   gp.navigatetoGraphPage();
   
}

@When("User tests the functionality of Graph Representations")
public void user_tests_the_functionality_of_graph_representations() {
    gp.clickGraphRepresentation();
    gp.scrollDown();
    gp.clickTryHere();
    gp.sendTextInEditor();
    gp.clickRunButtn();
}

@Then("The User navigates back to the Home Page")
public void the_user_navigates_back_to_the_home_page() {
    gp.navigatetoHomPage();
}	
}
