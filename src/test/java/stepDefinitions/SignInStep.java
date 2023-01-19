package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.SignInPage;
import util.ExcelReader;

public class SignInStep {

private SignInPage signinpage = new SignInPage(DriverFactory.getDriver());

@Given("The user is in the Sign In page")
public void the_user_is_in_the_sign_in_page() {
	
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
    
}

@When("User enters userid and password from the given sheetname {string} and {int}")
public void user_enters_userid_and_password_from_the_given_sheetname_sheet1_and(String SheetName,Integer RowNumber) throws InvalidFormatException, IOException {
	ExcelReader Reader =new ExcelReader();
	List<Map<String,String>> testData = Reader.getData("C:\\Users\\pavit\\eclipse-workspace\\DSAlgoProject\\DSAlgoProject\\src\\main\\java\\util\\LoginData.xlsx",SheetName);
   String username=testData.get(RowNumber).get("uname");
   String password=testData.get(RowNumber).get("pword");
   signinpage.enterUsername(username);
   signinpage.enterPassword(password);
}

@When("The user clicks login button")
public void the_user_clicks_login_button() throws InterruptedException {
	signinpage.clickLogin();
	Thread.sleep(2000);
}

@Then("The user should be redirected to the Home Page.")
public void the_user_should_be_redirected_to_the_home_page() {
   
}
}
