package com.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public  class TyssRMGServerJDBCTest {
    
	public static void main(String[] args) throws Throwable {
		Connection conn=null;
		String expresult="ty_53";
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.cssSelector("[name='projectName']")).sendKeys(expresult);
		driver.findElement(By.cssSelector("[name='createdBy']")).sendKeys("sweta");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='status']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Created");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		 Driver driver1=new Driver();
		 DriverManager.registerDriver(driver1);
		 conn= DriverManager.getConnection("jdbcmysqll:/rmgtestingserver:3333/projects", "root@%", "root");
		 Statement state = conn.createStatement();
		 String query="select * from project";
		 ResultSet result = state.executeQuery(query);
		 boolean flag=false;
		 while(result.next())
		 {
			String actual= result.getString(4);
			 if(actual.equalsIgnoreCase(expresult))
			 {
				 flag=true;
				 break;
			 }
		 }
		
			 
			 if(flag=true)
			 {
				 System.out.println("project created");
			 }
			 else
			 {
				 System.out.println("not created");
			 }
		 
		 
		}
}

	


