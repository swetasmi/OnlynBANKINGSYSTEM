package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DailypracticeTest {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TY51.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Organisation");
	int lastrow = sh.getLastRowNum();
	
	for (int i=0;i<=lastrow;i++)
	{
		int lastcell = sh.createRow(i).getLastCellNum();
		for(int j=0;j<lastcell;j++)
		{
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);
		}
		System.out.println();
	}
	

	}

}
