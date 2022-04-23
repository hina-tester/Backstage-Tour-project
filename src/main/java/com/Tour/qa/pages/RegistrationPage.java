package com.Tour.qa.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.Tour.qa.base.TestBase;

public class RegistrationPage extends TestBase{
	
	//Page Factory
	
			@FindBy(xpath="//*[@id=\"navigation-bar\"]/a")
			@CacheLookup
			WebElement Banner;
			
			@FindBy(xpath="//*[@id=\"content\"]/div[1]/h3")
			@CacheLookup
			WebElement pagenotfound;
			
	
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[2]/a[1]/b[1]")
			@CacheLookup
			WebElement original;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[2]/a[2]/strong")
			@CacheLookup
			WebElement date;

			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[2]/a[1]/b[2]")
			@CacheLookup
			WebElement groupSize;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[1]/div[1]/a")
			@CacheLookup
			WebElement chooseTour;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[1]/div[2]/a")
			@CacheLookup
			WebElement chooseDate;
			
			@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[3]")
			@CacheLookup
			WebElement registration;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[3]/h1")
			@CacheLookup
			WebElement heading;
			
			@FindBy(xpath="//*[@id=\"email\"]")
			@CacheLookup
			WebElement email;
			
			@FindBy(xpath="//*[@id=\"password\"]")
			@CacheLookup
			WebElement password;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[4]/div/form/div/span[3]/p/a")
			@CacheLookup
			WebElement forgotpw;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[4]/div/form/div/span[4]/input")
			@CacheLookup
			WebElement loginbut;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/form/div/div[2]/div/h3")
			@CacheLookup
			WebElement heading2;
			
			@FindBy(xpath="//*[@id=\"reservationUser_Name_First\"]")
			@CacheLookup
			WebElement fname;
			
			@FindBy(xpath="//*[@id=\"reservationUser_Name_Last\"]")
			@CacheLookup
			WebElement lname;
			
			@FindBy(xpath="//*[@id=\"reservationUser_Email\"]")
			@CacheLookup
			WebElement newemail;
			
			@FindBy(xpath="//input[@id='userForm_emailConfirmation']")
			@CacheLookup
			WebElement cemail;
			
			@FindBy(xpath="//*[@id=\"userForm_Password\"]")
			@CacheLookup
			WebElement pw;
			
			@FindBy(xpath="//*[@id=\"userForm_ConfirmPassword\"]")
			@CacheLookup
			WebElement cpw;
			
			@FindBy(xpath="//*[@id=\"reservationUser_Address_Zip_CodeAsString\"]")
			@CacheLookup
			WebElement zipcode;
			
			@FindBy(xpath="//*[@id=\"reservationUser_MobilePhone\"]")
			@CacheLookup
			WebElement mobile;
			
			@FindBy(xpath="//*[@id=\"DiscSourceDropDownList\"]")
			@CacheLookup
			WebElement dropdown;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/form/div/div[3]/div/h3")
			@CacheLookup
			WebElement heading3;
			
			@FindBy(xpath="//*[@id=\"groupSize\"]")
			@CacheLookup
			WebElement groupSizef;
			
			@FindBy(xpath="//*[@id=\"tourTicket_GroupName\"]")
			@CacheLookup
			WebElement nameofgroup;
			
