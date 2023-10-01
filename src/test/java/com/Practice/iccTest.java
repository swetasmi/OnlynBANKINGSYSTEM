package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iccTest {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
	 
	List<WebElement> allcountry = driver.findElements(By.xpath("//table/tbody/tr[*]/td[*]"));
    for(WebElement single:allcountry)
    {
    	String onebyone=single.getText();
    	if(onebyone.contains("Scotland"))
    	{
    		System.out.println("pass");
    	}
    	
    	
    }
	
	
	
	
	
	}

}
