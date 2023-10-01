package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffLoginpage {
	
	@FindBy(name="staff_id")
	private WebElement staffid;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="staff_login-btn")
	private WebElement login;
	
	public StaffLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getStaffid() {
		return staffid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	//Business Library
	public void stafflogin(String staffidd,String pwd )
	{
		staffid.sendKeys(staffidd);
		password.sendKeys(pwd);
		login.click();
	}

}
