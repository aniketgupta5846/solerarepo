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

public class Scenario7_WebElements {

	public static void main(String[] args) throws InterruptedException {
		// Step-1
		// Set the driver path
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

		// Step - 2
		// Crate the instance for FireFox Browser
		WebDriver wd = new FirefoxDriver();

		wd.get("https://www.bmw.in/en/index.html");

		WebElement we1;
		we1 = wd.findElement(By.xpath("//a[@title='Models']"));
		we1.click();
		// ((JavascriptExecutor) wd).executeScript("scroll(0,500)");

		WebElement we2;
		we2 = wd.findElement(By.xpath("//button[@data-anchor='#5']"));
		we2.click();

		Thread.sleep(5000);
		wd.quit();

	}

}
