package com.orange.hrm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.hrm.framework.web.commons.WebCommons;

public class DashboardPageElements extends WebCommons{
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public WebElement dashboardHeader;
	
	@FindBy(xpath="//span[text()='Admin']")
	public WebElement adminSideMenu;
	
	@FindBy(xpath="//span[text()='PIM']")
	public WebElement pimSideMenu;
	
	@FindBy(xpath="//span[text()='Leave']")
	public WebElement leaveSideMenu;
	
	@FindBy(xpath="//span[text()='Time']")
	public WebElement timeSideMenu;
	
	@FindBy(xpath="//span[text()='Recruitment']")
	public WebElement recruitmentSideMenu;
	
	@FindBy(xpath="//span[text()='My Info']")
	public WebElement myInfoSideMenu;
	
	@FindBy(xpath="//span[text()='Performance']")
	public WebElement performanceSideMenu;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	public WebElement dashboardSideMenu;
	
	@FindBy(xpath="//span[text()='Directory']")
	public WebElement directorySideMenu;
	
	@FindBy(xpath="//span[text()='Maintenance']")
	public WebElement maintenanceSideMenu;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-left']")
	public WebElement sideMenuToggleButton;
	
	
	

}
