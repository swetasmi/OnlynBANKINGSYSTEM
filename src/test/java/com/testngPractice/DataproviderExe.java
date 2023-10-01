package com.testngPractice;

import org.testng.annotations.Test;

public class DataproviderExe {
	
	
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "mobile")
	public void getdata(String pr1, String pr2 )
	{
		System.out.println(pr1+"  "+pr2);
	}

}