			@FindBy(xpath="//*[@id=\"tourTicket_IsAdultGroup\"]")
			@CacheLookup
			WebElement Adultgroupcb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_IsBusinessGroup\"]")
			@CacheLookup
			WebElement BusinessGroupcb;
			
			@FindBy(xpath="//input[@id='tourTicket_IsFamilyWithKids']")
			@CacheLookup
			WebElement familywithkidscb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_IsFamilyWithoutKids\"]")
			@CacheLookup
			WebElement familywihtoutkidscb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_IsReligiousGroup\"]")
			@CacheLookup
			WebElement religescb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_IsSchoolGroup\"]")
			@CacheLookup
			WebElement schoolgroupcb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_HasSpecialNeeds\"]")
			@CacheLookup
			WebElement radiobutno;
			
			@FindBy(xpath="//*[@id=\"tourTicket_HasSpecialNeeds\"]")
			@CacheLookup
			WebElement radiobutyes;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/form/div/div[3]/div/div[4]/a")
			@CacheLookup
			WebElement guestservice;
			
			@FindBy(xpath="//*[@id=\"tourTicket_IsHearingImpaired\"]")
			@CacheLookup
			WebElement HearingImpairedcb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_IsVisuallyImpaired\"]")
			@CacheLookup
			WebElement VisuallyImpairedcb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_NeedsWheelChair\"]")
			@CacheLookup
			WebElement WheelChaircb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_OtherNeeds\"]")
			@CacheLookup
			WebElement othercb;
			
			@FindBy(xpath="//*[@id=\"tourTicket_OtherNeedsDescription\"]")
			@CacheLookup
			WebElement othertext;
			
			@FindBy(xpath="//*[@id=\"tourTicket_Comments\"]")
			@CacheLookup
			WebElement commentbox;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/form/div/div[5]/div/h3")
			@CacheLookup
			WebElement heading4;
			
			@FindBy(xpath="//*[@id=\"tourTicket_VehicleType\"]")
			@CacheLookup
			WebElement dropdownv;
			
			@FindBy(xpath="//*[@id=\"tourTicket_VehicleCount\"]")
			@CacheLookup
			WebElement textboxv;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/form/div/div[6]/div/h3")
			@CacheLookup
			WebElement weapoinPolicyheading;
			
			@FindBy(xpath="//*[@id=\"weapons-policy\"]")
			@CacheLookup
			WebElement weapoinPolicycb;
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/form/div/div[7]/div/h3")
			@CacheLookup
			WebElement covidheading;
			
			@FindBy(xpath="//*[@id=\"submit-registration-button\"]")
			@CacheLookup
			WebElement submitbut;
			
			@FindBy(xpath="//*[@id=\"ui-dialog-title-8\"]")
			@CacheLookup
			WebElement invalidemail;
			
			@FindBy(xpath="//span[@id='ui-dialog-title-8']")
			@CacheLookup
			WebElement sameemail;
			
			@FindBy(xpath="//*[@id=\"ui-dialog-title-10\"]")
			@CacheLookup
			WebElement invalidpw;
			
			@FindBy(xpath="//*[@id=\"ui-dialog-title-13\"]")
			@CacheLookup
			WebElement dupemail;
			
			@FindBy(xpath="//span[contains(text(),'Registration was unsuccessful. Please correct the ')]")
			@CacheLookup
			WebElement errorForAllFormInvalid; // Registration was unsuccessful. Please correct the errors and try again.
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement enterValidEmail;
			
			@FindBy(xpath="//*[@id=\"pass-field\"]/div/span/div/p")
			@CacheLookup
			WebElement inpw; 			//Password cannot contain name or email. Please enter a valid password.
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/form/div/div[2]/div/div[7]/div/span/div/p")
			@CacheLookup
			WebElement validzip; //Please enter a valid zip code.
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/form/div/div[2]/div/div[8]/div/span/div/p")
			@CacheLookup
			WebElement mobileinva; //The value 'sssss' is invalid.
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement validpw; //Passwords must be at least 8 characters and contain numbers and letters.
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement emailnotmatch; // Emails do not match.
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[6]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement pwNotmatch; // The password and confirmation password do not match.
			
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[9]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement hearaboutus; //Please select where you heard about us.
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement groupnameenter; // Please enter a name for your group.
			
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/span[2]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement numOfVehicles; // The Number of Vehicles field is required.
			
			@FindBy(xpath="//span[contains(text(),'Please enter a valid number for the size of your g')]")
			@CacheLookup
			WebElement SizeofGroups; // Please enter a valid number for the size of your group.
			
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[3]/span[2]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement TypeOfGroup; // The Group Type field is required.
			
			@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/span[2]/div[1]/span[1]/div[1]/p[1]")
			@CacheLookup
			WebElement vehiString; // The value 'we' is not valid for Number of Vehicles.
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[2]/a[2]/strong")
			@CacheLookup
			WebElement dateString; 
			
			@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[4]/div/p/a")
			@CacheLookup
			WebElement logout; 
			
			@FindBy(xpath="//span[contains(text(),'Registration was unsuccessful. Please correct the ')]")
			@CacheLookup
			WebElement errormsg;
			
	
