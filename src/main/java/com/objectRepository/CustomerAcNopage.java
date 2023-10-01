package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAcNopage {
	
	@FindBy(name="account_no")
	private WebElement accountno;
	
	@FindBy(name="submit_view")
	private WebElement submit;
	
	public CustomerAcNopage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAccountno() {
		return accountno;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
