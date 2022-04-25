package com.Tour.qa.testdata;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.ChoosDatePage;
import com.Tour.qa.pages.ChoosTour;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.RegistrationPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class ChooseDateTest extends TestBase{

	
	HomePage homePage;
	ChoosTour chooseTour;
	ChoosDatePage chooseDate;
	RegistrationPage RegisPage;
	 ExtentTest extentTest;
	 ExtentReports extent;
	

	public ChooseDateTest(){
		super();
	}
	
	

	@BeforeMethod
	public void setUp(){
		initialization();
		
		chooseTour = new ChoosTour();	
		homePage = new HomePage();
		RegisPage = new RegistrationPage();
		chooseTour = homePage.CheckPurchaseTicket();
		 

		int groupsize ;
		
        groupsize = Integer.parseInt(prop.getProperty("groupsize"));   
		 
		chooseDate = chooseTour.EnterageGroup1(groupsize);
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}
	
	
	@Test(priority=1 ,description = "Choose Date Page:Verify Page title is displaying correct")
	public void CheckPageTitle(){
	//	extentTest = extent.startTest("CheckPageTitle");
		
		String title = chooseDate.validatePageTitle();
		Assert.assertEquals(title, "Choose Your Tour Date");
		
	}
	
	@Test(priority=2 ,description = "Choose Date Page:Verify Page Banner is display or not")
	public void validateBanne(){
		boolean flag = chooseDate.validateBanner();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=3,description = "Choose Date Page: Verify Page Heading is displaying correct")
	public void validateHeading(){
		boolean flag = chooseDate.validatePageHeading();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=4,description = "Choose Date Page:When user click Choose Tour form menu bar, user should redirect on Choose Tour page")
	public void validateChoosTourFromMenu(){
		chooseTour = chooseDate.validateChooseTourMenuOption();
			
	
	}
	

	@Test(priority=5,description = "Choose Date Page:Choose Date Page:validate the group type is displaying correct")
	public void validateTheOriginal(){
				
		String text = chooseDate.validateTheOriginal();
		Assert.assertEquals(text, prop.getProperty("tourname"));
		
		
	}
	
	
	
	@Test(priority=6,description = "Choose Date Page:Choose Date Page:validate that Group Size is displaying correct")
	public void validateGroupSize(){
				
		String text = chooseDate.validateGroupSize();
		Assert.assertEquals(text,prop.getProperty("groupsize"));
		
		
	}
	
		
	@Test(priority=7,description = "Choose Date Page:Validate that user can navigate successfully by selecting valid date of available slot")
	public void SelectValidSlotTest() throws InterruptedException{
				
		RegisPage = chooseDate.SelectValidSlot(prop.getProperty("monthYear"), prop.getProperty("date"));
		
	}
	
	

	@Test(priority=8,description = "Choose Date Page:Validate that message displayed for not available slot")
	public void SelectInValidSlot() throws InterruptedException{
				
		boolean flag = chooseDate.SelectInValidSlot("May 2022","3");
		Assert.assertTrue(flag);
		
	}
	
	
	@Test(priority=10 ,description = "Choose Date Page:Validate Group Size display correct based on give data on previous page")
	public void validateGroupSize2(){
				
		String text = chooseDate.validateGroupSize2();
		Assert.assertEquals(text,prop.getProperty("groupsize"));
		
		
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
}
