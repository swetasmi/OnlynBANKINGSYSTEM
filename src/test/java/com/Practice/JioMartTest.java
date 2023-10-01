package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JioMartTest {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.jiomart.com/");
	WebElement grocery = driver.findElement(By.xpath("//a[text()='Groceries']"));
	Actions a=new Actions(driver);
	a.moveToElement(grocery).perform();
	/*WebElement fruitsndveg = driver.findElement(By.xpath("//a[text()='Fruits & Vegetables']"));
	a.moveToElement(fruitsndveg).perform();
	List<WebElement> allveg = driver.findElements(By.xpath("//a[.='Fresh Vegetables']/../../li"));
	for(WebElement single:allveg)
	{
		String onebyone=single.getText();
		System.out.println(onebyone);
	}*/
	List<WebElement> table = driver.findElements(By.xpath("//a[text()='Fruits & Vegetables']/../../li"));
	

	}

}
