package com.orange.hrm.application.tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.orange.hrm.application.steps.DashboardPageSteps;
import com.orange.hrm.application.steps.LoginPageSteps;
import com.orange.hrm.framework.base.BasePage;
import com.orange.hrm.framework.utilities.ExcelUtil;

public class BaseTest extends BasePage{
	
	public LoginPageSteps loginPage = null;
	public DashboardPageSteps dashboardPage = null;
	
	@BeforeMethod(alwaysRun=true, dependsOnMethods="launchBrowser")
	public void inizializePageObjects() {
		WebDriver driver = new BasePage().getDriver();
		loginPage = new LoginPageSteps(driver);
		dashboardPage = new DashboardPageSteps(driver);
	}
	
	@DataProvider(name="data")
	public String [][] testData(Method method){
		String [][] data = ExcelUtil.readExcelData("TestData.xlsx", method.getName());
		return data;
	}
}
