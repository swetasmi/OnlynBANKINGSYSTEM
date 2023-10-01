package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferLoginPage {
	
	@FindBy(name="customer_id")
	private WebElement customerid;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login-btn")
	private WebElement login;
	
	public FundTransferLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCustomerid() {
		return customerid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public void customeridd(String cusid, String pwd)
	{
		customerid.sendKeys(cusid);
		password.sendKeys(pwd);
		login.click();
		
	}
	
	
	
	

}
