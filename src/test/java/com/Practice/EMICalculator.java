package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EMICalculator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://emicalculator.net/");
		Actions a=new Actions(driver);
		WebElement uptoyear = driver.findElement(By.xpath("//th[text()='Year']"));
		a.scrollToElement(uptoyear).perform();
		WebElement fullgraph = driver.findElement(By.xpath("//*[@class='highcharts-markers highcharts-series-2 highcharts-spline-series highcharts-tracker']/.."));
        a.moveToElement(fullgraph).perform();
        
	}

}
