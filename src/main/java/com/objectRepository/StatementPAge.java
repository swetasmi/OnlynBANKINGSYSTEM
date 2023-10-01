package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatementPAge {
	
	@FindBy(xpath="//li[.='Statement']")
	private WebElement statement;
	
	public StatementPAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getStatement() {
		return statement;
	}
	
	public void statement()
	{
		statement.click();
	}

}
