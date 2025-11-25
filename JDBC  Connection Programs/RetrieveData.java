package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveData {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
		Statement stmt = con.createStatement();
		String sql = "Select * from Employee";
		ResultSet res = stmt.executeQuery(sql);
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getInt(2)+" "+res.getString(3)+" "+res.getString(4));
		}
		System.out.println("Executed");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
