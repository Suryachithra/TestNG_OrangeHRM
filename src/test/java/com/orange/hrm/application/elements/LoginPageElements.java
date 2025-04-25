package com.orange.hrm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.hrm.framework.web.commons.WebCommons;

public class LoginPageElements extends WebCommons {
	
	@FindBy(xpath="//img[@alt='company-branding']")
	public WebElement companyBranding;
	
	@FindBy(xpath="//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
	public WebElement logo;
	
	@FindBy(xpath="//h5[text()='Login']")
	public WebElement loginHeader;
	
	@FindBy(xpath="//p[text()='Username : Admin']")
	public WebElement givenUsername;
	
	@FindBy(xpath="//p[text()='Password : admin123']")
	public WebElement givenPassword;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement usernameField;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordField;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	public WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	public WebElement linkedInLink;
	
	@FindBy(xpath="//a[@href='https://www.facebook.com/OrangeHRM/']")
	public WebElement facebookLink;
	
	@FindBy(xpath="//a[@href='https://twitter.com/orangehrm?lang=en']")
	public WebElement twitterLink;
	
	@FindBy(xpath="//a[@href='https://www.youtube.com/c/OrangeHRMInc']")
	public WebElement youtubeLink;
}
