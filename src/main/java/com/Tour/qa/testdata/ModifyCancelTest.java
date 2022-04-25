package com.Tour.qa.testdata;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.time.Duration;

import org.testng.Assert;
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





public class ModifyCancelTest extends TestBase{



	
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
	



	public ModifyCancelTest(){
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
			
		
		homePage.CheckModifyCancel();
		loginPage.login(prop.getProperty("email"), prop.getProperty("pw"));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
					
	}
	
	
	@Test(priority=1,description = "Modify Cancel page: Validate Correct page displayed")
	public void validateTitle(){
		
		String title = modifyCancel.validatePageTitle();
		Assert.assertEquals(title,"Modify Your Reservation");
		
		
	}
	
	
	
	
	@Test(priority=2,description = "Modify Cancel page: Validate Banner displayed as expected")
	public void validateBanner(){
		
		boolean  flag =  modifyCancel.validateBanner();
		Assert.assertTrue(flag);
		
		
	}
	
	

	@Test(priority=3,description = "Modify Cancel page: Validate Main menu displayed as expected")
	public void validateMenu(){
		
		boolean  flag =  modifyCancel.validatemenu();
		Assert.assertTrue(flag);
		
		
	}
	


	@Test(priority=4,description = "Modify Cancel page: Validate Correct User Name displayed on page")
	public void validateName(){
		
		boolean  flag =  modifyCancel.validatename();
		Assert.assertTrue(flag);
		
		
	}
	
	

	@Test(priority=5,description = "Modify Cancel page: Validate page heading should display as expected")
	public void validatePageH(){
		
		boolean  flag =  modifyCancel.validatePaheHeading();
		Assert.assertTrue(flag);
		
		
	}

	
	@Test(priority=6,description = "Modify Cancel page: Validate logout work fine")
	public void validatelogout(){
		
		String title = modifyCancel.validateLogOut();
		Assert.assertEquals(title,"Logon");
		
		
	}
	

	@Test(priority=7,description = "Modify Cancel page: Validate  Review button works fine")
	public void checkReview() throws InterruptedException {
		
		boolean  flag = modifyCancel.CheckReviewButton(prop.getProperty("id"));
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=8,description = "Modify Cancel page: Validate Resends button work fine")
	public void checkResend() throws InterruptedException {
		
		boolean  flag = modifyCancel.CheckResendButton(prop.getProperty("id"));
		Assert.assertTrue(flag);
		
		
	}
	
	
	@Test(priority=9,description = "Modify Cancel page: Validate Modify button work fine")
	public void checkModify() throws InterruptedException {
		
		boolean  flag = modifyCancel.CheckModifyButton(prop.getProperty("id"));
		Assert.assertTrue(flag);
		
		
	}
	

	@Test(priority=10,description = "Modify Cancel page: Validate Cancel button work fine")
	public void CheckCancelButton() throws InterruptedException {
		
		modifyCancel= modifyCancel.CheckCancelButton(prop.getProperty("id2"));
		
		
	}
	

	
	@Test(priority=11,description = "Modify Cancel page: Validate cancel confirmation window title display correct")
	public void CheckCancelConfirmationWindowTitle() throws InterruptedException {
		
		String msg = modifyCancel.CheckCancelDBoxTitle(prop.getProperty("id2"));
		Assert.assertEquals(msg,"Confirm Cancellation");
		
		
	}
	
		
	@Test(priority=12,description = "Modify Cancel page: Validate close button on cancel confirmation window work fine")
	public void checkCloseCancelwin() throws InterruptedException {
		
		modifyCancel = modifyCancel.CheckcloseCancelwin(prop.getProperty("id"));
		
		
	}
	
	
	@Test(priority=13,description = "Modify Cancel page: Validate delete button on cancel confirmation window work fine")
	public void checkDeleteTour() throws InterruptedException {
		
		boolean  flag = modifyCancel.CheckcDeleteTour(prop.getProperty("id"));
		Assert.assertTrue(flag);
		
		
		
	}
	


	@Test(priority=14,description = "Modify Cancel page: Validate if date is current date, user should not able to cancle or edit resevation")
	public void validateCancelAndModifyButtonOfexpiredDate() throws InterruptedException, ParseException {  //if date is after or equal, cancel and modify buttond should not displayed
		
		boolean  flag = modifyCancel.checkDate(prop.getProperty("id4"));
		
		Assert.assertTrue(flag);
		
		
		
	}
	

	@Test(priority=15,description = "Modify Cancel page: Validate group size should display as expected for selected id")
	public void printGroupSize(){
		
		int title = modifyCancel.returnGroupSize(prop.getProperty("id"));
		
		System.out.print(title);
		
		
	}

	
	@Test(priority=16,description = "Modify Cancel page: Validate total number of table")
	public void totalNumbersOfTable() throws InterruptedException{
		
		int title = modifyCancel.tableTotalrow();
		
		System.out.print(title);
		
		
	}
	
	
	@Test(priority=17,description = "Modify Cancel page: Validate purchase ticket  option from top menu work fine,and an extra record should display on modify page table") //full path from start to end
	public void PurchaceTicket() throws InterruptedException{
		
		
		 modifyCancel.PlaceOrder(prop.getProperty("monthYear"), prop.getProperty("date"));
		 
		 int table1 = modifyCancel.tableTotalrow();
			
			System.out.print(table1);
			
			payment = confirmPage.validatePurchaseTicketButt();
		
			payment.validatePayment();
			modifyCancel.BackToModifyPage();
			
			boolean status =false;
			
			int table2 = modifyCancel.tableTotalrow();
			
			if( table1 > table2) {
				
				status =  true;
				System.out.print(table2);
				
			}
			
			else {
				
				status = false;
			}
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
