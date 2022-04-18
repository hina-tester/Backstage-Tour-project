package com.Tour.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.ChoosDatePage;
import com.Tour.qa.pages.ChoosTour;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.RegistrationPage;

public class ChooseDateTest extends TestBase{

	
	HomePage homePage;
	ChoosTour chooseTour;
	ChoosDatePage chooseDate;
	RegistrationPage RegisPage;
	

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
		
	
		
	}
	
	@Test(priority=1)
	public void CheckPageTitle(){
		
		
		String title = chooseDate.validatePageTitle();
		Assert.assertEquals(title, "Choose Your Tour Date");
		
	}
	
	@Test(priority=2)
	public void validateBanne(){
		boolean flag = chooseDate.validateBanner();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=3)
	public void validateHeading(){
		boolean flag = chooseDate.validatePageHeading();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=4)
	public void validateChoosFromMenu(){
		chooseTour = chooseDate.validateChooseTourMenuOption();
			
	
	}
	

	@Test(priority=5)
	public void validateTheOriginal(){
				
		String text = chooseDate.validateTheOriginal();
		Assert.assertEquals(text, prop.getProperty("tourname"));
		
		
	}
	
	
	
	@Test(priority=6)
	public void validateGroupSize(){
				
		String text = chooseDate.validateGroupSize();
		Assert.assertEquals(text,prop.getProperty("groupsize"));
		
		
	}
		
	@Test(priority=7)
	public void SelectValidSlotTest() throws InterruptedException{
				
		RegisPage = chooseDate.SelectValidSlot(prop.getProperty("monthYear"), prop.getProperty("date"));
		
	}
	

	@Test(priority=8)
	public void SelectInValidSlot() throws InterruptedException{
				
		boolean flag = chooseDate.SelectInValidSlot("April 2022","7");
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=9)
	public void validateTheDeluxe(){
				
		String text = chooseDate.validateTheDeluxe();
		Assert.assertEquals(text, prop.getProperty("tourname2"));
		
		
	}
	
	@Test(priority=10)
	public void validateGroupSize2(){
				
		String text = chooseDate.validateGroupSize2();
		Assert.assertEquals(text,prop.getProperty("groupsize"));
		
		
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
}
