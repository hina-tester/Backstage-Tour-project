package com.Tour.qa.testdata;

import java.math.RoundingMode;
import java.text.DecimalFormat;
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
import com.Tour.qa.pages.ForgotPassword;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.LoginPage;
import com.Tour.qa.pages.PaymentPage;
import com.Tour.qa.pages.RegistrationPage;



public class ConfirmationPageTest  extends TestBase{
	

	
	HomePage homePage;
	ChoosTour chooseTour;
	ChoosDatePage chooseDate;
	RegistrationPage RegisPage;
	Confirm confirmPage;
	LoginPage loginPage;
	ForgotPassword fgPage;
	CusgtomerPlan service;
	PaymentPage payment;
	
	


	public ConfirmationPageTest(){
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
		
		chooseTour = homePage.CheckPurchaseTicket();
		
		int groupsize ;
		
        groupsize = Integer.parseInt(prop.getProperty("groupsize"));   
		 
		chooseDate = chooseTour.EnterageGroup1(groupsize);
				
		 RegisPage = chooseDate.SelectValidSlot(prop.getProperty("monthYear"), prop.getProperty("date"));
		 RegisPage.CheckFillData();
		 
		 
	//	 confirmPage = 
			//	 RegisPage.CheckFillData();
				 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
		
					
	}
	
	
	
	@Test(priority=1,description = "Validate tour type displayed as expected")
	public void ValidateTourType(){
		
		
		
		String TourType = confirmPage.validateTourType();
		Assert.assertEquals(TourType,(prop.getProperty("tourname")));
	}
	
	
	
	@Test(priority=2,description = "Validate First name display as expected")
	public void Validatefname(){
			
		 String fname = "fname";
		String fname1 = confirmPage.validateFname();
		Assert.assertEquals(fname1,fname);
	}
	
	

	@Test(priority=3,description = "Validate Last name display as expected")
	public void ValidateLname(){
		
		String lname = "lname";
			
		String lname1 = confirmPage.validateLname();
		Assert.assertEquals(lname1,lname);
	}
	
	
	
	@Test(priority=4,description = "Validate cost should display as expected")
	public void ValidateCost(){
		
	
	    DecimalFormat df = new DecimalFormat("#.##");
	    df.setRoundingMode(RoundingMode.DOWN);
	    
		double a,b,subTotal;
		
				 b=10.78;
								 
		String pageTot = confirmPage.validateCost();
		

		 subTotal = Double.parseDouble(prop.getProperty("groupsize"));
		 a = subTotal * b ;
		 
		 
        
   // String str = String.format("%.2f", a);
		 
		
       
		String tot = "$" + df.format(a) + " (includes tax)";
		
						
		Assert.assertEquals(pageTot, tot);
	}
	
	
	
	@Test(priority=5,description = "Validate ZipCode display as expected")
	public void ValidateZip(){
			
		String zip1 = "11122";
		
		String zip2 = confirmPage.validateZipCode();
		Assert.assertEquals(zip1,zip2);
		
		
	}
	@Test(priority=6,description = "Validate Mobile number should display as expected")
	public void ValidateMobile(){
		
		String mob = "3214679421";
		
			
		String mob2 = confirmPage.validateMobile();
		Assert.assertEquals(mob,mob2);
		
	}
	
	
	
	@Test(priority=7,description = "Validate Group Size should display as expected on top of the page")
	public void ValidateGroupSize(){
		
		String GroupSzie = prop.getProperty("groupsize");

		String gpsize = confirmPage.validateGroupSizeInput();
		Assert.assertEquals(GroupSzie,gpsize);
			
		
	}
	
	
	@Test(priority=8,description = "Validate Group Type display as expected")
	public void ValidateTypeOfGrop(){
		
		 String TypeOfGroup = "Family with Kids";
			
		 String typeOfGroup = confirmPage.validateTypeOfGroup();
			Assert.assertEquals(TypeOfGroup,typeOfGroup);
				
			
	}
	@Test(priority=9,description = "Validate Group name display as expected")
	public void ValidateNameOfGroup(){
		
		 String NameOfGroup = "new group";
			
		String namegroupe = confirmPage.validateNameOfGroupe();
		Assert.assertEquals(NameOfGroup,namegroupe);
	}
	
	
	
	@Test(priority=10,description = "Validate Travelling option should display as expected")
	public void ValidateTravell(){
		
		 String travill = "Car";
			
		 String transport = confirmPage.validateTransport();
			Assert.assertEquals(transport,travill);
	}
	
	
	
