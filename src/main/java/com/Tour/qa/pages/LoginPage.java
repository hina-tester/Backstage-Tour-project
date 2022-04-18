package com.Tour.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	
	@FindBy(name="email")
	@CacheLookup
	WebElement emial;
	
	@FindBy(xpath="//span[contains(text(),'Email/Password is incorrect.')]") //error displayed on invalid input email/pw
	@CacheLookup
	WebElement error;
	
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="submit-registration-button")
	@CacheLookup
	WebElement subbutt;
	

	@FindBy(linkText="Forgot your password?")
	@CacheLookup
	WebElement forgotpw;
	
	@FindBy(xpath= "//*[@id=\"navigation-bar\"]/a")
	@CacheLookup
	WebElement logo;
	
	@FindBy(xpath= "//*[@id=\"content-body\"]/div[1]/div/div/p")
	@CacheLookup
	WebElement text;
	
	@FindBy(xpath= "//*[@id=\"footer\"]/h5/a[1]")
	@CacheLookup
	WebElement fl1;
	
	@FindBy(xpath= "//*[@id=\"footer\"]/h5/a[2]")
	@CacheLookup
	WebElement fl2;
	
	@FindBy(xpath= "//*[@id=\"footer\"]/h5/a[3]")
	@CacheLookup
	WebElement fl3;
	
	@FindBy(xpath= "//*[@id=\"footer\"]/p/text()")
	@CacheLookup
	WebElement ftext;
	
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateLogo(){
			return logo.isDisplayed();
		}
		
		
		
		public ModifyCancelPage login(String un, String pwd){
			
			
			emial.sendKeys(un);
			password.sendKeys(pwd);
			//loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", subbutt);
			    	
			return new ModifyCancelPage();
		}
		
public  boolean loginEmpty(){
			
			
			emial.sendKeys("");
			password.sendKeys("");
			//loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", subbutt);
			    	
			    	return error.isDisplayed();
		}
		

public  boolean loginInvalidEmailPassword(){
	
	
	emial.sendKeys("abbs");
	password.sendKeys("111");
	//loginBtn.click();
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", subbutt);
	    	
	    	return error.isDisplayed();
}

		
	
}
