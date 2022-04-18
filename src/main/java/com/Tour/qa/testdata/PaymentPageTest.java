package com.Tour.qa.testdata;


import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.pages.ChoosDatePage;
import com.Tour.qa.pages.ChoosTour;
import com.Tour.qa.pages.Confirm;
import com.Tour.qa.pages.CusgtomerPlan;
import com.Tour.qa.pages.ForgotPassword;
import com.Tour.qa.pages.HomePage;
import com.Tour.qa.pages.LoginPage;
import com.Tour.qa.pages.PaymentPage;
import com.Tour.qa.pages.PrintTicket;
import com.Tour.qa.pages.RegistrationPage;

public class PaymentPageTest extends TestBase {

	

	
	HomePage homePage;
	ChoosTour chooseTour;
	ChoosDatePage chooseDate;
	RegistrationPage RegisPage;
	Confirm confirmPage;
	LoginPage loginPage;
	ForgotPassword fgPage;
	CusgtomerPlan service;
	PaymentPage payment;
	PrintTicket print;
	



	public PaymentPageTest(){
		super();
	}
	


	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		chooseTour = new ChoosTour();	
		chooseDate = new  ChoosDatePage();
		homePage = new HomePage();
		confirmPage = new Confirm();
		RegisPage = new RegistrationPage();
		loginPage = new LoginPage();
		fgPage = new ForgotPassword();
		service = new CusgtomerPlan();
		payment = new PaymentPage();
		print = new PrintTicket();
		
		
		chooseTour = homePage.CheckPurchaseTicket();
		
		int groupsize ;
		
        groupsize = Integer.parseInt(prop.getProperty("groupsize"));   
		 
		chooseDate = chooseTour.EnterageGroup1(groupsize);
				
		 RegisPage = chooseDate.SelectValidSlot(prop.getProperty("monthYear"), prop.getProperty("date"));
		 
	//	 confirmPage = 
				 RegisPage.CheckFillData();
				 
				 payment = confirmPage.validatePurchaseTicketButt();
	      
					
	}
	
	@Test(priority=1)
	public void validateTitle(){
		
		String title = payment.validatePageTitle();
		Assert.assertEquals(title,"Experient Group DEMO0541 Payment Page: Payment");
		
		
	}
	
	@Test(priority=2)
	public void validateQuantityTest(){
		
		String quantity = payment.validateQuantity();
		Assert.assertEquals(quantity,prop.getProperty("groupsize"));
		
		
	}
	
	

	@Test(priority=3)
	public void validateUnit(){

		String unito = "$10.00";// for original
		String unitd = "$20.00"; //for dup
		String item = payment.validateUnit();
		Assert.assertEquals(item,unito);
		
		
	}
	
	
	
	@Test(priority=4)
	public void validateTax(){  //display 2 digit after dot the amount without rounding last value
		
		double groupsizeb,subTotal;
		
		DecimalFormat df = new DecimalFormat("#.##");
		

		df.setRoundingMode(RoundingMode.DOWN);
    
		
		int groupsize ;
		
        groupsize = Integer.parseInt(prop.getProperty("groupsize"));   
		 
		
		subTotal = 0.78 * groupsize;
		
	
		
		String tax = payment.validateTax();
		
//		String str = Double.toString(subTotal);
			
		
	//	Assert.assertEquals(df.format(subTotal),tax);
		
		System.out.print(df.format(subTotal));
		
		Assert.assertEquals(df.format(subTotal),tax);
		
		
	}
	
	
	
	@Test(priority=5)
	public void validatePrice(){
		
		double subTotal,quantity,unit;
		
//		DecimalFormat df = new DecimalFormat("#.##");   // no need here
		
	
		unit = 10;   //for original
		
		quantity = Integer.parseInt(prop.getProperty("groupsize"));   
		 
	
		subTotal = quantity * unit;

		
		String str1 = String.format("%.2f", subTotal); 
   
		
		String Total = payment.validatePrice();
		
		Assert.assertEquals(str1,Total);
		
		
	}
	

	@Test(priority=6)
	public void validateTotal(){
		
		double  subTotal,quantity,unit;
		
	 DecimalFormat df = new DecimalFormat("#.##");
	 
		unit = 10.78;   //for original
		
		quantity = Integer.parseInt(prop.getProperty("groupsize"));   
				
	
		subTotal = quantity * unit;

        
	
		String Total = payment.validateTotal();
		
		df.setRoundingMode(RoundingMode.DOWN);   // this is for displaying two numbers after point without ronding it
   
		
	Assert.assertEquals(df.format(subTotal),Total);
		
		
	}
	
	
	@Test(priority=7)
	public void validatePayment(){
		
		//still no valid card is available there for this will not pass
		 
		
		
	//String page = 	payment.validatePayment();
		
		boolean  flag = payment.validatePayment();
		Assert.assertTrue(flag); //check print button is available on next landing page?
	

		
	}
	
	
	@Test(priority=8)
	public void validatePaymentwithemptyInput(){
		
		//still no valid card is available there for this will not pass
		
	payment.validatePaymentwithemptyData();
	
	
	}
	
	
	@Test(priority=9)
	public void validatePaymentwithinvalidInput(){
		
		//still no valid card is available there for this will not pass
		
	payment.validatePaymentwithinvaliData();
	
	
	}
	
	
	@Test(priority=10)
	
	public void ValidateBankLink(){
		
		
		String url1= payment.validateBackLink();
		
		String url2=  "https://tours.chick-fil-adev.com/" ;
			
		
		Assert.assertEquals(url2,url1);
		
	
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
