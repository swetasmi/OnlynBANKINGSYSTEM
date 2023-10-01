package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPracticeTest {

	public static void main(String[] args) {
	String monthandyear="November 2023";
	int date=2;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.goibibo.com/");
	driver.findElement(By.cssSelector("[class='logSprite icClose']")).click();
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	 String actual="//div[text()='"+monthandyear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']";
	 String nextmonth="//span[@aria-label='Next Month']";
	for(;;)
	{
		try
		{
			driver.findElement(By.xpath(actual)).click();
			break;
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath(nextmonth)).click();
		}
	}
	
	driver.findElement(By.xpath("//span[text()='Done']")).click();

	}

}
