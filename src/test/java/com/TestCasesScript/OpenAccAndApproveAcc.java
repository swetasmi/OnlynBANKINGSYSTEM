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
import org.openqa.selenium.support.ui.Select;

public class OpenAccAndApproveAcc {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=null;
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonFile.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Browser = pobj.getProperty("browser");
		String url = pobj.getProperty("url");
		
		FileInputStream fiss=new FileInputStream(".\\src\\test\\resources\\TY51.xlsx");
		Workbook book1 = WorkbookFactory.create(fiss);
		Sheet sh = book1.getSheet("OA");
		int lastrow = sh.getLastRowNum();
		
		
		
		if(Browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		Actions a=new Actions(driver);
			
			
		driver.get(url);
			
		//click on open Account
		driver.findElement(By.xpath("//li[.='Open Account']")).click();
			
		//Enter all the deatails and click on submit button
		
		HashMap<String, String> map=new HashMap<String, String>();
		for(int i=1;i<=lastrow;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		for(Entry<String, String> s:map.entrySet())
		{
			driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
		}
		
		/*driver.findElement(By.name("name")).sendKeys("jagg");
		driver.findElement(By.name("mobile")).sendKeys("1236547890");
	    driver.findElement(By.name("pan_no")).sendKeys("pan123");
		driver.findElement(By.name("citizenship")).sendKeys("123456");
		driver.findElement(By.name("homeaddrs")).sendKeys("odisha");
		driver.findElement(By.name("officeaddrs")).sendKeys("banglore");
		driver.findElement(By.name("pin")).sendKeys("560017");
		driver.findElement(By.name("arealoc")).sendKeys("ty");*/
		
		/*String dobb=sh.getRow(1).getCell(3).getStringCellValue();
		 WebElement dob = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		    dob.click();
			dob.sendKeys("09-09-1997");*/
		
		String state=sh.getRow(3).getCell(2).getStringCellValue();
		WebElement statedd = driver.findElement(By.name("state"));
		Select s1=new Select(statedd);
		s1.selectByVisibleText(state);
		
		String city=sh.getRow(4).getCell(2).getStringCellValue();
		WebElement citydd = driver.findElement(By.name("city"));
		Select s2=new Select(citydd);
		s2.selectByVisibleText(city);
		
		
		String dd = sh.getRow(1).getCell(2).getStringCellValue();
		WebElement savingdd = driver.findElement(By.name("acctype"));
		Select s3=new Select(savingdd);
		s3.selectByVisibleText(dd);
		
		String genderdd = sh.getRow(2).getCell(2).getStringCellValue();
		WebElement gendd = driver.findElement(By.name("gender"));
		Select s=new Select(gendd);
		s.selectByVisibleText(genderdd);
		
		
		//String dobb=sh.getRow(1).getCell(3).getStringCellValue();
		 WebElement dob = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		    dob.click();
			dob.sendKeys("09-09-1997");
			
		
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.name("cnfrm-submit")).click();
		
		//Alert popup page is displayed
		Alert alt=driver.switchTo().alert();
		String textalert = alt.getText();
		
		int length = textalert.length();
		String num="";
		for(int i=0;i<length;i++)
		{
			if(Character.isDigit(textalert.charAt(i)))
			{
				num=num+textalert.charAt(i);
			}
			
			
			
			
			
		}
		System.out.println("Application  "+num);
		//System.out.println(textalert);
		alt.accept();
		
		driver.findElement(By.xpath("//a[.='Staff Login']")).click();
		driver.findElement(By.name("staff_id")).sendKeys("210001");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("staff_login-btn")).click();
		driver.findElement(By.name("apprvac")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("application_no")).sendKeys(num);
		Thread.sleep(3000);
		driver.findElement(By.name("search_application")).click();
		driver.findElement(By.name("approve_cust")).click();
		Thread.sleep(5000);
		
		Alert altt=driver.switchTo().alert();
		String apptext=altt.getText();
		String accno="";
		for(int i=0;i<apptext.length();i++)
		{
			if(Character.isDigit(apptext.charAt(i)))
			{
				accno=accno+apptext.charAt(i);
			}
		}
		System.out.println("application no  "+accno);
		Thread.sleep(2000);
		
		altt.accept();
		

	}

}
