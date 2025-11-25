package com.swathi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
    public static void main(String[] args) throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccommand","root","Swathi_17");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			String sql = "insert into Student values(6,'raj','1997-04-16','male',26,'mysore')";
			stmt.addBatch(sql);
			String sql1 = "insert into Student values(7,'anil','1998-06-22','male',25,'banglore'";
			stmt.addBatch(sql1);
			
			int[] a = stmt.executeBatch();
			con.commit();
			System.out.println("executed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
