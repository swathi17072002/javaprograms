package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertColumnUsingPreparedStatement {
     public static void main(String[] args) throws SQLException {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
			String sql = "insert into Employee values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,4);
			pstmt.setString(2,"Raj");
			int res = pstmt.executeUpdate();
			
			/*pstmt.setInt(1,10);
			pstmt.setString(2,"Varsha");
			int res1 = pstmt.executeUpdate();
			
			pstmt.setInt(1,8);
			pstmt.setString(2,"Srinivas");
			int res2 = pstmt.executeUpdate();
			
			pstmt.setInt(1,3);
			pstmt.setString(2,"Raja");
			int res3 = pstmt.executeUpdate();*/
			
			System.out.println("Inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
