package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Benificiarypage {
	
	@FindBy(xpath="//tbody/tr[2]/td[3]")
	private WebElement showbenificiary;
	
	public Benificiarypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getShowbenificiary() {
		return showbenificiary;
	}
	
	public String viewbenificiary()
	{
		return showbenificiary.getText();
	}
	
	

}
