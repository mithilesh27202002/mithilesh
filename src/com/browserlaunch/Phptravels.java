package com.browserlaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Phptravels {


	public static WebDriver driver;
		public static void  brower() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://phptravels.org/login");
		
		}
public static void multiplemethod() {
//	WebElement password = driver.findElement(By.xpath("(//input[contains(@class'class=\"form-control pw-input\"')])"));
//	Select s = new Select(password);
//	s.selectByIndex("mithilesh");
	
	  
WebElement food1 =	driver.findElement(By.xpath("//select [@id='second']"));
	Select d= new Select(food1);
	d.selectByIndex(2);
	
	
}
public static void ijoolkp (String[] args) {
	brower();
	multiplemethod();
}
	
}



