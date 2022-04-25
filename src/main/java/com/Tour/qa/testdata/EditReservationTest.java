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
	

	@Test(priority=1,description = "EDIT YOUR RESERVATION page : Validate Page heading displayed as expected")
	public void valiPageHeading(){
		
		boolean  flag =  editReservation.PageHeading();
		Assert.assertTrue(flag,"Heading displayed as expected");
		
		
	}
	

	@Test(priority=2,description = "EDIT YOUR RESERVATION page: Validate Date display as expected")
	public void validate(){
		
		boolean  flag =  editReservation.date();
		Assert.assertTrue(flag,"Date displayed as expected");
		
		
	}
	

	@Test(priority=3,description = "EDIT YOUR RESERVATION page: Validate time of choosen slot display as expected")
	public void validatetime(){
		
		boolean  flag =  editReservation.time();
		Assert.assertTrue(flag,"Time of choosen date displayed as expected");
		
		
	}
	

	@Test(priority=4,description = "EDIT YOUR RESERVATION page : Validate Edit Date link should work as expected")
	public void validateEditDateLink(){
		
		boolean  flag =  editReservation.EditDateLink();
		Assert.assertTrue(flag,"Edit date link work as expected");
		
		
	}
	

	@Test(priority=5,description = "EDIT YOUR RESERVATION page : Validate Group size display as expected")
	public void validateGroupSize(){
		
	 editReservation.GroupSizeLock();
		
		
		
	}
	

	@Test(priority=6,description = "EDIT YOUR RESERVATION page : Validate Special needs section should only display when 'yes' is selected")
	public void validatesNeed(){
		
		boolean  flag = editReservation.CheckSpecialNeedOption();
		Assert.assertTrue(flag,"Special need options displayed when 'yes' option is selected");
		
	}
	


	@Test(priority=7,description = "EDIT YOUR RESERVATION page : Validate 'Visit Guest Services for more information' link should work as expected")
	public void validalink(){
		
		service= editReservation.guestLink();
		
		
	}
	
	
	@Test(priority=8,description = "EDIT YOUR RESERVATION page : Edit the form fields and validate form should updated successfully")  //check edit form by fillinf valid data and clicking button
	
	public void validaeditForm() throws InterruptedException{
		
		boolean  flag =  editReservation.CheckEditReservationForm();
		Assert.assertTrue(flag,"From updated successfully");
		
		
	}


	@Test(priority=9,description = "EDIT YOUR RESERVATION page : Error should be display on clicking button without providing any data on form")
	public void validaedtiEmptyForm(){
		
		boolean  flag =  editReservation.CheckEditReservationFormWithEmpty();
		Assert.assertTrue(flag,"errors displayed for mandatory fields");
		
		
	}
	
	

	@Test(priority=10,description = "EDIT YOUR RESERVATION page: Validate 'Additional Guests' should display on clicking submit button on leaving empty or providing invalid input for group name and vehical number field")
	public void GuestFieldOnErrorPage(){
		
		boolean  flag =  editReservation.guestFieldOnerrorpage();
		
		System.out.println(flag);
		
		Assert.assertTrue(flag,"Additional Guests field display on clicking button on empty fields ");
		
		
	}
	


	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	



}
