package com.Tour.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.Confirm;
import com.Tour.qa.pages.ForgotPassword;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.LoginPage;
import com.Tour.qa.pages.ModifyCancelPage;
import com.Tour.qa.pages.RegistrationPage;

public class ForgotPasswordTest extends TestBase{
	
	
	LoginPage loginPage;
	Confirm confirmPage;
	RegistrationPage regis;
	ModifyCancelPage modify;
	HomePage home;
	ForgotPassword forgot;
	
	
	
	public ForgotPasswordTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		regis = new RegistrationPage();
		modify = new  ModifyCancelPage();
		home = new HomePage();
		forgot = new ForgotPassword();
		
		home.CheckModifyCancel();
		forgot.ValidateForgotPage();
				
		
	}
	
	@Test(priority=1,description = "Forgot Password page: Validate Page title display correct")
	public void loginPageTitleTest(){
		boolean flag = forgot.ValidatePageH();
		Assert.assertTrue(flag);
	}
	

	
	@Test(priority=2,description = "Forgot Password page: Validate  Resetpage work fine with valid email")
	public void ValidateResetPWWithValidEmail(){
		boolean flag = forgot.ValidateResetPWWithValidEmail();
		Assert.assertTrue(flag);
	}



	
	@Test(priority=3,description = "Forgot Password page: Validate that proper error message should display on Reset password with invalid email")
	public void ValidateResetPWWithInValidEmail(){
		boolean flag = forgot.ValidateResetPWWithInValidEmail();
		Assert.assertTrue(flag);
	}



	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
