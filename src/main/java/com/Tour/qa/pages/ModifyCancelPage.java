package com.Tour.qa.pages;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Tour.qa.base.TestBase;

public class ModifyCancelPage  extends TestBase {

	

	//Page Factory
	
		@FindBy(xpath="//body[1]/div[1]/span[1]")
		@CacheLookup
		WebElement userName;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h1[1]")
		@CacheLookup
		WebElement PageH;
		
		@FindBy(xpath="//tbody/tr[@id='4513']/td[5]")
		@CacheLookup
		WebElement GroupSize;
		
		
		@FindBy(xpath="//a[contains(text(),'Log Out')]")
		@CacheLookup
		WebElement logOut;
		
		
		@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/a[1]")
		@CacheLookup
		WebElement Banner;
		
		
		@FindBy(xpath="//a[contains(text(),'Home')]")
		@CacheLookup
		WebElement mainMenu;
		
		@FindBy(xpath="//h1[contains(text(),'Confirmation Sent!')]")
		@CacheLookup
		WebElement headingResend;
		
		
		
		@FindBy(xpath="//h1[contains(text(),'Reservation Overview')]")
		@CacheLookup
		WebElement headingReview;
		

		@FindBy(xpath="//h1[contains(text(),'Edit Your Reservation')]")
		@CacheLookup
		WebElement headingModify;
		

		@FindBy(xpath="//button[normalize-space()='No']")
		@CacheLookup
		WebElement CancelNo;

		@FindBy(xpath="//button[contains(text(),'Yes')]")
		@CacheLookup
		WebElement CancelYes;
		

		@FindBy(xpath="//span[contains(text(),'close')]")
		@CacheLookup
		WebElement CanceLClose;
		

		@FindBy(xpath="//span[@id='ui-dialog-title-1']")
		@CacheLookup
		WebElement CanceLdigTitle;
	
///////////

		@FindBy(xpath="//*[@id=\"navigation-bar\"]/div/div[2]/div/ul/li[2]/a")
		@CacheLookup
		WebElement purchaseTicket; 
		
		@FindBy(xpath="//tbody/tr[@id='4513']/td[2]")
		@CacheLookup
		WebElement date; 
		
		
		@FindBy(xpath="//tbody/tr[@id='4513']/td[4]")
		@CacheLookup
		WebElement time; 

		@FindBy(xpath="//tbody/tr[@id='4513']/td[5]")
		@CacheLookup
		WebElement GroupSizeondashboard; 
		
		@FindBy(xpath="//tbody/tr[@id='4513']/td[6]")
		@CacheLookup
		WebElement amount; 
		
	//////------------------Regidtration page
				
				@FindBy(xpath="//input[@id='groupSize']")
				@CacheLookup
				WebElement groupS; 
				
				@FindBy(xpath="//input[@id='tourTicket_GroupName']")
				@CacheLookup
				WebElement groupName; 
				
				@FindBy(xpath="//input[@id='tourTicket_IsFamilyWithKids']")
				@CacheLookup
				WebElement groupType; 
				
				@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[4]/span[3]/label[2]/input[1]")
				@CacheLookup
				WebElement specialNeedRadiobuttYes;
				
				@FindBy(xpath="//input[@id='tourTicket_OtherNeeds']")
				@CacheLookup
				WebElement other; 
				
				@FindBy(xpath="//input[@id='tourTicket_OtherNeedsDescription']")
				@CacheLookup
				WebElement otherTextBox; 
				
				@FindBy(xpath="//input[@id='tourTicket_VehicleCount']")
				@CacheLookup
				WebElement vehical; 
				
				@FindBy(xpath="//input[@id='weapons-policy']")
				@CacheLookup
				WebElement weaponscheckbox;
				
				@FindBy(xpath="//input[@id='submit-registration-button']")
				@CacheLookup
				WebElement SubmitButton;
				
				//////////// conform purchase
				
				@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[2]/strong[1]")
				@CacheLookup
				WebElement dateonConformPage; 
				
				@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[2]/span[1]")
				@CacheLookup
				WebElement time1; 
				
				@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[2]/span[2]")
				@CacheLookup
				WebElement time2; 
				
