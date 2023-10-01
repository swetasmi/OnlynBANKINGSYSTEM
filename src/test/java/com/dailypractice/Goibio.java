package com.dailypractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		String month="December 2023";
//		int date=21;
        /*driver.get("https://www.goibibo.com/");
        driver.findElement(By.cssSelector("[class='logSprite icClose']")).click();
        driver.findElement(By.cssSelector("[class='sc-12foipm-22 cUvQPq fswDownArrow']")).click();
        String actual="//div[.='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']";
        String next="[class='DayPicker-NavButton DayPicker-NavButton--next']";
        for(;;)
        {
        	try {
        		driver.findElement(By.xpath(actual)).click();
        		break;
        	}
        	catch (Exception e) {
				driver.findElement(By.cssSelector(next)).click();
			}
        }*/
		
		String mon="December ";
		int dt=8;
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[.='Departure Date']")).click();
		String dep="//div[contains(text(),'December ')]/../../descendant::div[text()='8']";
		String next="//div[contains(@class,'css-1dbjc4n r-1loqt21 r-u8s1')]";
		
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
		
       	}

}
