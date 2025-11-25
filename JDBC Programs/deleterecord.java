package com.swathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleterecord {
 public static void main(String[] args) throws SQLException {
	 try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","Swathi_17");
		Statement stmt = con.createStatement();
		String sql ="delete from Employee where eid=3";
		int res = stmt.executeUpdate(sql);
		System.out.println("Succesfully delected");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
