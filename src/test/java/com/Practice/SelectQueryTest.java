package com.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {
	
	public static void main(String[] args) throws Throwable {
		Connection con=null;
		try {
		Driver driver=new Driver();
		//register to database
		DriverManager.registerDriver(driver);
		
		//connection to database
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet51", "root", "root");
		
		//create statement
		Statement state = con.createStatement();
		String query="select * from project";
		
		//execute the query
		ResultSet result = state.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		}
		}
		catch(Exception e)
		{
			System.out.println("displayed");
		}
		finally {
			//close the connection
			con.close();
		}

	}

}
