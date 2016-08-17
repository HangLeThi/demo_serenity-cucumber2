package auto.company.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import auto.company.pages.LoginGmailPage;

public class UserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LoginGmailPage loginGmailPage;

	@Step
	public void open_home_page() {
		// goi ham open browser
		loginGmailPage.open();
	}

	@Step
	public void input_email(String email) {
		// TODO Auto-generated method stub
		loginGmailPage.enter_email(email);
	}
	
	@Step
	public void click_on_next_btn() {
		// TODO Auto-generated method stub
		loginGmailPage.clickNextBtn();
	}
	
	@Step
	public void input_password(String pwd) {
		// TODO Auto-generated method stub
		loginGmailPage.enter_pwd(pwd);
	}
	
	@Step
	public void click_On_Sign_in_btn() {
		// TODO Auto-generated method stub
		loginGmailPage.clickSignInBtn();
	}

	@Step
	public String getAlertMsg() {
		// TODO Auto-generated method stub
		return loginGmailPage.getErrMsg();
	}
	
			
	}

