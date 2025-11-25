package miniproject;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.*;



class Online_Operations{
	Scanner sc = new Scanner(System.in);
	
	public int userVerification(String user, String password,Connection con) throws Exception {
		int val = 0;
		Statement st1 = con.createStatement();
		
		String quary = "select * from signup_details";

		ResultSet signup_detail = st1.executeQuery(quary);
		while (signup_detail.next()) {
			if (signup_detail.getString(3).equals(user) && signup_detail.getString(4).equals(password)) {
				if((signup_detail.getString(5)).equalsIgnoreCase("Admin")) {
				val = 1;
				}
				if((signup_detail.getString(5)).equalsIgnoreCase("User")) {
				
				val = 2;
				}
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
	public int checkAdmin(String Mail,Connection con)  throws Exception {
		int val = 0;
		Statement st1 = con.createStatement();
		
		String quary = "select * from admin";

		ResultSet admin_mails = st1.executeQuery(quary);
		while (admin_mails.next()) {
			if (admin_mails.getString(1).equals(Mail)) {
				val = 1;
			}
		}
		
		return val;
	}
	public int checkSignup(String Mail,Connection con)  throws Exception {
		int val = 0;
		Statement st1 = con.createStatement();
		
		String quary = "select * from signup_details";

		ResultSet signup_details = st1.executeQuery(quary);
		while (signup_details.next()) {
			if (signup_details.getString(1).equals(Mail)) {
				val = 1;
			}
		}
		
		return val;
	}
	
	
	public void addBus(Connection con) throws SQLException{
		  System.out.println("Enter the Bus Number : ");
		  String busNumber = sc.nextLine();
		  boolean found = false;
		  
		  String sql ="select * from Busses where busNumber=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,busNumber);
		  ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				found = true;
			}
			
		  if(found==false){
		  System.out.println("Enter the Bus Name : ");
		  String busName = sc.nextLine();
		  System.out.println("Enter the Departure of Bus : ");
		  String departureBus = sc.nextLine();
		  System.out.println("Enter the Destination of Bus : ");
		  String destinationBus = sc.nextLine();
		  Date departureTime =null;
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		  
		  try{
		    System.out.println("Enter the Bus Departure Time (dd-MM-yyyy HH:mm) : ");
		    String departureTime1 = sc.nextLine();
		    departureTime = sdf.parse(departureTime1);
		  
		    
		  System.out.println("Enter the Available Seats of Bus : ");
		  int availableSeats = sc.nextInt();
		  System.out.print("Enter number of Stops : ");
		  int numStops = sc.nextInt();
		  
		  String Stops1[] = new String[numStops];
		  
		  Stops1[0] = departureBus;
		  Stops1[Stops1.length-1] = destinationBus;
		  System.out.println("Enter the stops in between "+departureBus+" and "+destinationBus+"("+(numStops-2)+" Stops)");
		  sc.nextLine();
		  String Stops=departureBus+" ";
		  for(int i=1;i<numStops-1;i++){
		    Stops1[i] = sc.nextLine();
			  Stops = Stops+Stops1[i]+" ";
		  }
		  Stops = Stops+destinationBus;
		  float distanceOfStops1[] = new float[numStops];
		  String distanceOfStops ="0 ";
		  distanceOfStops1[0]=0;
		  for(int i=1;i<numStops;i++){
		    System.out.print("Enter "+Stops1[i-1]+" to "+Stops1[i]+" distance : ");
		    distanceOfStops1[i] = sc.nextFloat();
		    distanceOfStops = distanceOfStops+distanceOfStops1[i]+" ";
		  }
		  
		  String sql2 = "insert into busses values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
			pstmt2.setString(1, busNumber);
			pstmt2.setString(2, busName);
			pstmt2.setString(3, departureBus);
			pstmt2.setString(4, destinationBus);
			pstmt2.setString(5, departureTime1);
			pstmt2.setString(6, Stops);
			pstmt2.setString(7, distanceOfStops);
			pstmt2.setInt(8, availableSeats);
			
			pstmt2.executeUpdate();
		  
		    System.out.println("Bus added successfully");
		   
		}
		catch(Exception e){
		  System.out.println(e.getMessage());
		  }
		}
		else
		 System.out.println("Bus already exit");
		}
	public void removeBus(Connection con) throws SQLException {
		System.out.println("Enter the Bus Number : ");
		  String busNumber = sc.nextLine();
		  
		  String sql ="delete from Busses where busNumber=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,busNumber);
		  pstmt.executeUpdate();
		  System.out.println("Successfully bus deleted");
		 
	}
	
	public void viewAllBusses(Connection con) throws Exception{
		String sql ="select * from Busses";
		Statement stmt = con.createStatement();
	  ResultSet res = stmt.executeQuery(sql);
		while(res.next()) {
			System.out.println("-----------------------------------------");
			//System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5)+" "+res.getString(6)+" "+res.getString(7)+" "+res.getInt(8));
			System.out.println("Bus Number : "+res.getString(1));
			System.out.println("Bus Name : "+res.getString(2));
			System.out.println("Departure of Bus : "+res.getString(3));
			System.out.println("Destination of Bus : "+res.getString(4));

			Date departureTime =null;
			  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			    String departureTime1 = res.getString(5);
			    departureTime = sdf.parse(departureTime1);
			
			System.out.println("Departure Time : "+departureTime);
			System.out.println("Available Seats : "+res.getString(8));
			
		}
	}
	
	public void updateBus(Connection con) throws SQLException {
		
		System.out.println("Enter the Bus Number : ");
		  String busNumber = sc.nextLine();
		  boolean found = false;
		  
		  String sql ="select * from Busses where busNumber=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,busNumber);
		  ResultSet res = pstmt.executeQuery();
			while(res.next()) {
				found = true;
			}
			if(found=true) {
				boolean bb= true;
				while(bb) {
					System.out.println("1.Bus Name\n2.Departure Time\n3.Departure Stop\n4.Destination Stop\n5.Stops\n6.Back\nEnter option to Update");
					int update_Option = sc.nextInt();
					sc.nextLine();
					switch(update_Option) {
					case 1:String sql1 ="update Busses set busName=? where busNumber=?";
					   PreparedStatement pstmt1 = con.prepareStatement(sql1);
					   System.out.println("Enter new Bus Name to Update");
					   String new_busName = sc.nextLine();
					   pstmt1.setString(1,new_busName);
					   pstmt1.setString(2, busNumber);
					
					   pstmt1.executeUpdate();
					   
					   System.out.println("Successfully Bus Name Updated");
					break;
					case 2:String sql2 ="update Busses set departureTime=? where busNumber=?";
					   PreparedStatement pstmt2 = con.prepareStatement(sql2);
					   System.out.println("Enter new new departureTime(dd-MM-yyyy HH:mm) to Update");
					   String new_departureTime = sc.nextLine();
					   pstmt2.setString(1,new_departureTime);
					   pstmt2.setString(2, busNumber);
					
					   pstmt2.executeUpdate();
					
					   System.out.println("Successfully Departure Time Updated");
					   break;
					case 3:String sql3 ="update Busses set departureStop=? where busNumber=?";
					   PreparedStatement pstmt3 = con.prepareStatement(sql3);
					   System.out.println("Enter new new departure Stop to Update");
					   String new_departureStop = sc.nextLine();
					   pstmt3.setString(1,new_departureStop);
					   pstmt3.setString(2, busNumber);
					
					   pstmt3.executeUpdate();
					  
					   System.out.println("Successfully Departure Stop Updated");
					   break;
					case 4:String sql4 ="update Busses set destinationStop=? where busNumber=?";
					   PreparedStatement pstmt4 = con.prepareStatement(sql4);
					   System.out.println("Enter new new destination Stop to Update");
					   String new_destinationStop = sc.nextLine();
					   pstmt4.setString(1,new_destinationStop);
					   pstmt4.setString(2, busNumber);
					
					   pstmt4.executeUpdate();
					  
					   System.out.println("Successfully Destination Stop Updated");
					   break;
					case 5:String sql5 ="update Busses set Stops=? ,distanceOfStops=? where busNumber=?";
					   PreparedStatement pstmt5 = con.prepareStatement(sql5);
					   System.out.print("Enter number of Stops(>=2) : ");
						  int numStops = sc.nextInt();
						  sc.nextLine();
						  
						  String Stops1[] = new String[numStops];
						  
						  
						  String sql6 ="select * from Busses where busNumber=?";
						  PreparedStatement pstmt6 = con.prepareStatement(sql6);
						  
						   pstmt6.setString(1, busNumber);
						
						   ResultSet res1 = pstmt6.executeQuery();
							while(res1.next()) {
								Stops1[0] = res1.getString(3);
								
								Stops1[Stops1.length-1] = res1.getString(4);
								//System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getInt(5)+" "+res.getString(6));
							}
						  
							String Stops=Stops1[0]+" ";
						  System.out.println("Enter the stops in between "+Stops1[0]+" and "+Stops1[Stops1.length-1]+"("+(numStops-2)+" Stops)");
						 
						  for(int i=1;i<numStops-1;i++){
						    Stops1[i] = sc.nextLine();
							  Stops = Stops+Stops1[i]+" ";
						  }
						  Stops = Stops+Stops1[Stops1.length-1];
						  //System.out.println("Enter the Bus Name : ");
						  double distanceOfStops1[] = new double[numStops];
						  String distanceOfStops ="0.0 ";
						 // distanceOfStops1[0]=0;
						  for(int i=1;i<numStops;i++){
						    System.out.print("Enter "+Stops1[i-1]+" to "+Stops1[i]+" distance : ");
						    distanceOfStops1[i] = sc.nextDouble();
						    distanceOfStops = distanceOfStops+distanceOfStops1[i]+" ";
						  }
						  //System.out.println(Stops);
						  //System.out.println(distanceOfStops);
						  pstmt5.setString(1, Stops);
						  pstmt5.setString(2, distanceOfStops);
						  pstmt5.setString(3, busNumber);
						  int i =  pstmt5.executeUpdate();
						  
						  System.out.println("Successfully stops updated");
						  break;
					case 6:bb=false;
						  
						
					}
				}
			}
		  
	}
	
	
	
	
	
	public ResultSet findBus(Connection con ,String busNumber) throws SQLException{
		String sql ="select * from Busses where busNumber=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,busNumber);
	  ResultSet bus = pstmt.executeQuery();
	  if(bus.next())
		  return bus;
	  return null;
		}

	public int getRegistrationCounter(Connection con) throws SQLException {
		String sql ="select counter from RegistrationCounter limit 1";
		PreparedStatement pstmt = con.prepareStatement(sql);
	  ResultSet res = pstmt.executeQuery();
	  int counter=0;
		while(res.next()) {
			counter = res.getInt(1);
			//System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getInt(5)+" "+res.getString(6));
		}
		
		return counter;
	}
	
	public void updateRegistrationCounter(Connection con) throws SQLException {
		Online_Operations oop = new Online_Operations();
		String sql ="update RegistrationCounter set counter=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		int presentCounter = oop.getRegistrationCounter(con);
		pstmt.setInt(1, ++presentCounter);
	    pstmt.executeUpdate();
	  
	}
	
	public void makeReservation(Connection con,ResultSet passenger ,ResultSet bus,String departureStop,String destinationStop,double ticketPrice) throws SQLException{
		  LocalDateTime registrationTime1 = LocalDateTime.now();
		    
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		 
		  
		  String registrationTime = String.valueOf(registrationTime1);
		  Online_Operations oop = new Online_Operations();
		  String reservationNumber = "RN"+oop.getRegistrationCounter(con);
		  
		  String sql1 = "insert into Reservations values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt2 = con.prepareStatement(sql1);
			pstmt2.setString(1, reservationNumber);
			pstmt2.setString(2, bus.getString(1));
			pstmt2.setString(3, bus.getString(2));
			pstmt2.setString(4, departureStop);
			pstmt2.setString(5, destinationStop);
			pstmt2.setString(6, registrationTime);
			pstmt2.setString(7, passenger.getString(1));
			pstmt2.setInt(8, passenger.getInt(2));
			pstmt2.setString(9, passenger.getString(3));
			pstmt2.setDouble(10, ticketPrice);
			pstmt2.executeUpdate();
		  
			oop.updateRegistrationCounter(con);
		 
		  
		  //System.out.println("Reservation Succesfull");
		  //bus.setAvailableSeats(bus.getAvailableSeats()-1);
		}

		public void viewAllReservations(Connection con) throws SQLException{
			String sql ="select * from Reservations";
			PreparedStatement pstmt = con.prepareStatement(sql);
		  ResultSet reservations = pstmt.executeQuery();
		  while(reservations.next())
		  {
			  System.out.println("-------------------------------------------------------------------------");
			  System.out.println("reservationNumber : "+reservations.getString(1));
			  System.out.println("busNumber : "+reservations.getString(2));
              System.out.println("busName : "+reservations.getString(3));
			  System.out.println("departureStop : "+reservations.getString(4));
			  System.out.println("departureStop : "+reservations.getString(5));
			  System.out.println("registrationTime : "+reservations.getString(6));
			  System.out.println("passengerName : "+reservations.getString(7));
			  System.out.println("passengerAge : "+reservations.getInt(8));
			  System.out.println("passengerGender : "+reservations.getString(9));
			  System.out.println("ticketPrice : "+reservations.getDouble(10));
			}
		}
		
		public void viewAllReservationsByBus(Connection con) throws SQLException {
			System.out.println("Enter bus number");
			String busNumber = sc.nextLine();
			String sql ="select * from Reservations where busNumber=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, busNumber);
		  ResultSet reservations = pstmt.executeQuery();
		  while(reservations.next())
		  {
			  System.out.println("-------------------------------------------------------------------------");
			  System.out.println("reservationNumber : "+reservations.getString(1));
			  System.out.println("busNumber : "+reservations.getString(2));
              System.out.println("busName : "+reservations.getString(3));
			  System.out.println("departureStop : "+reservations.getString(4));
			  System.out.println("departureStop : "+reservations.getString(5));
			  System.out.println("registrationTime : "+reservations.getString(6));
			  System.out.println("passengerName : "+reservations.getString(7));
			  System.out.println("passengerAge : "+reservations.getInt(8));
			  System.out.println("passengerGender : "+reservations.getString(9));
			  System.out.println("ticketPrice : "+reservations.getDouble(10));
			}
		}
		
		
		//Selecting departure Stop
		public List selectDepartureStop(Connection con,ResultSet bus) throws SQLException{
		  String Stops= bus.getString(6);
		 
		  String[] departureStops = Stops.split(" ");
		  System.out.println("---Available Stops For Departure are---");
		  for(int i=0;i<departureStops.length-1;i++){
		    System.out.println((i+1)+" "+departureStops[i]);
		  }
		  System.out.print("Enter Your Departure (1-"+(departureStops.length-1)+") : ");
		  int departure = sc.nextInt();
		  if(departure>=1 && departure<departureStops.length){
		    List stop1 = new ArrayList();
		    stop1.add(departureStops[departure-1]);
		    stop1.add(departure-1);
		  return stop1;
		  }
		  else{
		    return null;
		  }
		}
		//Selecting Destination Stop
		public List selectDestinationStop(Connection con,ResultSet bus,Object stop) throws SQLException{
			String Stops= bus.getString(6);
			 
			  String[] destinationStops = Stops.split(" ");
		  int stop1 = (int)stop;
		   System.out.println("---Available Stops For Your Destination are---");
		  for(int i=stop1+1;i<destinationStops.length;i++){
		    System.out.println((i+1)+" "+destinationStops[i]);
		  }
		  System.out.print("Enter Your Destination ("+(stop1+2)+"-"+(destinationStops.length)+") : ");
		  int destination = sc.nextInt();
		  if(destination>=(stop1+2) && destination<=destinationStops.length){
		    List stop2 = new ArrayList();
		    stop2.add(destinationStops[destination-1]);
		    stop2.add(destination-1);
		    return stop2;
		  }
		  else{
		    return null;
		  }
		}
		//calculate payment
		public int calculatePayment(ResultSet bus,int departureStop,int destinationStop,int numSeats) throws SQLException{
		  String  distanceses= bus.getString(7);
		  String[] Distanceses= distanceses.split(" ");
		  float[] distances = new float[Distanceses.length];
		  for(int i=0;i<Distanceses.length;i++) {
			  distances[i] = Float.parseFloat(Distanceses[i]);
		  }
		  
		  float distance=0;
		  for(int i=departureStop;i<=destinationStop;i++){
		    distance = distance+distances[i];
		  }
		  int paymentPrice = ((int)(distance*1.5))*numSeats;
		  return paymentPrice;
		}
		//select payment options
		public boolean selectPaymentOption(){
		  System.out.println("**** Payment Options ****");
		  System.out.println("Enter payment option(1-3) : ");
		  boolean success=false;
		  for(int i=0;i<2;i++){
		    if(i==1)
		      System.out.println("Sorry,re-enter correct payment option(1-3) : ");
		    System.out.println("1.PhonePe");
		    System.out.println("2.GPay");
		    System.out.println("3.Paytm");
		    int n = sc.nextInt();
		    sc.nextLine();
		    if(n>=1 && n<=3){
		      success=true;
		      System.out.println("Payment Successful");
		      break;
		    }
		  }
		  if(success==false){
		    System.out.println("Payment Unsuccessful");
		  }
		  return success;
		}
	
		public void reduceAvailableSeats(Connection con,ResultSet bus,int numSeats) throws SQLException {
			int seats = bus.getInt(8);
			String busNumber = bus.getString(1);
			String sql = "update busses set availableSeats=? where busNumber=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,(seats-numSeats));
			pstmt.setString(2, busNumber);
			pstmt.executeUpdate();
		}
		public void increaseAvailableSeats(Connection con,ResultSet bus) throws SQLException {
			int seats = bus.getInt(8);
			String busNumber = bus.getString(1);
			String sql = "update busses set availableSeats=? where busNumber=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,(seats+1));
			pstmt.setString(2, busNumber);
			pstmt.executeUpdate();
		}
		
		//cancelling reservation
		public void cancelReservation(Connection con,ResultSet cancelReservations) throws SQLException, ParseException{
			String regNumber = cancelReservations.getString(1);
			String sql = "delete from reservations where reservationNumber=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,regNumber);
			
		  
			String sql1 = "select * from reservations where reservationNumber=?";
			PreparedStatement pstmt1 = con.prepareStatement(sql1);
			pstmt1.setString(1,regNumber);                                                                            
			
			String regTime="";
					
			ResultSet reserv = pstmt1.executeQuery();
			if(reserv.next()) {
				regTime=reserv.getString(6);
			}
			pstmt.executeUpdate();
			  System.out.println("Reservation Cancelled Successfully");
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		    
		    LocalDateTime cancellingTime = LocalDateTime.now(); 
		   System.out.println(cancellingTime);
		    LocalDateTime registrationTime = LocalDateTime.parse(regTime);
		    System.out.println(registrationTime);
		    Duration duration = Duration.between(registrationTime,cancellingTime);
		    //System.out.println(duration.getSeconds());
		    
		  if(duration.getSeconds()<3600){
		     int refundPayment = (int)(cancelReservations.getDouble(10)*90)/100;
		    System.out.println(+refundPayment+" is refunded in your account");
		   
		  }
		  else{
		    int refundPayment = (int)(cancelReservations.getDouble(10)*50)/100;
		    System.out.println(+refundPayment+" is refunded in your account");
		    
		  }
		  String busNumber = cancelReservations.getString(2);
		  Online_Operations oop = new Online_Operations();
		  ResultSet bus = oop.findBus(con ,busNumber);
		  increaseAvailableSeats(con,bus);
		  
		}
		
		
		public ResultSet findRegistrationNumber(Connection con,String regNumber) throws SQLException{
			
			String sql = "select * from reservations where reservationNumber=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, regNumber);
			ResultSet reservation = pstmt.executeQuery();
			  if(reservation.next()){
			    
			      return reservation;
			  }
			  return null;
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
class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
	
}

public class Bus_Tickt_Reservation {
	public static void main(String[] args) throws Exception{
		   
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bus_Ticket_Reservation","root","Swathi_17");
			Scanner sc = new Scanner(System.in);
			Online_Operations op = new Online_Operations();
			
			while(true) {
				System.out.println(
						"********Welcome to Online Bus Reservation System********\n1.Sign up\n2.Log in\n3.Close\nSelect one option");
				int choice1 = sc.nextInt();
				sc.nextLine();
				boolean b1=false;
				int check1=0;
				switch(choice1) {
				case 1:
					System.out.println("Sign-up as a..\n1.Admin\n2.User\n3.Back\nSelect One option");
					int choice2=sc.nextInt();
					sc.nextLine();
					if(choice2==3)
						continue;
					
					String signup_type = "";
					if(choice2==1)
					signup_type = "Admin";
					else if(choice2==2)
						signup_type = "User";
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
					if(op.checkSignup(Mail,con)==0) {
						if(choice2==1) {
					if((op.checkAdmin(Mail,con))==0) {
						System.out.println("You are not able to sign-up as Admin");
						break;
					}
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
					pstmt.setString(5, signup_type);
					
					pstmt.executeUpdate();
					b1=true;
					if(signup_type.equals("Admin")) {
						check1=1;
					}
					else
						check1=2;
					pstmt.close();
					}
					else
						System.out.println("Already signuped");
				break;
				case 2 :
					int count=0;
					System.out.println("Log-in...");
					//sc.nextLine();
					
					while(count<2) {
						if(count!=0) {
					System.out.println("Invalid User Name or Password");
					System.out.println("Re-LogIn...");}
					System.out.print("Enter User Name: ");
					String aUserName = sc.nextLine();
					System.out.print("Enter Password: ");
					String aPass = sc.nextLine();
					check1 = op.userVerification(aUserName, aPass,con);
					if(check1==0)
						count++;
					else {
						count=2;
					b1=true;
					}
					}
					
					
				break;
				default :
				System.out.println("Shut Down......");
				System.exit(0);
				
				
			}
				int choice3=0;
				if(check1>0) {
					if(check1==1) {
						
						choice3=1;
					}
					else
						choice3=2;
				}
				switch(choice3) {
				case 0:System.out.println("Invalid User Name or Password");
				System.out.println("Re-LogIn...");
				break;
				
				case 1: boolean bb1=true;
				while(bb1) {
					System.out.println("**************Welcome to the Admin Section**************");
				System.out.println("1.Add Bus\n2.Remove Bus\n3.Update Bus\n4.View All Buses\n5.View All Reservations\n6.View All Reservations By Bus\n7.Log-Out\nSelect one option");
				int choice4 = sc.nextInt();
				sc.nextLine();
				switch(choice4) {
				case 1 : op.addBus(con);
				break;
				case 2: op.removeBus(con);
				break;
				case 3: op.updateBus(con);
				break;
				case 4: op.viewAllBusses(con);
				break;
				case 5: op.viewAllReservations(con);
				break;
				case 6: op.viewAllReservationsByBus(con);
				break;
				default :bb1=false;
				}
				}
				break;
				case 2 : boolean bb2=true;
				while(bb2) {
					System.out.println("************Welcome to the Users Section**************");
				System.out.println("1.View All Buses\n2.Make Reservation\n3.Cancal Reservation\n4.Log-Out\nSelect one option");
				int choice5 = sc.nextInt();
				sc.nextLine();
				switch(choice5) {
				case 1 : op.viewAllBusses(con);
				break;
				case 2: System.out.print("Enter Bus Number : ");
		        String busNum = sc.nextLine();
		            ResultSet bus = op.findBus(con,busNum);
		          if(bus!=null){
		          List departureStops = op.selectDepartureStop(con,bus);
		          if(departureStops!=null){
		          String departureStop = (String)departureStops.get(0);
		          List destinationStops = op.selectDestinationStop(con,bus,departureStops.get(1));
		          if(destinationStops!=null){
		            String destinationStop = (String)destinationStops.get(0);
		          if(destinationStop!=null){
		            System.out.println("Enter number of seats want to book");
		            int numSeats = sc.nextInt();
		            sc.nextLine();
		            //List<Passenger> passengers = new ArrayList<>();
		            if(bus.getInt(8)>=numSeats){
		              for(int i=0;i<numSeats;i++){
		                System.out.println("Enter Passenger "+(i+1)+" Name :");
		                String name = sc.nextLine();
		                System.out.println("Enter Passenger "+(i+1)+" Gender :");
		                String gender = sc.nextLine();
		        
		                System.out.println("Enter Passenger "+(i+1)+" age :");
		                int age = sc.nextInt();
		                if(age<=0) {
		                	try {
		                	throw new InvalidAgeException("Invalid Age ! !");
		                	                         
		                	}
		                	catch(InvalidAgeException e) {
		                		System.out.println(e.getMessage());
		                		System.out.println("Age Should Be positive ! !\nRe-Enter Age ");
		                		age = sc.nextInt();
		                	}
		                	
		                }
		                String sql2 = "insert into Passenger values(?,?,?)";
		    			PreparedStatement pstmt1 = con.prepareStatement(sql2);
		    			pstmt1.setString(1, name);
		    			pstmt1.setInt(2, age);
		    			pstmt1.setString(3, gender);
		    			
		    			pstmt1.executeUpdate();
		                //brs.makeReservation(passenger,bus,departureStop,destinationStop);
		                
		                sc.nextLine();
		              }
		              int stop1 = (int)departureStops.get(1);
		              int stop2 = (int)destinationStops.get(1);
		              int paymentPrice = op.calculatePayment(bus,stop1,stop2,numSeats);
		              System.out.println("-------------------------------");
		              System.out.println("Yours Pyment Price is : "+paymentPrice);
		              System.out.println("-------------------------------");
		              boolean success = op.selectPaymentOption();
		              if(success){
		            	  String sql ="select * from Passenger ";
		      			PreparedStatement pstmt = con.prepareStatement(sql);
		      		  ResultSet res1 = pstmt.executeQuery();
		      		  
		      		 // System.out.println(success);
		      			while(res1.next()) {
		      				//System.out.println(success);
		      				op.makeReservation(con,res1,bus,departureStop,destinationStop,paymentPrice/numSeats);
		      				//System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getInt(5)+" "+res.getString(6));
		      			}
		                
		      			String sql2 ="truncate table Passenger";
		      			PreparedStatement pstmt2 = con.prepareStatement(sql2);

		      		    pstmt2.execute();
		      		    
		      		    op.reduceAvailableSeats(con,bus,numSeats);
		      			
		                System.out.println("Reservation Succesfull");
		              }
		            }
		            else
		              System.out.println(numSeats+" seats are not available");
		          }
		            else
		            System.out.println("Invalid Destination");
		          }
		          else
		            System.out.println("Invalid Designation");
		          }
		          
		        if(bus==null){
		          System.out.println("Bus not found");
		        }
		      }
		      break;
				case 3:
			        System.out.println("Enter Registration Number to Cancel");
			        String regNumber1 = sc.nextLine();
			        String regNumber = regNumber1.toUpperCase();
			        ResultSet cancelReservation = op.findRegistrationNumber(con,regNumber);
			        if(cancelReservation!=null){
			          op.cancelReservation(con,cancelReservation);
			        }
			        else{
			          System.out.println("Registration Number is not found");
			        }
			        break;
				default: bb2=false;
				}
				}
				}
				
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
