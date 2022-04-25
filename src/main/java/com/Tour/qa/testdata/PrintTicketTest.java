package com.Tour.qa.testdata;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.ChoosDatePage;
import com.Tour.qa.pages.ChoosTour;
import com.Tour.qa.pages.Confirm;
import com.Tour.qa.pages.CusgtomerPlan;
import com.Tour.qa.pages.FAQ;
import com.Tour.qa.pages.ForgotPassword;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.LoginPage;
import com.Tour.qa.pages.PaymentPage;
import com.Tour.qa.pages.PrintTicket;
import com.Tour.qa.pages.RegistrationPage;



public class PrintTicketTest extends TestBase{
	

	
	HomePage homePage;
	ChoosTour chooseTour;
	ChoosDatePage chooseDate;
	RegistrationPage RegisPage;
	Confirm confirmPage;
	LoginPage loginPage;
	ForgotPassword fgPage;
	CusgtomerPlan service;
	PaymentPage payment;
	PrintTicket print;
	FAQ faq;
	


	public PrintTicketTest(){
		super();
	}
	

	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		chooseTour = new ChoosTour();	
		chooseDate = new  ChoosDatePage();
		homePage = new HomePage();
		confirmPage = new Confirm();
		RegisPage = new RegistrationPage();
		loginPage = new LoginPage();
		fgPage = new ForgotPassword();
		service = new CusgtomerPlan();
		payment = new PaymentPage();
		print = new PrintTicket();
		faq = new FAQ();
		
		
		chooseTour = homePage.CheckPurchaseTicket();
		
		int groupsize ;
		
        groupsize = Integer.parseInt(prop.getProperty("groupsize"));   
		 
		chooseDate = chooseTour.EnterageGroup1(groupsize);
				
		 RegisPage = chooseDate.SelectValidSlot(prop.getProperty("monthYear"), prop.getProperty("date"));
		 
	//	 confirmPage = 
				 RegisPage.CheckFillData();
				 
				 payment = confirmPage.validatePurchaseTicketButt();
				 	 payment.validatePayment();
				 	 
