package com.Tour.qa.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



import com.Tour.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentTest;



public class TestBase {
	
	  public static ExtentTest test;
	public static WebDriver driver;
	public static Properties prop;
//	public  static EventFiringWebDriver  WebEventListener;
//	public static WebEventListener eventListener;
	
	public TestBase() {
	
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Selenium\\work space\\TourChickFilAdev\\src\\main\\java\\com\\Tour\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		public static void initialization(){
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");		
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				driver = new FirefoxDriver(); 
			}
			
			

			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
			 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.manage().deleteAllCookies();
				
			driver.get(prop.getProperty("url"));
		}
			
		
	
		
	}
	
	

	
	
