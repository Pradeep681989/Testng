package com.URL.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Test3 extends com.URL.Browser.Driver_Setup{
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.dettol.co.in/en/");
  }
  
  @BeforeClass

public void beforeClass() {
	
  try{
	    
  	    driver=Setup(driver);
  	   
  		  
     }
  catch(Exception e){
  			  e.printStackTrace();
  	}
  		  
    }
    @AfterClass
    public void afterClass() {
    	
  	    driver.quit();
    }

  
}
