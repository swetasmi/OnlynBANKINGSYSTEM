package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetTest {

	public static void main(String[] args) {
		int date=25;
		int returndate=2;
		String month="September ";
		String returnmonth="October ";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']//div[1]/following-sibling::div[2]/preceding-sibling::div[1]/descendant::div[@data-focusable='true']/following-sibling::div[1]/div[1]")).click();
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']//div[1]/following-sibling::div[2]/descendant::div[2]/div[@data-focusable='true']")).click();
        driver.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
        driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
        driver.findElement(By.xpath("//div[text()='"+month+"']/../../descendant::div[text()='"+date+"']")).click();
        driver.findElement(By.xpath("//div[text()='"+returnmonth+"']/../../descendant::div[text()='"+returndate+"']")).click();
        driver.findElement(By.xpath("//div[text()='INR']")).click();
        driver.findElement(By.xpath("//div[text()='USD']")).click();
        driver.findElement(By.xpath("//div[contains(text(),' Adult')]")).click();
       WebElement add= driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
        for(int i=0;i<4;i++)
        {
        	add.click();
        
        }
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/descendant::div[@class='css-1dbjc4n']/div[1]/div[1]/div/div[2]")).click();
        
        driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
      
        
	}

}
