package com.URL.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver_Setup {
public static WebDriver driver;
	
	public WebDriver Setup(WebDriver driver) throws InterruptedException{
		
		
	
		System.out.println("***********");
			 System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(3000);
			
		
		 
		
	    
	return driver;

	}


}
