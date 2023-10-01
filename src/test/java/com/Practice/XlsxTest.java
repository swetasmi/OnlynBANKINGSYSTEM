package com.Practice;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlsxTest {

	public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream(".\\src\\test\\java\\com\\Practice\\XlsxTest.java");
		//	FileInputStream fis=new FileInputStream(".\\src\\test\\java\\com\\Practice\\XlsxTest.java");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Organisation");
	int last=sh.getLastRowNum();
	int lastcell=sh.getRow(1).getLastCellNum();
	for(int i=1;i<=last;i++)
	{
		for(int j=0;j<lastcell;j++)
		{
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value);
		}
	}
	System.out.println();
	}

}
