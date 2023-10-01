package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCustomerByACnoPage {
	
	@FindBy(name="view_cust_by_ac")
	private WebElement viewcustomer;
	
	@FindBy(name="apprvac")
	private WebElement approvePendingAc;
	
	@FindBy(name="credit_cust_ac")
	private WebElement creditCustomer;
	
	public ViewCustomerByACnoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getViewcustomer() {
		return viewcustomer;
	}
	
	public WebElement getapprovePendingAc() {
		return approvePendingAc;
	}
	
	public WebElement getcreditCustomer() {
		return creditCustomer;
	}
	
	
	public void viewcustomer()
	{
		viewcustomer.click();
	}
	
	public void creditCustomer()
	{
		creditCustomer.click();
	}
	
	public void approvePendingAC()
	{
		approvePendingAc.click();
	}
	

}
