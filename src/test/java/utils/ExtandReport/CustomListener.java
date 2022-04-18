package utils.ExtandReport;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;


public class CustomListener extends TestUtil implements ITestListener{
	
	 public void onStart(ITestResult result) {
	       
	    }


	    public void onFinish(ITestResult result) {
	        
	    }

	    public void onTestStart(ITestResult result) {
	       
	    }


	    public void onTestSuccess(ITestResult result) {
	     
	    }

	    public void onTestFailure(ITestResult result) {
	        System.out.println("I am in onTestFailure method " );
	        
	       
	        try {
	        	getScreenshot(driver, "TEST CASE FAILED IS "+result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }

	
	    public void onTestSkipped(ITestResult iTestResult) {
	       
	    }

	
	    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
	       
	    }

	

}
