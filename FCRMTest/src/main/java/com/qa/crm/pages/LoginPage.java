package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="/html/body/div[1]/section/div[3]/nav/a[8]")
	WebElement btnLogin;
	
	@FindBy(name="mobileEmail")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="login")
	WebElement btnSubmitLogin;
	
	//Initializing Page Objects
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	//Actions
	 public void setUserNameAndPassword(String username,String password) {
		 txtpassword.sendKeys(username);
		 txtpassword.sendKeys(password);
		 btnSubmitLogin.click();
	 }
    

}
