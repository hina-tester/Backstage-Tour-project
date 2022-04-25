package com.Tour.qa.testdata;

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
import com.Tour.qa.pages.ModifyCancelPage;
import com.Tour.qa.pages.PaymentPage;
import com.Tour.qa.pages.PrintTicket;
import com.Tour.qa.pages.RegistrationPage;
import com.Tour.qa.pages.ResendConfPage;
import com.Tour.qa.pages.ReservationOverviewPage;




public class FaqPageTest  extends TestBase{
	

	
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
	ModifyCancelPage modifyCancel;
	ReservationOverviewPage reservation;
	ResendConfPage resend;
	CusgtomerPlan planVisit;
	FAQ faq;
	



	public FaqPageTest(){
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
		modifyCancel = new ModifyCancelPage();
		reservation = new ReservationOverviewPage();
		resend = new ResendConfPage();
		planVisit = new CusgtomerPlan();
		faq = new FAQ();
		
		homePage.CheckModifyCancel();
		loginPage.login(prop.getProperty("email"), prop.getProperty("pw"));
		faq.validateFAQPage();
			
				
	}
	
	
	
	@Test(priority=1,description = "FAQ Page : Validate Page heading display correct")
	public void validatePageHeading(){
		
		boolean  flag =  faq.validatePgaeHeading();
		Assert.assertTrue(flag);
		
		
	}
	
	@Test(priority=2,description = "FAQ Page : Validate Questions display as expected")
	public void validateQuestions(){
		
		boolean  flag =  faq.validatequestions();
		Assert.assertTrue(flag);
		
		
	}
	

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
