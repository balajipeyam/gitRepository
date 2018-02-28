package com.algates.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementActions {
	WebDriver driver;
	WebElement parentElement = null;
	By parentBy = null;

	ElementActions(WebDriver driver) {
		this.driver = driver;
	}

	public ElementActions withinParent(WebElement parentElement) {
		this.parentElement = parentElement;
		return this;
	}

	public ElementActions withinParent(By parentBy) {
		this.parentBy = parentBy;
		return this;
	}

	public ElementActions click(By locator) {
		if (parentBy != null) {
			driver.findElement(parentBy).findElement(locator).click();
		} else if (parentElement != null) {
			parentElement.findElement(locator).click();
		}
		driver.findElement(locator).click();

		return this;
	}

	public ElementActions click(WebElement element) {
		element.click();
		return this;
	}

}
