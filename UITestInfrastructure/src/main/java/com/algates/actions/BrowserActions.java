package com.algates.actions;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
	WebDriver driver;

	BrowserActions(WebDriver driver) {
		this.driver = driver;
	}

	public BrowserActions open(String url) {
		driver.get(url);
		return this;
	}

	public BrowserActions navigateTo(String url) {
		driver.navigate().to(url);
		return this;
	}

	public BrowserActions navigateForward() {
		driver.navigate().forward();
		return this;
	}

	public BrowserActions navigateBack() {
		driver.navigate().back();
		return this;
	}

	public BrowserActions refresh() {
		driver.navigate().refresh();
		return this;
	}

	public BrowserActions closeWindow() {
		driver.close();
		return this;
	}

	public BrowserActions closeAllWindows() {
		driver.quit();
		return this;
	}
}
