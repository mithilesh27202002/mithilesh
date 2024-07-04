package com.browserlaunch;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Hotel {


public static WebDriver driver;
    
public static void  web() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}
public static void xpath() {
WebElement usernam =driver.findElement(By.xpath("(//input[contains(@class,'login_input')])[1]"));
	usernam.sendKeys("NitheesGopii");
	
	WebElement pass = driver.findElement(By.xpath("(//input[contains(@id,'password')])"));
	pass.sendKeys("Bgopi@1711");
	WebElement login = driver.findElement(By.xpath("(//input[contains(@id,'login')])"));
	login.click();
	}


public static void search() {
	WebElement loction = driver.findElement(By.xpath("//select[@id='location']"));
	Select t=new Select(loction);
	t.selectByIndex(2);
	
	WebElement hotel  =driver.findElement(By.xpath("//select[@id='hotels']"));
	Select h= new Select(hotel);
	h.selectByIndex(3);
	

	WebElement broomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
	Select b=new Select(broomtype);
	b.selectByIndex(2);
	
	WebElement number =driver.findElement(By.xpath("//select[@id='room_nos']"));
	Select n= new Select(number);
	n.selectByIndex(3);
	
//driver.findElement(By.xpath("//select[@id='datepick_in']")).sendKeys("05/05/2024");
  

	
	WebElement aduits = driver.findElement(By.xpath("//select[@id='adult_room']"));
	Select a=new Select(aduits);
	a.selectByIndex(2);
	
	WebElement children = driver.findElement(By.xpath("//select[@id='child_room']"));
	Select c=new Select(children);
	c.selectByIndex(2);
	
	WebElement slogin = driver.findElement(By.xpath("//input[contains(@id,'Submit')]"));
	slogin.click();
	
	
	driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	driver.findElement(By.xpath("//input[@id='continue']")).click();
}
	
	
	public static void book()  throws  InterruptedException{
		
		WebElement fnamElement= driver.findElement(By.xpath("//input[@name='first_name']"));
        fnamElement.sendKeys("abi");
        
	    WebElement lname=driver.findElement(By.xpath("//input[@name='last_name']"));
	    lname.sendKeys("S");
		
	    WebElement area	=driver.findElement(By.xpath("//textarea[@id='address']"));
		area.sendKeys("W122 Fourth Floor, 3rd Ave, W Block, Anna Nagar, Chennai,Tamil Nadu 600040");
	
	    WebElement  ccNo= driver.findElement(By.xpath("//input[@name='cc_num']"));
	    ccNo.sendKeys("1234567890123456");
	    
	    WebElement cctype= driver.findElement(By.xpath("//select[@id='cc_type']"));
	    Select c = new Select(cctype);
	    c.selectByIndex(2);
	    
	    WebElement monty= driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	    Select m = new Select(monty);
	    m.selectByIndex(2);
	    
	    WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	    Select y = new Select(year);
	    y.selectByIndex(12);
	    
	    WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	    cvv.sendKeys("123");
	    
	   WebElement booknoW = driver.findElement(By.xpath("//input[@id='book_now']"));
	   booknoW.click();
	   Thread.sleep(10000);
	   driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
	}
	
	  
	   
//	   public  static void screen()  throws IOException { 
//		   
//	
//		   TakesScreenshot ts =(TakesScreenshot) driver;
//		   File soure = ts.getScreenshotAs(OutputType.FILE);
//		   File target = new File("C:\\Users\\USER\\eclipse-workspace\\Selenium\\screenshot\\file.png");
//		   FileHandler.copy(soure, target);
//		   driver.quit();
//	   }	   
//	    
	     public static void logout() throws InterruptedException {
	    	 Thread.sleep(5000);
	    	 
	    	WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
	    	logout.click();
	   
	     }	
	
public static void main(String[] args) throws InterruptedException, IOException {
	 web();
	 xpath();
	 search();
	 book();
//	 screen();
	 logout();
}
}
