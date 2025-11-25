package com.swathi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updaterecords {
    public static void main(String[] args) throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccommand","root","Swathi_17");
			Statement stmt = con.createStatement();
			String sql ="update student set age=22 where sid=2";
			int res = stmt.executeUpdate(sql);
			
			System.out.println("updated succesfully ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    }
}
