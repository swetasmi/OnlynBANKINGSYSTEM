package com.TestCasesScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StaffLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		driver.findElement(By.linkText("Staff Login")).click();
			

	}

}
