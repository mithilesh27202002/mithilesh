package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Dxpath {
	public static WebDriver driver;
    
	public static void  dx() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
	}
	
	
	public  static void dynamic() {
		
		driver.findElement(By.xpath("//input[@id='email']/parent::div/following-sibling::div/descendant::input")).sendKeys("asdfghh");
		
		
		
	}

	
	
	public static void main(String[] args) {
		dx();dynamic();
	}
	
}
