package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferAccNo {
	
	@FindBy(name="account_no")
	private WebElement accno;
	
	@FindBy(name="submit_view")
	private WebElement submit;
	
	public FundTransferAccNo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getAccno() {
		return accno;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public void fundtransferacno(Object Accno)
	{
		accno.sendKeys((String)Accno);
		submit.click();
	}

}
