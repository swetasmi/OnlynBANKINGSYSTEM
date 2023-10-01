package com.dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericUtilities.FileUtility;

public class SJ {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=null;
		String dmonth="December ";
		int ddate=14;
		String rmonth="March 2024 ";
		int rdate=12;
		FileUtility flib=new FileUtility();
		String Browser = flib.fetchdataFromProperty("browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
	//WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
	String dep="//div[contains(text(),'December ')]/../../descendant::div[text()="+ddate+"]";
	String next="//div[contains(@class,'r-1loqt21 r-u8s1d r-11xbo3g r-1v2o')]";
	for(;;)
	{
		try {
			driver.findElement(By.xpath(dep)).click();
			break;
		}
		catch (Exception e) {
			driver.findElement(By.xpath(next)).click();
		}
	}
	
	driver.findElement(By.xpath("//div[text()='Return Date']")).click();
	String ret="//div[contains(text(),'March ')]/../../descendant::div[text()='"+rdate+"']";
	String rnext="//div[contains(@class,'r-1loqt21 r-u8s1d r-11xbo3g r-1v2o')]";
    
	for(;;)
	{
		try {
			driver.findElement(By.xpath(ret)).click();
			break;
		}
		catch (Exception e) {
			driver.findElement(By.xpath(rnext)).click();
		}
	}
	}

}
