package com.Practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		List<WebElement> all = driver.findElements(By.xpath(" //td[@class='communityLinks']//img"));
		for(WebElement single:all)
		{
			single.click();
		}
		Set<String> allwin = driver.getWindowHandles();
		for(String sin:allwin)
		{
			driver.switchTo().window(sin);
	       String tit= driver.getTitle();
	       if(tit.contains("Linkedin"))
	       {
	    	   //driver.switchTo().window(sin);
	    	   System.out.println("ok");
	    	   
	       }
	       else {
	    	   driver.close();
	       }
	       
		}

	}

}
