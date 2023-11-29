package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		//driver.findElement(By.xpath("//a[@class='close']")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

	}

}
