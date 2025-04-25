package com.orange.hrm.application.tests;

import org.testng.annotations.Test;

public class ApplicationTest extends BaseTest{
	
	@Test (priority=0)
	public void verifyCompanyBranding() {
		loginPage.launchApplication();
		loginPage.verifyCompanyBranding();
	}
	
	@Test (priority=1)
	public void verifyCompanyLogo() {
		loginPage.launchApplication();
		loginPage.verifyCompanyLogo();
	}
	
	@Test(priority=2)
	public void verifyLoginPageHeader() {
		loginPage.launchApplication();
		loginPage.verifyPageHeader();
	}
	
	@Test(priority=3)
	public void verifyUsernameAndPasswordIsDisplayed() {
		loginPage.launchApplication();
		loginPage.verifyUsernameAndPasswordIsDisplayed();
	}
	
	@Test(priority=4, dataProvider ="data")
	public void verifyApplicationLogin(String user, String pass) {
		loginPage.launchApplication();
		loginPage.enterLoginCredentials(user, pass);
		loginPage.clickLoginButton();
		dashboardPage.verifyLoginIsSuccessful();
	}
	
	
	
	
	
	

}
