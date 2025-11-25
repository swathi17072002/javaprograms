package com.swathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//step 2:establish connection between java append database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","Swathi_17");
			//step 3
			Statement stmt = con.createStatement();
			String sql = "create table Employee1(id int,age int)";
			
			boolean b = stmt.execute(sql);
			System.out.println("Successfully created table");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
