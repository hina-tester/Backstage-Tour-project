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
import com.Tour.qa.pages.ForgotPassword;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.LoginPage;
import com.Tour.qa.pages.ModifyCancelPage;
import com.Tour.qa.pages.PaymentPage;
import com.Tour.qa.pages.PrintTicket;
import com.Tour.qa.pages.RegistrationPage;
import com.Tour.qa.pages.ResendConfPage;
import com.Tour.qa.pages.ReservationOverviewPage;

public class PlanYourVisitText extends TestBase { //test calss of cusgtomerPlan page
	

	
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
	
	


	public PlanYourVisitText(){
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
			
		
		homePage.CheckModifyCancel();
		loginPage.login(prop.getProperty("email"), prop.getProperty("pw"));
		planVisit.validateLinkmenu();
			
	
					
	}
	@Test(priority=1,description = "Plan your Visit Page :Validate Page title should display as expected")
	public void validateTitle(){
		
		boolean  flag =  planVisit.validatePageHeading();
		Assert.assertTrue(flag);
		
		
	}
	
	@Test(priority=2,description = "Plan your Visit Page :Validate Get Paid Direction button work fine")
	public void validateGetPaidDirectionButton(){
		
		boolean  flag =  planVisit.validateGetPaidDirectionButton();
		Assert.assertTrue(flag);
		
		
	}
	
	@Test(priority=3,description = "Plan your Visit Page :Validate Get Google Direction button work fine")
	public void validateGetGoogleDirectionButton(){
		
		boolean  flag =  planVisit.validateGetGoogleDirectionButton();
		Assert.assertTrue(flag);
		
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
