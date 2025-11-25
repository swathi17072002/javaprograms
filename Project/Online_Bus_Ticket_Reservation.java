package miniproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/*import project.InvalidMailIdException;
import project.InvalidMobileNumberException;
import project.InvalidUserNameException;
import project.Operations;
import project.PasswordNotMatchingException;*/


class Operations{
	public int userVerification(String user, String password,Connection con) throws Exception {
		int val = 0;
		Statement st1 = con.createStatement();
		
		String quary = "select * from signup_details";

		ResultSet signup_detail = st1.executeQuery(quary);
		while (signup_detail.next()) {
			if (signup_detail.getString(3).equals(user) && signup_detail.getString(4).equals(password)) {
				val = 1;
			}
		}
		
		return val;

	}
	public boolean checkUserName(String userName,Connection con) throws Exception {
		Statement st1 = con.createStatement();
		
		String quary = "select * from signup_details";
		ResultSet signup_detail = st1.executeQuery(quary);
		
		while (signup_detail.next()) {
			if (signup_detail.getString(3).equals(userName)) {
				return true;

			}
		}
		
		return false;
	}

}

class InvalidMailIdException extends Exception {
	public InvalidMailIdException(String str) {
		super(str);
	}
}

class InvalidUserNameException extends Exception {
	public InvalidUserNameException(String str) {
		super(str);
	}
}

class PasswordNotMatchingException extends Exception {
	public PasswordNotMatchingException(String str) {
		super(str);
	}
}

class InvalidMobileNumberException extends Exception {
	public InvalidMobileNumberException(String str) {
		super(str);
	}
}

public class Online_Bus_Ticket_Reservation {
	public static void main(String[] args) throws Exception{
		   
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bus_Ticket_Reservation","root","Swathi_17");
			Scanner sc = new Scanner(System.in);
			Operations op = new Operations();
			
			while(true) {
				System.out.println(
						"********Welcome to Online Bus Reservation System********\n1.Sign up\n2.Log in\n3.Close\nSelect one option");
				int choice1 = sc.nextInt();
				sc.nextLine();
				boolean b1=false;
				switch(choice1) {
				case 1:
					
					System.out.println("Enter Mail Id: ");
					String CheckMail = sc.nextLine();
					String Mail = "";
					
					int Index = CheckMail.indexOf("@");
					
					if (Index == -1) {
						
						try {
							throw new InvalidMailIdException("Invalid mail formate !");
						} catch (InvalidMailIdException e) {
							System.out.println(e.getMessage());
							System.out.println("Mail Must Contain @mail.com or @email.com");
							System.out.print("RE-Enter the Mail: ");
							CheckMail = sc.nextLine();
							Index = CheckMail.indexOf("@");
						}
					}
					try {
						String sub1 = CheckMail.substring(Index);
						if (validMail(sub1)) {
							Mail = CheckMail;
						} else {
							throw new InvalidMailIdException("Invalid Mail Formate :@gmail.com or @email.com");
						}
					} catch (InvalidMailIdException e) {
						System.out.println(e.getMessage());
						System.out.println("Enter mail Again..");
						Mail = sc.nextLine();
						
					}
					
					
					System.out.print("Enter Mobile Number: ");
					long checkMobileNumber = sc.nextLong();
					long mobileNumber = 0;
					sc.nextLine();
					if (validMobileNumber(checkMobileNumber)) {
						mobileNumber = checkMobileNumber;
					} else {
						try {
							throw new InvalidMobileNumberException("Invalid Mobile Number! ! ");
						} catch (InvalidMobileNumberException e) {
							System.out.println(e.getMessage());
							System.out.print("Re-Enter Mobile Number: ");
							mobileNumber = sc.nextLong();
							sc.nextLine();
						}
					}
					
					System.out
							.println("User Name must Contais capital latter,small latter,Number and Special Charecter");
					System.out.print("Set User-Name: ");
					String erCheckUserName = sc.nextLine();
					String erUserName = "";
					if (validUserName(erCheckUserName)) {
						erUserName = erCheckUserName;
					} else {
						try {
							throw new InvalidUserNameException("Invalid user Name Formate");
						} catch (InvalidUserNameException e) {
							System.out.println(e.getMessage());
							System.out.println("Enter User-name Again..");
							erUserName = sc.nextLine();
						}
					}
					while (op.checkUserName(erUserName,con)) {
						System.out.println("User Name Should Be Unic ! !\nRe-Enter User-Name");
						System.out.println("User Name must Contais capital latter,small latter,Number and Special Charecter");
						erUserName = sc.nextLine();
						if (validUserName(erUserName)) {
							erUserName = erUserName;
						} else {
							try {
								throw new InvalidUserNameException("Invalid user Name Formate");
							} catch (InvalidUserNameException e) {
								System.out.println(e.getMessage());
								System.out.println(
										"User Name must Contais capital latter,small latter,Number and Special Charecter\nRe-Enter User-Name");
								erUserName = sc.nextLine();
							}
						}
					}
					String erPass = "";
					System.out.print("Set New Password: ");
					String pass1 = sc.nextLine();
					System.out.print("Enter Again New Password: ");
					String pass2 = sc.nextLine();
					if (pass1.equals(pass2)) {
						erPass = pass1;
					} else {
						try {
							throw new PasswordNotMatchingException("Password Not Matching ! ! !");
						} catch (PasswordNotMatchingException e) {
							System.out.println(e.getMessage());
							System.out.println("Re-Enter New Password..");
							erPass = sc.nextLine();
						}
					}
					
					String sql = "insert into signup_details values(?,?,?,?,?)";
					PreparedStatement pstmt = con.prepareStatement(sql);
					pstmt.setString(1, Mail);
					pstmt.setLong(2, mobileNumber);
					pstmt.setString(3, erUserName);
					pstmt.setString(4, erPass);
					
					pstmt.executeUpdate();
					b1=true;
					pstmt.close();
					
				break;
				case 2 :
					int count=0;
					System.out.println("Log-in...");
					//sc.nextLine();
					while(count<2) {
						if(count!=0) {
					System.out.println("Invalid User Name or Password");
					System.out.println("Re-LogIn...");
						}
					System.out.print("Enter User Name: ");
					String aUserName = sc.nextLine();
					System.out.print("Enter Password: ");
					String aPass = sc.nextLine();
					int check1 = op.userVerification(aUserName, aPass,con);
					if(check1==0)
						count++;
					if(check1==1) {
						count=2;
					b1=true;
					}
					}
				break;
				default :
				System.out.println("Shut Down......");
				System.exit(0);
				
				
			}
				if(b1=true) {
					
				}
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
   public static boolean validUserName(String userName) {
		// TODO Auto-generated method stub
		boolean capital = false, small = false, number = false, special = false;
		for (int i = 0; i < userName.length(); i++) {
			char ch = userName.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				small = true;
			} else if (ch >= 'A' && ch <= 'Z') {
				capital = true;
			} else if (ch >= '0' && ch <= '9') {
				number = true;
			} else {
				special = true;
			}
		}
		if (capital && small && number && special) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validMail(String sub1) {
		if (sub1.equals("@gmail.com") || sub1.equals("@email.com")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validMobileNumber(long number) {
		if (1000000000 <= number && 9999999999l >= number) {
			return true;
		} else {
			return false;
		}
	}

}
