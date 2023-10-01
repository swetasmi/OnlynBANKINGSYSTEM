package com.testUtility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.genericUtilities.BaseClass;
import com.objectRepository.Benificiarypage;
import com.objectRepository.FundTransferAccNo;
import com.objectRepository.FundTransferLoginPage;
import com.objectRepository.FundTransferMajorTabpage;
import com.objectRepository.HomePageOpenAcPage;
import com.objectRepository.StaffLoginpage;
import com.objectRepository.ViewBenificiaryClickPage;
import com.objectRepository.ViewCustomerByACnoPage;

public class FundTransferutilityTest extends BaseClass {

	//public static void main(String[] args) throws Throwable {
	@Test
	public void fundtransfer() throws Throwable
	{
	//	WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		/*String Browser = flib.fetchdataFromProperty("browser");
		String URL = flib.fetchdataFromProperty("url");*/
		String username = flib.fetchdataFromProperty("un");
		String password = flib.fetchdataFromProperty("pwd");
		String customerid = flib.fetchdataFromProperty("Customerid");
		String customewpwd = flib.fetchdataFromProperty("cpassword");
		
		
		HomePageOpenAcPage hpf=new HomePageOpenAcPage(driver);
		hpf.fundtransfer();
		
		//driver.findElement(By.xpath("//li[.='Fund Transfer']")).click();
		
		
		FundTransferLoginPage flogin=new FundTransferLoginPage(driver);
		flogin.customeridd(customerid, customewpwd);
		
		
		//driver.findElement(By.name("customer_id")).sendKeys(customerid);
		//driver.findElement(By.name("password")).sendKeys(customewpwd);
		//driver.findElement(By.name("login-btn")).click();
		
		FundTransferMajorTabpage ftmt=new FundTransferMajorTabpage(driver);
		ftmt.fundTransfertab();
		//driver.findElement(By.xpath("//li[.='Fund Transfer']")).click();
		
		ViewBenificiaryClickPage vbt=new ViewBenificiaryClickPage(driver);
		vbt.benificiaryTab();
		//driver.findElement(By.name("view_beneficiary")).click();
		
		
		Benificiarypage benifi=new Benificiarypage(driver);
		String benificiaryacno=benifi.viewbenificiary();
		//String benificiary = driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText();
		
		hpf.stafflogin();
		//driver.findElement(By.linkText("Staff Login")).click();
		
		StaffLoginpage slp=new StaffLoginpage(driver);
		slp.stafflogin(username, password);
		//driver.findElement(By.name("staff_id")).sendKeys(username);
		//driver.findElement(By.name("password")).sendKeys(password);
		//driver.findElement(By.name("staff_login-btn")).click();
		
		ViewCustomerByACnoPage vc=new ViewCustomerByACnoPage(driver);
		vc.viewcustomer();
		//driver.findElement(By.name("view_cust_by_ac")).click();
		
		//FundtViewBenificiaryPage vbp=new FundtViewBenificiaryPage(driver);
		//vbp.viewbenificiary();
		
		FundTransferAccNo ftacn=new FundTransferAccNo(driver);
		ftacn.fundtransferacno(benificiaryacno);
		
		System.out.println("customer details is visible");
		
	  //  driver.findElement(By.name("account_no")).sendKeys(benificiary);
	  //  driver.findElement(By.name("submit_view")).click();
		
		


	}

}
