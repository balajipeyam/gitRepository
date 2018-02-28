package com.balaji.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailPOM {
	WebDriver driver;
	String userName;
	String password;

	public GmailPOM(WebDriver driver) {
		this.driver = driver;
		driver.get("http://www.gmail.com");
	}

	private void setUserName(String userName) {
		WebElement we = driver.findElement(By.id("identifierId"));
		we.sendKeys(userName);
	}

	private void setPassword(String password) {
		WebElement we = driver.findElement(By.name("password"));
		we.sendKeys(password);
	}

	public GmailPOM enterWithUserID(String userName) {
		setUserName(userName);
		WebElement we = driver.findElement(By.id("identifierNext"));
		we.click();
		return this;
	}

	public GmailPOM enterWithPassword(String passsword) {
		setPassword(passsword);
		WebElement we = driver.findElement(By.id("passwordNext"));
		we.click();
		return this;
	}
}
