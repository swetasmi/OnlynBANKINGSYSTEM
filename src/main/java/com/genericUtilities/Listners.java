package com.genericUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listners implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./Extentreport/report.html");
		htmlreport.config().setDocumentTitle("SDET 51");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("OnlineBanking");
		
		 report = new ExtentReports();
		 report.attachReporter(htmlreport);
		 report.setSystemInfo("OS","windows-10");
		 report.setSystemInfo("Base-Browser", "Chrome");
		 report.setSystemInfo("Base-url", "http://rmgtestingserver/domain/Online_Banking_System/");
		 report.setSystemInfo("Reporter-name", "sweta");
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		 test = report.createTest(methodName);
		 Reporter.log(methodName+"--->Execution start");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+"--->passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		
		try {
			WebDriverUtility wlib=new WebDriverUtility();
			  String failedScript=wlib.takescreenshot(BaseClass.sdriver, methodName);
			  test.addScreenCaptureFromPath( failedScript);	
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		test.log(Status.FAIL, result.getThrowable());
		test.log(Status.FAIL, methodName+"--->Failed");
		
		Reporter.log(methodName+"--->failed");
				
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, result.getThrowable());
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodName+"--->skipped");
		
	
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		report.flush();
	}
	
	

}
