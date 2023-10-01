package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataTest {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TY51.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Organisation");
	//String value=sh.getRow(1).getCell(1).getStringCellValue();
	//System.out.println(value);
	
	int lastrow=sh.getLastRowNum();
    for(int i=1;i<=lastrow;i++)
	{
		int lastcel=sh.getRow(i).getLastCellNum();
		for(int j=0;j<lastcel;j++)
		{
			String value=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}

	}

}
