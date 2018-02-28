package com.algates.actions;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class SmartPolling extends FluentWait<WebDriver> {
	WebDriver driver;
	private int waitTimeOut, pollingTime;

	public SmartPolling(WebDriver input) {
		super(input);
	}

	public SmartPolling setWaitTimeOut(int waitTimeOut) {
		this.waitTimeOut = waitTimeOut;
		return this;
	}

	public SmartPolling setPollingTime(int pollingTime) {
		this.pollingTime = pollingTime;
		return this;
	}

	Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {

		public Boolean apply(WebDriver driver) {
			WebElement element = driver.findElement(By.id(""));
			return null;
		}

	};

}
