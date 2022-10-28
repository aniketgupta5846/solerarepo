package com.day1.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Libraryone {
	WebDriver wd;
	
	public void initDriver(WebDriver wd) {
		this.wd = wd;
	}
	
	public void launchOpencart() {
		wd.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		String expTitle = "Account Login";
		String actTitle = wd.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("Application is invoked successfully");
			
		}
		else {
			System.out.println("The application url is wrong");
		}
	}
	public void Click_On_MyAccount() {
		if(wd.findElement(By.xpath("//span[contains(text(),\"My Account\")]")).isDisplayed()){
			 wd.findElement(By.xpath("//span[contains(text(),\"My Account\")]")).click();
		}
		else {
			System.out.println("Wrong Url");
		}
	}

}
