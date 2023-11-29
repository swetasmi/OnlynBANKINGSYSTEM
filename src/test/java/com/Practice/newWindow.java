package com.Practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newWindow {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//a[@class='gb_d']")).click();
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//span[text()='YouTube']")).click();
	  


	}
}

 
