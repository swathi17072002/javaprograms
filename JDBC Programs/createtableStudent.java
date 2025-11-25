package com.swathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtableStudent {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","Swathi_17");
			Statement stmt = con.createStatement();
			String sql = "create table Student(id int,name varchar(15),dob date,gender varchar(10),age int,address varchar(20))";
			boolean b = stmt.execute(sql);
			System.out.println("Successfully created table");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
