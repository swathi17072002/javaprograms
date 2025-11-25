package com.swathi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class modifycolumn {
     public static void main(String[] args) throws SQLException {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccommand","root","Swathi_17");
			Statement stmt = con.createStatement();
			String sql ="alter table student modify column name varchar(20)";
			boolean b = stmt.execute(sql);
			System.out.println("Succesfully column size modified");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
}
