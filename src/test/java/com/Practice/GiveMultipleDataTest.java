package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GiveMultipleDataTest {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TY51.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Organisation");
	sh.createRow(9).createCell(0).setCellValue("welcome");
	sh.getRow(9).createCell(1).setCellValue("home");
	sh.getRow(9).createCell(2).setCellValue("ohk");
	FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TY51.xlsx");
	book.write(fos);
	book.close();

	}

}
