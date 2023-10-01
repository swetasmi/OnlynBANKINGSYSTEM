package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAcPage {
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="gender")
	private WebElement gender;
	
	@FindBy(name="mobile")
	private WebElement mobilenum;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="dob")
	private WebElement dob;
	
	@FindBy(name="pan_no")
	private WebElement panno;
	
	@FindBy(name="citizenship")
	private WebElement citizenship;
	
	@FindBy(name="homeaddrs")
	private WebElement homeadd;
	
	@FindBy(name="officeaddrs")
	private WebElement offaddress;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="pin")
	private WebElement pin;
	
	@FindBy(name="arealoc")
	private WebElement arealoc;
	
	@FindBy(name="acctype")
	private WebElement accounttype;
	
	@FindBy(name="submit")
	private WebElement submit;
	
    
	
	
	public  OpenAcPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMobilenum() {
		return mobilenum;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getPanno() {
		return panno;
	}

	public WebElement getCitizenship() {
		return citizenship;
	}

	public WebElement getHomeadd() {
		return homeadd;
	}

	public WebElement getOffaddress() {
		return offaddress;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getArealoc() {
		return arealoc;
	}

	public WebElement getAccounttype() {
		return accounttype;
	}
	
	public WebElement getsubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
