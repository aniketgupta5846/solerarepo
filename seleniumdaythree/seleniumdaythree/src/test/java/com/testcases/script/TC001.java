package com.testcases.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.day1.lib.Libraryone;

public class TC001 {

	public static void main(String[] args) {
		//Step-1
		//Set the driver path
	    System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
	    
	    //Step - 2
	    //Crate the instance for FireFox Browser
	    WebDriver wd = new FirefoxDriver();
	    
	    Libraryone obj = new Libraryone();
	    
	    obj.initDriver(wd);
	    obj.launchOpencart();
	    obj.Click_On_MyAccount();

	}

}
