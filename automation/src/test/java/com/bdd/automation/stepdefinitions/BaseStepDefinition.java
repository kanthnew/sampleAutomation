package com.bdd.automation.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseStepDefinition {
	
	@Before
	public void BeforeScenario(Scenario sc){
		System.out.println("Before Scenario : "+sc.getName());
	}
	
	@After
	public void AfterScenario(Scenario sc){
		System.out.println("After Scenario Status: "+sc.getStatus());
	}

}
