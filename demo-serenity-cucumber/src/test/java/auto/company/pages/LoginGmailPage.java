package auto.company.pages;



import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com")
public class LoginGmailPage extends PageObject{

	//xác định địa chỉ đối tượng
	@FindBy(id="Email")
	WebElement emailField;
	
	@FindBy(id="errormsg_0_Passwd")
	WebElement errMsg;
	
	@FindBy(id="next")
	WebElement nextbtn;
	
	@FindBy(id="Passwd")
	WebElement pwdField;
	
	@FindBy(id="signIn")
	WebElement signInBtn;

			
	public void enter_email(String email) {
		// TODO Auto-generated method stub
		emailField.sendKeys(email);
	}
	
	public void clickNextBtn() {
		// TODO Auto-generated method stub
		nextbtn.click();
	}
	
	public void enter_pwd(String pwd) {
		// TODO Auto-generated method stub
		pwdField.sendKeys(pwd);
	}
	
	public void clickSignInBtn() {
		// TODO Auto-generated method stub
		signInBtn.click();
	}

	
	public String getErrMsg() {
		// TODO Auto-generated method stub
		return errMsg.getText();
	}

	
	
}
