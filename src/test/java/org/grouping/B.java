package org.grouping;

import org.testng.annotations.Test;

public class B {
	@Test(groups = "regression")
	private void tc1() {
		System.out.println("Test 11");

	}
	@Test(groups = "sanity")
	private void tc33() {
		System.out.println("Test 33");

	}
	@Test(groups = "regression")
	private void tc22() {
		System.out.println("Test 22");

	}
	
	

}
