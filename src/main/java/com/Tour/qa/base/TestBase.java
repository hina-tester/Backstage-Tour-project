package com.Tour.qa.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	
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
			
			logger = Logger.getLogger("Backstage Tour");
			PropertyConfigurator.configure("Log4j.properties");
			
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
			
		public void captureScreen(String tname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}
		 public static void takeScreenshotAtEndOfTest() throws IOException {
			  
			  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			  String currentDir = System.getProperty("user.dir");
			  FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" +  System.currentTimeMillis() + ".png"));
			  
			  }
			 
		
	}
	
	

	
	
