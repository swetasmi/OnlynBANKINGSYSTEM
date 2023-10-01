package com.TestCasesScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericUtilities.ExcellUtility;
import com.genericUtilities.FileUtility;
import com.genericUtilities.JavaUtility;
import com.genericUtilities.WebDriverUtility;
import com.objectRepository.HomePageOpenAcPage;

public class ApplyingForAc {

	public static void main(String[] args) throws Throwable {
		
		 ExcellUtility elib=new ExcellUtility();
	       JavaUtility jlib=new JavaUtility();
	       WebDriverUtility wlib=new WebDriverUtility();
	       FileUtility flib=new FileUtility();
		
		String URL = flib.fetchdataFromProperty("url");
		
		WebDriver driver=new ChromeDriver();
		wlib.maximize(driver);	
		wlib.implicityWait(driver, 10);
		driver.get(URL);
		HomePageOpenAcPage hp=new HomePageOpenAcPage(driver);
		hp.openAc();
		
			

	}

}
