package com.objectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditButtonpage {
	
	public void creditAmount(HashMap<String, String> map, WebDriver driver)
	{
		for(Entry<String, String> s:map.entrySet())
		{
		driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
		
		}
	}
	
	@FindBy(name="credit_btn")
	private WebElement creditbutton;
	
	public CreditButtonpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreditbutton() {
		return creditbutton;
	}
	
	public void creditbutton()
	{
		creditbutton.click();
	}

}
