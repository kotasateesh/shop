package com.automation.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Sateesh\\selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://en-gb.facebook.com/");
	  Thread.sleep(30000);
	  driver.quit();
	  
	  
	  
  }
}
