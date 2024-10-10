package org.tstng.anotations;


import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	public void tc1() {
		System.out.println("Test 1");

	}

	@Test
	public void tc3() {
		System.out.println("Test 3");

	}

	@Test
	public void tc2() {
		Assert.assertTrue(false,"assertion failure");
		System.out.println("Test 2");
		

	}

}
