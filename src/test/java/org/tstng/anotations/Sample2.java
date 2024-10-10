package org.tstng.anotations;

import org.testng.annotations.Test;

public class Sample2 {

	// -3,-2,-1..0..,1,2,3

	// Disabling test case

	@Test(priority = -7, enabled = false) 
	private void tc1() {
		System.out.println("Test 1");

	}

	@Test
	private void tc2() {  // Test case executes  // executes second because default priority is 0
		System.out.println("Test 2");

	}

	// Running same test case multiple case

	@Test(priority = -11, invocationCount = 3) // executes first because priority is -11
	private void tc4() {
		System.out.println("Test 4");

	}

	@Test(priority = 24)
	private void tc5() {
		System.out.println("Test 5");

	}

	@Test(priority = 3)
	private void tc6() {
		System.out.println("Test 6");

	}

}
