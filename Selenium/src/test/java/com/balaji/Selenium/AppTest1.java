package com.balaji.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest1 {
	
	@Test
	public void testGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(10000);
		
		
	}

}
