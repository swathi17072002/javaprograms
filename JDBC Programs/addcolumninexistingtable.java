package com.swathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addcolumninexistingtable {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","Swathi_17");
		    Statement stmt = con.createStatement();
		    
		    String sql ="alter table Employee rename column id to eid";
		    boolean b = stmt.execute(sql);
		    
		    System.out.println("successfully  column added");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
