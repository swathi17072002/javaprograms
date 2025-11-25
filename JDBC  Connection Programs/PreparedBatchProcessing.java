package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedBatchProcessing {
   public static void main(String[] args) throws SQLException {
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
		con.setAutoCommit(false);
		String sql = "insert into Employee values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,3);
		pstmt.setString(2, "Harika");
	    pstmt.addBatch();
	    
	   String sql1 = "update Employee set name=? where eid=?";
	   PreparedStatement pstmt1 = con.prepareStatement(sql1);
	   pstmt1.setString(1,"Varsha");
	   pstmt1.setInt(2,4);
	   pstmt1.addBatch();
	    
	    
	    
	    int[] a = pstmt.executeBatch();
	    int[] b= pstmt1.executeBatch();
	    con.commit();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
