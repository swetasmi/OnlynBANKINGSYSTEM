package com.testngPractice;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.genericUtilities.ExcellUtility;

public class DataFromExcell {
	
	@Test(dataProvider ="datafromexcel" )
	public void getdata(String p1, String p2)
	{
		System.out.println(p1+"  "+p2);
	}
	
	
	
	@DataProvider
	public Object[][] datafromexcel() throws Throwable
	{
		ExcellUtility elib=new ExcellUtility();
		return elib.getsetdata("DataP");
	}
	

}
