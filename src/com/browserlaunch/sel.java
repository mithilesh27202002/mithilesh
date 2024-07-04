package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel {

	static WebDriver driver;

public static void browser() {



 System.setProperty("webdriver.chrome.driver",

"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

driver = new ChromeDriver();

driver.get("https://www.linkedin.com/login");

//driver.manage().window().maximize();
//

}

public static void webelements(){



WebElement username = driver.findElement(By.id("username")); 
username.sendKeys("mithilesh");

WebElement password =driver.findElement(By.id("password")); 
password.sendKeys ("123456789");

WebElement login = driver.findElement(By.className("btn__primary--large from__button--floating")); 
login.click();
}

	public static void main(String[] args) {
		browser();
		webelements();
	}
}