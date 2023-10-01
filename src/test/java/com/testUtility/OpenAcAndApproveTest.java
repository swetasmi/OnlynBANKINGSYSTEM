package com.testUtility;

import org.openqa.selenium.Alert;
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
import com.objectRepository.ApplicationNoApprove;
import com.objectRepository.ConfirmSubmitOAPage;
import com.objectRepository.HomePageOpenAcPage;
import com.objectRepository.OpenACCnfrAlert;
import com.objectRepository.OpenAcSubmitpage;
import com.objectRepository.StaffLoginpage;
import com.objectRepository.ViewCustomerByACnoPage;

public class OpenAcAndApproveTest extends BaseClass {

	
	@Test(groups = {"system"})
	public void openAC() throws Throwable
	{
		
		
	       String password = flib.fetchdataFromProperty("pwd");
	       String username = flib.fetchdataFromProperty("un");
		
		
		HomePageOpenAcPage hpa=new HomePageOpenAcPage(driver);	
		hpa.openAc();
		 elib.rowcount("OA");
		//elib.getMultipleDataFromExcel(driver, "OA", 0, 1);
		OpenAcSubmitpage oadetails=new OpenAcSubmitpage(driver);
		oadetails.detailsOfAcOpening(elib.getMultipleDataFromExcel(driver, "OA", 0, 1),driver,elib.ReadDataFromExcellSheet("OA", 3, 2),elib.ReadDataFromExcellSheet("OA", 4, 2), elib.ReadDataFromExcellSheet("OA", 1, 2),elib.ReadDataFromExcellSheet("OA", 2, 2));
		//String dobb=sh.getRow(1).getCell(3).getStringCellValue();
		 WebElement dob = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		    dob.click();
			dob.sendKeys("09-09-1997");
			
		OpenAcSubmitpage oas=new OpenAcSubmitpage(driver);
		oas.submitbutton();
		
		
		ConfirmSubmitOAPage cb=new ConfirmSubmitOAPage(driver);
		cb.confirmbutton();
		
		
		
		OpenACCnfrAlert aac=new OpenACCnfrAlert(driver);
		
		String appnum=aac.alertconfirm(driver);
		wlib.Alertpopup(driver);
		
		HomePageOpenAcPage hp=new HomePageOpenAcPage(driver);
		hp.stafflogin();
		
		
		StaffLoginpage sl=new StaffLoginpage(driver);
		sl.stafflogin(username, password);
		
		ViewCustomerByACnoPage approveAC=new ViewCustomerByACnoPage(driver);
		approveAC.approvePendingAC();
		
		Thread.sleep(2000);
		ApplicationNoApprove appno=new ApplicationNoApprove(driver);
		appno.applicationnum(appnum);
		
		Thread.sleep(3000);
		
		
	
	}
	}



