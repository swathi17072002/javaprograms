package com.swathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatedata {
 public static void main(String[] args) throws SQLException {
	 try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","Swathi_17");
		 Statement stmt = con.createStatement();
		    
		    String sql ="update Employee set age=30 where eid=1";
		    
		    int res = stmt.executeUpdate(sql);
		    System.out.println("successfully updated");
		    

		    String sql2 ="delete from Employee where eid=2";
		    
		    int res2 = stmt.executeUpdate(sql2);
		    System.out.println("successfully deleted");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
