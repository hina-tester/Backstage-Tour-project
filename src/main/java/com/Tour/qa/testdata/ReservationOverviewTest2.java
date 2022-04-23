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
import com.Tour.qa.pages.EditReservationPage;
import com.Tour.qa.pages.ForgotPassword;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.LoginPage;
import com.Tour.qa.pages.ModifyCancelPage;
import com.Tour.qa.pages.PaymentPage;
import com.Tour.qa.pages.PrintTicket;
import com.Tour.qa.pages.RegistrationPage;
import com.Tour.qa.pages.ResendConfPage;
import com.Tour.qa.pages.ReservationOverview2page;
import com.Tour.qa.pages.ReservationOverviewPage;

public class ReservationOverviewTest2 extends TestBase{
	
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
	EditReservationPage editres;
	ReservationOverview2page res2;
	


	public ReservationOverviewTest2(){
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
		editres = new EditReservationPage();
		res2 = new ReservationOverview2page();
		
			
		
		homePage.CheckModifyCancel();
		loginPage.login(prop.getProperty("email"), prop.getProperty("pw"));
		
		 modifyCancel.CheckModifyButton(prop.getProperty("id"));
		 
				 
		 editres.CheckEditReservationFormWithGuest();
		 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
						
	}
	
	@Test(priority=1,description = "Validate Purchase button work fine on adding more guest on Reservation Overview page")
	public void checkPurchanseTicketButton(){
		
		String  PageTitle =  res2.checkPurchanseTicketButton();
		Assert.assertEquals(PageTitle,"Experient Group DEMO0541 Payment Page: Payment","Purchase button works fine");
		
	}
	
	
	@Test(priority=2,description = "Validate Modify button work fine on adding more guest on Reservation Overview page")
	public void checkModifyButton() throws InterruptedException{
		
		String  PageTitle =  res2.checkModifyButton();
		Assert.assertEquals(PageTitle,"EDIT YOUR RESERVATION","Modify button works fine");
		
	}
	
	@Test(priority=3,description = "Validate cancel button work fine on adding more guest on Reservation Overview page")
	public void checkCancleButton() throws InterruptedException{
		
		String  PageTitle =  res2.checkCancleButton();
		Assert.assertEquals(PageTitle,"Confirm Cancellation");
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

	

}
