package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
   public static void main(String[] args) throws SQLException {
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
		
		Statement stmt = con.createStatement();
		String sql = "create table Employee(id int,age int,dob date)";
		
		boolean b = stmt.execute(sql);
		System.out.println("Successfully created table");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
