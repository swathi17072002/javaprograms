package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
    public static void main(String[] args) throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
			Statement stmt = con.createStatement();
			/*String sql = "insert into Employee values(1,20,'2002-07-17','swathi')";
			int res = stmt.executeUpdate(sql);*/
			String sql = "insert into Employee values(5,25,'2000-10-28','swetha')";
			int res = stmt.executeUpdate(sql);
			String sql1 = "insert into Employee values(2,20,'2004-03-10','harika')";
			int res1 = stmt.executeUpdate(sql1);
			System.out.println("inserted rows "+(res+res1));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
