package com.day1.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *  @author Aniketramji.Gupta
 *  
 *  1.Launch Opencart
 *  2.Click on My Account
 *  3.Click on Login
 *  4.Enter User name
 *  5.Enter Password
 *  6.Click on Login button
 *  Date of creation:
 *  Test data path:
 *  Dtiver path:
 *  Author name:
 * 
 */
/**
 *	Method name 
 *
 *
 */


public class TCS3 {

	public static void main(String[] args) {
		//Step-1
		//Set the driver path
	    System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
	    
	    //Step - 2
	    //Crate the instance for FireFox Browser
	    WebDriver wd = new FirefoxDriver();
	    
	    //Maximize browser window
	    wd.manage().window().maximize();
	    
	    //Invoke application under test  //a[contains(text(),"Login")]
	    wd.get("https://demo.opencart.com/"); 
	    
	    wd.findElement(By.xpath("//span[contains(text(),\"My Account\")]")).click();
	    wd.findElement(By.xpath("//a[contains(text(),\"Login\")]")).click();
	    //sendKeys is used to pass the test data at the time of execution
	    
	    if(wd.findElement(By.id("input-email")).isDisplayed()) {
	    	wd.findElement(By.id("input-email")).clear();
	    	wd.findElement(By.id("input-email")).sendKeys("Testdatauser1");
	    }
	    else {
	    	System.out.println("User name is not present");
	    }
	    
	    if( wd.findElement(By.name("password")).isDisplayed()) {
	    	wd.findElement(By.name("password")).clear();
	    	wd.findElement(By.name("password")).sendKeys("Testuser345");
	    }
	    else {
	    	System.out.println("Password is not correct");
	    }
	   
	    if(wd.findElement(By.xpath("//button[contains(text(),\"Login\")]")).isDisplayed()) {
	    	//wd.findElement(By.xpath("//button[contains(text(),\"Login\")]")).clear();
	    	wd.findElement(By.xpath("//button[contains(text(),\"Login\")]")).click();
	    }
	    else {
	    	System.out.println("Press the login button");
	    }   
	    
	    
	    wd.close();
	}

}
