package com.testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPpractice {
	
	@Test(dataProvider="daata")
	public void data(String acc, String study)
	{
		System.out.println(acc+"acc"+study);
	}
	
	
	@DataProvider
	public Object[][] daata()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="tv";
		obj[0][1]="mobile";
		
		obj[1][0]="book";
		obj[1][1]="copy";
		
		return obj;
	}
	 
	

}
