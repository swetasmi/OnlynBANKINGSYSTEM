package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferMajorTabpage {
	
	@FindBy(xpath="//li[.='Fund Transfer']")
	private WebElement fundtransclick;
	
	public FundTransferMajorTabpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFundtransclick() {
		return fundtransclick;
	}
	
	public void fundTransfertab()
	{
		fundtransclick.click();
	}
	
	

}
