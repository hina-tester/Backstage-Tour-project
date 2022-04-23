package com.Tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.Tour.qa.base.TestBase;

public class ReservationOverview2page  extends TestBase {
	
	
	
	//Page Factory
	
		
		@FindBy(xpath="//input[@id='confirm-payment-button']")
		@CacheLookup
		WebElement purchaseTicketButton;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[4]")
		@CacheLookup
		WebElement headingofpur;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/a[1]")
		@CacheLookup
		WebElement ModifyReservationButton;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[4]")
		@CacheLookup
		WebElement headingofmodify;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/a[2]")
		@CacheLookup
		WebElement CancleButton;
		
		
		
		
public String checkPurchanseTicketButton(){  //If we enter guest,confirm button title becom purchase,which is wrong
				
	driver.findElement(By.xpath("//input[@id='confirm-payment-button']")).click();
	
	return headingofpur.getText();  
			}

public String checkModifyButton() throws InterruptedException{  //If we enter guest,confirm button title becom purchase,which is wrong
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/a[1]")).click();
	
	Thread.sleep(8000);
	
	return headingofmodify.getText();  
			}


public String checkCancleButton() throws InterruptedException{  //If we enter guest,confirm button title becom purchase,which is wrong
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/a[2]")).click();
	Thread.sleep(8000);
	
String title=driver.findElement(By.xpath("//*[@id=\"ui-dialog-title-1\"]")).getText();
	return title;
			}





}
