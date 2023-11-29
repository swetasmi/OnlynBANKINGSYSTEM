package com.dailypractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonColour {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/s?k=iphone+14&crid=2LNBTFFOSP0ZZ&sprefix=iphone%2Caps%2C465&ref=nb_sb_ss_ts-doa-p_2_6");
     List<WebElement> ele = driver.findElements(By.xpath("//span[.='Apple iPhone 14 (256 GB) - Midnight']/../../../../descendant::span[@class='s-color-swatch-inner-circle-border']/../.."));
        for (WebElement Element : ele)
        {
		String text = Element.getAttribute("aria-label");
		System.out.println(text);
		}
	}

}
