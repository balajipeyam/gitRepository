package com.balaji.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testGoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		WebElement userID = driver.findElement(By.id("identifierId"));
		userID.sendKeys("balajipeyam");
		WebElement userNext = driver.findElement(By.id("identifierNext"));
		userNext.click();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("samilih3010");
		WebElement passwordNext = driver.findElement(By.id("passwordNext"));
		passwordNext.click();
		WebElement unread = driver.findElement(By.xpath("//div[contains(@class,'ain')]//a"));
		String s = unread.getAttribute("aria-label");
		System.out.println(s);
		int unreadmails = Integer.parseInt(s.replaceAll("[^0-9]", ""));
		System.out.println(unreadmails);
		// driver.quit();

	}
}
