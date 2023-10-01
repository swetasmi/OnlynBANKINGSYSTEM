package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngTest {
	@Test
	public void cmdtest()
	{
		String browser = System.getProperty("Browser");
		String urll = System.getProperty("url");
		String un = System.getProperty("username");
		String pwd = System.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.get(urll);
		//driver.findElement(By.name("user_name")).sendKeys(un);
		//driver.findElement(By.name("user_password")).sendKeys(pwd);
		//driver.findElement(By.id("submitButton")).click();
		
		
		
	}
	

}
