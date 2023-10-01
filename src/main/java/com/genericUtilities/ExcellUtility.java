package com.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcellUtility {
	
	
	/**
	 * This method is used to read the data from excellSheet
	 * @param sheet
	 * @param rownum
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public String ReadDataFromExcellSheet(String sheet, int rownum ,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path.epath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		Row row = sh.getRow(rownum);
		Cell celll = row.getCell(cell);
		String value = celll.getStringCellValue();
		return value;
		
	}
	
	
	/**
	 * This method is used to write the data into excellSheet
	 * @param sheet
	 * @param rownum
	 * @param cell
	 * @param msg
	 * @throws Throwable
	 */
	public void WriteDataintoExcellSheet(String sheet, int rownum ,int cell,String msg) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path.epath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		Row row = sh.createRow(rownum);
		Cell celll = row.createCell(cell);
		 celll.setCellValue(msg);
		 
		 FileOutputStream fos=new FileOutputStream(path.epath);
		 book.write(fos);
		 
		 book.close();
			
	}
	
	/**
	 * This method is used to return the last rownum
	 * 
	 * @param sheet
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
	public int rowcount(String sheet) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream(path.epath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		int lastrow = sh.getLastRowNum();
		return lastrow;
	}
	
	//public HashMap<String, String> getMultipleDataFromExcel(WebDriver driver, String sheet,int keycolumn,int valuecolumn, JavaUtility jut) throws Throwable
    /**
     * \This method is used to get multiple data from excel
     * @param driver
     * @param sheet
     * @param keycolumn
     * @param valuecolumn
     * @return
     * @throws Throwable
     */
	public HashMap<String, String> getMultipleDataFromExcel(WebDriver driver, String sheet,int keycolumn,int valuecolumn) throws Throwable
	
	{
		FileInputStream fis=new FileInputStream(path.epath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		int lastrow=sh.getLastRowNum();
		
		HashMap<String, String> map=new HashMap<String, String>();
		for(int i=1;i<=lastrow;i++)
		
		{
			String key=sh.getRow(i).getCell(keycolumn).getStringCellValue();
			String value=sh.getRow(i).getCell(valuecolumn).getStringCellValue();
			map.put(key, value);	
		}
		
		/*for(Entry<String, String> s:map.entrySet())
		{
			//if(s.getKey().contains(visiblemsg))
			//{
				driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
			//}
			//else {
			//	driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
			//}
		}*/
		return map;
	}
	
	/**
	 * 
	 * @param sheetname
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
   public	Object[][] getsetdata(String sheetname) throws Throwable, IOException
		{
			FileInputStream fis1=new FileInputStream(path.epath);
			Workbook book1=WorkbookFactory.create(fis1);
			Sheet sheet2 = book1.getSheet(sheetname);
			int lastrownum = sheet2.getLastRowNum()+1;
			int lastcell = sheet2.getRow(0).getLastCellNum();
			
			Object[][] obj=new Object[lastrownum][lastcell];
			for(int i=0;i<lastrownum;i++)
			{
				for(int j=0;j<lastcell;j++)
				{
					obj[i][j]=sheet2.getRow(i).getCell(j).getStringCellValue();
				}
			}
			return obj;
			
			}
		
}
		
		
		
		
		
	
	
	
	


