package ScenariosBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*******************************************************

Script Name : TCS01.java

Script Description:
Step-1: Invoke Facebook application in firefox browser
Step-2: Enter Email
Step-3: Click on tab key
Step-4: Enter password
Step-5: Click on tab key
Step-6: Click on Login
Date of creation :
Method Library:
Test data path:
Driver Path:
Author Name: 

********************************************************/

public class Scenario2_PressEnter {

	public static void main(String[] args) throws InterruptedException {
		//Step-1
				//Set the driver path
			    System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
			    
			    //Step - 2
			    //Crate the instance for FireFox Browser
			    WebDriver wd = new FirefoxDriver();
			    
			    wd.navigate().to("https://www.facebook.com/");
			    wd.findElement(By.name("email")).sendKeys("axsnnsknak");			    
			    wd.findElement(By.name("email")).sendKeys(Keys.TAB);
			    
			    wd.findElement(By.name("pass")).sendKeys("password");			    
			    wd.findElement(By.name("pass")).sendKeys(Keys.TAB);
			    
			    wd.findElement(By.name("login")).sendKeys(Keys.ENTER);
			   
			    //Thread.sleep(5000);
			    //wd.close();
	}

}
