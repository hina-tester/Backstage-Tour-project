package com.Tour.qa.testdata;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
	
	@Test(priority=1,description = "Home page : Validate Home page title display as expected")
	public void HomePageTitleTest(){
		
		String title = homePage.validateHomePageTitle();
		
		Assert.assertEquals(title, "Backstage Tours");
	}

	
	@Test(priority=2,description = "Home page : Validate Banner displayed as expected")
	public void CheckBanner(){
		boolean flag = homePage.validateBanner();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3,description = "Home page : Validate  Modify cancle option work as expected")
	public void CheckModifyCancel(){
		String title = homePage.CheckModifyCancel();
		Assert.assertEquals(title, "Logon");
	}
	
		
	
	@Test(priority=4,description = "Home page : Validate purchase ticket option work fine")
	public void CheckOurchaseTicket(){

		chooseTour = homePage.CheckPurchaseTicket();
		
		
	}
	
	@AfterMethod
public void tearDown() throws IOException{
		
	
			driver.quit();
	
	}
}
