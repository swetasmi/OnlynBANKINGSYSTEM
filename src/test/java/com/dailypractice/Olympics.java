package com.dailypractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olympics {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='Tablestyles__CommonGrid-sc-xjyvs9-1 Tablestyles__Content-sc-xjyvs9-3 knZfST eVgKXR']/descendant::span[text()='Armenia']/../following-sibling::div"));
        for(int i=0;i<4;i++)
        {
        	String text = all.get(i).getText();
        	System.out.println(text);
        }
	}

}
