package com.testUtility;



import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.genericUtilities.BaseClass;
import com.genericUtilities.ExcellUtility;
import com.genericUtilities.FileUtility;
import com.genericUtilities.JavaUtility;
import com.genericUtilities.WebDriverUtility;
import com.objectRepository.CreditButtonpage;
import com.objectRepository.FundTransferLoginPage;
import com.objectRepository.HomePageOpenAcPage;
import com.objectRepository.StaffLoginpage;
import com.objectRepository.StatementPAge;
import com.objectRepository.ViewCustomerByACnoPage;

public class CreditCustomerTest extends BaseClass {

	
	
	@Test(groups= "system")
	public void creditCustomer()  throws Throwable
	{
      
       String username=flib.fetchdataFromProperty("un");
       String password=flib.fetchdataFromProperty("pwd");
       String cid= flib.fetchdataFromProperty("Customerid");
       String cpwd = flib.fetchdataFromProperty("cpassword");
		
		
		HomePageOpenAcPage hpl=new HomePageOpenAcPage(driver);
		hpl.stafflogin();
		
		StaffLoginpage stlogin=new StaffLoginpage(driver);
		stlogin.stafflogin(username, password);
		
		
		ViewCustomerByACnoPage credit=new ViewCustomerByACnoPage(driver);
		credit.creditCustomer();
		
		
		elib.rowcount("Organisation");
		
		
		
		elib.getMultipleDataFromExcel(driver, "Org", 0, 1);
		
		CreditButtonpage cb=new CreditButtonpage(driver);
		cb.creditAmount(elib.getMultipleDataFromExcel(driver, "Org", 0, 1), driver);
		
		
		cb.creditbutton();
		
		wlib.Alertpopup(driver);
		
		
		
		
		
		HomePageOpenAcPage hpoa=new HomePageOpenAcPage(driver);
		hpoa.homebutton();
		
		
		
		WebElement internetb = driver.findElement(By.xpath("//div[@class='ebanking']/a"));
		wlib.mouseOverElement(driver, internetb);
		
		hpoa.inbanknglogin();
		
		FundTransferLoginPage ftl=new FundTransferLoginPage(driver);
		ftl.customeridd(cid, cpwd);
		
		
		
		StatementPAge state=new StatementPAge(driver);
		state.statement();
		
		
		
		
	}

}
