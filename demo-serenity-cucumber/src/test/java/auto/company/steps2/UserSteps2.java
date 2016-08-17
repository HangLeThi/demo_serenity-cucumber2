package auto.company.steps2;


import org.openqa.selenium.WebDriver;

import net.thucydides.core.steps.ScenarioSteps;
import auto.company.pages.LoginGmailPage;

public class UserSteps2 extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginGmailPage loginGmailPage;
	WebDriver driver;

	public void open_home_page() throws InterruptedException {

		loginGmailPage.open();
		driver.manage().window().maximize();
		Thread.sleep(50);
		// ko thuc hien maximize
	}

	public void in_put_my_email(String email) throws InterruptedException {

		loginGmailPage.enter_email(email);
		Thread.sleep(50);
	}

	public void click_on_next_btn() throws InterruptedException {

		loginGmailPage.clickNextBtn();
		Thread.sleep(50);
	}

	public void in_put_my_password(String pwd) throws InterruptedException {

		loginGmailPage.enter_pwd(pwd);
		Thread.sleep(50);
	}

	public void click_On_Sign_in_btn() throws InterruptedException {

		loginGmailPage.clickSignInBtn();
		Thread.sleep(50);
	}

	public Object getAlertMsg() {

		return loginGmailPage.getErrMsg();
	
	}

	public void close() {

		driver.quit();
		// khong quit browser
	}

}
