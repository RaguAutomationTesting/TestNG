package org.pract;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	@BeforeSuite
	private void tc1() {
		System.out.println("BeforeSuite");

	}

	@AfterSuite
	private void tc2() {
		System.out.println("AfterSuite");

	}

	@BeforeGroups
	private void tc3() {
		System.out.println("BeforeGroups");

	}
	@AfterGroups
	private void tc4() {
		System.out.println("AfterGroups");

	}
	@AfterClass
	private void tc5() {
		System.out.println("After class");

	}
	@BeforeClass
	private void tc6() {
		System.out.println("Before class");

	}
	@BeforeMethod
	private void tc7() {
		System.out.println("Before Method");

	}
	@AfterMethod
	private void tc8() {
		System.out.println("After Method");

	}
	@Test
	private void tc9() {
		System.out.println("test case");

	}
	@BeforeTest
	private void tc10() {
		System.out.println("before test");

	}
	@AfterTest
	private void tc11() {
		System.out.println("After test");

	}
	
	

}
