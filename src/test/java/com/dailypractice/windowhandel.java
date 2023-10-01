package com.dailypractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandel {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		Set<String> all = driver.getWindowHandles();
		for(String single:all)
		{
			
			driver.switchTo().window(single);
			String title = driver.getTitle();
			System.out.println(title);
		}
	}

}
