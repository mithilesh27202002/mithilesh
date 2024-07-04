package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Instad { 
	static WebDriver driver;
	

	public  static void browsr () {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.get("https://www.instagram.com/");		 
		
	}

	
	public static void webElement() {
		WebElement username =  driver.findElement(By.id("_aa4a"));
		username.sendKeys("mithilesh");
		 WebElement element = driver.findElement(By.name("Password"));
		element.sendKeys("jhhuhh");
	
	}
	
	

	public static void main(String[] args) {
 browsr(); webElement();
	}


	
		
}
	



	
	

