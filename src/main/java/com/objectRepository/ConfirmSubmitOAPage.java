package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmSubmitOAPage {
	
	@FindBy(name="cnfrm-submit")
	private WebElement confirmbutton;
	
	public ConfirmSubmitOAPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirmbutton() {
		return confirmbutton;
	}
	public void confirmbutton()
	{
		confirmbutton.click();
	}
}
