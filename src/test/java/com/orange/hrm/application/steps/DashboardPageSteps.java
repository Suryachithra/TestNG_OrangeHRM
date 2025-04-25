package com.orange.hrm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orange.hrm.application.elements.DashboardPageElements;

public class DashboardPageSteps extends DashboardPageElements{
	
	public DashboardPageSteps(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLoginIsSuccessful() {
		waitForElement(dashboardHeader,30);
		log("pass","Application Login is Successful");
	}
	
	public void clicksideMenuToggleButton() {
		click(sideMenuToggleButton);
	}
	
	public void verifyAdminSideMenuIsDisplayed() {
		waitForElement(adminSideMenu,30);
		Assert.assertTrue(isElementDisplayed(adminSideMenu));
		log("pass","Side Menu: Admin is displayed");
	}
	
	
	public void verifyPIMSideMenuIsDisplayed() {
		waitForElement(pimSideMenu,30);
		Assert.assertTrue(isElementDisplayed(pimSideMenu));
		log("pass","Side Menu: PIM is displayed");
	}
	
	public void verifyLeaveSideMenuIsDisplayed() {
		waitForElement(leaveSideMenu,30);
		Assert.assertTrue(isElementDisplayed(leaveSideMenu));
		log("pass","Side Menu: Leave is displayed");
	}
	
	public void verifyTimeSideMenuIsDisplayed() {
		waitForElement(timeSideMenu,30);
		Assert.assertTrue(isElementDisplayed(timeSideMenu));
		log("pass","Side Menu: Time is displayed");
	}
	
	public void verifyRecruitmentSideMenuIsDisplayed() {
		waitForElement(recruitmentSideMenu,30);
		Assert.assertTrue(isElementDisplayed(recruitmentSideMenu));
		log("pass","Side Menu: Recruitment is displayed");
	}
	
	public void verifyMyInfoSideMenuIsDisplayed() {
		waitForElement(myInfoSideMenu,30);
		Assert.assertTrue(isElementDisplayed(myInfoSideMenu));
		log("pass","Side Menu: My Info is displayed");
	}
	
	public void verifyPerformanceSideMenuIsDisplayed() {
		waitForElement(performanceSideMenu,30);
		Assert.assertTrue(isElementDisplayed(performanceSideMenu));
		log("pass","Side Menu: Performance is displayed");
	}
	
	public void verifyDashboardSideMenuIsDisplayed() {
		waitForElement(dashboardSideMenu,30);
		Assert.assertTrue(isElementDisplayed(dashboardSideMenu));
		log("pass","Side Menu: Dashboard is displayed");
	}
	
	public void verifyDirectorySideMenuIsDisplayed() {
		waitForElement(directorySideMenu,30);
		Assert.assertTrue(isElementDisplayed(directorySideMenu));
		log("pass","Side Menu: Directory is displayed");
	}
	
	public void verifyMaintenanceSideMenuIsDisplayed() {
		waitForElement(maintenanceSideMenu,30);
		Assert.assertTrue(isElementDisplayed(maintenanceSideMenu));
		log("pass","Side Menu: Maintenance is displayed");
	}
	
	public void verifySideMenuToggleButton() {
		waitForElement(sideMenuToggleButton,30);
		Assert.assertTrue(isElementDisplayed(sideMenuToggleButton));
		log("pass","Side Menu sideMenuToggleButton is displayed");
	}
	


}
