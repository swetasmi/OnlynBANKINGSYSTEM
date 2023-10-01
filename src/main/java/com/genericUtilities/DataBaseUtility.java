package com.genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	 Connection con=null;
	 
	 public void connectToDb() throws SQLException
	 {
		 Driver driver=new Driver();
		 DriverManager.registerDriver(driver);
		 con=DriverManager.getConnection(path.dburl,path.dbusername,path.dbpassword);
	 }
	 
	 public String ExcecuteQuery(String query, int columnNo, String ExpData) throws Throwable
	 {
		 ResultSet result = con.createStatement().executeQuery(query);
		 boolean flag=false;
		 while(result.next())
		 {
			 String data=result.getString(columnNo);
			 if(data.equalsIgnoreCase(ExpData))
			 {
				 flag=true;
				 break;
			 }
		 }
		 if(flag==true)
		 {
			 System.out.println("data verified");
			 return ExpData;
		 }
		 else {
			 System.out.println("data is not present");
			 return"";
		 }
		
		
	 }
	 
	 
	 public void closeDB() throws Throwable
	 {
		 con.close();
	 }

}
