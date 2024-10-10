package org.grouping;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class F1 extends BaseClass {
	@BeforeClass
	private void launchBrowser() {
		loadBrowser("chrome");
		maximizeBrowser();
		driver.get("https://www.facebook.com/");

	}

	@AfterClass
	private void closeBrowser() {
		closeCurrentWindow();

	}

	@Test(groups = {"sanity"})
	private void tc1() {

		

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("ram");

		Assert.assertEquals("ram", getAttributeValueOfWebelement(userName), "Actual and Expected email are different");

		WebElement pass = driver.findElement(By.id("pass"));

		pass.sendKeys("ram@123");

		Assert.assertEquals("ram@123", getAttributeValueOfWebelement(pass), "Actual and Expected email are different");

		WebElement btnLogin = driver.findElement(By.name("login"));

		clickElement(btnLogin);

	}

	@Test(groups = {"regression"})
	private void tc2() {

		

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("ram");

		Assert.assertEquals("ram1", getAttributeValueOfWebelement(userName), "Actual and Expected email are different");

		WebElement pass = driver.findElement(By.id("pass"));

		pass.sendKeys("ram@123");

		Assert.assertEquals("ram@123", getAttributeValueOfWebelement(pass), "Actual and Expected email are different");

		WebElement btnLogin = driver.findElement(By.name("login"));

		clickElement(btnLogin);

	}
}
