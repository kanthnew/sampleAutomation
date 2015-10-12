package com.bdd.automation.framework;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Driver {
	
	public static Driver instance;
	private AppiumDriver driver;
	
	private Driver() throws MalformedURLException{
	
		DesiredCapabilities capabilities = new  DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(CapabilityType.VERSION, "5.0");
		capabilities.setCapability("appPackage", "com.htc.calculator");
		capabilities.setCapability("appActivity", "com.htc.calculator.Calculator");
		capabilities.setCapability("deviceName", "sreekanth");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	}
	
	public static Driver getDriverInstance() throws MalformedURLException{
		if(instance != null)
			return instance;
		
		instance =  new Driver();
		return instance;
	}
	
	public AppiumDriver getAppiumDriver(){
		return driver;
	}
	
	public void tearDown(){
		
		driver.closeApp();
		driver.quit();
		instance = null;
	}
		
	
}
