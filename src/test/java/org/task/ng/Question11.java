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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question11 extends BaseClass {
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

	@Test(groups = "sanity")
	private void validUserNameAndPasswordTest() {
		
		launchUrl("https://www.facebook.com/");


		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("ram");

		Assert.assertEquals("ram", getAttributeValueOfWebelement(userName),
				"Actual and Expected email are different");

		WebElement pass = driver.findElement(By.id("pass"));

		pass.sendKeys("ram@123");

		Assert.assertEquals("ram@123", getAttributeValueOfWebelement(pass),
				"Actual and Expected email are different");

		WebElement btnLogin = driver.findElement(By.name("login"));

		clickElement(btnLogin);

	}

	@Test(groups = "smoke")
	private void InvalidUserNameTest() {
		
		launchUrl("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("ram");

		Assert.assertEquals("ram1", getAttributeValueOfWebelement(userName),
				"Actual and Expected email are different");

		WebElement pass = driver.findElement(By.id("pass"));

		pass.sendKeys("ram@123");

		Assert.assertEquals("ram@123", getAttributeValueOfWebelement(pass),
				"Actual and Expected email are different");

		WebElement btnLogin = driver.findElement(By.name("login"));

		clickElement(btnLogin);

	}

}
