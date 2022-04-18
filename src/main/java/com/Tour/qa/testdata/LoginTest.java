package com.Tour.qa.testdata;

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
	
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Logon");
	}

	@Test(priority=2)
	public void CheckLogo(){
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3)
	public void loginTest(){
		modify = loginPage.login(prop.getProperty("email"), prop.getProperty("pw"));
	}
	
	
	@Test(priority=4)
	public void loginTestInvalidEmail(){   //invalid email/pw
		
		boolean flag = loginPage.loginInvalidEmailPassword();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void loginEmpty(){   //empty fields
		
		boolean flag = loginPage.loginEmpty();
		Assert.assertTrue(flag);
	}
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
