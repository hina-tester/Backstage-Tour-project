package com.Tour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class CusgtomerPlan  extends TestBase { //Plan your Visit page
	
	
	


	//Page Factory
	
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/h1")
		@CacheLookup
		WebElement pageHeading;
		
		@FindBy(xpath="//a[@id='button-directions-pdf']")
		@CacheLookup
		WebElement getPaidDirectionsButton;
		
		@FindBy(xpath="//a[@id='button-directions-google']")
		@CacheLookup
		WebElement GetGoogleDirections;
		
		@FindBy(xpath="//a[@id='button-directions-pdf']")
		@CacheLookup
		WebElement headingPage1;
		
		@FindBy(xpath="//a[@id='button-directions-google']")
		@CacheLookup
		WebElement headingPage2;
		

		@FindBy(xpath="//a[contains(text(),'Plan Your Visit')]")
		@CacheLookup
		WebElement menulink;
		
		


		//Initializing the Page Objects:
				public CusgtomerPlan(){
					
					
					PageFactory.initElements(driver, this);
				}

				

				//Actions:


				
				public boolean validateGetPaidDirectionButton(){
					
					
					return getPaidDirectionsButton.isDisplayed();
					
					
					
				}
				

				public boolean validatePageHeading(){
					
					
					return pageHeading.isDisplayed();
					
					
					
				}
				

				
				public void validateLinkmenu(){
					
					
					menulink.click();
					
					
					
				}

				
				public boolean validateGetGoogleDirectionButton(){
					
					
					return GetGoogleDirections.isDisplayed();
					
				}

}
