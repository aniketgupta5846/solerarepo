package ScenariosBasedAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*******************************************************
 * 
 * Script Name : TCS01.java
 * 
 * Script Description: Step-1: Launch the Google application in firefox browser
 * Step-2: Search Test Automation Step-3: Press Enter key Date of creation :
 * Method Library: Test data path: Driver Path: Author Name:
 * 
 ********************************************************/

public class Scenario9_SelectList {

	public static void main(String[] args) throws InterruptedException {
		// Step-1
		// Set the driver path
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

		// Step - 2
		// Crate the instance for FireFox Browser
		WebDriver wd = new FirefoxDriver();

		wd.get("https://demo.guru99.com/test/newtours/register.php");

		Select sel = new Select(wd.findElement(By.xpath("//select[@name='country']")));
		((JavascriptExecutor) wd).executeScript("scroll(0,500)");
		Thread.sleep(3000);
		sel.selectByVisibleText("ANGOLA");
		
		List<WebElement> l = sel.getOptions();

		int count = l.size();
		for (int i = 0; i < count; i++) {
			System.out.println();
			String countryval = l.get(i).getText();
			System.out.println(countryval);
		}

		Thread.sleep(5000);
		wd.quit();

	}

}
