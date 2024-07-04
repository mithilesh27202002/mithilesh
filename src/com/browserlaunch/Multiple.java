package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static WebDriver driver;
		public static void  brower() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		}
public static void multiplemethod() {
	WebElement food = driver.findElement(By.xpath("//select [@id='second']"));
	Select s = new Select(food);
	s.selectByValue("donut");
	  
WebElement food1 =	driver.findElement(By.xpath("//select [@id='second']"));
	Select d= new Select(food1);
	d.selectByIndex(2);
	
	
}
public static void main(String[] args) {
	brower();
	multiplemethod();
}
	
}
