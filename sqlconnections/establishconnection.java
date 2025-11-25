package sqlconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class establishconnection {
     public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Swathi_17");
			System.out.println("succesfully connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
