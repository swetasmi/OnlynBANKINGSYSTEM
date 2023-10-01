package com.testngPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations .BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrderOfExcecution extends Dtest{
	
	@BeforeSuite
	private void bs() {
		System.out.println("connect to database");

	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("launch the browser");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("login to applicaton");
	}
	
	@Test
	public void test1()
	{
		System.out.println("testScript Execution");
	}
	
	@Test
	public void test2()
	{
		System.out.println("execution2");
		
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("logout the application");
	}
	
	
	@AfterClass
	public void ac()
	{
		System.out.println("close the browser");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("close the database");
	}
	
	}
