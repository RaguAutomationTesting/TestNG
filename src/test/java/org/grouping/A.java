package org.grouping;

import org.testng.annotations.Test;

public class A {
	@Test(groups = {"smoke","regression"})
	private void tc111() {
		System.out.println("Test 111");

	}
	@Test(groups ="regression")
	private void tc333() {
		System.out.println("Test 333");

	}
	@Test(groups = "sanity")
	private void tc222() {
		System.out.println("Test 222");

	}
	

}
