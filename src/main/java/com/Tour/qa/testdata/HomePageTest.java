package com.Tour.qa.testdata;


import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.ChoosTour;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.util.TestUtil;

public class HomePageTest  extends TestBase {

	HomePage homePage;
	ChoosTour chooseTour;
	TestUtil util;

	
	
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();	
		util = new TestUtil();
	
		
	}
	
	@Test(priority=1)
	public void HomePageTitleTest(){
		
		String title = homePage.validateHomePageTitle();
		
		Assert.assertEquals(title, "Backstage Tours");
	}

	
	@Test(priority=2)
	public void CheckBanner(){
		boolean flag = homePage.validateBanner();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=2)
	public void CheckModifyCancel(){
		String title = homePage.CheckModifyCancel();
		Assert.assertEquals(title, "Logon");
	}
	
		
	
	@Test(priority=3)
	public void CheckOurchaseTicket(){

		chooseTour = homePage.CheckPurchaseTicket();
		
		
	}
	
	@AfterMethod
public void tearDown() throws IOException{
		
	
			driver.quit();
	
	}
}
