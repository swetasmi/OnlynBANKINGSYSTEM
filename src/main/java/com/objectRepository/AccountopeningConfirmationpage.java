package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountopeningConfirmationpage {
	
	@FindBy(name="cnfrm-submit")
	private WebElement confirm;
	
	public AccountopeningConfirmationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	//Business Libreary
	public void accopencnfdetails()
	{
		 confirm.click();
	}
	
	
	
	

}
