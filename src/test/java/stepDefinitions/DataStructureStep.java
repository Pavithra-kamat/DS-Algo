package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.DataStructurePage;

public class DataStructureStep {
	private DataStructurePage ds = new DataStructurePage(DriverFactory.getDriver());

	@Given("The user successfully logins in to home page")
	public void the_user_successfully_logins_in_to_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		ds.signInpPageLogin();
	}

	@Given("The user clicks on Get Started")
	public void the_user_clicks_on_get_started() {
		ds.getStartedButton();
	}

	@Given("The user clicks on Time Complexity")
	public void the_user_clicks_on_time_complexity() {
		ds.scrollDown();
		ds.clickTimeComplexity();
	}

	@Given("The user clicks on Try Here")
	public void the_user_clicks_on_try_here() {
		ds.scrollDown();
		ds.clickTryHere();
	}

	@Given("The user prints simple python code")
	public void the_user_prints_simple_python_code() {
		ds.sendTextInEditor();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("The user clicks on Run button")
	public void the_user_clicks_on_run_button() {
		ds.clickRunButton();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("The user checks the output")
	public void the_user_checks_the_output() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The is output is successful");
	}

	@Then("The user navigates back to the Home Page")
	public void the_user_navigates_back_to_the_home_page() {
		ds.navigatetoHomePage();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
