package com.Tour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class FAQ extends TestBase{
	

	//Page Factory
	
		@FindBy(xpath="//h1[contains(text(),'Frequently Asked Questions')]")
		@CacheLookup
		WebElement pageHeading;
		
		@FindBy(xpath="//a[contains(text(),'Q: How do I navigate the site?')]")
		@CacheLookup
		WebElement questions;
		
		@FindBy(xpath="//a[contains(text(),\"FAQ's\")]")
		@CacheLookup
		WebElement faq;
		


		//Initializing the Page Objects:
				public FAQ(){
					
					
					PageFactory.initElements(driver, this);
				}

				

				//Actions:


				
				public boolean validatePgaeHeading(){
					
					
					return pageHeading.isDisplayed();
					
					
					
				}
				

				
				public boolean validatequestions(){
					
					
					return questions.isDisplayed();
					
					
					
				}
				
	public void validateFAQPage(){
					
					
					faq.click();
					
					
					
				}
				

		
	
	

}
