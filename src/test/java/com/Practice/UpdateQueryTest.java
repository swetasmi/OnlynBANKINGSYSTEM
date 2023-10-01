package com.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UpdateQueryTest {

	public static void main(String[] args) throws Throwable {

      Driver driver=new Driver();
      
      //register to database
      DriverManager.registerDriver(driver);
      
      //connection to database
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet51", "root", "root");
     
     //create statement
     Statement state = con.createStatement();
     
     String query="insert into project values('manual', 'banglore', 2);";
     
     //update query
     int result=state.executeUpdate(query);
     
     if(result==1)
     {
    	 System.out.println("data created");
     }
     else {
    	 System.out.println("not created");
     }
     
     //connection close
       con.close();
	}

}
