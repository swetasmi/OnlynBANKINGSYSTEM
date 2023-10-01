package com.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JDBCAssignmaent {

	public static void main(String[] args) throws Throwable {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		
		
		
		
		//register to database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root" ,"root");
		
		//create statement
		Statement state = con.createStatement();
		
		String query="select * from ty21";
		
		//Excecute the query
		ResultSet result = state.executeQuery(query);
		Boolean flag=false;
		while(result.next())
		{
			if(result.getString(2).equalsIgnoreCase(name))
			{
				flag=true;
			}
			else
			{
				String id=result.getString(1);
			}
		}
		
		
		
		
		
		
		
	}
		
		
	}


