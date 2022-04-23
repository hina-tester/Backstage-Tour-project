package com.Tour.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.Tour.qa.base.TestBase;

public class EditReservationPage extends TestBase {
	


	//Page Factory
	
		@FindBy(xpath="//h1[contains(text(),'Edit Your Reservation')]")
		@CacheLookup
		WebElement Pageheading;
		
		@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]")
		@CacheLookup
		WebElement date;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/span[1]")
		@CacheLookup
		WebElement time;
		
		
		@FindBy(xpath="//a[contains(text(),'Edit Date')]")
		@CacheLookup
		WebElement editDate;
		
		
		@FindBy(xpath="//*[@id='groupSize']")
		@CacheLookup
		WebElement GroupSize;
		
		@FindBy(xpath="//input[@id='additionalGuests']")
		@CacheLookup
		WebElement guests;
		

		@FindBy(xpath="//input[@id='tourTicket_GroupName']")
		@CacheLookup
		WebElement groupName;
		
		
		@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/form[1]/div[4]/div[2]/span[3]/label[1]")
		@CacheLookup
		WebElement needNo;
		
		
		@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/form[1]/div[4]/div[2]/span[3]/label[2]")
		@CacheLookup
		WebElement needYes;
		
		@FindBy(xpath="//a[contains(text(),'Visit Guest Services for more information')]")
		@CacheLookup
		WebElement visitGuest;
		

		@FindBy(xpath="//input[@id='tourTicket_IsHearingImpaired']")
		@CacheLookup
		WebElement extraneeds;
		
		
		@FindBy(xpath="//textarea[@id='tourTicket_Comments']")
		@CacheLookup
		WebElement Comments;
		
		
		@FindBy(xpath="//input[@id='tourTicket_VehicleCount']")
		@CacheLookup
		WebElement vCount;
		
		@FindBy(xpath="//input[@id='submit-registration-button']")
		@CacheLookup
		WebElement button;
		
		
		@FindBy(xpath="//span[contains(text(),'Registration was unsuccessful. Please correct the ')]")
		@CacheLookup
		WebElement error1;

		@FindBy(xpath="//span[contains(text(),'Please enter a name for your group.')]")
		@CacheLookup
		WebElement error2;
		
		@FindBy(xpath="//span[contains(text(),'The Number of Vehicles field is required.')]")
		@CacheLookup
		WebElement error3;


		//Initializing the Page Objects:
				public EditReservationPage(){
					PageFactory.initElements(driver, this);
				}

				//Actions:
				@SuppressWarnings("deprecation")
				public boolean PageHeading(){
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					return Pageheading.isDisplayed();
					
				}
				
				public boolean date(){
		
					return date.isDisplayed();
				}
				
				
				
				public boolean guestFieldOnerrorpage(){

					groupName.clear();
					vCount.clear();
					button.click();
				
					return guests.isDisplayed();
				}
				
				public boolean time(){
					
					return time.isDisplayed();
				}
				
				public boolean EditDateLink(){
					
					 editDate.click();
					 
					 return driver.findElement(By.xpath("//h1[contains(text(),'CHOOSE A DATE')]")).isDisplayed();
					 
					// return new ChoosDatePage();
				}
				
				
				public void GroupSizeLock(){
					
					try {
					GroupSize.sendKeys("2");
					}
					
					catch (Exception e) {
						System.out.print("fiels is locked");
					}
					
				}
				
			
				
				public boolean CheckSpecialNeedOption(){
					
					WebElement special =  driver.findElement(By.id("specialNeedsForm"));
					
					
					if(needNo.isSelected() ) {
						 try
				            {
						
							 if(special.isDisplayed())
				               {
				               return false;
				               }
				               return false;
				            }
				            catch(Exception e)
				            {
				                
				                return true;
				            }}
					return false;
				}
				
					public CusgtomerPlan guestLink(){
					
						visitGuest.click();
				
					 return new CusgtomerPlan();
				
				}
				
					
					public boolean CheckEditReservationForm() throws InterruptedException{
						
				//		guests.clear();
				//		 guests.sendKeys("1");
						 
						 						
						 groupName.clear();
						 groupName.sendKeys("Happy kids");
						 
						 needNo.click();
						 
					//	 extraneeds.click();
						 
						 Comments.sendKeys("this is testing");
						//Transportation
							
							Select dropdownv= new Select(driver.findElement(By.xpath("//*[@id=\"tourTicket_VehicleType\"]")));
							dropdownv.selectByVisibleText("Van");
							vCount.clear();
							vCount.sendKeys("2");
							
							button.click();
							
							Thread.sleep(8000);
							
							return driver.findElement(By.xpath("//h1[contains(text(),'Reservation Overview')]")).isDisplayed();
						 
				//	 return new ReservationOverviewPage();
				
				}
					
					public boolean CheckEditReservationFormWithGuest() throws InterruptedException{
						
								guests.clear();
								 guests.sendKeys("1");
								 
								 						
								 groupName.clear();
								 groupName.sendKeys("Happy kids");
								 
								 needNo.click();
								 
							//	 extraneeds.click();
								 
								 Comments.sendKeys("this is testing");
								//Transportation
									
									Select dropdownv= new Select(driver.findElement(By.xpath("//*[@id=\"tourTicket_VehicleType\"]")));
									dropdownv.selectByVisibleText("Van");
									vCount.clear();
									vCount.sendKeys("2");
									
									button.click();
									
									Thread.sleep(8000);
									
									return driver.findElement(By.xpath("//h1[contains(text(),'Reservation Overview')]")).isDisplayed();
								 
						//	 return new ReservationOverviewPage();
						
						}
							
						
					
					public boolean CheckEditReservationFormWithEmpty() {
						
					
						groupName.clear();
						vCount.clear();
						button.click();
					

					
							
							return driver.findElement(By.xpath("//span[contains(text(),'Please enter a name for your group.')]")).isDisplayed();
					
						
						 
					
				
				}
					
					public int sendguestnumber() {
						
						
						
				String guest=groupName.getText();
						
					
						int t=Integer.parseInt(guest);
						 
					
							
							return t;
						
						 
					
				
				}
				
				
		

}
