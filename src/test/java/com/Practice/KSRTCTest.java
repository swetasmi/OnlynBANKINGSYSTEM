package com.Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTCTest {

	public static void main(String[] args) {
	int date=31;
	int returndate=3;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.ksrtc.in/oprs-web/");
	driver.findElement(By.id("fromPlaceName")).sendKeys("Mumbai");
	driver.findElement(By.id("txtJourneyDate")).click();
	driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[text()='"+date+"']")).click();
	driver.findElement(By.id("txtReturnJourneyDate")).click();
	driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
	driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[text()='"+returndate+"']")).click();
	
	}

}