	@Test(priority=11,description = "Validate Vehical number should displayed as expected")
	public void ValidateVehical(){
		
		 String vihical1 = "2";
			
		 String vihical = confirmPage.validateVehicalnumber();
			Assert.assertEquals(vihical1,vihical);
	}
	
	
	
	//----------
	
	@Test(priority=12,description = "Validate Page Banner should display on page")
	public void validateBannerTest(){
			
		boolean flag = confirmPage.validateBanner();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=13,description = "Validate Group type should display as expected")
	public void validateTheOriginalTest(){
		
		String groupty = confirmPage.validateTheOriginal();
		Assert.assertEquals(groupty,prop.getProperty("tourname"));
		
	}
	

	@Test(priority=14,description = "Validate page title should display as expected")
	public void validateTitle(){
		
		String title = confirmPage.validatePageTitle();
		Assert.assertEquals(title,"Review Your Registration");
		
	}
	
	

	@Test(priority=16,description = "Validate Group Size on page data should display as expected")
	public void validateGroupSizeTest(){
		
		String size = confirmPage.validateGroupSize();
		Assert.assertEquals(size,prop.getProperty("groupsize"));
		
	}
	
	
	@Test(priority=17,description = "Validate choose tour from menu bar should display and work as expected")
	public void validateChooseTourMenuOption(){
		
		chooseTour	 = confirmPage.validateChooseTourMenuOption();
	
	}
	
	
	@Test(priority=18,description = "Validate choose Date option form menu bar display and work as expected")
	public void validateChooseDateOption(){
		
		chooseDate	 = confirmPage.validateChooseDateOption();
	
	}
	
	
	@Test(priority=19,description = "Validate Rigistration option from menu bar should display and work as expected")
	public void validateRegistration(){
		
		RegisPage	 = confirmPage.validateRegistration();
	
	}
	
	@Test(priority=20,description = "Validate Confirm page option from menu bar should display and work as expected")
	public void validateTick(){
		
		boolean flag = confirmPage.validateTick();
		Assert.assertTrue(flag);
	
	}
	
	@Test(priority=21,description = "Validate Page heading should display as expected")
	public void validatePageHeading(){
		
		boolean flag = confirmPage.validatePageHeading();
		Assert.assertTrue(flag);
	
	}
	
	
	@Test(priority=22,description = "Validate Purchase Ticket Button should work as expected")
	public void validatePurchaseTicketButt(){
		
		payment = confirmPage.validatePurchaseTicketButt();
		
	
	}
	
	
	@Test(priority=23,description = "Validate Heading 1 should display as expected")
	public void validateHeading1(){
		
		boolean flag = confirmPage.validateHeading1();
		Assert.assertTrue(flag);
	
	}
	
	@Test(priority=24,description = "Validate Page heading 2 should display as expected")
	public void validateHeading2(){
		
		boolean flag = confirmPage.validateHeading2();
		Assert.assertTrue(flag);
	
	}
	@Test(priority=25,description = "Validate Page heading 3 should display as expected")
	public void validateHeading3(){
		
		boolean flag = confirmPage.validateHeading3();
		Assert.assertTrue(flag);
	
	}
	@Test(priority=26,description = "Validate page heading 4 should display as expected")
	public void validateHeading4(){
		
		boolean flag = confirmPage.validateHeading4();
		Assert.assertTrue(flag);
	
	}
	
	@Test(priority=27,description = "Validate heading 5 should display as expected")
	public void validateHeading5(){
		
		boolean flag = confirmPage.validateHeading5();
		Assert.assertTrue(flag);
	
	}
	
	
	@Test(priority=28,description = "Validate Purchase Ticket from bottom of the page should work as expected")
	public void validatePurchaseTicketButt2(){
		
		payment = confirmPage.validatePurchaseTicketButt2();
	
	
	}
	
	@Test(priority=29,description = "Validate Modify Reservation button should work as expected")
	public void validateModifyReservationButt2(){
		
		chooseDate = confirmPage.validateModifyReservationButt2();
	
	
	}
	
	@Test(priority=30,description = "Validate Cancel button should work as expected")
	public void validateCancelButt2(){
		
		homePage = confirmPage.validateCancelButt2();
	
	
	}
	
	
	
	@Test(priority=31,description = "Validate Main menu should display as expected on top of the page")
	public void CheckTopMenu(){
		
		boolean flag = confirmPage.validatemenu();


if(driver.getPageSource().contains("FAQ"))
		
	 {
		
		System.out.println("Menu is displaying on page");
	}

	else {
		System.out.println("Main top menu is missing from page");
	}
Assert.assertTrue(flag);
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
