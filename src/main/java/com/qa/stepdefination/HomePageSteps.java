package com.qa.stepdefination;


import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.testBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends testBase{
	
	LoginPage loginpage;
	HomePage homepage;

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		testBase.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		String title = loginpage.validateloginPageTitle();
		Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String homeTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homeTitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		boolean flag = homepage.verifyCorrectUserName();
		Assert.assertTrue(flag);
	}

}
