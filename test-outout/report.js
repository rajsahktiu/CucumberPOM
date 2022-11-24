$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_WorkSpace/CucumberPOM/src/main/java/com/qa/features/CRMPro.feature");
formatter.feature({
  "line": 1,
  "name": "CRM PRO Application Test",
  "description": "",
  "id": "crm-pro-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate CRM PRO Home Page Test",
  "description": "",
  "id": "crm-pro-application-test;validate-crm-pro-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 5429405200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 1715900,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"com.qa.pages.LoginPage.validateloginPageTitle()\" because \"this.loginpage\" is null\r\n\tat com.qa.stepdefination.HomePageSteps.user_is_on_login_page(HomePageSteps.java:24)\r\n\tat ✽.Then user is on login page(C:/Selenium_WorkSpace/CucumberPOM/src/main/java/com/qa/features/CRMPro.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "status": "skipped"
});
});