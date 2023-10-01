package com.TestCasesScript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreditCustomerTest {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=null;
		
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonFile.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Browser = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String sid = pobj.getProperty("un");
		String pwd = pobj.getProperty("pwd");
		
		FileInputStream fiss=new FileInputStream(".\\src\\test\\resources\\TY51.xlsx");
		Workbook book = WorkbookFactory.create(fiss);
		Sheet sh = book.getSheet("Organisation");
		
		
		
		//launch the browser
		if(Browser.equalsIgnoreCase("chrome"))
			
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		//enter the url
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.linkText("Staff Login")).click();
		driver.findElement(By.name("staff_id")).sendKeys(sid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		driver.findElement(By.name("staff_login-btn")).click();
		driver.findElement(By.name("credit_cust_ac")).click();
		
		int lastRowNum = sh.getLastRowNum();
		
		
		HashMap<String, String> map=new HashMap<String, String>();
		for(int i=1;i<=2;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		
		for(Entry<String, String> s:map.entrySet())
		{
		driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
		
		}
		driver.findElement(By.name("credit_btn")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.name("logout_btn")).click();
		driver.findElement(By.linkText("Home")).click();
		Actions a=new Actions(driver);
		WebElement internetb = driver.findElement(By.xpath("//div[@class='ebanking']/a"));
		a.moveToElement(internetb).perform();
		driver.findElement(By.xpath("//li[.='Login ']")).click();
		
		HashMap<String, String> map1=new HashMap<String, String>();
		FileInputStream fiss1=new FileInputStream(".\\src\\test\\resources\\TY51.xlsx");
		Workbook book1 = WorkbookFactory.create(fiss1);
		Sheet sh1 = book1.getSheet("Sheet1");
		int rCount=sh1.getLastRowNum();
		for(int i=1;i<=rCount;i++)
		{
			String key1 = sh1.getRow(i).getCell(0).getStringCellValue();
			String value1 = sh1.getRow(i).getCell(1).getStringCellValue();
			map1.put(key1, value1);
		}
		//System.out.println(map1.size());
		for(Entry<String, String> s1:map1.entrySet())
		{
			
		driver.findElement(By.name(s1.getKey())).sendKeys(s1.getValue());
		//driver.findElement(By.name("password")).sendKeys("SJSJ9686");
		}
		driver.findElement(By.name("login-btn")).click();
		driver.findElement(By.xpath("//li[.='Statement']")).click();
		
		
				
	}

}
