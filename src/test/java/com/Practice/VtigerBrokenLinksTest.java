package com.Practice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerBrokenLinksTest {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	int size = alllinks.size();
	System.out.println(size);
	ArrayList<String> arr=new ArrayList<String>();
	
	for(int i=0;i<size;i++)
	{
		String Eachlinks=alllinks.get(i).getAttribute("href");
		URL url=null;
		int statuscode=0;
		try {
			
			url=new URL(Eachlinks);
			HttpURLConnection httpconn=(HttpURLConnection) url.openConnection();
			statuscode=httpconn.getResponseCode();
		if(statuscode>=400)
		{
			arr.add(Eachlinks);
			System.out.println(Eachlinks);
			}
		}
		catch(Exception e)
		{
			arr.add(Eachlinks);
		}
		
		
	}
	

	}

}
