package org.task.ng;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPagePojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question111 extends BaseClass {
	@BeforeClass
	private void launchBrowser() {
		loadBrowser("chrome");
		maximizeBrowser();
//		launchUrl("https://www.facebook.com/");
//		applyWaitToAllElements();

	}

	@AfterClass
	private void closeBrowser() {
		closeCurrentWindow();

	}

	@BeforeMethod
	private void startTime() {
		System.out.println("Test case Starts: " + new Date());

	}

	@AfterMethod
	private void endTime() {
		System.out.println("Test case Ends: " + new Date());

	}

	@Test(groups = "regression")
	private void InvalidPasswordTest() {
		
		launchUrl("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("ram");

		Assert.assertEquals("ram", getAttributeValueOfWebelement(userName),
				"Actual and Expected email are different");
		
		WebElement pass = driver.findElement(By.id("pass"));

		pass.sendKeys("ram@123");

		Assert.assertEquals("ram@1234", getAttributeValueOfWebelement(pass),
				"Actual and Expected email are different");
		
		WebElement btnLogin = driver.findElement(By.name("login"));

		clickElement(btnLogin);

	}

	@Test(groups = { "sanity", "regression" })
	private void EmptyEmailAndPasswordTest() {
		
		launchUrl("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys();

		Assert.assertEquals("ram", getAttributeValueOfWebelement(userName),
				"Actual and Expected email are different");

		WebElement pass = driver.findElement(By.id("pass"));

		pass.sendKeys();


		Assert.assertEquals("ram@123", getAttributeValueOfWebelement(pass),
				"Actual and Expected email are different");

		WebElement btnLogin = driver.findElement(By.name("login"));

		clickElement(btnLogin);


	}

}
