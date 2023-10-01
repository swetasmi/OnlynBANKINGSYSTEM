package com.Practice;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonFile.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String browser=pobj.getProperty("Browser");
		String url=pobj.getProperty("URL");

		String un=pobj.getProperty("username");
		String pwd=pobj.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);



	}

}
