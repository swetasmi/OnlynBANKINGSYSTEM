package com.testngPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.genericUtilities.path;

public class DataProviderTest {
	
/*	@Test(dataProvider="mobile")
	public void mobTest(String p,String p2)
	{
		System.out.println("ohk");
	}
	
	
	@DataProvider
	public Object[][] mobile()
	{

     Object[][] obj = new Object[2][2];
     obj[0][0]= "Realme";
     obj[0][1]= "redmi";
     
     obj[1][0]= "samsung";
     obj[1][1]= "iphone";
     
     return obj;
     
	}*/
	
	
	public Object[][] fetchdatafromexcel() throws Throwable
	{
		FileInputStream fis=new FileInputStream(path.epath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("DataP");
		int lastrow = sh.getLastRowNum();
		int lastcell = sh.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[lastrow][lastcell];
		for(int i=0;i<lastrow;i++)
		{
			for(int j=0;j<lastcell;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
