package com.bdd.automation;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import com.bdd.automation.framework.Driver;

public class Calculator {
	
	
	private WebElement clear;
	private WebElement digit1;
	private WebElement digit2;
	private WebElement digit3;
	private WebElement digit4;
	private WebElement digit5;
	private WebElement digit6;
	private WebElement digit7;
	private WebElement digit8;
	private WebElement digit9;
	private WebElement digit0;
	private WebElement plus;
	private WebElement minus;
	private WebElement mul;
	private WebElement div;
	private WebElement equal;
	private WebElement dot;
	private AppiumDriver driver;
	private WebElement textField;
	
	public Calculator() throws MalformedURLException{
		driver = Driver.getDriverInstance().getAppiumDriver();
		
		digit1 = driver.findElementById("com.htc.calculator:id/digit1");
		digit2 = driver.findElementById("com.htc.calculator:id/digit2");
		digit3 = driver.findElementById("com.htc.calculator:id/digit3");
		digit4 = driver.findElementById("com.htc.calculator:id/digit4");
		digit5 = driver.findElementById("com.htc.calculator:id/digit5");
		digit6 = driver.findElementById("com.htc.calculator:id/digit6");
		digit7 = driver.findElementById("com.htc.calculator:id/digit7");
		digit8 = driver.findElementById("com.htc.calculator:id/digit8");
		digit9 = driver.findElementById("com.htc.calculator:id/digit9");
		digit0 = driver.findElementById("com.htc.calculator:id/digit0");
		
		clear = driver.findElementById("com.htc.calculator:id/del");
		
		plus = driver.findElementById("com.htc.calculator:id/plus");
		minus = driver.findElementById("com.htc.calculator:id/minus");
		mul = driver.findElementById("com.htc.calculator:id/mul");
		div = driver.findElementById("com.htc.calculator:id/div");
		
		equal = driver.findElementById("com.htc.calculator:id/equal");
		
		dot = driver.findElementById("com.htc.calculator:id/dot");
		
		textField = driver.findElementByClassName("android.widget.EditText");
		
	}
	
	
	public void tapClear(){
		clear.click();
	}
	
	public void tapPlus(){
		plus.click();
	}
	
	public void tapMinus(){
		minus.click();
	}
	
	public void tapMultiply(){
		mul.click();
	}
	
	public void tapDivide(){
		div.click();
	}
	
	public void tapEqual(){
		equal.click();
	}
	
	public void tapDot(){
		dot.click();
	}
	
	public String getResult(){
		return textField.getText();
	}
	
	public void tapDigit(int digit){
		
		switch(digit){
		case 0:
			digit0.click();
			break;
		case 1:
			digit1.click();
			break;
		case 2:
			digit2.click();
			break;
		case 3:
			digit3.click();
			break;
		case 4:
			digit4.click();
			break;
		case 5:
			digit5.click();
			break;
		case 6:
			digit6.click();
			break;
		case 7:
			digit7.click();
			break;
		case 8:
			digit8.click();
			break;
		case 9:
			digit9.click();
			break;
			
		}
		
	}
	
	
	
	
	
}
