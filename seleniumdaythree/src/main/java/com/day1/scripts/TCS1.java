package com.day1.scripts;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCS1 {

//	public static void main(String[] args) {
//		//Step-1
//		//Set the driver path
//	    System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");  
//	    
//	    //Step - 2
//	    //Crate the instance for FireFox Browser
//	    WebDriver wd = new ChromeDriver();
//	    
//	    //Step - 3
//	    //Invoke the application
//	    wd.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.5.3");
//	    
//
//	}
	public static void main(String[] args) {
		//Step-1
		//Set the driver path
	    System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
	    
	    //Step - 2
	    //Crate the instance for FireFox Browser
	    WebDriver wd = new FirefoxDriver();
	    
	    //Step - 3
	    //Invoke the application
	    wd.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.5.3");
	    

	}

}
