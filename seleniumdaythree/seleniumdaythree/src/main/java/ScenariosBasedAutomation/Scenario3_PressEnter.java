package ScenariosBasedAutomation;

import java.util.Scanner;

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

public class Scenario3_PressEnter {

	public static void main(String[] args) throws InterruptedException {
		//Step-1
				//Set the driver path
			    System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
			    
			    //Step - 2
			    //Crate the instance for FireFox Browser
			    WebDriver wd = new FirefoxDriver();
			    
			    Scanner sc = new Scanner(System.in);
			    System.out.println("Enter your search");
			    String input = sc.nextLine();
			    
			    wd.navigate().to("https://www.wikipedia.org/");
			    wd.findElement(By.name("search")).sendKeys(input);
			    
			    //Code to click enter in key board
			    
			    wd.findElement(By.name("search")).sendKeys(Keys.ENTER);
			   
			    Thread.sleep(5000);
			    wd.close();
	}

}
