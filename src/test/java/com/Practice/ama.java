package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ama {
	@Test
	public void amazon() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//a|//img|//button"));
		int img=0;
		int link=0;
		int button=0;
		for(int i=0;i<all.size();i++)
		{
			if(all.equals("//a"))
			{
				link++;
			}
			else if(all.equals("//img"))
			{
				img++;
			}
			else {
				button++;
			}
		}
		System.out.println(link+" "+button+" "+img);
	}

}
