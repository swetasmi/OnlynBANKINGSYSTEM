package com.objectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.WebDriverUtility;

public class OpenAcSubmitpage extends WebDriverUtility {
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="acctype")
	private WebElement Acctype;
	
	@FindBy(name="gender")
	private WebElement gender;
	
   public void detailsOfAcOpening(HashMap<String, String> map,WebDriver driver,String vtext,String ctext,String ATypetext, String gen)
   {
	   for(Entry<String, String> s:map.entrySet())
		{
			
				driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
			
		}
	   selectDropDownByVisisbleText(state, vtext);
	   selectDropDownByVisisbleText(city, ctext);
	   selectDropDownByVisisbleText(Acctype, ATypetext);
	   selectDropDownByVisisbleText(gender, gen);
   }
	
	
	
	@FindBy(name="submit")
	private WebElement submitButton;
	
	public OpenAcSubmitpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSubmitButton() {
		return submitButton;
	}


	public void submitbutton()
	{
		submitButton.click();
	}
	
	
	
	
	
	
	
	
}
