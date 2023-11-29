package com.dailypractice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> all = driver.findElements(By.xpath("//a"));
		int size=all.size();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<size;i++)
		{
			String each = all.get(i).getAttribute("href");
			try {
				URL url=new URL(each);
				
				HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
				int responseCode = httpcon.getResponseCode();
				if(responseCode>400)
				{
					al.add(each);
					System.out.println(each);
				}
				
			}
			catch (Exception e) {
				// TODO: handle exception
				al.add(each);
				
				
			}
		}
        
	}
	
}


