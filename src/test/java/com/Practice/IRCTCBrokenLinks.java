package com.Practice;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCBrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int size = alllinks.size();
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<size;i++)
		{
			String eachlinks=alllinks.get(i).getAttribute("href");
			URL url=null;
			int statuscode=0;
			try {
				url=new URL(eachlinks);
				HttpsURLConnection httpconn=(HttpsURLConnection)url.openConnection();
				statuscode=httpconn.getResponseCode();
				if(statuscode>=400)
				{
					arr.add(eachlinks);
					System.out.println(eachlinks);	
				}
			}
			catch(Exception e)
			{
				arr.add(eachlinks);
			}
			
			
		}
		
		

	}

}
