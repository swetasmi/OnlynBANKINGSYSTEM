package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewBenificiaryClickPage {
   
	@FindBy(name="view_beneficiary")
	private WebElement viewbenificiarytab;
	
	public ViewBenificiaryClickPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void benificiaryTab()
	{
		 viewbenificiarytab.click();
	}
}
