package org.tstng.anotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@Test
	private void tc1() {   // method can be private in TestNG
		System.out.println("Test 1");

	}
	
	@AfterClass
	private void closeBrowser() {
		System.out.println("Quit Browser");
		

	}
	@BeforeMethod
	private void tcStartTime() {
		System.out.println("Test case Starts...");

	}
	@BeforeClass
	private void browserLaunch() {
		System.out.println("Launch Browser");

	}
	@AfterMethod
	private void tcEndTime() {
		System.out.println("....Test ends");

	}
	@Test
	private void tc3() {
		System.out.println("Test 3");

	}
	@Test
	private void tc2() {
		System.out.println("Test 2");

	}

}
