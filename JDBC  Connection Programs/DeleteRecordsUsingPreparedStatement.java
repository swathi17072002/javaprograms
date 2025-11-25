package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecordsUsingPreparedStatement {
     public static void main(String[] args) throws SQLException {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
			String sql = "delete from Employee where eid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,3);
			int res = pstmt.executeUpdate();
			System.out.println(res+" rows get affected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
