package com.Tour.qa.testdata;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.ChoosDatePage;
import com.Tour.qa.pages.ChoosTour;
import com.Tour.qa.pages.HomePage;



public class ChooseTourTest extends TestBase{

	HomePage homePage;
	ChoosTour chooseTour;
	ChoosDatePage chooseDate;
	
	
	
	
	public ChooseTourTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		chooseTour = new ChoosTour();	
		homePage = new HomePage();
		chooseTour = homePage.CheckPurchaseTicket();
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

	@Test(priority=1)
	public void ChooseTourPageTitleTest(){
		
		
		String title = chooseTour.validatereservationPageTitle();
		Assert.assertEquals(title, "About the Tour");
		
	}

	@Test(priority=2)
	public void validateBanne(){
		boolean flag = chooseTour.validateBanner();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void validateText1(){
		boolean flag = chooseTour.validateText1();
		Assert.assertTrue(flag);
	}
	


	@Test(priority=4)
	public void InputGroupSizeOfTHEORIGINAL() {
		
		

		int groupsize ;
		
        groupsize = Integer.parseInt(prop.getProperty("groupsize"));   
		 
		chooseDate = chooseTour.EnterageGroup1(groupsize);
		
	//	chooseDate = chooseTour.EnterageGroup1(10);
		
	}
	
	
	@Test(priority=5)
	public void InputGroupSizeOfTHEDELUXE() {
		
		
		int groupsize;
		
		
        groupsize = Integer.parseInt(prop.getProperty("groupsize"));   
		 
		chooseDate = chooseTour.EnterGroup2(groupsize);
		
	}
	
	
	@Test(priority=6)
	public void TestInvalidInout1() throws InterruptedException{
		
		
		String msg = chooseTour.TestinvalidInputF1("a");

		Assert.assertEquals(msg, "Please enter a valid number for the size of your group.");
		//Assert.assertTrue(flag);
		
	}
	
	@Test(priority=7)
	public void TestInvalidInout2() throws InterruptedException{
		
		
		String msg = chooseTour.TestinvalidInputF2("a");

		Assert.assertEquals(msg, "Invalid Group Size");
		//Assert.assertTrue(flag);
		
	}
	
	@Test(priority=8)
	public void Slider(){
		
		
		boolean flag = chooseTour.CheckSlider();
		Assert.assertTrue(flag);

		
	}
	
	@Test(priority=9)
	public void PageHeading(){
		
		
		boolean flag = chooseTour.CheckPageHeading();
		Assert.assertTrue(flag);

	}
	
	
	@Test(priority=10)
	public void TestSliderPreBut(){
		
		
		boolean flag = chooseTour.Checkprebut();
		Assert.assertTrue(flag);

		
	}
	
	@Test(priority=11)
	public void TestSliderNextBut(){
		
		
		boolean flag = chooseTour.Checknextbut();
		Assert.assertTrue(flag);

		
	}

	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
