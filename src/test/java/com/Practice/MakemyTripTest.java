package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemyTripTest {

	public static void main(String[] args) throws InterruptedException{
		int date=12;
		String monthandyear="December 2023";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Actions a=new Actions(driver);
		a.doubleClick().perform();
		Thread.sleep(2000);
		a.moveByOffset(0,80).click().perform();
		Thread.sleep(2000);
		//WebElement close=driver.findElement(By.xpath("//a[@class='close']"));
		//a.moveToElement(close).click().perform();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		a.doubleClick().perform();
		
		String actual="//div[text()='"+monthandyear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']";	
		String next="//span[@aria-label='Next Month']";
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath(actual)).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath(next)).click();
			}
		}

	}

}
