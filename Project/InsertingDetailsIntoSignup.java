package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertingDetailsIntoSignup {
   public static void main(String[] args) throws SQLException {
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bus_Ticket_Reservation","root","Swathi_17");
		String sql = "insert into signup_details values(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		System.out.println("Enter mail :");
		String Mail = sc.nextLine();
		pstmt.setString(1, Mail);
		System.out.println("Enter mobile number :");
		long mobileNumber = sc.nextLong();
		sc.nextLine();
		pstmt.setLong(2, mobileNumber);
		System.out.println("Enter username :");
		String erUserName = sc.nextLine();
		pstmt.setString(3, erUserName);
		System.out.println("Enter password :");
		String erPass = sc.nextLine();
		pstmt.setString(4, erPass);
		
		pstmt.executeUpdate();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
}
}
