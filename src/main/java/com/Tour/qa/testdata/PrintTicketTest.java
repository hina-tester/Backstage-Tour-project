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
	
	
	@Test(priority=1)
	public void validateTitle(){
		
		String title = print.validatePageTitle();
		Assert.assertEquals(title,"IIS 10.0 Detailed Error - 500.0 - Internal Server Error");
		
		
	}
	

	@Test(priority=2)
	public void validateBanner(){
		
		boolean flag= print.validateBanner();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=3)
	public void validatemenu(){
		
		boolean flag= print.validatemenu();
		Assert.assertTrue(flag);
		
		
	}
	


	@Test(priority=4)
	public void validatechooseTour(){
		
		String title1 = print.validatechooseTour();
		
		Assert.assertEquals(title1,"About the Tour");
		
	}

	


	@Test(priority=5)
	public void validateRegistration(){
		
		String title1 = print.RegistrationPage();
		Assert.assertEquals(title1,"Register Your Group");
		
		
	}


	@Test(priority=6)
	public void validatechooseDate(){
		
		String title1 =  print.validatechooseDate();
		
		Assert.assertEquals(title1,"Choose Your Tour Date");
		
		
	}

	

	@Test(priority=7)
	public void validateconfirm(){
		
		String title1  = print.validateconfirm();
		Assert.assertEquals(title1,"Review Your Registration");
	
	}



	
	@Test(priority=8)
	public void tick1(){
		
		String title1  = print.tick1();
		Assert.assertEquals(title1,"Register Your Group");
	
	}
	

	@Test(priority=9)
	public void tick2(){
		
		String title1  = print.tick2();
		Assert.assertEquals(title1,"Review Your Registration");
	
	}


	@Test(priority=10)
	public void printTicketmenu() throws InterruptedException{
		
		boolean flag= print.printTicketmenu();
		Assert.assertTrue(flag);
	
			}


	@Test(priority=11)
	public void printTicket() throws InterruptedException{
		
		boolean flag= print.printTicket();
		
		Assert.assertTrue(flag);
			
		
			}

	@Test(priority=12)
	public void validatePageHeading1(){
		
		boolean flag= print.validatePageHeading1();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=13)
	public void validatePageHeading2(){
		
		boolean flag= print.validatePageHeading2();
		Assert.assertTrue(flag);
		
		
	}
	


	@Test(priority=14)
	public void validateOriginal(){
		
		boolean flag= print.validateOriginal();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=15)
	public void validatePlanVisit(){
		
		service= print.validatePlanvisit();
	
	}


	@Test(priority=16)
	public void validatemailto(){
		
		boolean flag= print.validatemailto();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=17)
	public void validateheading1(){
		
		boolean flag= print.validateh1();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=18)
	public void validateheading2(){
		
		boolean flag= print.validateh2();
		Assert.assertTrue(flag);
		
		
	}


	@Test(priority=19)
	public void validateheading3(){
		
		boolean flag= print.validateh3();
		Assert.assertTrue(flag);
		
		
	}


	@Test(priority=20)
	public void validateheading4(){
		
		boolean flag= print.validateh4();
		Assert.assertTrue(flag);
		
		
	}


	@Test(priority=21)
	public void validatedate(){
		
		boolean flag= print.datetext();
		Assert.assertTrue(flag);
		
		
	}

	
	@Test(priority=22)
	public void validatelinkquestion(){
		
		faq =  print.validatelinkquestion();
		
		
		
	}

	
	@Test(priority=23)
	public void validatecardHolderName(){
		
		String name = print.validatecardHolderName();
		
		
		
		Assert.assertEquals(prop.getProperty("cardname"),name);
		
		
	}
	

	@Test(priority=24)
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
		 
		
		
		Assert.assertEquals(fordig,fordig2);
		
		
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	



}
