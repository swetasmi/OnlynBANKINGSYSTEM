package com.genericUtilities;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	
	/**
	 * This method is used to get the random number
	 * @return
	 */
	public int getRandomNumber()
	{
	Random r=new Random();
	int randumnum = r.nextInt(1000);
	return randumnum; 
	}
	
	
	/**
	 * This method is used to fetch the date in IST Format
	 * @return
	 * 
	 * 
	 */
	public String getSystemDate()
	{
		Date date=new Date();
		String dt = date.toString();
		return dt;
	}
	
	/**
	 * This method is used to fetch the date in required Format
	 * @return
	 */
	public String getSystemInFormat()
	{
		Date date=new Date();
		String[] d = date.toString().split("");
		String day=d[0];
		String month=d[1];
		String datee=d[2];
		String year=d[5];
		
		String format=day+""+month+""+datee+""+year;
		return format;
		
	}

}
