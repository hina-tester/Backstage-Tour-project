package com.Tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class PrintTicket extends TestBase {
	
	
	//Page Factory
	
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[1]/div[1]")
		@CacheLookup
		WebElement chooseTour;
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[1]/div[2]")
		@CacheLookup
		WebElement chooseDate;
		
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[1]/div[3]")
		@CacheLookup
		WebElement Registration;
		
		
		@FindBy(xpath="///*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[1]/div[4]")
		@CacheLookup
		WebElement confirm;
		
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[1]/div[5]")
		@CacheLookup
		WebElement PrintTicket;
		
		@FindBy(xpath="//b[contains(text(),'The Original')]")
		@CacheLookup
		WebElement original;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[2]/strong[1]")
		@CacheLookup
		WebElement date;
		
		
		@FindBy(xpath="//span[contains(text(),'9:00am-10:00am')]")
		@CacheLookup
		WebElement time;
		
		@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[3]")
		@CacheLookup
		WebElement tick1;
		
		
		@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[4]")
		@CacheLookup
		WebElement tick2;
		
		
		@FindBy(xpath="//h1[contains(text(),'Thank You!')]")
		@CacheLookup
		WebElement pageHeading1;
		
		
		@FindBy(xpath="//h2[contains(text(),'Your Reservation and Payment is Complete!')]")
		@CacheLookup
		WebElement pageHeading2;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/input[1]")
		@CacheLookup
		WebElement printbutt;
		
		
		@FindBy(xpath="//a[contains(text(),'Chick-fil-abackstagetour@chick-fil-a.com')]")
		@CacheLookup
		WebElement link1;
		
		
		@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/p[3]/a[1]")
		@CacheLookup
		WebElement plankvisitlink;
		
		@FindBy(xpath="//h3[contains(text(),'Reservation Details')]")
		@CacheLookup
		WebElement h1;
		
		
		@FindBy(xpath="//h3[contains(text(),'Payment Details')]")
		@CacheLookup
		WebElement h2;
		
		
		@FindBy(xpath="//h3[contains(text(),'Group Leader Information')]")
		@CacheLookup
		WebElement h3;
		
		@FindBy(xpath="//h3[contains(text(),'Transportation')]")
		@CacheLookup
		WebElement h4;
		
		
		@FindBy(xpath="//a[@id='button-plan-your-visit']")
		@CacheLookup
		WebElement planvisitbutt;
		
		
		@FindBy(xpath="//a[contains(text(),'Frequently Asked Questions')]")
		@CacheLookup
		WebElement askQuestion;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/span[3]")
		@CacheLookup
		WebElement cardHolderName;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/span[3]")
		@CacheLookup
		WebElement cardN;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/span[3]")
		@CacheLookup
		WebElement currentTimeDate;
		
		

		@FindBy(xpath="//*[@id=\"navigation-bar\"]/a")
		@CacheLookup
		WebElement banner;

		@FindBy(xpath="//*[@id=\"navigation-bar\"]/div/div[2]/div/ul/li[1]/a")
		@CacheLookup
		WebElement menu;




		//Initializing the Page Objects:
				public PrintTicket(){
					PageFactory.initElements(driver, this);
				}


				//Actions:
				public String validatePageTitle(){
					
					
					return driver.getTitle();  
				}
				
				
				public boolean validateBanner(){
					return banner.isDisplayed();
				}
				

				public boolean validatemenu(){
					return menu.isDisplayed();
				}
				
				
				public boolean datetext(){
					return date.isDisplayed();
				}
				
				public boolean validatechooseTour(){
					
					chooseTour.click();
					WebElement heading = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h1[1]"));
					
					return  heading.isDisplayed();
					
				}
				


				public boolean validatechooseDate(){
						
						chooseDate.click();
						
			WebElement heading =	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h1[1]"));
						
						 return heading.isDisplayed();
						 
					
				}
				
				


				public boolean validateconfirm(){
					
					
					confirm.click();
WebElement heading = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]"));
					
					return heading.isDisplayed();
				
					}
				
				
				public boolean RegistrationPage (){
					
					
					Registration.click();
					
		WebElement heading = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/h1[1]"));
					
					return heading.isDisplayed();
					
				}
				


				

				public boolean validatePageHeading1(){
					return pageHeading1.isDisplayed();
				}
				


				public boolean validatePageHeading2(){
					return pageHeading2.isDisplayed();
				}
				
				public boolean printTicketmenu(){
					
					return pageHeading2.isDisplayed();
				}
				

				public CusgtomerPlan validatePlanvisit(){
					
					
					planvisitbutt.click();
					 
					 return new CusgtomerPlan();
				}
				
				
				public boolean tick1(){
					
					Registration.click();
					
WebElement heading =driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/h1[1]"));
					
					return heading.isDisplayed();
				}
				
				public boolean tick2(){
					
					
					confirm.click();
					WebElement heading =driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]"));
					 
					return heading.isDisplayed();
				}
				
				public boolean printTicket() throws InterruptedException{
					
					
					printbutt.click();
					Thread.sleep(5000);
				/*	
					driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
					WebElement webElement = driver.findElement(By.tagName("body"));
					webElement.sendKeys(Keys.ESCAPE);

					*/

					Thread.sleep(5000);
					
			
					boolean allPresent = true;
					
					if (!this.chooseTour.isDisplayed() ) {
						
						System.out.println("Choose Tour menu is missing");
						
				        allPresent = false;
				       
				    }
					
					if (!this.banner.isDisplayed() ) {
						
						System.out.println("Banner is missing");
						
				        allPresent = false;
				       
				    }
				    if (!this.chooseDate.isDisplayed()) {
				    	System.out.print("Choose Date menu is missing");
				        allPresent = false;
				        
				    }
				    if (!this.Registration.isDisplayed()) {
				    	System.out.print("Registration menu is missing");
				        allPresent = false;
				       
				    }
				    if (!this.confirm.isDisplayed()) {
				    	System.out.print("Confirm  menu is missing");
				        allPresent = false;
				       
				    }
				    if (!this.PrintTicket.isDisplayed()) {
				    	
				    	System.out.print("Print Ticket menu is missing");
				        allPresent = false;
				       
				    }
				    if (!this.tick1.isDisplayed()) {
				    	
				    	System.out.print("Registration Tick is missing is missing");
				        allPresent = false;
				        
				    }
				    if (!this.tick2.isDisplayed()) {
				    	System.out.print("Confirm tick is missing");
				        allPresent = false;
				       
				    }
				    if (!this.printbutt.isDisplayed()) {
				    	System.out.print("Print button is missing");
				    	
				        allPresent = false;
				        
				    }
				    if (!this.plankvisitlink.isDisplayed()) {
				    	
				    	System.out.print("Plan you visit link is missing");
				        allPresent = false;
				        
				    }
				    if (!this.planvisitbutt.isDisplayed()) {
				    	
				    	System.out.print("Plan your visit button is missing");
				        allPresent = false;
				       
				    }
				  
				    return allPresent;
									}

				
				
				
				public boolean validateOriginal(){
					return original.isDisplayed();
				}
				

				

				public boolean validatemailto(){
					return link1.isDisplayed();
				}
				

				public boolean validateh1(){
					return h1.isDisplayed();
				}

				public boolean validateh2(){
					return h2.isDisplayed();
				}

				public boolean validateh3(){
					return h3.isDisplayed();
				}
				

				public boolean validateh4(){
					return h4.isDisplayed();
				}

				public boolean validatedate(){
					return date.isDisplayed();
				}

				public FAQ validatelinkquestion(){
				
					 askQuestion.click();
					 
						
						return new FAQ();
				}
				
				public String validatecardHolderName(){
					return cardHolderName.getText();
				}
				
				public String validatecardnum(){
					return cardN.getText();
				}
				
				
				
				
		
}
