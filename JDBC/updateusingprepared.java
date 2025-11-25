package com.swathi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateusingprepared {
	public static void main(String[] args) throws SQLException {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccommand","root","Swathi_17");
			String sql ="update student set name=? and gender=? where sid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,"anil kumar");
			pstmt.setString(2, "male");
			
			pstmt.setInt(3,2);
			int a = pstmt.executeUpdate();
			System.out.println(a+" rows updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
