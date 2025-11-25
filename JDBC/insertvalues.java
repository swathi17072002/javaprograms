package com.swathi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertvalues {
    public static void main(String[] args) throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccommand","root","Swathi_17");
			Statement stmt = con.createStatement();
			String sql ="insert into student values(1,'swathi','2002-07-17','female',20,'hyd')";
			String sql2 ="insert into student values(2,'swetha','2002-07-17','female',31,'chennai')";
			String sql3 ="insert into student values(3,'harika','2007-08-12','female',16,'nalgonda')";
			String sql4 ="insert into student values(4,'srinivas','2000-04-16','male',40,'hyd')";
			int res = stmt.executeUpdate(sql);
			int res2 = stmt.executeUpdate(sql2);
			int res3 = stmt.executeUpdate(sql3);
			int res4 = stmt.executeUpdate(sql4);
			System.out.println("data succesfully inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
