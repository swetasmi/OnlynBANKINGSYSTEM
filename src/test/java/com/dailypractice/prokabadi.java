package com.dailypractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prokabadi {

	public static void main(String[] args) {
		String team="Jaipur Pink Panthers";
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.prokabaddi.com/standings");
//	List<WebElement> all=driver.findElements(By.xpath("//div[@class='table-responsive']/descendant::p[.='"+team+"']/../../../following-sibling::div"));
//	for(WebElement sin:all)
//	{
//	  String text=sin.getText();
//	  System.out.println(text);
//	}
	
	List<WebElement> all = driver.findElements(By.xpath("//div[@class='tsp-fr tsp-fs tsp-cpd tsp-cnbm tsp-cwbm']/descendant::span[text()='Jaipur Pink Panthers']/../../following-sibling::td"));
	for(WebElement sin:all)
	{
		String text = sin.getText();
		System.out.println(text);
	}
	}
	
	
}


