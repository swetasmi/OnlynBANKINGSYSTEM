package com.testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtilities.BaseClass;
import com.genericUtilities.ExcellUtility;
import com.genericUtilities.FileUtility;
import com.genericUtilities.JavaUtility;
import com.genericUtilities.WebDriverUtility;
import com.objectRepository.HomePageOpenAcPage;
@Listeners(com.genericUtilities.Listners.class)
public class ApplyingForAc extends BaseClass {

	@Test
	public void applyingForAc() throws Throwable
	
	{
		
		HomePageOpenAcPage hp=new HomePageOpenAcPage(driver);
		hp.openAc();
	//	Assert.fail();
		
	}
	@Test
	public void demo()
	{
		System.out.println("demo");
	}
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
	
}
