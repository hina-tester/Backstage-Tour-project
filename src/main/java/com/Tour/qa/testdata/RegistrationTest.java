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
			
			
						
		}
		

		@Test(priority=1)
		public void CheckFillData(){
			
			String titlecheck = RegisPage.CheckFillData();
			
			Assert.assertEquals(titlecheck,"Register Your Group");
			
//			confirmPage = RegisPage.CheckFillData();
			
			
			
			
		}
		
	
		
		@Test(priority=2)
		public void CheckInvalidEmail() throws InterruptedException {
			
			boolean flag= RegisPage.CheckInvalidEmail("abc");
			
			Assert.assertTrue(flag);
		//	System.out.print("No error message displayed on providing invalid Email");
			
			
			
		}
	
		
		@Test(priority=3)
		public void CheckduplicateEmail() throws InterruptedException {
			
		
			boolean flag=RegisPage.Checkduplicateemail(prop.getProperty("email"));
			Assert.assertTrue(flag);
		
			
		}
		
				@Test(priority=4)
		public void CheckinvalidData() throws InterruptedException{
			
			boolean flag = RegisPage.fillInvalidForm();
			Assert.assertTrue(flag);
			
			
			
		}
	
		
		@Test(priority=5)
		public void emptyFormtTest() throws InterruptedException{
			boolean flag = RegisPage.emptyForm();
			Assert.assertTrue(flag);
			
			
		}

		
		
		@Test(priority=6)
		public void invalidPasswordTest() throws InterruptedException{
			boolean flag = RegisPage.invalidPassword("test11");
			Assert.assertTrue(flag);
			
			
		}
		
	
		@Test(priority=7)
		public void invalidZipCodeTest() throws InterruptedException{
			boolean flag = RegisPage.invalidZipCode("tes");
			Assert.assertTrue(flag);
			
			
		}
		
		
		@Test(priority=8)
		public void textcharacterinMobe() throws InterruptedException{
			
			
			String error = RegisPage.invalidmobile("tes");
			Assert.assertEquals(error, "Please enter a valid Mobile Phone #");
				
			
		}
		
		
		@Test(priority=9)
		public void TestLessDigitinMob() throws InterruptedException{
			
			
			String error = RegisPage.invalidmobile("27876");
			Assert.assertEquals(error, "Please enter a valid Mobile Phone #");
				
			
		}
		
		
		@Test(priority=10)
		public void TestpwwithInt() throws InterruptedException{
			
			
			String error2 = RegisPage.checkPWwithin("2787688");
			Assert.assertEquals(error2, "Passwords must be at least 8 characters and contain numbers and letters.");
				
			
		}
		
		@Test(priority=11)
		public void testPWwithString() throws InterruptedException{
			
			
			String error3 = RegisPage.checkPWwithst("aassddff");
			Assert.assertEquals(error3, "Passwords must be at least 8 characters and contain numbers and letters.");
				
			
		}
	
		
		@Test(priority=12)
		public void checkFname() throws InterruptedException{
			
			
			String text = RegisPage.CheckFname("111");
			
			

			
			Assert.assertEquals(text.contains("Enter valid First name"), true); //check error displayed on providing invalid name or not when error not displayed
			
			
		
				
			
		}
			
		
		@Test(priority=13)
		public void checkLname() throws InterruptedException{
			
			
			String text = RegisPage.CheckLname("111");
			
			

			
			Assert.assertEquals(text.contains("Enter valid Last name"), true); //check error displayed on providing invalid name or not when error not displayed
			
			
		
				
			
		}
		
		@Test(priority=14)
		public void checkEmailnotMatch() throws InterruptedException{
			
			
			String text = RegisPage.Emailnotmatch("abs@gmail.com","xyd@gmail.com");
			
			
			Assert.assertEquals(text, "Emails do not match.");
			
			
		}
		
		
		@Test(priority=15)
		public void checkPWnotMatch() throws InterruptedException{
			
			
			String text = RegisPage.PWnotmatch("qwer1234","fghj1234");
			
			
			Assert.assertEquals(text, "The password and confirmation password do not match.");
			
			
		}
		
		
		@Test(priority=16)
		public void checkMandatoryFields() throws InterruptedException{
			
			
			 RegisPage.CheckMandatoryFields();
			
						
		}
		
		
		
		@Test(priority=17)
		public void vehiclesinvalidgTest() throws InterruptedException{
			
			String number = "qw";
			String text = RegisPage.vehiclesinvalidg("qw");  //changing int into string
			
			
			Assert.assertEquals(text, "The value '"+ number +"' is not valid for Number of Vehicles.");
			
			
		}
		
		
		
		@Test(priority=18)
		public void checkGroupSizeToString() throws InterruptedException{
			
			
			String text1 = "abc";
			String text = RegisPage.ChangeGroupSizeToString("abc"); //change int into string
			

			Assert.assertEquals(text.contains("The value '"+ text1 + "' is not valid for Number of Group Size"), true); 
				//check text on whole page
		}
		
		
		
		@Test(priority=19)
		public void HomePageTitleTest(){
			
			
			
			String title = RegisPage.validatePageTitle();
			Assert.assertEquals(title, "Register Your Group");
		}
		@Test(priority=20)
		public void CheckBanner(){
			boolean flag = RegisPage.validateBanner();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=21)
		public void validateGroupText1(){
			
			String group = RegisPage.validateTheOriginal();
			
			Assert.assertEquals(group,  prop.getProperty("tourname"));
		}
		
		
		
		@Test(priority=22)
		public void validateGroupSize(){
			
			String date = RegisPage.validateGroupSize();
			
			Assert.assertEquals(date,prop.getProperty("groupsize"));
		}
		
		@Test(priority=23)
		public void validateChoosFromMenu(){
			chooseTour = RegisPage.validateChooseTourMenuOption();
				
		
		}
		
		@Test(priority=24)
		public void validateChoosDate(){
			chooseDate = RegisPage.validateChooseDateOption();
				
		
		}
		
		@Test(priority=25)
		public void HeadingValidate1(){
			boolean flag = RegisPage.validatePageHeading();
			Assert.assertTrue(flag);
		}

		@Test(priority=26)
		public void validateLoginButton(){
			loginPage = RegisPage.validateloginbutton();
				
		
		}
		
		@Test(priority=27)
		public void validateForgot(){
			fgPage = RegisPage.validateforgotpw();
				
		
		}
		
		
		

		@Test(priority=28)
		public void ValidateHeading2(){
			boolean flag = RegisPage.validateheading2();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=29)
		public void ValidateHeading3(){
			boolean flag = RegisPage.validateheading3();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=30)
		public void ValidateHeading4(){
			boolean flag = RegisPage.validateheading4();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=31)
		public void ValidateHeading5(){
			boolean flag = RegisPage.validateheading5();
			Assert.assertTrue(flag);
		}
		
		
		@Test(priority=32)
		public void validateService(){
			service = RegisPage.validatevisitGuestService();
				
		
		}
		

		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		
	}


