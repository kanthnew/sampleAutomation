package com.bdd.automation.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {
	
	

@Given("^browser is open with Home Page$")
public void browser_is_open_with_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("browser is open with Home Page");
}

@Then("^Sport Types are displayed$")
public void sport_Types_are_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Sport Types are displayed");
}

@When("^user click on a sport \"([^\"]*)\"$")
public void user_click_on_a_sport(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("user click on a sport");
}

@Then("^Sports page \"([^\"]*)\" is displayed$")
public void sports_page_is_displayed(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Sports page");
	//assertTrue("Failing",false);
}


}
