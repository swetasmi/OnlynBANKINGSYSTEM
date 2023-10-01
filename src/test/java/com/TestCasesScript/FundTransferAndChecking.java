package com.TestCasesScript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FundTransferAndChecking {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonFile.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Browser = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String username = pobj.getProperty("un");
		String password = pobj.getProperty("pwd");
		String customerid = pobj.getProperty("Customerid");
		String customewpwd = pobj.getProperty("cpassword");
		driver.get(URL);
		driver.findElement(By.xpath("//li[.='Fund Transfer']")).click();
		
		driver.findElement(By.name("customer_id")).sendKeys(customerid);
		driver.findElement(By.name("password")).sendKeys(customewpwd);
		driver.findElement(By.name("login-btn")).click();
		driver.findElement(By.xpath("//li[.='Fund Transfer']")).click();
		driver.findElement(By.name("view_beneficiary")).click();
		String benificiary = driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText();
		driver.findElement(By.linkText("Staff Login")).click();
		
		
		
		driver.findElement(By.name("staff_id")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("staff_login-btn")).click();
		
		driver.findElement(By.name("view_cust_by_ac")).click();
	    driver.findElement(By.name("account_no")).sendKeys(benificiary);
	    driver.findElement(By.name("submit_view")).click();
		
		
	}

}
