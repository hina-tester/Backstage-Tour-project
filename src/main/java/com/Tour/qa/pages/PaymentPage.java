package com.Tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Tour.qa.base.TestBase;

public class PaymentPage extends TestBase{
	
	
	//Page Factory
	
	@FindBy(xpath="//*[@id=\"order\"]/table/tbody/tr/td[1]")
	@CacheLookup
	WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"order\"]/table/tbody/tr/td[2]")
	@CacheLookup
	WebElement item;
	
	
	@FindBy(xpath="//*[@id=\"order\"]/table/tbody/tr/td[3]")
	@CacheLookup
	WebElement unit;
	
	@FindBy(xpath="//*[@id=\"order\"]/table/tbody/tr/td[5]")
	@CacheLookup
	WebElement price;

	
	@FindBy(xpath="//*[@id=\"order\"]/table/tfoot/tr[1]/td[4]")
	@CacheLookup
	WebElement tax; //3.10 for d
	
	@FindBy(xpath="//*[@id=\"order\"]/table/tfoot/tr[2]/td[4]")
	@CacheLookup
	WebElement total;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/a")
	@CacheLookup
	WebElement home;
	
	
	@FindBy(xpath="//*[@id=\"exact_cardholder_name\"]")
	@CacheLookup
	WebElement cardHolderName;
	
	@FindBy(xpath="//*[@id=\"x_card_num\"]")
	@CacheLookup
	WebElement cardNum;
	
	@FindBy(xpath="//*[@id=\"x_exp_date\"]")
	@CacheLookup
	WebElement expiryDate;  //mmyy
	
	@FindBy(xpath="//*[@id=\"x_card_code\"]")
	@CacheLookup
	WebElement securityCode;  
	
	
	@FindBy(xpath="//*[@id=\"cc\"]/form/input[2]")
	@CacheLookup
	WebElement button;  
	
	
	@FindBy(xpath="//div[contains(text(),\"The Card Holder's Name is required.\")]")
	@CacheLookup
	WebElement emptycardname;  
	
	@FindBy(xpath="//div[contains(text(),'The Credit Card Number is required.')]")
	@CacheLookup
	WebElement emptycardnumber;  
	
	@FindBy(xpath="//div[contains(text(),'The Credit Card Expiration Date is required.')]")
	@CacheLookup
	WebElement emptycardexpiry;  
	
	@FindBy(xpath="//div[contains(text(),'Invalid credit card number')]")
	@CacheLookup
	WebElement invalidCardNumber;  
	
	
	@FindBy(xpath="//div[contains(text(),'The Credit Card Expiration Date Format is MMYY.')]")
	@CacheLookup
	WebElement invalidexpiry;  
	



	//Initializing the Page Objects:
			public PaymentPage(){
				PageFactory.initElements(driver, this);
			}

			
			//Actions:
			public String validatePageTitle(){
				
				
				return driver.getTitle();  
			}
			
			
			public String validateQuantity(){
				
				String msg = quantity.getText();
			       
			       return msg;
								}
			
			
			
public String validateBackLink(){
				
				 home.click();
				 
				 String url = driver.getCurrentUrl();  //https://tours.chick-fil-adev.com/
				 
			       
			       return url;
								}
			
			public String validateItem(){
				
				String msg = item.getText();
			       
			       return msg;
								}

public String validateUnit(){
	
	String msg = unit.getText();
       
       return msg;
					}

public String validateTax(){
	
	String msg = tax.getText();
       
       return msg;
					}


public String validatePrice(){
	
	String msg = price.getText();
       
       return msg;
					}



public String validateTotal(){
	
	String msg = total.getText();
       
       return msg;
					}


	public boolean validatePayment(){
	
	cardHolderName.sendKeys(prop.getProperty("cardname"));
	cardNum.sendKeys( prop.getProperty("cardNumber"));
	expiryDate.sendKeys(prop.getProperty("expiry"));
	securityCode.sendKeys(prop.getProperty("pin"));
	button.click();
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
//	String title = driver.getTitle();
	
	return 	driver.findElement(By.id("print-ticket-button")).isDisplayed();
	
	//return title;
					}

public void validatePaymentwithemptyData(){
	
	cardHolderName.sendKeys("");
	cardNum.sendKeys("");
	expiryDate.sendKeys("");
	securityCode.sendKeys("");
	button.click();
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//check all mandatory fields at a time if text display change in leaving empty
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(emptycardname.getText(), "The Card Holder's Name is required.");
		softAssert.assertEquals(emptycardnumber.getText(), "The Credit Card Number is required.");
		softAssert.assertEquals(emptycardexpiry.getText(), "The Number of Vehicles field is required.");
		// 	softAssert.assertEquals(SizeofGroups.getText(), "Please enter a valid number for the size of your group.");
	//	softAssert.assertEquals(TypeOfGroup.getText(), "The Group Type field is required.");
		
		
	//	return title;
					}
			

public void validatePaymentwithinvaliData(){
	
	cardHolderName.sendKeys("xyz");
	cardNum.sendKeys("426398264026f299");
	expiryDate.sendKeys("04/2023");
	securityCode.sendKeys("755");
	button.click();
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//check all mandatory fields at a time if text display change in leaving empty
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(invalidCardNumber.getText(), "Invalid credit card number");
		softAssert.assertEquals(invalidexpiry.getText(), "The Credit Card Expiration Date Format is MMYY.");
		// 	softAssert.assertEquals(SizeofGroups.getText(), "Please enter a valid number for the size of your group.");
	//	softAssert.assertEquals(TypeOfGroup.getText(), "The Group Type field is required.");
		
		
	//	return title;
					}
			





}
