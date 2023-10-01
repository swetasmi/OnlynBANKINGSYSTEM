package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoTest {

	public static void main(String[] args) throws Throwable {
	//give multiple data
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row number");
		int row = sc.nextInt();
		System.out.println("Enter the column");
		int column = sc.nextInt();
		String path=".\\src\\test\\resources\\TY51.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		for(int i=0;i<row;i++)
		{
		sh.createRow(i);
		for(int j=0;j<column;j++)
		{
			System.out.println("enter the data for "+i+" row and "+j+" cell");
			String value = sc.next();
			sh.getRow(i).getCell(j).setCellValue(value);
		}
		}
	     FileOutputStream fos=new FileOutputStream(path);
	     book.write(fos);
	     book.close();

	}

}
