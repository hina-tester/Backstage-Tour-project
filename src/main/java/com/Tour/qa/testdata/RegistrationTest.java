package com.Tour.qa.testdata;


import java.time.Duration;

import org.openqa.selenium.By;
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
import com.Tour.qa.pages.RegistrationPage;


public class RegistrationTest  extends TestBase{

			

	
	HomePage homePage;
	ChoosTour chooseTour;
	ChoosDatePage chooseDate;
	RegistrationPage RegisPage;
	Confirm confirmPage;
	LoginPage loginPage;
	ForgotPassword fgPage;
	CusgtomerPlan service;
	
	


		public RegistrationTest(){
			super();
		}
		
		

		@BeforeMethod
		public void setUp() throws InterruptedException{
			initialization();
			chooseTour = new ChoosTour();	
			homePage = new HomePage();
			confirmPage = new Confirm();
			RegisPage = new RegistrationPage();
			loginPage = new LoginPage();
			fgPage = new ForgotPassword();
			service = new CusgtomerPlan();
			
			chooseTour = homePage.CheckPurchaseTicket();
			
			int groupsize ;
			
	        groupsize = Integer.parseInt(prop.getProperty("groupsize"));   
			 
			chooseDate = chooseTour.EnterageGroup1(groupsize);
			
			
			
			 RegisPage = chooseDate.SelectValidSlot(prop.getProperty("monthYear"), prop.getProperty("date"));
			 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
						
		}
		

		@Test(priority=1,description = "Validate Registration form without signin work fine and User navigate on Next page successfully")
		public void CheckFillDataInRegistrationForm(){
			
			String Actualheading = RegisPage.CheckFillData();
			
	String ExpactedHeading=		driver.findElement(By.xpath("//h1[contains(text(),'CONFIRM RESERVATION AND PURCHASE TICKET')]")).getText();
			
			Assert.assertEquals(Actualheading,ExpactedHeading);
			
//			confirmPage = RegisPage.CheckFillData();
			
			
			
			
		}
		
	
	
		@Test(priority=2,description = "Validate proper error message should displayed on providing inavlid email like only abc or abc@")
		public void CheckInvalidEmail() throws InterruptedException {
			
			boolean flag= RegisPage.CheckInvalidEmail("abc");
			
			Assert.assertTrue(flag);
		//	System.out.print("No error message displayed on providing invalid Email");
			
			
			
		}
	
		
		@Test(priority=3,description = "Validate that proper error message should displayed on providing duplicate email")
		public void CheckduplicateEmail() throws InterruptedException {
			
		
			boolean flag=RegisPage.Checkduplicateemail(prop.getProperty("email"));
			Assert.assertTrue(flag);
		
			
		}
		
				@Test(priority=4,description = "Validate Proper error message should display for providing invalid data in each form's fields")
		public void CheckinvalidData() throws InterruptedException{
			
			boolean flag = RegisPage.fillInvalidForm();
			Assert.assertTrue(flag);
			
			
			
		}
	
		
		@Test(priority=5,description = "Validate that proper error message should displayed for each mandatory field on clicking button without providing any data on form")
		public void emptyFormtTest() throws InterruptedException{
			boolean flag = RegisPage.emptyForm();
			Assert.assertTrue(flag);
			
			
		}


		
		@Test(priority=6,description = "Validate that proper error message should displayed on providing invalid password like char are less then 8 char, or provide on int or only char")
		public void invalidPasswordTest() throws InterruptedException{
			boolean flag = RegisPage.invalidPassword("test11");
			Assert.assertTrue(flag);
			
			
		}
		
	
		@Test(priority=7,description = "Validate that proper error message should dispalyed on providing invalid zipCode like less than 5 char")
		public void invalidZipCodeTest() throws InterruptedException{
			boolean flag = RegisPage.invalidZipCode("tes");
			Assert.assertTrue(flag);
			
			
		}
		
		
		@Test(priority=8,description = "Validate proper error message should displayed on providing invalid mobile number as per rules")
		public void invalidMobNumber() throws InterruptedException{  // provide less then 10 int
			
			String text = "1234";
			String error = RegisPage.invalidmobileWithStrign(text);
			Assert.assertEquals(error, "The value '"+text+"' is invalid.");
				
			
		}
		
