package com.qa.ExtandReportListner;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.Tour.qa.base.TestBase;
import com.Tour.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtandReportListner extends TestBase implements IReporter {
	
	
	
	
//	org.openqa.selenium.winium.WiniumDriver d= null;

	private static ExtentReports extent;


    
	
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
    	
    	
  //  	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html", true);
		
		extent = new ExtentReports(outputDirectory + File.separator
				+ "BackStagereport.html", true);

		extent.addSystemInfo("QA Engineer", "Hina S");
		extent.addSystemInfo("Company Name", "HS Testing World");
		extent.addSystemInfo("Environment", "QA");
		
		
		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
			}
		}

		extent.flush();
		extent.close();
	}

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
					

					  String currentDir = System.getProperty("user.dir");
				
					String file = System.getProperty(currentDir+"/screenshots/"+"FailureMethod"+System.currentTimeMillis()+".png");

					try {
						TestUtil.getScreenshot(TestBase.driver, file);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					test.log(status, test.addScreenCapture(file));
									// TODO: handle exception
					}
				
					
			 else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extent.endTest(test);
			}
		}
	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}}

