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

public class Question14 extends BaseClass {
	@BeforeClass
	private void launchBrowser() {
		loadBrowser("chrome");
		maximizeBrowser();
		launchUrl("https://mail.google.com/");
		applyWaitToAllElements();

	}

	@AfterClass
	private void closeBrowser() {
		// closeCurrentWindow();

	}

	@BeforeMethod
	private void startTime() {
		System.out.println("Test case Starts: " + new Date());

	}

	@AfterMethod
	private void endTime() {
		System.out.println("Test case Ends: " + new Date());

	}

	@Parameters({ "username", "password" })
	@Test
	private void tc1(String email, String pass) {
		
		WebElement email1 = driver.findElement(By.id("identifierId"));
		email1.sendKeys("vramjira93");
		
		WebElement btnNext = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext.click();
		
		WebElement pass1 = driver.findElement(By.name("Passwd"));
		pass1.sendKeys("ram@123");
		
		WebElement btnNext1 = driver.findElement(By.xpath("//span[.='Next']"));
		btnNext1.click();
		
		

	}

}
