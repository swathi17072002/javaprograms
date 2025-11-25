package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class batchProcessing {
   public static void main(String[] args) throws SQLException {
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
	    Statement stmt = con.createStatement();
	    con.setAutoCommit(false);
	    String sql = "insert into Employee values(9,'Anil')";
	    stmt.addBatch(sql);
	    
	    String sql1 = "insert into Employee values(10,'Raj')";
	    stmt.addBatch(sql1);
	    
	    String sql2 = "update Employee set name='swetha' where eid=2";
	    stmt.addBatch(sql2);
	    
	    int[] a = stmt.executeBatch();
	    con.commit();
	    System.out.println("Completed");
	   } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}