				@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]/b[2]")
				@CacheLookup
				WebElement groupSizeonPagecon;
				
				@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/p[1]/input[12]")
				@CacheLookup
				WebElement purTicket; 
				
				@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[3]/span[1]")
				@CacheLookup
				WebElement dateOnConfirmPage; 
				
				@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/span[2]")
				@CacheLookup
				WebElement transport; 
				
				@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[2]/span[2]")
				@CacheLookup
				WebElement vehicalnum;
				
				@FindBy(xpath="//a[@id='modify-registration-button']")
				@CacheLookup
				WebElement modifyButton; 
				
				@FindBy(xpath="//a[@id='cancel-registration-button']")
				@CacheLookup
				WebElement cancelButt; 
				
				////////////////Payment
				
				@FindBy(xpath="//*[@id=\"exact_cardholder_name\"]")
				@CacheLookup
				WebElement CardHolderName;
				
				@FindBy(xpath="//*[@id=\"x_card_num\"]")
				@CacheLookup
				WebElement CardNum;
				
				@FindBy(xpath="//*[@id=\"x_exp_date\"]")
				@CacheLookup
				WebElement cardExpiry;
				
				@FindBy(xpath="//*[@id=\"x_card_code\"]")
				@CacheLookup
				WebElement cardCode;
				
				@FindBy(xpath="//*[@id=\"cc\"]/form/input[2]")
				@CacheLookup
				WebElement button;
				
			
				
				/////////mofidy
				
				@FindBy(xpath="//*[@id=\"navigation-bar\"]/div/div[2]/div/ul/li[4]/a")
				@CacheLookup
				WebElement linkForModifyPage;

				
				


		//Initializing the Page Objects:
				public ModifyCancelPage(){
					PageFactory.initElements(driver, this);
				}

				

				//Actions:
				public String validatePageTitle(){
					
					
					return driver.getTitle();  
				}
				
	public String total(String id){
					
		String total=driver.findElement(By.xpath("//tbody/tr[@id='"+ id + "']/td[6]")).getText();
	
					
					return total;
				}
				
				
				public int returnGroupSize(String id){
					
				String number=	driver.findElement(By.xpath("//tbody/tr[@id='"+ id + "']/td[5]")).getText();
				 int t=Integer.parseInt(number);
					return t;
					
				}
				
				
				public String validateDate(String id){
					
					String date=	driver.findElement(By.xpath("//tbody/tr[@id='"+ id + "']/td[2]")).getText();
					 
						return date;
						
					}
					
				
				public boolean validateBanner(){
					return Banner.isDisplayed();
				}
				

				public boolean validatemenu(){
					return mainMenu.isDisplayed();
				}
				
				public boolean validatename(){
					return userName.isDisplayed();
				}
				
				public boolean validatePaheHeading(){
					return PageH.isDisplayed();
				}
				
				public String validateLogOut(){
					
					logOut.click();
					
					return driver.getTitle();
					
				}
				
				
				public boolean CheckReviewButton(String id) throws InterruptedException{
					
								
			//		String id = "4432";


            driver.findElement(By.xpath("//tbody/tr[@id='" + id + "']/td[7]/a[1]")).click();
            Thread.sleep(5000);
            
            
            return headingReview.isDisplayed();

			//	return new ReservationOverviewPage();
				
				}			


				public boolean CheckResendButton(String id) throws InterruptedException{
					
								
			//		String id = "4432";

				
            driver.findElement(By.xpath("//tbody/tr[@id='" + id + "']/td[8]/a[1]")).click();
            Thread.sleep(5000);
            
          return  headingResend.isDisplayed();


			//	return new ResendConfPage();
				
				}			

				public boolean CheckModifyButton(String id) throws InterruptedException{
					
					
					//		String id = "4480";
					
						
		            driver.findElement(By.xpath("//tbody/tr[@id='" + id + "']/td[9]/a[1]")).click();
		            
		            Thread.sleep(5000);
		            
		          return  headingModify.isDisplayed();

						}			
				
public ModifyCancelPage CheckCancelButton(String id) throws InterruptedException{
					
					
					//		String id = "4480";
	
	 Thread.sleep(5000);
	driver.findElement(By.xpath("//tbody/tr[@id='"+id+"']/td[10]/a[1]")).click();
	
	 Thread.sleep(5000);
	CancelNo.click();

	

	  Thread.sleep(5000);
	  
		       
		        	          return  new ModifyCancelPage();


}	

