package com.objectRepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OpenACCnfrAlert {

	
	public String alertconfirm(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String textalert = alt.getText();
		
		int length = textalert.length();
		String num="";
		for(int i=0;i<length;i++)
		{
			if(Character.isDigit(textalert.charAt(i)))
			{
				num=num+textalert.charAt(i);
			}
			
			}
		System.out.println("Application  "+num);
		return num;
		
	}
	
	 public OpenACCnfrAlert(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

	
	 
	 
	 
	 
	 
	 
}
