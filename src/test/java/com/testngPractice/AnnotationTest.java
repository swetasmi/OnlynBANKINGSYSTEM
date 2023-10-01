package com.testngPractice;

import org.testng.annotations.Test;

public class AnnotationTest {
	
	@Test(invocationCount = 1)
	public void createdata()
	{
		int[] a= {1,2,4};
		int i = a[6];
		System.out.println(i);
		System.out.println(" created data");
	}
	
	@Test(dependsOnMethods ="createdata" )
	public void editdata()
	{
		System.out.println("data edited sucessfully");
	}
	
	@Test(priority = -1)
	public void delete()
	{
		System.out.println("data deleted");
	}

}
