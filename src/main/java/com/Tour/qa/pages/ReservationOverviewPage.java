package com.Tour.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class ReservationOverviewPage  extends TestBase{
	
	
	//Page Factory
	
		
		@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/span[3]")
		@CacheLookup
		WebElement newGroupS;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/span[3]/span[2]")
		@CacheLookup
		WebElement newDate;
		
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/div[1]/span[2]")
		@CacheLookup
		WebElement specialNo;
		
		@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/div[2]/span[2]")
		@CacheLookup
		WebElement vNum;
		
		
		@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]/span[2]")
		@CacheLookup
		WebElement newGroupN;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[5]/span[3]")
		@CacheLookup
		WebElement newTime;
		
		
	////
	
		@FindBy(xpath="//a[@id='modify-registration-button']")
		@CacheLookup
		WebElement modifyButt;
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/h1")
		@CacheLookup
		WebElement pageH;
		
		
				
		@FindBy(xpath="//*[@id=\"confirm-registration-button\"]")
		@CacheLookup
		WebElement confirmbutt;
		
		
		@FindBy(xpath="//*[@id=\"cancel-registration-button\"]")
		@CacheLookup
		WebElement cancelButt;
		
		
		@FindBy(xpath="//h1[contains(text(),'Confirmation Sent!')]")
		@CacheLookup
		WebElement confirmPageh;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h1[1]")
		@CacheLookup
		WebElement EditPageh;
		
		@FindBy(xpath="//button[contains(text(),'Yes')]")
		@CacheLookup
		WebElement cancelYes;
		
		@FindBy(xpath="//span[@id='ui-dialog-title-1']")
		@CacheLookup
		WebElement canceltitle;
		
		
		@FindBy(xpath="//a[@id='cancel-registration-button']")
		@CacheLookup
		WebElement cancelbutt;
		
		@FindBy(xpath="//input[@id='confirm-payment-button']")
		@CacheLookup
		WebElement purchaseTicketbutt;
		


		//Initializing the Page Objects:
				public ReservationOverviewPage(){
					PageFactory.initElements(driver, this);
				}

				//Actions:
			
				public boolean validPageH(){
					
				
					return pageH.isDisplayed();
					
				}
				
				
				public boolean validconfirm(){
					
					confirmbutt.click();
					
					return confirmPageh.isDisplayed();
				}
				
				
			
	public boolean checkConfirmButtTitle(){  //If we enter guest,confirm button title becom purchase,which is wrong
					
					
		return	confirmbutt.isDisplayed();
					
				}
				
				
	public boolean validModifyButt(){
					
				modifyButt.click();
					
					return EditPageh.isDisplayed();
				}
				

				@SuppressWarnings("deprecation")
				public boolean validCancle (String id){
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					cancelbutt.click();
					
					cancelYes.click();
					
					driver.navigate().to("http://tours.chick-fil-adev.com/tours/Reservation/ModifyTickets");
					
					
				
				       
					try {
				       driver.findElement(By.xpath("//td[contains(text(),'"+id+"')]"));
				        return true;
				    } catch (org.openqa.selenium.NoSuchElementException e) {
				        return false;
				    }

					
			//		return	!record.isDisplayed();
			        
					
				//	return canceltitle.isDisplayed();
				}
				
	
public String confirmGroupSize(){
					
					String Gsize = newGroupS.getText();
					
					return Gsize;
				}
				
public String confirmSpecialNeed(){
	
	String SpecialN = specialNo.getText();
		
		return SpecialN;
}

public String confirmGroupN(){
	
	String Gname = newGroupN.getText();
		
		return Gname;
}

public String confirmTravlling() {
	
	
	
	
String a=   driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/div[1]/span[2]")).getText();


	return a;
		
	
}
public String confirmVnum(){
	
	String vnum = vNum.getText();
	
	return vnum;
}



		
		
		

}
