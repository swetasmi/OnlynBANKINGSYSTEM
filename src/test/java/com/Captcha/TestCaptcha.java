package com.Captcha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCaptcha {

	public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disableed notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("");

	}

}