///////////////-----------------
			//Initializing the Page Objects:
					public RegistrationPage(){
						PageFactory.initElements(driver, this);
					}

					
					//Actions:
					public String validatePageTitle(){
						
						
						return driver.getTitle();
					}
					
					public boolean validateBanner(){
						return Banner.isDisplayed();
					}
					
					public String validateTheOriginal(){
						
						String msg = original.getText();
					       
					       return msg;
										}
					
					public String validatedate(){
						
					
						
						String msg = date.getText();
						
					       
					       return msg;
										}
					
					public String validateGroupSize(){
						
						String msg = groupSize.getText();
					       
					       return msg;
										}
					
					public ChoosTour validateChooseTourMenuOption(){
						
						chooseTour.click();
						
						return new ChoosTour();
					}
					
					public ChoosDatePage validateChooseDateOption() {
						
						chooseDate.click();
						
						return new ChoosDatePage();
					}
					
					public RegistrationPage validateRegistration(){
						
						registration.click();
						
						return new RegistrationPage();
					}
					
					public boolean validatePageHeading(){
						
						return heading.isDisplayed();
					}
					
					
					public LoginPage validateloginbutton(){
						
						loginbut.click();
						
						return new LoginPage();
					}	
					
					public ForgotPassword validateforgotpw(){
						
						forgotpw.click();
						
						return new ForgotPassword();
					}	
					
					public boolean validateheading2(){
						
						return heading2.isDisplayed();
					}
					
					public boolean validateheading3(){
						
						return heading3.isDisplayed();
					}
					
					public boolean validateheading4(){
						
						return heading4.isDisplayed();
					}
					
					public boolean validateheading5(){
						
						return covidheading.isDisplayed();
					}
					
					public CusgtomerPlan validatevisitGuestService(){
						
						guestservice.click();
						
						return new CusgtomerPlan();
					}	
					
	public String CheckFillData()  {
		
					fname.sendKeys("fname");
						lname.sendKeys("lname");
						
						String username = "test";
			Random randomGenerator = new Random();  
				int randomInt = randomGenerator.nextInt(100000);  
				int randomInt1 = randomGenerator.nextInt(1000);  
						
				String  myemail = (randomInt + username + "@gmail.com");
				
				newemail.sendKeys(myemail);
				
				cemail.sendKeys(myemail);
					
						pw.sendKeys("hina1212"); // 8 characters, letters and digits
						cpw.sendKeys("hina1212");
						zipcode.sendKeys("11122");
						mobile.sendKeys("3214679421");
						
						Select dropdown1 = new Select(dropdown);  //from where we hear
						dropdown1.selectByVisibleText("CFA Mobile App");  
						
						//Group Information
						
//				groupSizef.clear();
//				groupSizef.sendKeys(prop.getProperty("groupsize")));
						
						nameofgroup.sendKeys("new group");
						
						//Type of group
						
						driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
						
						//Radio button select
						
					//river.findElement(By.xpath("//*[@id=\"tourTicket_HasSpecialNeeds\"]")).click(); //select radio 
						Actions action = new Actions(driver);
						action.moveToElement(radiobutno);
						action.perform();
											
						radiobutno.click();
						
						commentbox.sendKeys("This is comment");
						
						//Transportation
						
						Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
						dropdownv.selectByVisibleText("Car");
						
						textboxv.clear();
						textboxv.sendKeys("2");   //vehical number
						
						//Weapons Policy
						
						weapoinPolicycb.click();
												
					//	submitbut.click();
						
						submitbut.submit();
						
						
						try {
							Thread.sleep(7000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
			String heading=	driver.findElement(By.xpath("//h1[contains(text(),'CONFIRM RESERVATION AND PURCHASE TICKET')]")).getText();
						
						
						return heading;
	
						
						
					}
					
					
					
					
public boolean fillInvalidForm() throws InterruptedException {
						
						fname.sendKeys("111");
						lname.sendKeys("222");
						newemail.sendKeys("qwkhire3@gmail.com");
						cemail.sendKeys("qwkhire3@gmail.com");
						pw.sendKeys("1111w"); // 8 characters, letters and digits
						cpw.sendKeys("1111w");
						zipcode.sendKeys("abc");//must be 5 digits
						mobile.sendKeys("abc"); //must be 10 digit
						
		//		Select dropdown1 = new Select(dropdown);  //from where we hear
	//			dropdown1.selectByVisibleText("CFA Mobile App");  
						
						//Group Information
						
						groupSizef.sendKeys(groupSize.getText());
						
						nameofgroup.sendKeys("new group");
						
						//Type of group
						
						driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
						
						//Radio button select
						
					
						Actions action = new Actions(driver);
						action.moveToElement(radiobutno);
						action.perform();
											
						radiobutno.click();
						
						commentbox.sendKeys("This is comment");
						
						//Transportation
						
						Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
						dropdownv.selectByVisibleText("Car");
						
						textboxv.sendKeys("a");
						
						//Weapons Policy
						
						weapoinPolicycb.click();
												
						submitbut.click();
						Thread.sleep(7000);
						return errorForAllFormInvalid.isDisplayed();  //return error message on registration page
				//return new RegistrationPage();
					}	
					
		public boolean emptyForm() throws InterruptedException {
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
			
		return errorForAllFormInvalid.isDisplayed();
	
}	
		
		public boolean invalidPassword(String ipw) throws InterruptedException{
			
			fname.sendKeys("111");
			lname.sendKeys("222");
			newemail.sendKeys("qwkhire3@gmail.com");
			cemail.sendKeys("qwkhire3@gmail.com");
			pw.sendKeys(ipw);// 8 characters, letters and digits
			cpw.sendKeys(ipw);
			zipcode.sendKeys("abc");//must be 5 digits
			mobile.sendKeys("abc"); //must be 10 digit
			
//		Select dropdown1 = new Select(dropdown);  //from where we hear
//			dropdown1.selectByVisibleText("CFA Mobile App");  
			
			//Group Information
			
			groupSizef.sendKeys(groupSize.getText());
			
			nameofgroup.sendKeys("new group");
			
			//Type of group
			
			driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
			
			//Radio button select
			
		
			Actions action = new Actions(driver);
			action.moveToElement(radiobutno);
			action.perform();
								
			radiobutno.click();
			
			commentbox.sendKeys("This is comment");
			
			//Transportation
			
			Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
			dropdownv.selectByVisibleText("Car");
			
			textboxv.sendKeys("a");
			
			//Weapons Policy
			
			weapoinPolicycb.click();
									
			submitbut.click();
			Thread.sleep(5000);
			return validpw.isDisplayed();  //return error message on registration page

			
		}	


		public boolean invalidZipCode(String zip) throws InterruptedException{
			
			fname.sendKeys("111");
			lname.sendKeys("222");
			newemail.sendKeys("qwkhire3@gmail.com");
			cemail.sendKeys("qwkhire3@gmail.com");
			pw.sendKeys("nnn");// characters, letters and digits
			cpw.sendKeys("nnn");
			zipcode.sendKeys(zip);//must be 5 digits
			mobile.sendKeys("abc"); //must be 10 digit
			
//		Select dropdown1 = new Select(dropdown);  //from where we hear
//			dropdown1.selectByVisibleText("CFA Mobile App");  
			
			//Group Information
			
			groupSizef.sendKeys(groupSize.getText());
			
			nameofgroup.sendKeys("new group");
			
			//Type of group
			
			driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
			
			//Radio button select
			
		
			Actions action = new Actions(driver);
			action.moveToElement(radiobutno);
			action.perform();
								
			radiobutno.click();
			
			commentbox.sendKeys("This is comment");
			
			//Transportation
			
			Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
			dropdownv.selectByVisibleText("Car");
			
			textboxv.sendKeys("a");
			
			//Weapons Policy
			
			weapoinPolicycb.click();
									
			submitbut.click();
			Thread.sleep(5000);
			return validzip.isDisplayed();  //return error message on registration page

			
		}	

					
public String invalidmobileWithStrign(String mob) throws InterruptedException{
			
			fname.sendKeys("111");
			lname.sendKeys("222");
			newemail.sendKeys("qwkhire3@gmail.com");
			cemail.sendKeys("qwkhire3@gmail.com");
			pw.sendKeys("nnn");// characters, letters and digits
			cpw.sendKeys("nnn");
			zipcode.sendKeys("aaa");// be 5 digits
			mobile.sendKeys(mob); //must be 10 digit
			
//		Select dropdown1 = new Select(dropdown);  //from where we hear
//			dropdown1.selectByVisibleText("CFA Mobile App");  
			
			//Group Information
			
			groupSizef.sendKeys(groupSize.getText());
			
			nameofgroup.sendKeys("new group");
			
			//Type of group
			
			driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
			
			//Radio button select
			
		
			Actions action = new Actions(driver);
			action.moveToElement(radiobutno);
			action.perform();
								
			radiobutno.click();
			
			commentbox.sendKeys("This is comment");
			
			//Transportation
			
			Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
			dropdownv.selectByVisibleText("Car");
			
			textboxv.sendKeys("a");
			
			//Weapons Policy
			
			weapoinPolicycb.click();
									
			submitbut.click();
			Thread.sleep(5000);
			String error =	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[8]/div[1]/span[1]/div[1]/p[1]")).getText();
			
			
	//		String error = mobileinva.getText();
			
			return error;  //return error message on registration page

			
		}	
public String invalidmobile2(String mob) throws InterruptedException{
	
	fname.sendKeys("111");
	lname.sendKeys("222");
	newemail.sendKeys("qwkhire3@gmail.com");
	cemail.sendKeys("qwkhire3@gmail.com");
	pw.sendKeys("nnn");// characters, letters and digits
	cpw.sendKeys("nnn");
	zipcode.sendKeys("aaa");// be 5 digits
	mobile.sendKeys(mob); //must be 10 digit
	
//Select dropdown1 = new Select(dropdown);  //from where we hear
//	dropdown1.selectByVisibleText("CFA Mobile App");  
	
	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.sendKeys("a");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	String error =	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[8]/div[1]/span[1]/div[1]/p[1]")).getText();
	
	
//		String error = mobileinva.getText();
	
	return error;  //return error message on registration page

	
}	

public String intigermobile(int mob) throws InterruptedException{  //invalid ph = 899999
	
	fname.sendKeys("111");
	lname.sendKeys("222");
	newemail.sendKeys("qwkhire3@gmail.com");
	cemail.sendKeys("qwkhire3@gmail.com");
	pw.sendKeys("nnn");// characters, letters and digits
	cpw.sendKeys("nnn");
	zipcode.sendKeys("aaa");// be 5 digits
	mobile.sendKeys(String.valueOf(mob));; //must be 10 digit
	
//Select dropdown1 = new Select(dropdown);  //from where we hear
//	dropdown1.selectByVisibleText("CFA Mobile App");  
	
	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.sendKeys("a");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
	
	String error = mobileinva.getText();
	
	return error;  //return error message on registration page

	
}	

public String checkPWwithin(int pwi) throws InterruptedException{  //invalid ph = 899999
	
	fname.sendKeys("111");
	lname.sendKeys("222");
	newemail.sendKeys("qwkhire3@gmail.com");
	cemail.sendKeys("qwkhire3@gmail.com");
	pw.sendKeys(String.valueOf(pwi));// enter only int
	cpw.sendKeys(String.valueOf(pwi));
	zipcode.sendKeys("aaa");// be 5 digits
	mobile.sendKeys("88888");//t be 10 digit
	
//Select dropdown1 = new Select(dropdown);  //from where we hear
//	dropdown1.selectByVisibleText("CFA Mobile App");  
	
	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.sendKeys("a");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
	
	String error = validpw.getText();
	
	return error;  //return error message on registration page

	
}	
public String checkPWwithst(String pwi) throws InterruptedException{  //invalid ph = 899999
	
	fname.sendKeys("111");
	lname.sendKeys("222");
	newemail.sendKeys("qwkhire3@gmail.com");
	cemail.sendKeys("qwkhire3@gmail.com");
	pw.sendKeys(pwi);// enter only int
	cpw.sendKeys(pwi);
	zipcode.sendKeys("aaa");// be 5 digits
	mobile.sendKeys("88888");//t be 10 digit
	
//Select dropdown1 = new Select(dropdown);  //from where we hear
//	dropdown1.selectByVisibleText("CFA Mobile App");  
	
	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.sendKeys("a");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
	
	String error = validpw.getText();
	
	return error;  //return error message on registration page

	
}	

public String CheckFname(int name1) throws InterruptedException {
	

	fname.sendKeys(String.valueOf(name1)); //invalid name
	lname.sendKeys(String.valueOf(name1));
	newemail.sendKeys("qwkhire3@gmail.com");
	cemail.sendKeys("qwkhire3@gmail.com");
	pw.sendKeys("123asd");
	cpw.sendKeys("123asd");
	zipcode.sendKeys("aaa");// be 5 digits
	mobile.sendKeys("88888");//t be 10 digit
	
//Select dropdown1 = new Select(dropdown);  //from where we hear
//	dropdown1.selectByVisibleText("CFA Mobile App");  

	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.sendKeys("a");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	

	
	WebElement l =driver.findElement(By.tagName("body"));
	
	String search = l.getText();
	
	
	return search;
	
	
	
}	

public String CheckLname(int name) throws InterruptedException {
	
	fname.sendKeys(String.valueOf(name));//invalid name
	lname.sendKeys(String.valueOf(name));
	newemail.sendKeys("qwkhire4@gmail.com");
	cemail.sendKeys("qwkhire4@gmail.com");
	pw.sendKeys("123asd");
	cpw.sendKeys("123asd");
	zipcode.sendKeys("aaa");// be 5 digits
	mobile.sendKeys("88888");//t be 10 digit
	
//Select dropdown1 = new Select(dropdown);  //from where we hear
//	dropdown1.selectByVisibleText("CFA Mobile App");  
	
	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.sendKeys("a");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
	WebElement l =driver.findElement(By.tagName("body"));
	
	String search = l.getText();
	
	
	return search;
	
	
	
}	



public String Emailnotmatch(String email1,String email2) throws InterruptedException{
	
	fname.sendKeys("name");
	lname.sendKeys("name");
	newemail.sendKeys(email1);
	cemail.sendKeys(email2);
	pw.sendKeys("123asd");
	cpw.sendKeys("123asd");
	zipcode.sendKeys("aaa");// be 5 digits
	mobile.sendKeys("88888");//t be 10 digit
	

	
	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.sendKeys("a");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
String error = emailnotmatch.getText();
	
	return error;  //return error message on registration page
	
}	

public String PWnotmatch(String pw1,String pw2) throws InterruptedException{
	
	fname.sendKeys("name");
	lname.sendKeys("name");
	newemail.sendKeys("abc@gmail.com");
	cemail.sendKeys("abc@gmail.com");
	pw.sendKeys(pw1);
	cpw.sendKeys(pw2);
	zipcode.sendKeys("11111");//e 5 digits
	mobile.sendKeys("2345213456");//10 digit
	

	
	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.sendKeys("a");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
String error = pwNotmatch.getText();
	
	return error;  //return error message on registration page
	
	
}	


public String invalidVehical(String vehi) throws InterruptedException{
	
	fname.sendKeys("name");
	lname.sendKeys("name");
	newemail.sendKeys("abc@gmail.com");
	cemail.sendKeys("abc@gmail.com");
	pw.sendKeys("hina1212");
	cpw.sendKeys("hina1212");
	zipcode.sendKeys("11111");//e 5 digits
	mobile.sendKeys("2345213456");//10 digit
	

	
	//Group Information
	
	groupSizef.sendKeys(groupSize.getText());
	
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.clear();
	
	textboxv.sendKeys(vehi);
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
String error = vehiString.getText();
	
	return error;  //return error message on registration page
	
	
}	

public String ChangeGroupSizeToString(String gs) throws InterruptedException{
	
	fname.sendKeys("name");
	lname.sendKeys("name");
	newemail.sendKeys("abc@gmail.com");
	cemail.sendKeys("abc@gmail.com");
	pw.sendKeys("hina1212");
	cpw.sendKeys("hina1212");
	zipcode.sendKeys("11111");//e 5 digits
	mobile.sendKeys("2345213456");//10 digit
	

	
	//Group Information
	
	// 	groupSizef.sendKeys(groupSize.getText());
	groupSizef.clear();
	groupSizef.sendKeys(gs);
		
	nameofgroup.sendKeys("new group");
	
	//Type of group
	
	driver.findElement(By.xpath("//input[@id='tourTicket_IsFamilyWithKids']")).click(); //family with kids
	
	//Radio button select
	

	Actions action = new Actions(driver);
	action.moveToElement(radiobutno);
	action.perform();
						
	radiobutno.click();
	
	commentbox.sendKeys("This is comment");
	
	//Transportation
	
	Select dropdownv= new Select(driver.findElement(By.xpath("//select[@id='tourTicket_VehicleType']")));
	dropdownv.selectByVisibleText("Car");
	
	textboxv.clear();
	
	textboxv.sendKeys("2");
	
	//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
	
String msg=	  driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid number for the size of your g')]")).getText();

//WebElement l =driver.findElement(By.tagName("body"));
	
	
	System.out.println(msg);
	return msg;
	
	
}


public void CheckMandatoryFields() throws InterruptedException{
	
	fname.sendKeys("fname");
	lname.sendKeys("lname");
	newemail.sendKeys("abc@gmail.com");
	cemail.sendKeys("abc@gmail.com");
	pw.sendKeys("1234fdsa");
	cpw.sendKeys("1234fdsa");
	zipcode.sendKeys("11111");//e 5 digits
	mobile.sendKeys("2345213456");//10 digit
	
// -------------------- 
		//Weapons Policy
	
	weapoinPolicycb.click();
							
	submitbut.click();
	Thread.sleep(5000);
	
	//check all mandatory fields at a time if text display change in leaving empty
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(groupSizef.getText(), "Please select where you heard about us.d");
	softAssert.assertEquals(groupnameenter.getText(), "Please enter a name for your group.");
	softAssert.assertEquals(numOfVehicles.getText(), "The Number of Vehicles field is required.");
	// 	softAssert.assertEquals(SizeofGroups.getText(), "Please enter a valid number for the size of your group.");
	softAssert.assertEquals(TypeOfGroup.getText(), "The Group Type field is required.");
	
	
	
	
	 // return new RegistrationPage();//  error message on registration page
	
	
}	

		
					public boolean CheckInvalidEmail(String invalidEmail) throws InterruptedException  {
						
						newemail.sendKeys(invalidEmail);
						cemail.sendKeys(invalidEmail);
					
						Thread.sleep(5000);
						

						weapoinPolicycb.click();
												
						submitbut.click();
						
						return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]/div[1]/p[1]")).isDisplayed();
						
					}
					
					public boolean Checkduplicateemail(String email) throws InterruptedException  {
						
						
						newemail.sendKeys(email);
						cemail.sendKeys(email);
					
						Thread.sleep(5000);
						
						return invalidemail.isDisplayed();
										}
					
					
					
					
}


