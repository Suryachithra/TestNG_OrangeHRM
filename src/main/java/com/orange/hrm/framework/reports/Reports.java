package com.orange.hrm.framework.reports;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {
	
	public static ExtentHtmlReporter html = null; 
	public static ExtentReports extent = null;
	public static ExtentTest logger = null;
	
	@BeforeSuite(alwaysRun=true)
	public void setupReport() {
		html = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\AutomationTestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	
	public void startReporting(String testcaseName) {
			logger = extent.createTest(testcaseName);
			logger.info("Test Execution Started for the Test Method :"+testcaseName);
		}
		
		// Method to stop printing process
		public void stopReporting() {
			extent.flush();
		}

}
