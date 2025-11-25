package com.swathi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retrievedata {
	public static void main(String[] args) throws SQLException {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccommand","root","Swathi_17");
			String sql ="select * from student where address=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,"hyd");
			ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getInt(5)+" "+res.getString(6));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
