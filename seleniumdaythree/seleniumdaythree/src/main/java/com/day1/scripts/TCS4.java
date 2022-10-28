package com.day1.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCS4 {

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
			    wd.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb"); 
			    //wd.findElement(By.linkText("Register")).click();
			    wd.findElement(By.partialLinkText("Forgotten")).click();
			    
			    //Absolute 
			    //Relative Xpath

	}

}
