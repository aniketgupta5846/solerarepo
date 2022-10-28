package ScenariosBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*******************************************************
 * 
 * Script Name : TCS01.java
 * 
 * Script Description: Step-1: Launch the Google application in firefox browser
 * Step-2: Search Test Automation Step-3: Press Enter key Date of creation :
 * Method Library: Test data path: Driver Path: Author Name:
 * 
 ********************************************************/

public class Scenario8_RegisterWebElements {

	public static void main(String[] args) throws InterruptedException {
		// Step-1
		// Set the driver path
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

		// Step - 2
		// Crate the instance for FireFox Browser
		WebDriver wd = new FirefoxDriver();

		wd.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");

		WebElement we1, we2, we3;
		we1 = wd.findElement(By.name("firstname"));
		we2 = wd.findElement(By.name("lastname"));
		we3 = wd.findElement(By.name("email"));

		we1.sendKeys("Testuser1");
		we2.sendKeys("Testuser2");
		we3.sendKeys("Testuser@gmail.com");

		Thread.sleep(5000);
		wd.quit();

	}

}
