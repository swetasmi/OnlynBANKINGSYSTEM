package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationNoApprove {
	
	
	@FindBy(name="application_no")
	private WebElement applicationnum;
	
	@FindBy(name="search_application")
	private WebElement search;
	
	@FindBy(name="approve_cust")
	private WebElement approveac;
	
	
	
	public ApplicationNoApprove(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getApplicationnum() {
		return applicationnum;
	}
    public WebElement getSearch() {
		return search;
	}
	public WebElement getApproveac() {
		return approveac;
	}

	public void applicationnum(String num)
	{
		applicationnum.sendKeys(num);
		search.click();
		approveac.click();
	}
	
	

}