public String CheckCancelDBoxTitle(String id) throws InterruptedException{
	
	
	//		String id = "4480";
	
	
		
    driver.findElement(By.xpath("//tbody/tr[@id='" + id + "']/td[10]/a[1]")).click();
    
    Thread.sleep(5000);
    
   String msg = CanceLdigTitle.getText();
    
    Thread.sleep(5000);
    
  return  msg;

		}			

public ModifyCancelPage CheckcloseCancelwin(String id) throws InterruptedException{
	
	
	//		String id = "4480";

Thread.sleep(5000);
driver.findElement(By.xpath("//tbody/tr[@id='"+id+"']/td[10]/a[1]")).click();

Thread.sleep(5000);
CanceLClose.click();



Thread.sleep(5000);


	          return  new ModifyCancelPage();


}	


public Boolean CheckcDeleteTour(String id) throws InterruptedException{
	
	
	//		String id = "4480";

Thread.sleep(6000);
driver.findElement(By.xpath("//tbody/tr[@id='"+id+"']/td[10]/a[1]")).click();

Thread.sleep(6000);
CancelYes.click();

Thread.sleep(6000);
         

         //      return driver.findElement(By.xpath("//td[contains(text(),'"+ id +"')]")).isDisplayed();    

			return	driver.findElement(By.xpath("//td[contains(text(),'"+id+"')]")).isDisplayed();

	       

}	



////date function///
public Boolean checkDate(String id) throws ParseException{
	
	
	//		String id = "4480";
	boolean allPresent = true;
	
	
	DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
	
	
	
	String d= driver.findElement(By.xpath("//tbody/tr[@id='"+ id +"']/td[2]")).getText();
	
	
//	String d = date.getText();
	
	
	Date date1=new SimpleDateFormat("MMMM dd, yyyy").parse(d);  
	
	
	//get current date time with Date()
	 Date cdate = new Date();
	 
	 SimpleDateFormat DateFor = new SimpleDateFormat("MMMM dd, yyyy");
	 
	 String stringDate = DateFor.format(cdate);
	 
	 
	 // Now format the date
	
	 Date cdate1=new SimpleDateFormat("MMMM dd, yyyy").parse(stringDate);  
	 
//	 String date2= dateFormat.format(cdate);
	 
	// Print the Date
	 System.out.println(date1);   //given date
	 System.out.println(cdate1);   //current date
	 
	 //these buttons will be displayed if tour date is not current date and after date
	 
	 WebElement cancelbutt = driver.findElement(By.xpath("//tbody/tr[@id='"+id+"']/td[10]/a[1]"));
	 WebElement modifybutt = driver.findElement(By.xpath("//tbody/tr[@id='" + id + "']/td[9]/a[1]"));
	 
	 Calendar cal1 = Calendar.getInstance();
	 Calendar cal2 = Calendar.getInstance();
	 
	 cal1.setTime(date1);
	 cal2.setTime(cdate1);
	 
	 if (cal2.before(cal1)) {
		 
		 System.out.print(cdate1 + " is after" +  date1);
		 
		
		 
	 }
	 
if (cal2.equals(cal1)) {   //if tour date has been passed or current, cancel and mocify button should not displayed for that tour
		 
		 System.out.print("both equal");
		 
		 if (cancelbutt.isDisplayed() ) {
				
				System.out.println("cancel button displayed");
				
		        allPresent = false;
		       
		    }
			
			if (modifybutt.isDisplayed() ) {
				
				System.out.println("modify button displayed");
				
		        allPresent = false;
		       
		    }
	 }
if (cal2.after(cal1)) {
	 
	 System.out.print("after");
	 if (cancelbutt.isDisplayed() ) {
			
			System.out.println("cancel button displayed");
			
	        allPresent = false;
	       
	    }
		
		if (modifybutt.isDisplayed() ) {
			
			System.out.println("modify button displayed");
			
	        allPresent = false;
	       
	    }
	 
	 
	 
}
return allPresent;
	
}	

/////

