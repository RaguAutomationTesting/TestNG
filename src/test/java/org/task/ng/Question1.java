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

public class Question1 extends BaseClass {

	@BeforeClass
	private void launchBrowser() {
		loadBrowser("chrome");
		maximizeBrowser();
		launchUrl("https://www.facebook.com/");
		applyWaitToAllElements();

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

	@Parameters({ "username", "password" })
	@Test
	private void tc1(String email, String pass) {

		LoginPagePojo l = new LoginPagePojo();

		l.getTxtEmail().sendKeys(email);

		Assert.assertEquals("ram", l.getAttributeValueOfWebelement(l.getTxtEmail()),
				"Actual and Expected email are different");

		l.getTxtPass().sendKeys(pass);

		Assert.assertEquals("ram@123", l.getAttributeValueOfWebelement(l.getTxtPass()),
				"Actual and Expected email are different");

		clickElement(l.getBtnLogin());

	}

}
