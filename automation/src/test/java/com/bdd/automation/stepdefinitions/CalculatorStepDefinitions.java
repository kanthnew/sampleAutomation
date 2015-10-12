package com.bdd.automation.stepdefinitions;

import java.net.MalformedURLException;

import junit.framework.Assert;

import com.bdd.automation.Calculator;
import com.bdd.automation.framework.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefinitions {
	
	private Calculator calc;
	
	public CalculatorStepDefinitions() throws MalformedURLException{
		calc = new Calculator();
	}
	
	@Given("^Calculator App is Open in Mobile$")
	public void calculator_App_is_Open_in_Mobile() throws Throwable {
	    
		Driver.getDriverInstance();
	}

	@Given("^Result text is \"([^\"]*)\"$")
	public void result_text_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		calc.tapClear();
	}

	@When("^tap digit \"([^\"]*)\"$")
	public void tap_digit(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    calc.tapDigit(Integer.parseInt(arg1));
	}

	@When("^tap \"([^\"]*)\"$")
	public void tap(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    switch(arg1){
	    case "plus":
	    	calc.tapPlus();
	    	break;
	    case "minus":
	    	calc.tapMinus();
	    	break;
	    case "mul":
	    	calc.tapMultiply();
	    	break;
	    case "div":
	    	calc.tapDivide();
	    	break;
	    case "equal":
	    	calc.tapEqual();
	    	break;
	    
	    }
	}

	@Then("^result is \"([^\"]*)\"$")
	public void result_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertEquals("Exptected result", calc.getResult(), arg1);
	}


	
	
	
}
