package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlymoicsTest {
	
	public static void main(String[] args) throws InterruptedException {
		
	       // go to olympics and print the medals of all the countries		
			//WebDriver driver= new ChromeDriver();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
			Thread.sleep(2000);
			driver.findElement(By.id("onetrust-pc-btn-handler")).click();
			driver.findElement(By.className("ot-pc-refuse-all-handler")).click();
			
	        JavascriptExecutor jse=(JavascriptExecutor)driver;
	        jse.executeScript("window.scrollBy(0,800)"); // for scroll webpage
	        
	        WebElement c=driver.findElement(By.xpath("//div[contains(@class,'Tablestyles__Content-sc-xjyvs9-3 knZfST eVgKXR')]/descendant::span[text()='Argentina']"));
	        System.out.println(c.getText());
	     List<WebElement> alll = driver.findElements(By.xpath("//div[contains(@class,'Tablestyles__Content-sc-xjyvs9-3 knZfST eVgKXR')]/descendant::span[text()='Argentina']/../following-sibling::div[@title='Gold']"));
			//List<WebElement> all = driver.findElements(By.xpath("//div[@class='Tablestyles__CommonGrid-sc-xjyvs9-1 Tablestyles__Content-sc-xjyvs9-3 knZfST eVgKXR']/div"));
			for(WebElement single:alll)
			{
				String print=single.getText();
				System.out.println(print);
			}
			
			
			
			
			
		}

}
