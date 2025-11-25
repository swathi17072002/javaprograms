package com.swathi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class preparedstatement {
	public static void main(String[] args) throws SQLException {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccommand","root","Swathi_17");
			String sql ="insert into student values(?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,5);
			pstmt.setString(2, "varsha");
			pstmt.setString(3, "2000-02-03");
			pstmt.setString(4, "female");
			pstmt.setInt(5,25);
			pstmt.setString(6, "banglore");
			int a = pstmt.executeUpdate();
			System.out.println("executed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
