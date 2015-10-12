package com.bdd.automation.stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.bdd.automation.framework.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseStepDefinition {
	public Driver driver;
	
	
	public BaseStepDefinition() throws MalformedURLException{
		
		
	}
	@Before
	public void BeforeScenario(Scenario sc) throws MalformedURLException{
		System.out.println("Before Scenario : "+sc.getName());
		driver = Driver.getDriverInstance();
		
	}
	
	@After
	public void AfterScenario(Scenario sc){
		System.out.println("After Scenario Status: "+sc.getStatus());
		driver.tearDown();
		
		
	}

}
