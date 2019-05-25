package com.qa.crm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage lp;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
	initialization();
	lp = new LoginPage();
	}
	
	
	@Test
	public void loginPage() {
		try {
			Thread.sleep(5000);
			lp.clickLoginButton();
			lp.setUserNameAndPassword(prop.getProperty("username"),prop.getProperty("password"));
			lp.clickLoginButton();
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
