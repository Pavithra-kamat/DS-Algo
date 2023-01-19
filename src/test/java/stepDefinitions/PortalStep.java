package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PortalPage;


public class PortalStep {
	
	private PortalPage portalPage=new PortalPage(DriverFactory.getDriver());

	@Given("The user is in the {string} page")
	public void the_user_clicks_page(String string) {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		portalPage.getStarted();
	}

	@Then("The user should be redirected to homepage {string}")
	public void the_user_should_be_redirected_to_homepage(String expectedHomePage) {
		/*String htitle =portalPage.getHomeTitle();
		System.out.println("Home Page "+ htitle +"is launched" );
		Assert.assertEquals(expectedHomePage, htitle);*/ 
	}

}
