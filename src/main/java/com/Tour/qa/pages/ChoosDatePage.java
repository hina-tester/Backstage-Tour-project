package com.Tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Tour.qa.base.TestBase;

public class ChoosDatePage extends TestBase{


	//Page Factory
	
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/h1")
		@CacheLookup
		WebElement ChooseDateHeading;
		
		
		@FindBy(xpath="//*[@id=\"calendarDiv\"]/div[2]/div/div/div[2]/a/div[1]/span[2]") //9:00- 10:00 am
		@CacheLookup
		WebElement timeString;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[5]/div[2]/div[1]/div[1]")  //56
		@CacheLookup
		WebElement ticketlable;
		
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[2]/a/b[1]")
		@CacheLookup
		WebElement TheOriginal;
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[2]/a/text()")
		@CacheLookup
		WebElement GroupSize;
		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/h1")
		@CacheLookup
		WebElement PageHading;
		
		@FindBy(xpath="//*[@id=\"calendarDiv\"]/div[1]/span")
		@CacheLookup
		WebElement MonthYear;
	
		
		@FindBy(xpath="//*[@id=\"calendarDiv\"]/div[1]/a[2]")
		@CacheLookup
		WebElement NextButt;
		

		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[1]/div[1]/a")
		@CacheLookup
		WebElement ChoosTour;

		@FindBy(xpath="//*[@id=\"calendarDiv\"]/div[2]/div/div/div/a/div[1]/span[2]")
		@CacheLookup
		WebElement AvalableDate;
		
		
		@FindBy(xpath="//*[@id=\"calendarDiv\"]/div[2]/div/table/tbody/tr[2]/td[3]")
		@CacheLookup
		WebElement NoTourOffer;
		
		
		@FindBy(xpath="//*[@id=\"calendarDiv\"]/div[2]/div/table/tbody/tr[1]/td[4]")
		@CacheLookup
		WebElement ReservationFull;
		
		@FindBy(xpath="//*[@id=\"calendarDiv\"]/div[2]/div/table/tbody/tr[1]/td[3]/div/div[2]/div")
		@CacheLookup
		WebElement NotShaduleYet;
		
				

		@FindBy(xpath="//*[@id=\"navigation-bar\"]/a")
		WebElement Banner;
		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/b[1]")
		WebElement deluxe;
		

		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/b[2]")
		WebElement enterSize2;
		

		
		@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[2]/a/b[2]")
		WebElement EntredSize;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]")
		WebElement referanceNum;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]")
		WebElement groupSize;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")
		WebElement date;
		
		@FindBy(xpath="//a[contains(text(),'Purchase Tickets')]")
		WebElement purchaseTicket;
		
		
	
		//Initializing the Page Objects:
				public ChoosDatePage(){
					PageFactory.initElements(driver, this);
				}

				
				//Actions:
				public String validatePageTitle(){
					
					
					return driver.getTitle();
				}
				
				
public String validatetime(){
					
					
					return timeString.getText();
				}



	public String availablenumber(){
	
	
	String a = ticketlable.getText();
	
	     System.out.print(a);
	return a;
	
}
	public void availablenumber(String monthYear, String date) throws InterruptedException{
		
		
		//String month = "May 2022";
//		String year = "2022";
//		String date = "2";

						Thread.sleep(2000);
						while(true)
						{
						String text = driver.findElement(By.xpath("//*[@id=\"calendarDiv\"]/div[1]/span")).getText();
						
						if(text.equals(monthYear)) {
							
							break;
						
						}
						else
						{
							driver.findElement(By.xpath("//*[@id=\"calendarDiv\"]/div[1]/a[2]")).click();
						}
						
					
						}
	
			Thread.sleep(2000);
			
			
						
					
		}
		

				public boolean validateBanner(){
					return Banner.isDisplayed();
				}

				public boolean validatePageHeading(){
					
					return PageHading.isDisplayed();
				}
				
				public ChoosTour validateChooseTourMenuOption(){
					
					ChoosTour.click();
					
					return new ChoosTour();
				}
				
				public String validateTheOriginal(){
					
					String msg = TheOriginal.getText();
				       
				       return msg;
									}
				
				
				
				public String validateGroupSize(){
					
					String msg = EntredSize.getText();
				       
				       return msg;
									}
				
				
				public String validateThOriginal(){
					
					String msg = deluxe.getText();
				       
				       return msg;
									}
				
				
				
				public String validateGroupSize2(){
					
					String msg = enterSize2.getText();
				       
				       return msg;
									}
				
				
				
				public boolean SelectInValidSlot(String MonthYear, String date) throws InterruptedException{
					
				/*	
					String MonthYear = "April 2022";
					String year = "2022";
					String date = "5";
					*/
					Thread.sleep(2000);
					while(true)
					{
					String text = driver.findElement(By.xpath("//*[@id=\"calendarDiv\"]/div[1]/span")).getText();
					
					if(text.equals(MonthYear)) {
						
						break;
						
						
						
					}
					else
					{
						driver.findElement(By.xpath("//*[@id=\"calendarDiv\"]/div[1]/a[2]")).click();
					}
												
					}
					
					
					
	//				driver.findElement(By.xpath("//tbody/tr/td/div[1]/div[1][normalize-space()='"+date+"']//following::a[1]")).click();
					
String text=	driver.findElement(By.xpath("//div[@class='fc-day-number' and text()='3' ]//following-sibling::div[@class='fc-day-content']/div[@class='no-tours-offered']")).getText();
		
					Thread.sleep(5000);
					
					 try
			            {
			               if(text.equals("No Tours Offered"))
			               {
			            	   System.out.print("Dates is not Available");
			               return true;
			               }
			               return true;
			            }
			            catch(Exception e)
			            {
			                 System.out.print("Dates is Available");
			                return false;
			            }

					
				//	return new ChoosDatePage();
					
					//ChoosTour.click();
					
									}
				
		
				public RegistrationPage SelectValidSlot(String monthYear, String date) throws InterruptedException{
	
	
	//String month = "May 2022";
//	String year = "2022";
//	String date = "2";

					Thread.sleep(4000);
					while(true)
					{
					String text = driver.findElement(By.xpath("//*[@id=\"calendarDiv\"]/div[1]/span")).getText();
					
					if(text.equals(monthYear)) {
						
						break;
					
					}
					else
					{
						driver.findElement(By.xpath("//*[@id=\"calendarDiv\"]/div[1]/a[2]")).click();
					}
					
				
					}
					
					
//	driver.findElement(By.xpath("//div[@class='fc-day-number' and text()='"+date+"']//following-sibling::div[@xpath='1']"));
				
				//	WebElement radio=	driver.findElement(By.xpath("//tbody/tr/td/div[1]/div[1][normalize-space()='"+ date +"']//following::a[1]"));
					
	//			driver.findElement(By.xpath("//tbody/tr/td/div[1]/div[1][normalize-space()='"+ date+"']//following::a[1]")).click();
					Thread.sleep(7000);
					driver.findElement(By.xpath("//div[@class='fc-day-number' and text()='"+date+"']//following::a[1]/div[@class='timeContainer']")).click();
				//	radio.click();
					
				 return new RegistrationPage();
	}
	
	
	//ChoosTour.click();
	
					}

