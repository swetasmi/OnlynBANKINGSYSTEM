package com.Practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KayakTest {

	public static void main(String[] args) throws Throwable {
		
		int date=12;
		String monthANDYear="October 2023";
		int returndate=1;
		String returnmonth="November 2023";
		
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.kayak.co.in/flights");
		driver.findElement(By.xpath("//div[text()='Flights']")).click();
		WebElement from=driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-origin']"));
		from.click();
		driver.findElement(By.xpath("//input[@class='k_my-input' and @placeholder='From?']")).sendKeys("Delhi");
		WebElement airport=driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']"));
		act.moveToElement(airport).click().perform();
		WebElement to=driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-destination']"));
		to.click();
		driver.findElement(By.xpath("//input[@class='k_my-input' and @placeholder='To?']")).sendKeys("Banglore");
		WebElement returnairport=driver.findElement(By.xpath("//span[text()='Bengaluru, Karnataka, India']"));
		act.moveToElement(returnairport).click().perform();
		driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']")).click();
		driver.findElement(By.xpath("//div[.='"+monthANDYear+"']/../../descendant::div[text()='"+date+"']")).click();
		driver.findElement(By.xpath("//div[.='"+returnmonth+"']/../../descendant::div[.='"+returndate+"']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='nrc6-main']/../following-sibling::div[1]/descendant::div[@class='f8F1-price-text']"));
		String mainpage=driver.getWindowHandle();
		Set<String> allpageid = driver.getWindowHandles();
		for(String id:allpageid)
		{
			if(!(mainpage.equals(id)))
			{
				driver.switchTo().window(id);
			}
		}
		
		
		
		for(WebElement single:allprice)
		{
			String fullprice=single.getText();
			System.out.println(fullprice);
		}
		
		
		
		
		
	}

}
