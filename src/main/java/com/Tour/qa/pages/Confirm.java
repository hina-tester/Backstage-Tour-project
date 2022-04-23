package com.Tour.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tour.qa.base.TestBase;

public class Confirm extends TestBase{
	
	//Page Factory
	
	@FindBy(xpath="//*[@id=\"navigation-bar\"]/a")
	@CacheLookup
	WebElement Banner;
	
	
	
	@FindBy(xpath="//*[@id=\"navigation-bar\"]/div/div[2]/div/ul/li[1]/a")
	@CacheLookup
	WebElement topmenu;
	
	@FindBy(xpath="//a[contains(text(),'Choose a Tour')]")
	@CacheLookup
	WebElement chooseTour;
	

	@FindBy(xpath="//a[contains(text(),'Choose a Date')]")
	@CacheLookup
	WebElement chooseDate;
	
	@FindBy(xpath="//a[contains(text(),'Registration')]")
	@CacheLookup
	WebElement registration;

	@FindBy(xpath="//*[@id=\\\"content-body\\\"]/div[1]/div/div/div[2]/div/div[2]/a[1]/b[1]")
	@CacheLookup
	WebElement original;
	
	
	@FindBy(xpath="//b[contains(text(),'The Original')]")
	@CacheLookup
	WebElement original2;
	
	@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div/div[2]/a[2]/strong")
	@CacheLookup
	WebElement date;
	
	@FindBy(xpath="//body/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[4]/span[3]")
	@CacheLookup
	WebElement groupsize;

	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[1]/h1")
	@CacheLookup
	WebElement pageHeading;
	
	@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[4]/div/p/a")
	@CacheLookup
	WebElement logout;
	
	@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[2]/a[3]")
	@CacheLookup
	WebElement tick;

	@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[1]/div[4]")
	@CacheLookup
	WebElement confirmandpurchase;
	
	
	@FindBy(xpath="//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[2]/a[2]/strong")
	@CacheLookup
	WebElement datedisplay;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[2]/div/div/div[3]/span[3]")
	@CacheLookup
	WebElement time1;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[2]/div/div/div[3]/span[5]")
	@CacheLookup
	WebElement time2;

	
	
	@FindBy(id="confirm-payment-button")
	@CacheLookup
	WebElement purchaseTicketbutt;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[2]/div/h3")
	@CacheLookup
	WebElement heading1;

	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[3]/div/h3")
	@CacheLookup
	WebElement heading2;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[4]/div/h3[1]")
	@CacheLookup
	WebElement heading3;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[5]/div/h3")
	@CacheLookup
	WebElement heading4;

	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[6]/div/h3")
	@CacheLookup
	WebElement heading5;
	
	
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/input[1]")
	@CacheLookup
	WebElement purchaseTickbut2;
	
	@FindBy(xpath="//*[@id=\"modify-registration-button\"]")
	@CacheLookup
	WebElement modifybutt;

	@FindBy(xpath="//*[@id=\"cancel-registration-button\"]")
	@CacheLookup
	WebElement cancelbutt;
	
	//-----------form data
	
	@FindBy(xpath="//span[contains(text(),'The Original')]")
	@CacheLookup
	WebElement originalinput;

	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[2]/div/div/div[2]/span[3]/span[1]")
	@CacheLookup
	WebElement dateinput;
	
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[2]/div/div/div[4]/span[3]")
	@CacheLookup
	WebElement groupsizeinput;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[3]/div/div/div/span[3]")
	@CacheLookup
	WebElement totalcost;

	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[4]/div/div/div[1]/span[2]")
	@CacheLookup
	WebElement fnameinput;
	
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[4]/div/div/div[2]/span[2]")
	@CacheLookup
	WebElement lnameinput;

	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[4]/div/div/div[3]/span[2]/a")
	@CacheLookup
	WebElement emailinput;
	
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[5]/div/div/div[1]/span[2]")
	@CacheLookup
	WebElement tyoeOfGroupInput;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[5]/div/div/div[2]/div/span[2]")
	@CacheLookup
	WebElement nameOfGroup;

	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[5]/div/div/div[4]/div/span[2]")
	@CacheLookup
	WebElement specialNeedNo;

	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[6]/div/div/div[1]/span[2]")
	@CacheLookup
	WebElement transpostinput;
	
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[6]/div/div/div[2]/span[2]")
	@CacheLookup
	WebElement numerOfVehi;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[4]/div/div/div[5]/span[2]")
	@CacheLookup
	WebElement zip;
	
	@FindBy(xpath="//*[@id=\"submitForm\"]/div/div[4]/div/div/div[6]/span[2]")
	@CacheLookup
	WebElement mobile;
	



