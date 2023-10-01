package com.testngPractice;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	@Test
	public void compare()
	{
		String actual="sweta";
		String exp="sweta";
		System.out.println("1");
		System.out.println("2");
		assertTrue(actual.contains(exp));
		System.out.println("3");
		System.out.println("4");
	}
	
	@Test
	public void equal()
	{
		System.out.println("5");
		System.out.println("6");
		assertEquals("sweta", "swetasmi");
		System.out.println("7");
		System.out.println("8");
	}
	
	@Test
	public void notequal()
	{
		
		System.out.println("9");
		System.out.println("10");
		SoftAssert sa=new SoftAssert();
		sa.assertNotEquals("sweta", "sweta");
		sa.assertAll();
		
	}
	
	

}
