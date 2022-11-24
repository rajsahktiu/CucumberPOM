package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.testBase;

public class LoginPage extends testBase{

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(linkText="Sign Up")
	WebElement signUpBtn;
	
	@FindBy(xpath="(//img[@class='img-responsive'])")
	WebElement crmLogo;
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginPageTitle() {
		return driver.getTitle();	
	}
	
	public boolean validateLogo() {
		return crmLogo.isDisplayed();
		
	}
	
	public HomePage login(String un, String pw) throws IOException {
		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
		
		return new HomePage();
	}
}
