package revision;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {
	 public static void main(String[] args) throws SQLException {
		   try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revisionclass","root","Swathi_17");
				Statement stmt = con.createStatement();
				String sql = "create table Student(id int,name varchar(15))";
				stmt.execute(sql);
				System.out.println("succesfully table created");;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
