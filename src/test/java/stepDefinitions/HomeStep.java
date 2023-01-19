package stepDefinitions;

import org.junit.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeStep {

	//private HomePage homepage;
	private HomePage homepage= new HomePage(DriverFactory.getDriver());
	
	@Given("The user is in the home page {string}")
	public void the_user_is_in_the_home_page(String string) {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	   }

	@When("The user clicks the Data Structures dropdown")
	public void the_user_clicks_the_dropdown() throws InterruptedException {
		homepage.clickDS();
		Thread.sleep(2000);
		}

	@When("The user should see {int} panes with different data structures")
	public void the_user_should_see_panes_with_different_data_structures(Integer int1) throws InterruptedException {
		 int no_of_panes=homepage.paneSize();
		 System.out.println("The Expected no. of panes is " +no_of_panes);
		 Assert.assertEquals(7,no_of_panes); 
		 Thread.sleep(2000);
		 
	}

	@When("The user clicks any Get Started below data structures")
	public void the_user_clicks_any_below_data_structures() {
		homepage.clickGetStartedButton();	    
	}

	@When("User gets Alert \"You are not Logged in")
	public void user_gets_alert_you_are_not_logged_in() {
		homepage.displayAlert();	   
	}

	@When("The user selects any data structures item from the drop down without Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
		homepage.clickDropElements();	    
	}

	@When("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) throws InterruptedException {
		homepage.displayAlert();
		Thread.sleep(2000);
	}

	@When("The user clicks Register")
	public void the_user_clicks() throws InterruptedException {
		homepage.clickregister();	
		Thread.sleep(2000);
	}

	@When("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() throws InterruptedException {
		homepage.navigateToRegisterPage();	    
		Thread.sleep(2000);
	}

	@When("The user navigates back to the previous page and clicks Sign in")
	public void the_user_navigates_back_to_the_previous_page_and_clicks_sign_in() throws InterruptedException {
		homepage.goToPreviousPage();
	    homepage.clickSignIn();
	    Thread.sleep(2000);
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		homepage.navigateToSignInPage();	   
	}

}
