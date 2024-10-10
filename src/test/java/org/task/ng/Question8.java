package org.task.ng;

import java.util.Date;

import org.base.BaseClass;
import org.pojo.LoginPagePojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question8 extends BaseClass {

	@BeforeClass
	private void launchBrowser() {
		loadBrowser("chrome");
		maximizeBrowser();

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

	@Test
	private void tc1() {
		launchUrl("http://www.greenstechnologys.com/");

	}

}
