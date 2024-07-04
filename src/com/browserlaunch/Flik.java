package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flik { 
	

	public static WebDriver driver;
		public static void  brower() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://snapdeal.com/");
		
		}
		
		public static void  JS() {
			driver.findElement(By.xpath("(//a<[text()='Winter Wear'])"));
			
		}
		
		
		
		
		
	public static void main(String[] args) {
		brower();
		JS();
	}	
		
		
		
	}