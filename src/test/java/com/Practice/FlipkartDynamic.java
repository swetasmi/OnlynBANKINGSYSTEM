package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDynamic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone");
		search.submit();
		List<WebElement> allmob = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0;i<allmob.size();i++)
		{
	        System.out.print(allmob.get(i).getText()+">>>>>>");
	        System.out.println(allprice.get(i).getText());
			
		
		}
		
	}

}
	
