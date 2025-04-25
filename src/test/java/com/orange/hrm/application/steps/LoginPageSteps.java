package com.orange.hrm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orange.hrm.application.elements.LoginPageElements;

public class LoginPageSteps extends LoginPageElements {
	
	public LoginPageSteps(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCompanyBranding() {
		waitForElement(companyBranding, 15);
		Assert.assertTrue(isElementDisplayed(companyBranding));
		log("pass", "OrangeHRM Branding is Successfully displayed in the Login Page");
		addScreenshot(companyBranding, "OrangeHRM Branding");
	}

	public void verifyCompanyLogo() {
		waitForElement(logo, 30);
		Assert.assertTrue(isElementDisplayed(logo));
		log("pass", "OrangeHRM logo is Successfully displayed in the Login Page");
		addScreenshot(logo, "OrangeHRM Logo");
	}
	
	public void verifyPageHeader() {
		waitForElement(loginHeader, 30);
		Assert.assertEquals(loginHeader.getText(), "Login");
		log("pass","Application Login Header is displayed as expected");
	}
	
	public void verifyUsernameAndPasswordIsDisplayed() {
		waitForElement(givenPassword, 30);
		Assert.assertTrue(isElementDisplayed(givenUsername));
		Assert.assertTrue(isElementDisplayed(givenPassword));
		log("pass", "Username and Password is Successfully displayed in the Login Page");
	}
	
	public void enterLoginCredentials(String user, String pass) {
		waitForElement(loginButton, 30);
		enterText(usernameField, user);
		enterText(passwordField, pass);
		log("info","Credentials are entered successfully");
	}
	
	public void clickLoginButton() {
		click(loginButton);
		log("info","Clicked on the Login Button");
		implicitWait(30);
	}
	
	public void verifyForgotPasswordLinkIsDisplayed() {
		Assert.assertTrue(isElementDisplayed(forgotPasswordLink));
	}
	
	public void clickForgotPasswordLink() {
		click(forgotPasswordLink);
	}
	
	public void verifyLinkedInIconIsDisplayed() {
		Assert.assertTrue(isElementDisplayed(linkedInLink));
		log("pass", "LinkedIn icon is Successfully displayed in the Login Page");
	}
	
	public void clickLinkedInIcon() {
		click(linkedInLink);
	}
	
	public void verifyFacebookIconIsDisplayed() {
		Assert.assertTrue(isElementDisplayed(facebookLink));
		log("pass", "Facebook icon is Successfully displayed in the Login Page");
	}
	
	public void clickFacebookIcon() {
		click(facebookLink);
	}
	
	public void verifyTwitterIconIsDisplayed() {
		Assert.assertTrue(isElementDisplayed(twitterLink));
		log("pass", "Twitter icon is Successfully displayed in the Login Page");
	}
	
	public void clickTwitterIcon() {
		click(twitterLink);
	}
	
	public void verifyYoutubeIconIsDisplayed() {
		Assert.assertTrue(isElementDisplayed(youtubeLink));
		log("pass", "Youtube icon is Successfully displayed in the Login Page");
	}
	
	public void clickYoutubeIcon() {
		click(youtubeLink);
	}
	
	

}
