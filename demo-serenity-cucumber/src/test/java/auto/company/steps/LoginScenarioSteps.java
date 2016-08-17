package auto.company.steps;

import net.thucydides.core.annotations.Steps;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenarioSteps {
	@Steps
	UserSteps loginStep;

	@Given("^I am on Home page$")
	public void i_am_on_Home_page() throws Throwable {
		loginStep.open_home_page();
		
	}

	@When("^I input my email is \"([^\"]*)\"$")
	public void i_input_my_account_is(String email) throws Throwable {
		loginStep.input_email(email);
	}

	@When("^I click next button$")
	public void i_click_next_button() throws Throwable {
	   loginStep.click_on_next_btn();
}

	@When("^I leave password field is \"([^\"]*)\"$")
	public void i_leave_password_field_is(String pswd) throws Throwable {
		loginStep.input_password(pswd);
	}
	
	@When("^I click signIn button$")
	public void i_click_signIn_button() throws Throwable {
	    loginStep.click_On_Sign_in_btn();
	}

	@Then("^I should see an alert message is \"([^\"]*)\"$")
	public void i_should_see_an_alert_message_is(String Msg) throws Throwable {
		Assert.assertEquals(loginStep.getAlertMsg(), Msg);
	}
	
}
