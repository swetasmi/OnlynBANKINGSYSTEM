package com.writeProperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritePropertiesText {

	public static void main(String[] args) throws Throwable { 
		
	Properties pobj=new Properties();
	
	pobj.setProperty("browser", "chrome");
	pobj.setProperty("url", "http://localhost:8888/");
	pobj.setProperty("un", "admin");
	pobj.setProperty("pwd", "password");
	 
	FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\CommonFile.properties");
	pobj.store(fos,"write data");
	fos.close();
	
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonFile.properties");
	pobj.load(fis);
	String brow = pobj.getProperty("browser");
	String urll = pobj.getProperty("url");
	String usname = pobj.getProperty("un");
	String psd = pobj.getProperty("pwd");
	
	WebDriver driver=new ChromeDriver();
	driver.get(urll);
	driver.findElement(By.name("user_name")).sendKeys(usname);
	driver.findElement(By.name("user_password")).sendKeys(psd);
	driver.findElement(By.id("submitButton")).click();
	}

}
