
package com.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
   public ExcellUtility elib=new ExcellUtility();
   public FileUtility flib=new FileUtility();
   public WebDriverUtility wlib=new WebDriverUtility();
   public DataBaseUtility dlib=new DataBaseUtility();
   public WebDriver driver;
   public static WebDriver sdriver;
	@BeforeSuite(alwaysRun = true)
	public void connectDB() throws Throwable
	{
		dlib.connectToDb();
		System.out.println("connect to db");
	}
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowse() throws Throwable
	{ 
		String Browser = flib.fetchdataFromProperty("browser");
		//System.out.println("launch the browser");
		//Assert.assertEquals("Browser", "chrome");
	if(Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if (Browser.equalsIgnoreCase("FireFox")) 
		{
			
			
			
			
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
		System.out.println("launch the browser");
		sdriver=driver;
		wlib.maximize(driver);
		}
		
		@BeforeMethod(alwaysRun = true)
		public void loginapp() throws Throwable
		{
			String URL = flib.fetchdataFromProperty("url");
			driver.get(URL);
			wlib.implicityWait(driver, 10);
			
		}
		
		@AfterClass(alwaysRun = true)
		public void closeBrowser()
		{
			driver.quit();
		}
		
		@AfterSuite(alwaysRun = true)
		public void closeDb() throws Throwable
		{
			dlib.closeDB();
		}
		
		
	
 
	
	}


