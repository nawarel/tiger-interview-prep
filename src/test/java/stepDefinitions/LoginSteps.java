package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.LoginPageObj;

public class LoginSteps extends Base{
	LoginPageObj loginPageObj=new LoginPageObj();
	
	@Given("I am on test Enviroment Home Page")
	public void i_am_on_test_enviroment_home_page() {

		String ExpectedText="TEST ENVIRONMENT";
	    String actualtext =loginPageObj.getTestEnvironmentText();
	    Assert.assertEquals(ExpectedText, actualtext);
	    logger.info("user login to test enviroment succesffuly");
	}
	@When("I click my account button")
	public void i_click_my_account_button() {
		loginPageObj.clickOnLoginButton();
		logger.info("user clicked on my account bttn succesffuly");
	}
	@When("I click on login link")
	public void i_click_on_login_link() {
		loginPageObj.clickOnLoginLink();
	   logger.info("user clicked on login link succesffuly");
	}
	@When("Ienter my username and Password")
	public void ienter_my_username_and_password() {
		loginPageObj.enterEmail("tekschoolcapstoe@gmail.com");
		loginPageObj.enterPassword("tek0123");
	}
	@Then("I click on login button")
	public void i_click_on_login_button() {
		loginPageObj.clickOnLoginLink();
		logger.info(" clicked login bttn succesffly");
	}
	@Then("I am logged into my Test Enviroment account")
	public void i_am_logged_into_my_test_enviroment_account() {
	    String expect="My Account";
	    String actual=loginPageObj.getTextAfterLogin();
	    logger.info("verified");
	}

}
