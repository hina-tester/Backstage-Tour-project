package com.Tour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class ForgotPassword extends TestBase{


	//Page Factory
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement forgotPassdordlink;
	
	@FindBy(xpath="//h1[contains(text(),'Need To Reset Your Password?')]")
	@CacheLookup
	WebElement pageH;
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[@id='submit-registration-button']")
	@CacheLookup
	WebElement submittbutton;
	

	@FindBy(xpath="//span[contains(text(),'Please enter a valid email.')]")
	@CacheLookup
	WebElement error;

	

	
	//Initializing the Page Objects:
			public ForgotPassword(){
				PageFactory.initElements(driver, this);
			}

			
			//Actions:




			public void ValidateForgotPage(){
						
						
				forgotPassdordlink.click();
				
					}
			
			public boolean ValidatePageH(){
						
						
						return pageH.isDisplayed();
					}
			
			
			
	public boolean ValidateResetPWWithValidEmail(){
		
			email.sendKeys(prop.getProperty("email"));
				
			submittbutton.click();
			
		
				return pageH.isDisplayed();
			}

	public boolean ValidateResetPWWithInValidEmail(){
		
		email.sendKeys("abc");
			
		submittbutton.click();
		
	
			return error.isDisplayed();
		}



}
