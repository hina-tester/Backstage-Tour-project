package com.Tour.qa.testdata;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.Confirm;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.LoginPage;
import com.Tour.qa.pages.ModifyCancelPage;
import com.Tour.qa.pages.RegistrationPage;


public class LoginTest extends TestBase{
	
	LoginPage loginPage;
	Confirm confirmPage;
	RegistrationPage regis;
	ModifyCancelPage modify;
	HomePage home;
	
	
	
	public LoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		regis = new RegistrationPage();
		modify = new  ModifyCancelPage();
		home = new HomePage();
		
		home.CheckModifyCancel();
		
		
		
	}
	
	
	@Test(priority=1,description = "Validate Login page title display as expected")
	public void loginPageTitleTest(){
		
		
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Logon");
	}

	@Test(priority=2,description = "Validate  logo should display as expected")
	public void CheckLogo(){
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3,description = "Validate login button work fine and Modify/cancle page should be displayed after login")
	public void loginTest(){
		modify = loginPage.login(prop.getProperty("email"), prop.getProperty("pw"));
	}
	
	
	@Test(priority=4,description = "Validate error should be displayed on providing invalid email")
	public void loginTestInvalidEmail(Method method){   //invalid email/pw
	
		boolean flag = loginPage.loginInvalidEmailPassword();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5,description = "Validate error should be displayed on providing no email")
	public void loginPageOnEmptyEmailField(){   //empty fields
		
		boolean flag = loginPage.loginEmpty();
		Assert.assertTrue(flag);
	}
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
