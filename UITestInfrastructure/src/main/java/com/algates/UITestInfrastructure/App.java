package com.algates.UITestInfrastructure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.algates.actions.Actions;

public class App {
	@Test
	public void testGmail() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
				
		By.ById b= new ById("identifierId");
		
		actions.browser().open("");
		actions.element().withinParent(By.className("")).click(b);
		
	}
}
