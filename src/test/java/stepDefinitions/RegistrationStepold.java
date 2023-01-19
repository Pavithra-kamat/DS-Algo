package stepDefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.RegistrationPageold;

public class RegistrationStepold {
	
	private RegistrationPageold regpage=new RegistrationPageold(DriverFactory.getDriver());

	@Given("The user is in the registration page")
	public void the_user_is_in_the_registration_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");
	    
	}
	@When("The user enters a username")
	public void the_user_enters_a_username() throws InterruptedException {
		regpage.userName("1mridula211");
		Thread.sleep(2000);
	}

	@When("The user enters password in the password textbox")
	public void the_user_enters_password_in_the_password_textbox() throws InterruptedException {
	   regpage.password1("1ghajini31");
	   Thread.sleep(2000);
	}

	@When("The user enters a different password in the confirm password textbox and clicks register")
	public void the_user_enters_a_different_password_in_the_confirm_password_textbox_and_clicks_register() throws InterruptedException {
	   regpage.password2("1ghaj");
	   regpage.registerButton();
	   Thread.sleep(2000);
	}

	@When("Password mismatch error message {string} is displayed")
	public void password_mismatch_error_message_is_displayed(String actMessage) {
		String actAlert=regpage.missmatchAlert();
		System.out.println("The actual Alert message is "+actAlert);
		Assert.assertTrue(actAlert.contains("password_mismatch"));
		System.out.println("The alert is present, assertion passed");
	   
	}
	@When("The user enters the same password in both the boxes")
	public void the_user_enters_the_same_password_in_both_the_boxes() {
		regpage.password2("1ghajini31");
	    
	}
	@When("The user clicks the Register button")
	public void the_user_clicks_the_register_button() throws InterruptedException {
	    regpage.registerButton();
	    Thread.sleep(2000);
	}

	@Then("The user is redirected to homepage with message {string}")
	public void the_user_is_redirected_to_homepage_with_message(String string) {
		String successAlert=regpage.newAccountAlert();
		System.out.println("Message After Registration==" +successAlert);
		Assert.assertTrue(successAlert.contains("New Account Created."));
		System.out.println("The User Account is successfully created, and is now redirected to HomePage");
	  
	}
}