		@Test(priority=8,description = "Validate proper error message should displayed on providing invalid mobile number as per rules")
		public void invalidMobWithLeassDigit() throws InterruptedException{  // provide less then 10 int
			
			int text = 1234;
			String error = RegisPage.intigermobile(text);
			Assert.assertEquals(error, "The value '"+text+"' is invalid.");
				
			
		}
		
		
		@Test(priority=8,description = "Validate proper error message should displayed on providing invalid mobile number as per rules")
		public void ErrorShouldDisplyOnPrpviding10CharInMobileFildOdRegidtrationPage() throws InterruptedException{  //enter character
			
			String text = "qwertyuiop";
					
			String error = RegisPage.invalidmobile2(text);
			Assert.assertEquals(error, "The value '"+ text +"' is invalid.");
				
			
		}
		
		
		@Test(priority=9,description = "Validate proper error message should dispalyed on providing less digits in mobile field/ invalid data")
		public void TestLessDigitinMob() throws InterruptedException{
			
			int num =7876;
			String error = RegisPage.intigermobile(num);
				
			Assert.assertEquals(error, "The value '"+num+ "' is invalid.");
			
			if(driver.getPageSource().contains("phone number must be 10 digits"))	
			 {
					
					System.out.println("Proper error message displayed on providing invalid ");
					
					
				}
			else {
				System.out.println("No proper error message displayed on providing invalid");
			}
				
			
		}
		
		
		@Test(priority=10,description = "Validate proper error message should display on providing only int in password field")
		public void TestPasseordWithOnlyInt() throws InterruptedException{
			
			int num =12345678;
			String error2 = RegisPage.checkPWwithin(num);
			Assert.assertEquals(error2, "Passwords must be at least 8 characters and contain numbers and letters.");
				
			
		}
		
		
		
		@Test(priority=11,description = "Validate that proper error message should displayed on providing only string in password field")
		public void testPasswordWithOnlyString() throws InterruptedException{
			
			
			String error3 = RegisPage.checkPWwithst("aassddff");
			Assert.assertEquals(error3, "Passwords must be at least 8 characters and contain numbers and letters.");
				
			
		}
	
		
		@Test(priority=12,description = "Validate error message should dispayed on providing invalid input in first name field")
		public void checkFirstName() throws InterruptedException{
			
			int name=111;
			
			String text = RegisPage.CheckFname(name);
			
			if(driver.getPageSource().contains("Enter valid First name"))	
			 {
					
					System.out.println("Proper error message displayed on providing invalid First name");
					
					
				}
			else {
				System.out.println("No proper error message displayed on providing invalid First name");
				
			}
		
					

					
	Assert.assertEquals(text.contains("Enter valid First name"), true);//check error displayed on providing invalid name or not when error not displayed
	

		
		
		}
			
		
		@Test(priority=13,description = "Validate error message should dispayed on providing invalid input in last name field")
		public void checkLastName() throws InterruptedException{
			
			int name=111;
			
			String text = RegisPage.CheckLname(name);
				
			Assert.assertEquals(text.contains("Enter valid Last name"), true); //check error displayed on providing invalid name or not when error not displayed
		
			if(driver.getPageSource().contains("Enter valid Last name"))	 {
				
				System.out.println("Proper error message displayed on providing invalid Last name");
					
						}
					else {
						System.out.println("No proper error message displayed on providing invalid First name");
						
					}
			
			
		}
		
		
		@Test(priority=14,description = "Validate proper error message should displayed on providing different email and confirm email field")
		public void checkEmailnotMatch() throws InterruptedException{
			
			
			String text = RegisPage.Emailnotmatch("abs@gmail.com","xyd@gmail.com");
			
			
			Assert.assertEquals(text, "Emails do not match.");
			
			
		}
		
		
		@Test(priority=15,description = "Validate error display on providing different password and confirm password field")
		public void BothPasswordFieldNotMatch() throws InterruptedException{
			
			
			String text = RegisPage.PWnotmatch("qwer1234","fghj1234");
			
			
			Assert.assertEquals(text, "The password and confirmation password do not match.");
			
			
		}
		
		
		@Test(priority=16,description = "Validate error should displayed on leaving mandatory fields on form")
		public void checkMandatoryFieldsOnLeavinfEmpty() throws InterruptedException{
			
			
			 RegisPage.CheckMandatoryFields();
			
						
		}
		
		
		
