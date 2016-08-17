package auto.company.steps2;

import net.thucydides.core.annotations.Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenarioSteps2 {
	WebDriver driver;
	@Steps
	UserSteps2 loginSteps2;

	@Given("^I am on gmail page$")
	public void i_am_on_gmail_page() throws Throwable {
		loginSteps2.open_home_page();
		driver.manage().window().maximize();

	}

	@When("^I enter my <Email>$")
	public void i_enter_my_Email(String email) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		loginSteps2.in_put_my_email(email);
	}

	@When("^I click the next button$")
	public void i_click_the_next_button() throws Throwable {
		loginSteps2.click_on_next_btn();
	}

	@When("^I enter my <Password>$")
	public void i_enter_my_Password(String pwd) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		loginSteps2.in_put_my_password(pwd);
	}

	@When("^I click the signIn button$")
	public void i_click_the_signIn_button() throws Throwable {
		loginSteps2.click_On_Sign_in_btn();
	}

	@Then("^I see an alert message is <Message>$")
	public void i__see_an_alert_message_is_Message(DataTable arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		Assert.assertEquals(loginSteps2.getAlertMsg(), arg1);

	}
	@Then("^I close my browser$")
	public void i_close_my_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginSteps2.close();
	}
}
