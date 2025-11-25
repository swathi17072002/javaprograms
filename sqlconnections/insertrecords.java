package revision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertrecords {
   public static void main(String[] args) throws SQLException {
	   try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revisionclass","root","Swathi_17");
			Statement stmt = con.createStatement();
			String sql = "insert into student values(3,'srinivas')";
			int b = stmt.executeUpdate(sql);
			System.out.println(b+" rows get effected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
