package com.algates.actions;

import org.openqa.selenium.WebDriver;

public class Actions {
	WebDriver driver;

	public Actions(WebDriver driver) {
		this.driver = driver;
	}

	public BrowserActions browser() {
		return new BrowserActions(this.driver);
	}

	public ElementActions element() {
		return new ElementActions(this.driver);
	}

	public Alert alert() {
		return new Alert(this.driver);
	}

}
