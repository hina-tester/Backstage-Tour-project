package com.Tour.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	//Page Factory
	
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div[1]/div[1]/div/img")
		@CacheLookup
		WebElement banner;
		
		@FindBy(id="reserve-button")
		@CacheLookup
		WebElement purchaseTicketBut;
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div[1]/div[3]/div[2]/div[2]/p[2]/a[1]")
		@CacheLookup
		WebElement zoomlink1;
		
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div[1]/div[3]/div[2]/div[2]/p[2]/a[2]")
		@CacheLookup
		WebElement zoomlink2;
		
		

		@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
		@CacheLookup
		WebElement ModifyCancel;
		
		//Initializing the Page Objects:
				public HomePage(){
					PageFactory.initElements(driver, this);
				}

				
				//Actions:
				public String validateHomePageTitle(){
					return driver.getTitle();
				}
				
				public boolean validateBanner(){
					return banner.isDisplayed();
				}
				/*
				
				public String CheckLink1(){
					
				zoomlink1.click();
				
				String currentHandle= driver.getWindowHandle();
				
				
				return driver.getTitle();
				
				}
				
				public String CheckLink2(){
					
					zoomlink2.click();
					return driver.getTitle();
					
					}
					
					*/
				
				public ChoosTour CheckPurchaseTicket(){
					
					purchaseTicketBut.click();
					return new ChoosTour();
					
					}
				
public String CheckModifyCancel(){
					
					ModifyCancel.click();
					
					
					return driver.getTitle();
					
					
					}
				
				
				
				
				
				
}
