package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataUsingPreparedStatement {
     public static void main(String[] args) throws SQLException {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
			String sql = "update Employee set name='Raj Kumar' where eid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,4);
			int res = pstmt.executeUpdate();
			System.out.println(res+" rows get affected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
