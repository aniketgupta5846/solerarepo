package ScenariosBasedAutomation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*******************************************************

Script Name : TCS01.java

Script Description:
Step-1: Launch the Google application in firefox browser
Step-2: Search Test Automation
Step-3: Press Enter key
Date of creation :
Method Library:
Test data path:
Driver Path:
Author Name: 

********************************************************/

public class Scenario5_PressEnter {

	public static void main(String[] args) throws InterruptedException, IOException {
				//Step-1
				//Set the driver path
			    System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
			    
			    //Step - 2
			    //Crate the instance for FireFox Browser
			    WebDriver wd = new FirefoxDriver();
			    
			    wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
			    wd.findElement(By.name("login")).sendKeys("testdata1");
			    wd.findElement(By.name("proceed")).click();
			    Thread.sleep(5000);
			    Alert alt =  wd.switchTo().alert();
			    //alt.accept();
			    
			    String expMessage = "Please enter your password";
			    String val = alt.getText();
			    System.out.println("Alert Message is : "+val);
			   /* Thread.sleep(2000);
			    wd.findElement(By.name("passwd")).sendKeys("testpwd1");
			    
			    Thread.sleep(3000);
			    wd.close();*/
			    
			    if(expMessage.equals(val)) {
			    	System.out.println("The alert message is correct");
			    }
			    else {
			    	System.out.println("The alert message is incorrect");
			    }
	}

}
