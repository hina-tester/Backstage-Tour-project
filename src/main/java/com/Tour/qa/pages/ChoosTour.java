package com.Tour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Tour.qa.base.TestBase;

public class ChoosTour extends TestBase{
	
	

	//Page Factory
	
		@FindBy(xpath="//*[@id=\"navigation-bar\"]/a")
		@CacheLookup
		WebElement banner;
		
		
		@FindBy(xpath="//*[@id=\"groupSizeOriginal\"]")
		@CacheLookup
		WebElement enterGrupSize1;
		
		@FindBy(xpath="//*[@id=\"original\"]/input[2]")
		@CacheLookup
		WebElement purchaseTicketButt1;
		
		@FindBy(xpath="//input[@id='groupSizeDeluxe']")
		@CacheLookup
		WebElement groupsize2;
		
		@FindBy(xpath="//*[@id=\"deluxe\"]/input[2]")
		@CacheLookup
		WebElement purchaseTicketButt2;
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div[1]/div[3]/div[1]/div[1]/span")
		@CacheLookup
		WebElement text1;
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div[1]/div[3]/div[2]/div[1]/span")
		@CacheLookup
		WebElement text2;
		
		@FindBy(xpath="//*[@id=\"myCarousel\"]")
		@CacheLookup
		WebElement slider;
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div[1]/div[2]/h1")
		@CacheLookup
		WebElement heading;
		
		@FindBy(xpath="/html/body/div[4]/div[2]")
		WebElement body;
		
		@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/span[1]")
		WebElement body2;
		
		@FindBy(xpath="//*[@id=\"myCarousel\"]/a[1]")
		WebElement prebut;
		
		@FindBy(xpath="//*[@id=\"myCarousel\"]/a[2]")
		WebElement nextbut;
		
		
		//Initializing the Page Objects:
		public ChoosTour(){
			PageFactory.initElements(driver, this);
		}

		
		//Actions:
		public String validatereservationPageTitle(){
			
			
			return driver.getTitle();
		}
		
		public boolean validateBanner(){
			return banner.isDisplayed();
		}
		
		
		
		public boolean validateText1(){
			
			return text1.isDisplayed();
		}
		
		public boolean validateText2(){
			
			
			return text2.isDisplayed();
		}
		
		public ChoosDatePage EnterageGroup1(int age){ //The Original
				
			enterGrupSize1.sendKeys(Integer.toString(age));
			purchaseTicketButt1.click();
			return new ChoosDatePage();
			
		}
		
		public ChoosDatePage EnterGroup2(int age){  //The duplex
			
			groupsize2.sendKeys(Integer.toString(age));
			purchaseTicketButt2.click();
			return new ChoosDatePage();
			
		}
		
		public String TestinvalidInputF1(String age) throws InterruptedException {

			enterGrupSize1.sendKeys(age);
			purchaseTicketButt1.click();
			
			String winHandleBefore = driver.getWindowHandle();
			
			
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
	        
	       Thread.sleep(5000);
	       
	       driver.switchTo().window(winHandleBefore);

	       System.out.println("Invalid Group Size");
	       String msg = body.getText();
	       
	       return msg;
	   //    driver.switchTo.window(parent); 

			          }
	       
		
		public String TestinvalidInputF2(String age) throws InterruptedException{

			groupsize2.sendKeys(age);
			purchaseTicketButt2.click();

			
			String winHandleBefore = driver.getWindowHandle();
			
			
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
	        
	       Thread.sleep(5000);
	       
	       driver.switchTo().window(winHandleBefore);

	       System.out.println("Invalid Group Size");
	       String msg = body2.getText();
	       
	       return msg;
			
		}
		
		public boolean CheckSlider(){

			return slider.isDisplayed();
						
			
		}
		
		public boolean CheckPageHeading(){

			return heading.isDisplayed();
						
			
		}
		
		
		
		public boolean Checkprebut(){

			return prebut.isDisplayed();
						
			
		}
		
		public boolean Checknextbut(){

			return nextbut.isDisplayed();
						
			
		}
		
	
		
		
		
		
	

}
