package com.browserlaunch;
     import java.security.PublicKey;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.http.HttpParser.FieldState;

	public class Firstselect {


		public static WebDriver driver;
			public static void  brower() {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
			
			}
			public static void fist() {
				WebElement first = driver.findElement(By.xpath("//select [@id='second']"));
				
				Select s = new Select(first);
				s.selectByIndex(0);
				s.selectByIndex(1);
				s.selectByIndex(2);
				s.selectByIndex(3);
				
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement w : allSelectedOptions) 
				System.out.println(w.getText());
				
			
			
			
			
			}
			
			public static void gejt (){
			
//			Select s;
//			WebElement allfirstSelectedOptions = s.getFirstSelectedOption();
//			for (WebElement f :allfirstSelectedOptions);
//				WebElement f;
//				System.out.println(f.getText());
			
			
			
			
			}
			
			
			public static void main(String[] args) {
				brower();
				fist();
				gejt();
			}

			}