public int tableTotalrow() throws InterruptedException{  //it will return all rows of table before and after new record
	
	Thread.sleep(2000);
	 List <WebElement> rows = driver.findElements(By.xpath("//*[@id='ticket_dash']//td[1]")); 
	 
//	 System.out.print(rows.size());
	 
	 return rows.size();
	 
//	 Assert.assertEquals(rows.size(), "Logon");
	 
	 /*
	 
	 boolean status = false;
	 
	 for(WebElement ele:rows) {
		 
		 String value = ele.getText();
		 System.out.print(value);
		 
		 if(value.contains("")) {
			 
			 status = true;
			 break;
		 }

}
	 Assert.assertTrue(status);
	 
	 */
}



//////////Place new order from modify page 1-2 steps till registration


public void PlaceOrder(String monthYear, String date) throws InterruptedException{


//String month = "May 2022";
//String year = "2022";
//String date = "2";

	purchaseTicket.click();
	driver.findElement(By.id("groupSizeDeluxe")).sendKeys("1");
	
//	int size1 = Integer.parseInt(driver.findElement(By.id("groupSizeDeluxe")).getText());
	
	    
	driver.findElement(By.xpath("//*[@id='deluxe']/input[2]")).click();
			
	
	Thread.sleep(2000);
	while(true)
	{
	String text = driver.findElement(By.xpath("//*[@id=\"calendarDiv\"]/div[1]/span")).getText();
	
	if(text.equals(monthYear)) {
		
		break;
	
	}
	else
	{
		driver.findElement(By.xpath("//*[@id=\"calendarDiv\"]/div[1]/a[2]")).click();
	}
	

	}
	
	String AvailableNumber = driver.findElement(By.xpath("//div[@class='fc-day-number'][text()='" + date + "']//following::a[1]//div[@class='ticketLabel'] ")).getText();
	
	
	System.out.println(AvailableNumber);
	
	String timing = driver.findElement(By.xpath("//div[@class='fc-day-number'][text()='"+ date+ "']//following::a[1]/div[@class='timeContainer']")).getText();

	System.out.println(timing);
	
	
	//selecting date and clicking
	
	 driver.findElement(By.xpath("//div[@class='fc-day-number'][text()='"+ date+"']//following::a[1]")).click();
	
	 ////filling form based on signin for TheDeluxe group
	 
	 ///cleaning all fields
	 
	
	 ///
	 driver.findElement(By.xpath("//input[@id='groupSize']")).clear();
	 
	 driver.findElement(By.xpath("//input[@id='groupSize']")).sendKeys("1");
	 driver.findElement(By.xpath("//input[@id='tourTicket_GroupName']")).clear();
	 
	 driver.findElement(By.xpath("//input[@id='tourTicket_GroupName']")).sendKeys("new fresh group");

	 driver.findElement(By.xpath("//input[@id='tourTicket_IsSchoolGroup']")).click();
	 
	 Select dropdownv= new Select(driver.findElement(By.xpath("//*[@id=\"SchoolGroupTypeList\"]")));
		dropdownv.selectByVisibleText("Middle School");
		 driver.findElement(By.xpath("//*[@id=\"tourTicket_Chaperones\"]")).clear();
		 driver.findElement(By.xpath("//*[@id=\"tourTicket_Chaperones\"]")).sendKeys("1");
		 
		 
		 WebElement radio = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[4]/span[3]/label[2]/input[1]"));
		 Actions action = new Actions(driver);
			action.moveToElement(radio);
			action.perform();
			radio.click();

	 driver.findElement(By.xpath("//input[@id='tourTicket_OtherNeeds']")).click();
	 driver.findElement(By.xpath("//input[@id='tourTicket_OtherNeedsDescription']")).sendKeys("stick and chair");
	 Select dropdownv1= new Select(driver.findElement(By.id("tourTicket_VehicleType")));
		dropdownv1.selectByVisibleText("Bus");

		 driver.findElement(By.name("tourTicket.VehicleCount")).clear();
	 driver.findElement(By.name("tourTicket.VehicleCount")).sendKeys("2");
	 driver.findElement(By.id("weapons-policy")).click();
	 driver.findElement(By.id("submit-registration-button")).submit();
	 
	
	 
	
// return new RegistrationPage();
	
	
}


public void BackToModifyPage() {  //back to modify page
	
	linkForModifyPage.click();
}




}





