package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connectionss {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
		System.out.println("Connection Established");
		String sql = "update Employee set name =? where eid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,"Swathi");
		pstmt.setInt(2,1);
		int res = pstmt.executeUpdate();
		System.out.println(res+" rows get effected");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