				 	driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
					 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
				 	 
					
	}
	
	


	@Test(priority=2,description = "Print Ticket Page : Validate banner should display on page")
	public void validateBanner(){
		
		boolean flag= print.validateBanner();
		Assert.assertTrue(flag,"Banner is displaying on page");
		
		
	}	
	

	@Test(priority=3,description = "Print Ticket Page : Validate Top menu should display as expected")
	public void validatemenu(){
		
		boolean flag= print.validatemenu();
		Assert.assertTrue(flag,"Top menu is displaying as expected");
		Assert.assertFalse(false,"Top menu is missing from page");
		
		
	}
	


	@Test(priority=4,description = "Print Ticket Page : Validate choose Tour option from bar menu should work as expected")
	public void ChooseTourshouldBeClickableFromManuBar(){
		
		boolean heading = print.validatechooseTour();
		
	Assert.assertTrue(heading);
		
		
	}

	


	@Test(priority=5,description = "Print Ticket Page : Validate Registration option from menu bar should work as expected")
	public void RegistrationShouldBeClickableFromMenuBar(){
		
		boolean heading = print.RegistrationPage();
		Assert.assertTrue(heading,"Registration menu work as expected from bar menu");
		
	
		
		
	}


	@Test(priority=6,description = "Print Ticket Page : Validate choose Date option from bar menu shoul work as expected")
	public void ChooseDateShouldBeClickableFromMenuBar(){
		
		boolean heading =  print.validatechooseDate();
		Assert.assertTrue(heading,"Choose date option work as expected from bar menu");
		
		
	}

	

	@Test(priority=7,description = "Print Ticket Page : Validate Confirmation and purchase ticket option from menu bar should work as expected")
	public void ConfirmAndPurchaseShouldBeClickableFromMenuBar(){
		
		boolean heading  = print.validateconfirm();
		Assert.assertTrue(heading,"Confirm and purchase option work as expected from bar menu");
		
	
	}



	
	@Test(priority=8,description = "Print Ticket Page : Validate Tick for Registration option should display as expected")
	public void TickForRegistrationShouldBeClickable(){
		
		boolean heading  = print.tick1();
		Assert.assertTrue(heading,"Tick for Registration completed work as expected");
		
	
	}
	

	@Test(priority=9,description = "Print Ticket Page : Validate Tick for  confirm and Purchase page should display as exected")
	public void TickForConfirmationShouldBeClickable(){
		
		boolean heading  = print.tick2();
		Assert.assertTrue(heading,"Tick for Confirm and purchase page should work as expected");
		
	
	}
	


	@Test(priority=10,description = "Print Ticket Page : Validate Print ticket option from menu bar should display as expected")
	public void PrintTicketShouldBeDisplay() throws InterruptedException{
		
		boolean flag= print.printTicketmenu();
		Assert.assertTrue(flag,"Print ticket menu works as expeted");
	
			}


	@Test(priority=11,description = "Print Ticket Page : Validate print ticket text should display as expected")
	public void PrintTicketShouldWorkFrmoMenu() throws InterruptedException{
		
		boolean flag= print.printTicket();
		
		Assert.assertTrue(flag," Print ticket option from menu bar work as expected");
			
		
			}

	@Test(priority=12,description = "Print Ticket Page : Validate page heading  is display as expected")
	public void validatePageHeading1(){
		
		boolean flag= print.validatePageHeading1();
		Assert.assertTrue(flag,"Page heading is display as expected");
		
		
	}
	

	@Test(priority=13,description = "Print Ticket Page : Validate page heading should display as expected")
	public void validatePageHeading2(){
		
		boolean flag= print.validatePageHeading2();
		Assert.assertTrue(flag);
		
		
	}
	


	@Test(priority=14,description = "Print Ticket Page : Validate Group type display as expected")
	public void validateOriginal(){
		
		boolean flag= print.validateOriginal();
		Assert.assertTrue(flag,"Group type display as expected");
		
		
	}
	

	@Test(priority=15,description = "Print Ticket Page : Validate Plan Visit button should work as expected")
	public void validatePlanVisit(){
		
		service= print.validatePlanvisit();
	
	}


	@Test(priority=16,description = "Print Ticket Page : Print Ticket Page : Validate Email link work as expected")
	public void validatemailto(){
		
		boolean flag= print.validatemailto();
		Assert.assertTrue(flag,"on clicking emial, mailto open");
		
		
	}
	

	@Test(priority=17,description = "Print Ticket Page : Validate page heading display as expected")
	public void validateheading1(){
		
		boolean flag= print.validateh1();
		Assert.assertTrue(flag,"heading display as expected");
		
		
	}
	

	@Test(priority=18,description = "Print Ticket Page : Validate page heading  should display as expected")
	public void validateheading2(){
		
		boolean flag= print.validateh2();
		Assert.assertTrue(flag,"Heading display as expected");
		
		
	}


	@Test(priority=19,description = "Print Ticket Page : Validate page heading should display as expected")
	public void validateheading3(){
		
		boolean flag= print.validateh3();
		Assert.assertTrue(flag,"Heading display as expected");
		
		
	}


	@Test(priority=20,description = "Print Ticket Page : Validate page heading should display as expected")
	public void validateheading4(){
		
		boolean flag= print.validateh4();
		Assert.assertTrue(flag,"heading display as expected");
		
		
	}


	@Test(priority=21,description = "Print Ticket Page : Validate Date should display as expected")
	public void validatedate(){
		
		boolean flag= print.datetext();
		Assert.assertTrue(flag,"date display as expected");
		
		
	}

	
	@Test(priority=22,description = "Print Ticket Page : Validate link for question")
	public void validatelinkquestion(){
		
		faq =  print.validatelinkquestion();
		
		
		
	}

	
	@Test(priority=23,description = "Print Ticket Page : Validate Card Holder name  should display as expected")
	public void validatecardHolderName(){
		
		String name = print.validatecardHolderName();
		
		
		
		Assert.assertEquals(prop.getProperty("cardname"),name,"Name display as expected");

		
		
	}
	

	@Test(priority=24,description = "Print Ticket Page : Validate Card Number should display as expected")
	public void validatecardnum(){
		
		String num = print.validatecardnum();
		
		String fordig = "";
		String fordig2 = "";
		
		String s2 = prop.getProperty("cardNumber");
		
		if (s2.length() > 4) 
		{
			fordig = s2.substring(s2.length() - 4);
		} 
		else
		{
			fordig = s2;
		}
		
		
		if (num.length() > 4) 
		{
			fordig2 = num.substring(num.length() - 4);
		} 
		else
		{
			fordig2 = num;
		}
		 
		
		
		Assert.assertEquals(fordig,fordig2,"Card number displayed as expected");
		
		
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	



}
