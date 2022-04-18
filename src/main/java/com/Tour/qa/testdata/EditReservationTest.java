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
import com.Tour.qa.pages.EditReservationPage;
import com.Tour.qa.pages.ForgotPassword;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.LoginPage;
import com.Tour.qa.pages.ModifyCancelPage;
import com.Tour.qa.pages.PaymentPage;
import com.Tour.qa.pages.PrintTicket;
import com.Tour.qa.pages.RegistrationPage;
import com.Tour.qa.pages.ResendConfPage;
import com.Tour.qa.pages.ReservationOverviewPage;



public class EditReservationTest extends TestBase {
	


	
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
	EditReservationPage editReservation;
	



	public EditReservationTest(){
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
		editReservation = new EditReservationPage();
		
		homePage.CheckModifyCancel();
		loginPage.login(prop.getProperty("email"), prop.getProperty("pw"));
		 modifyCancel.CheckModifyButton(prop.getProperty("id"));
		 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
				
	}
	

	@Test(priority=1)
	public void valiPageHeading(){
		
		boolean  flag =  editReservation.PageHeading();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=2)
	public void validate(){
		
		boolean  flag =  editReservation.date();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=3)
	public void validatetime(){
		
		boolean  flag =  editReservation.time();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=4)
	public void validateDateLink(){
		
		boolean  flag =  editReservation.EditDateLink();
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=5)
	public void validateGroupSize(){
		
	 editReservation.GroupSizeLock();
		
		
		
	}
	

	@Test(priority=6)
	public void validatesNeed(){
		
		boolean  flag = editReservation.CheckSpecialNeedOption();
		Assert.assertTrue(flag);
		
	}
	


	@Test(priority=7)
	public void validalink(){
		
		service= editReservation.guestLink();
		
		
	}
	
	
	@Test(priority=8)  //check edit form by fillinf valid data and clicking button
	
	public void validaeditForm() throws InterruptedException{
		
		boolean  flag =  editReservation.CheckEditReservationForm();
		Assert.assertTrue(flag);
		
		
	}


	@Test(priority=9)
	public void validaedtiEmptyForm(){
		
		boolean  flag =  editReservation.CheckEditReservationFormWithEmpty();
		Assert.assertTrue(flag);
		
		
	}
	
	

	@Test(priority=10)
	public void GuestFieldOnErrorPage(){
		
		boolean  flag =  editReservation.guestFieldOnerrorpage();
		Assert.assertTrue(flag);
		
		
	}
	


	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	



}
