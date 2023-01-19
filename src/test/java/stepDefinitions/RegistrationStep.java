package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.RegistrationPage;

public class RegistrationStep {
	private RegistrationPage regpage = new RegistrationPage(DriverFactory.getDriver());

	@Given("The user is in the Registration page")
	public void the_user_is_in_the_registration_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");
	}

	@When("Title of registration pagae is {string}")
	public void title_of_registration_pagae_is(String expTitle) {
		String actTitle = regpage.getPageTitle();
		System.out.println("Register page title is==" + actTitle);
		Assert.assertEquals(expTitle, actTitle);
	}

	@Then("The user enters {string} and {string} and {string}")
	public void the_user_enters_and_and(String userName, String password, String confirmPassword) {
		regpage.enterRegisterationData(userName, password, confirmPassword);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Clicks on registr butoon")
	public void clicks_on_registr_butoon() {
		regpage.clickRegister();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("Check for message {string} is displayed\" for invalid data")
	public void check_for_message_is_displayed_for_invalid_data(String alertMsg) {
		String actAlert = regpage.getAlertMsg();
		System.out.println("The actual Alert message is " + actAlert);
		Assert.assertTrue(actAlert.contains("password_mismatch"));
		System.out.println("The alert is present, assertion passed");
	}

	@Then("The user is on home page")
	public void the_user_is_on_home_page() {
		String homeTitle = regpage.getPageTitle();
		System.out.println("The home page title is==>" + homeTitle);
		Assert.assertTrue(homeTitle.contains("NumpyNinja"));

	}

	@Then("The message {string}")
	public void the_message(String succMsg) {
		String actualMsg = regpage.getSuccessMsg();
		System.out.println("The actual Alert message is==> " + actualMsg);
		Assert.assertTrue(actualMsg.contains(succMsg));
		System.out.println("The alert is present, assertion passed");
	}

	@Then("Check for the {string} in right corner of the page")
	public void check_for_the_in_right_corner_of_the_page(String uname) {
		System.out.println("The logged in user name is==> " + uname);
		Assert.assertTrue(DriverFactory.getDriver().getPageSource().contains(uname));
		System.out.println("The alert is present, assertion passed");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Click on Sign Out page")
	public void click_on_sign_out_page() {
		regpage.clickSignout();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("The {string} is displayed")
	public void the_is_displayed(String logoutMsg) {
		String actualMsg = regpage.getSuccessMsg();
		System.out.println("The actual Alert message is==> " + actualMsg);
		Assert.assertTrue(actualMsg.contains(logoutMsg));
		System.out.println("The alert is present, assertion passed");

	}

}