	//Initializing the Page Objects:
			public Confirm(){
				PageFactory.initElements(driver, this);
			}

			
			//Actions:
			public String validatePageTitle(){
				
				
				return driver.getTitle();
			}
			
			
			
public String returndate(){
				
	
	
	String b = datedisplay.getText();
	
	            
				return b;
			}
			
public String returntime(){
				
	
	
	return time1.getText();
	
	            
			}

public String returntime2(){
				
	
	
	return time2.getText();
	
	            
			}
			



			public boolean validateBanner(){
				return Banner.isDisplayed();
			}
			
			
			
			public boolean validatemenu(){
				return topmenu.isDisplayed();
			}
			
			
			public String validateTheOriginal(){
				
				String msg = driver.findElement(By.xpath("//*[@id=\"content-body\"]/div[1]/div/div/div[2]/div[2]/a[1]/b[1]")).getText();
			       
			       return msg;
								}
			
			public String validatedate(){
				
			
				
				String msg = date.getText();
				
			       
			       return msg;
								}
			
			public String validateGroupSize(){
				
				String msg = groupsize.getText();
			       
			       return msg;
								}
			
			public ChoosTour validateChooseTourMenuOption(){
				
				chooseTour.click();
				
				return new ChoosTour();
			}
			
			public ChoosDatePage validateChooseDateOption() {
				
				chooseDate.click();
				
				return new ChoosDatePage();
			}
			
			public RegistrationPage validateRegistration(){
				
				registration.click();
				
				return new RegistrationPage();
			}
			
			public boolean validateTick(){                   //tick image
				return confirmandpurchase.isDisplayed();
			}
			
			public boolean validatePageHeading(){
				return pageHeading.isDisplayed();
			}
			
			
			public PaymentPage validatePurchaseTicketButt(){
				
				purchaseTicketbutt.click();
				
				return new PaymentPage();
			}
			
			public boolean validateHeading1(){
				return heading1.isDisplayed();
			}
			
			public boolean validateHeading2(){
				return heading2.isDisplayed();
			}
			public boolean validateHeading3(){
				return heading3.isDisplayed();
			}
			public boolean validateHeading4(){
				return heading4.isDisplayed();
			}
			public boolean validateHeading5(){
				return heading5.isDisplayed();
			}
			
			public PaymentPage validatePurchaseTicketButt2(){
				
				purchaseTickbut2.click();
	
				return new PaymentPage();
			}
			
			
public ChoosDatePage validateModifyReservationButt2(){
				
	modifybutt.click();
	
				return new ChoosDatePage();
			}
			

public HomePage validateCancelButt2(){
	
	cancelbutt.click();

	return new HomePage();
}

			//-------- validate form data

public String validateTourType(){
	
	
	
	String msg = originalinput.getText();
	
       
       return msg;
					}
public String validateInputdate(){
	
	
	
	String msg = dateinput.getText();
	
       
       return msg;
					}
public String validateTime(){
	
	
	
	String msg = date.getText();
	
       
       return msg;
					}
public String validateGroupSizeInput(){
	
	
	
	String msg = groupsizeinput.getText();
	
       
       return msg;
					}
public String validateCost(){
	
	
	
	
	
	
	String msg = driver.findElement(By.xpath("//*[@id=\"submitForm\"]/div/div[3]/div/div/div/span[3]")).getText();
	
       
       return msg;
					}
public String validateFname(){
	
	
	
	String msg = fnameinput.getText();
	
       
       return msg;
					}
public String validateLname(){
	
	
	
	String msg = lnameinput.getText();
	
       
       return msg;
					}




public String validateEmail(){
	
	
	
	String msg = emailinput.getText();
	
       
       return msg;
					}
public String validateTypeOfGroup(){
	
	
	
	String msg = tyoeOfGroupInput.getText();
	
       
       return msg;
					}
public String validateNameOfGroupe(){
	
	
	
	String msg = nameOfGroup.getText();
	
       
       return msg;
					}
public String validateSpecialNeed(){
	
	
	
	String msg = specialNeedNo.getText();
	
       
       return msg;
					}
public String validateTransport(){
	
	
	
	String msg = transpostinput.getText();
	
       
       return msg;
					}


public String validateVehicalnumber(){

	
	String msg = numerOfVehi.getText();
	
       
       return msg;
					}
			
public String validateMobile(){
	
	
	
	String msg = mobile.getText();
	
       
       return msg;
					}
public String validateZipCode(){
	
	
	
	String msg = zip.getText();
	
       
       return msg;
					}

			
	

}
