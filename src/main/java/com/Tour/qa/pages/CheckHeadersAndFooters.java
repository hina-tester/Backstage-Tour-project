package com.Tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class CheckHeadersAndFooters extends TestBase{
	
	

	//Page Factory
	@FindBy(xpath="//div[@id='slider']")
	@CacheLookup
	WebElement pg1;
	@FindBy(xpath="//h1[contains(text(),'ABOUT THE TOUR')]")
	@CacheLookup
	WebElement pg2;
	@FindBy(xpath="//h1[contains(text(),'Plan Your Visit')]")
	@CacheLookup
	WebElement pg3;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h1[1]")
	@CacheLookup
	WebElement pg4;
	@FindBy(xpath="//h1[contains(text(),'Confirmation Sent!')]")
	@CacheLookup
	WebElement pg5;
	@FindBy(xpath="//h1[contains(text(),'Frequently Asked Questions')]")
	@CacheLookup
	WebElement pg6;
	
		@FindBy(xpath="//a[contains(text(),'Home')]")
		@CacheLookup
		WebElement home;
		
		
		@FindBy(xpath="//a[contains(text(),'Purchase Tickets')]") 
		@CacheLookup
		WebElement PurcaseTicket;
		
		


		@FindBy(xpath="//a[contains(text(),'Plan Your Visit')]")  //56
		@CacheLookup
		WebElement PlanYourVisit;
		
		@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
		@CacheLookup
		WebElement ModifyCancle;
		
		
		@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
		@CacheLookup
		WebElement resend;
		
		
		@FindBy(xpath="//*[@id=\"navigation-bar\"]/div/div[2]/div/ul/li[6]/a")  
		@CacheLookup
		WebElement faq;
		@FindBy(xpath="//a[contains(text(),'LEGAL')]")
		@CacheLookup
		WebElement legal;
		
		@FindBy(xpath="//a[contains(text(),'CHICK-FIL-A.COM')]")
		@CacheLookup
		WebElement chick;
		
		
		@FindBy(xpath="//a[contains(text(),'PRIVACY')]") 
		@CacheLookup
		WebElement privacy;
		
		

		
		//Initializing the Page Objects:
				public CheckHeadersAndFooters(){
					PageFactory.initElements(driver, this);
				}

				
				//Actions:
				public boolean validatehomeLink(){
					
					home.click();
					return pg1.isDisplayed();
				}
				
				public boolean validatePurchaseTicketLink(){
					PurcaseTicket.click();
					
					return pg2.isDisplayed();
				}
				
				public boolean validatePlanYourVisitLink(){
					
					PlanYourVisit.click();
					return pg3.isDisplayed();
				}
				
				public boolean validateModifyLink(){
					
					ModifyCancle.click();
					return pg4.isDisplayed();
				}
				
				public boolean validateResendLink(){
					
					resend.click();
					return pg5.isDisplayed();
				}	
				
				public boolean validateFAQLink(){
					
					faq.click();
					return driver.findElement(By.xpath("//h1[contains(text(),'Frequently Asked Questions')]")).isDisplayed();
				}	
				
				public boolean validateLegalLink(){
					
					
					return legal.isDisplayed();
				}	
				
				public boolean validateChickLink(){
					
					
					return chick.isDisplayed();
				}	
				
				public boolean validatePrivacyLink(){
					
					
					return privacy.isDisplayed();
				}	
				
		
		

}
