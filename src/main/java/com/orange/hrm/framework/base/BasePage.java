package com.orange.hrm.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.orange.hrm.framework.reports.Reports;

public class BasePage extends Reports{
	
	private static WebDriver driver = null;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters(value="browser")
	public void launchBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else {
			Assert.fail("Invalid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver newDriver) {
		driver = newDriver;
	}

}
