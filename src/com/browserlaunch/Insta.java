package com.browserlaunch;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Insta { 
	static WebDriver driver;
	

	public  static void browsr () {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.get("https://www.instagram.com/");		 
		
	}

	
	public static void webElement() {
//		WebElement username =  driver.findElement(By.id("//input[contains(@class,'_aa4b _add6 _ac4d _ap35 focus-visible')])"));
//		username.sendKeys("mithilesh");
		WebElement password = driver.findElement(By.name("//input[contains(@class,'_aa4b _add6 _ac4d _ap35 focus-visible')])"));
		password.sendKeys("jhhuhh");
	
	}
	
	

	public static void main(String[] args) {
 browsr(); webElement();
	}


	
		
}
	
	
	

