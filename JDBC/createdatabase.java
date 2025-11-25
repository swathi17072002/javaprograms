package com.swathi1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createdatabase {
 public static void main(String[] args) throws SQLException {
	 try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Swathi_17");
		Statement stmt = con.createStatement();
		String sql ="create database jdbccommand";
		boolean b = stmt.execute(sql);
		System.out.println("Succesfully database created");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
