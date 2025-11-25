package com.swathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {
  public static void main(String[] args) throws SQLException{
	//step 1: load and register the mysql driver
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		//step 2:establish connection between java append database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Swathi_17");
		//step 3
		Statement stmt = con.createStatement();
		String sql = "create database backend";
		
		boolean b = stmt.execute(sql);
		System.out.println("Succesfully created to database from backend application");
		
		System.out.println("Successfully connected");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
