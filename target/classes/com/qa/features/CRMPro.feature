Feature: CRM PRO Application Test

Scenario: Validate CRM PRO Home Page Test

	Given user opens browser
	Then user is on login page
	Then user enters username and password
	Then validate home page title
	Then validate logged in username 