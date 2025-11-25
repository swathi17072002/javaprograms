package com.swathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertdatatodatabase {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","Swathi_17");
		 Statement stmt = con.createStatement();
		    
		    String sql ="insert into Employee values(1,20)";
		    String sql2 ="insert into Employee values(2,23)";
		    String sql3 ="insert into Employee values(3,10)";
		    String sql4 ="insert into Employee values(4,25)";
		    int res = stmt.executeUpdate(sql);
		    int res2 = stmt.executeUpdate(sql2);
		    int res3 = stmt.executeUpdate(sql3);
		    int res4 = stmt.executeUpdate(sql4);
		    System.out.println("row get affected");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
