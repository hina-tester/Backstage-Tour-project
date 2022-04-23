package com.Tour.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.CheckHeadersAndFooters;
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




public class HeaderFooterTest  extends TestBase{
	

	
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
	CheckHeadersAndFooters hf;
	


	public HeaderFooterTest(){
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
		hf = new CheckHeadersAndFooters();
		
		
		homePage.CheckModifyCancel();  //to reach on login page first we have to navigate home page then click modify link and
		loginPage.login(prop.getProperty("email"), prop.getProperty("pw")); //then login
		
	
					
	}
	

	@Test(priority=1,description = "Validate Home link work fine")
	public void validateeHomelink(){
		
		boolean flag =  hf.validatehomeLink();
		Assert.assertTrue(flag);
	}
	

	@Test(priority=2,description = "Validate Purchase ticket option from top menu work fine")
	public void validateePurchacelink(){
		
		boolean flag =  hf.validatehomeLink();
		Assert.assertTrue(flag);
		
	}
	

	@Test(priority=3,description = "Validate Plan Visit option from topm menu work fine")
	public void validateePlanvisitlink(){
		
		boolean flag =   hf.validatePlanYourVisitLink();
		Assert.assertTrue(flag);
	}
	
	


	@Test(priority=4,description = "Validate Modify/Cancle option from top menu work fine")
	public void validateeMOdifylink(){
		
		boolean flag =   hf.validateModifyLink();
		Assert.assertTrue(flag);
		
	}
	


	@Test(priority=5,description = "Validate Resend option from top menu work fine")
	public void validateResendlink(){
		
		boolean flag =   hf.validateResendLink();
		Assert.assertTrue(flag);
		
		
	}
	

	

	@Test(priority=6,description = "Validate FAQ option from top menu work fine")
	public void validateFAQLink(){
		
		boolean flag =   hf.validateFAQLink();
		Assert.assertTrue(flag);
		
	}
	
	
	
	@Test(priority=7,description = "Validate Link from footer work fine")
	public void validateChickLink(){
		
		boolean flag =  hf.validateChickLink();
		Assert.assertTrue(flag);
		
		
	}
	@Test(priority=8,description = "Validate  leagle link form footer work fine")
	public void validateLeagleLink(){
		
		boolean flag =  hf.validateLegalLink();
		Assert.assertTrue(flag);
		
		
	}
	
	
	@Test(priority=9,description = "Validate Privacy link from footer work fine")
	public void validatePriLink(){
		
		boolean flag =  hf.validatePrivacyLink();
		Assert.assertTrue(flag);
		
		
	}


	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
