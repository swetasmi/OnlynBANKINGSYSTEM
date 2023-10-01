package com.TestCasesScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenAndDeleteAc {

	public static void main(String[] args) throws Throwable {
		
		
	WebDriver driver=new ChromeDriver();
	Actions a=new Actions(driver);
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		
	//click on open Account
	driver.findElement(By.xpath("//li[.='Open Account']")).click();
		
	//Enter all the deatails and click on submit button
	driver.findElement(By.name("name")).sendKeys("jagg");
	WebElement gendd = driver.findElement(By.name("gender"));
	Select s=new Select(gendd);
	s.selectByVisibleText("Female");
	driver.findElement(By.name("mobile")).sendKeys("1236547890");
     WebElement dob = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
    dob.click();
	dob.sendKeys("09-09-1997");
	driver.findElement(By.name("pan_no")).sendKeys("pan123");
	driver.findElement(By.name("citizenship")).sendKeys("123456");
	driver.findElement(By.name("homeaddrs")).sendKeys("odisha");
	driver.findElement(By.name("officeaddrs")).sendKeys("banglore");
	WebElement statedd = driver.findElement(By.name("state"));
	Select s1=new Select(statedd);
	s1.selectByIndex(3);
	WebElement citydd = driver.findElement(By.name("city"));
	Select s2=new Select(citydd);
	s2.selectByIndex(2);
	driver.findElement(By.name("pin")).sendKeys("560017");
	driver.findElement(By.name("arealoc")).sendKeys("ty");
	WebElement savingdd = driver.findElement(By.name("acctype"));
	Select s3=new Select(savingdd);
	s3.selectByVisibleText("Saving");
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
	
	/*driver.findElement(By.xpath("//*[@name='home']")).click();
	driver.findElement(By.name("viewdet")).click();
	List<WebElement> allac = driver.findElements(By.xpath("//tbody/tr/td[4]"));
	for(WebElement single:allac)
	{
		String singleac = single.getText();
		if(singleac.equalsIgnoreCase(accno))
		{
			System.out.println("present");
		}
		
	}*/
	
	
	
	}

}