		@Test(priority=17,description = "Validate proper error message should displayed on providing invalid data in vehicales field")
		public void VehiclesFieldWithCharacter() throws InterruptedException{
			
			String number = "qw";
			String text = RegisPage.invalidVehical("qw");  //changing int into string
			
			
			Assert.assertEquals(text, "The value '"+ number +"' is not valid for Number of Vehicles.");
			
			
		}
		
		
		
		@Test(priority=18,description = "Validate error message should displayed on providing invalid data in group size field")
		public void checkGroupSizeWithString() throws InterruptedException{
			
			
			String text1 = "abc";
			String text = RegisPage.ChangeGroupSizeToString(text1); //change int into string
			

			Assert.assertEquals(text.contains("Please enter a valid number for the size of your group"), true); 
				//check text on whole page
		}
		
		
		
		@Test(priority=19,description = "Validate page heading is displaying on page")
		public void HomePageTitleTest(){
			
			
			
			String title = RegisPage.validatePageTitle();
			Assert.assertEquals(title, "Register Your Group");
		}
		@Test(priority=20,description = "Validate banner is displaying on page")
		public void CheckBanner(){
			boolean flag = RegisPage.validateBanner();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=21,description = "Validate Group type displayed correct as per given data ")
		public void validateGroupText1(){
			
			String group = RegisPage.validateTheOriginal();
			
			Assert.assertEquals(group,  prop.getProperty("tourname"));
		}
		
		
		
		@Test(priority=22,description = "Validate Group size displaying correct as per given data")
		public void validateGroupSize(){
			
			String date = RegisPage.validateGroupSize();
			
			Assert.assertEquals(date,prop.getProperty("groupsize"));
		}
		
		
		
		@Test(priority=23,description = "Validate on clicking choose date from sub bar menu is working fine and choose date page should navigate by clicking this link")
		public void validateChoosFromMenuBar(){
			chooseTour = RegisPage.validateChooseTourMenuOption();
				
		
		}
		
		@Test(priority=24,description = "Validate date should displayed as per given data")
		public void validateChoosDateFromMenuBar(){
			chooseDate = RegisPage.validateChooseDateOption();
				
		
		}
		
		@Test(priority=25,description = "Validate Heading of page displaying ")
		public void HeadingValidate1(){
			boolean flag = RegisPage.validatePageHeading();
			Assert.assertTrue(flag);
		}

		@Test(priority=26,description = "Validate login button is working fine,it should navigate onlogin page")
		public void validateLoginButton(){
			loginPage = RegisPage.validateloginbutton();
				
		
		}
		
		@Test(priority=27,description = "Validate forgot password link is working fine")
		public void validateForgot(){
			fgPage = RegisPage.validateforgotpw();
				
		
		}
		
		
		

		@Test(priority=28,description = "Validate form heading is display fine")
		public void ValidateHeading2(){
			boolean flag = RegisPage.validateheading2();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=29,description = "Validate form heading of section display fine")
		public void ValidateHeading3(){
			boolean flag = RegisPage.validateheading3();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=30,description = "Validate form section heading should displaying fine")
		public void ValidateHeading4(){
			boolean flag = RegisPage.validateheading4();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=31,description = "Validate form section heading should displaying fine")
		public void ValidateHeading5(){
			boolean flag = RegisPage.validateheading5();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=32,description = "Validate link for gues service should work fine")
		public void validateService(){
			service = RegisPage.validatevisitGuestService();
				
		
		}
		
	

		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		
	}


