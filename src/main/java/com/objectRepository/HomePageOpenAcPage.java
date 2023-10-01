package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.WebDriverUtility;

public class HomePageOpenAcPage extends WebDriverUtility {
	
	@FindBy(xpath="//li[text()='Open Account']")
	private WebElement openAccount;
	
	@FindBy(xpath="//li[.='Fund Transfer']")
	private WebElement fundtransfer;
	
	@FindBy(linkText="Staff Login")
	private WebElement stafflogin;
	
	@FindBy(linkText="Home")
	private WebElement homebutton;
	
	@FindBy(xpath="//li[.='Login ']")
	private WebElement internetloginbutton;
	
	@FindBy(xpath="//div[@class='ebanking']/a")
	private WebElement ebanking;
	
	
	

	

	public HomePageOpenAcPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getOpenAccount() {
		return openAccount;
	}


	public WebElement getStafflogin() {
		return stafflogin;
	}
	
	public WebElement getfundtransfer() {
		return fundtransfer;
	}
	
	public WebElement getHomebutton() {
		return homebutton;
	}
	
	public WebElement getinternetloginbutton()
	{
		return internetloginbutton;
	}
	
	public WebElement getebanking()
	{
		return ebanking;
	}

	
	//Business Library
	public void openAc()
	{
		openAccount.click();
	}
	
	public void stafflogin()

	{
		stafflogin.click();
	}
	
	public void fundtransfer()
	{
		fundtransfer.click();
	}
	
	public void homebutton()
	{
		homebutton.click();
	}
	
	public void inbanknglogin()
	{
		internetloginbutton.click();
	}
	
	public void ebanking()
	{
		ebanking.click();
	}


	
	

	
	
	
	
}
