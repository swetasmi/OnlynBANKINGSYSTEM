package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundtViewBenificiaryPage {
	
	@FindBy(name="view_beneficiary")
	private WebElement viewbenificiary;
	
	public FundtViewBenificiaryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	 public void viewbenificiary()
	 {
		 viewbenificiary.click();
	 }
}
