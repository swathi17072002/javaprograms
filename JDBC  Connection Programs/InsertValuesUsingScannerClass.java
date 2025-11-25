package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValuesUsingScannerClass {
    public static void main(String[] args) throws SQLException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend12","root","Swathi_17");
			String sql = "insert into Employee Values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of rows want to insert");
			int rows = sc.nextInt();
			for(int i=0;i<rows;i++) {
				System.out.println("Enter id : ");
				int id = sc.nextInt();
				pstmt.setInt(1,id);
				sc.nextLine();
				System.out.println("Enter Name : ");
				String name = sc.nextLine();
				pstmt.setString(2,name);
				int res = pstmt.executeUpdate();
			}
			System.out.println("Rows Inserted "+rows);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
