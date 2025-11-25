package project;

//Bus Reservation System
//import java.time.LocalDateTime;
//import java.time.ZoneId;
import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
class Passenger{
String name;
int age;
String gender;
long mobileNumber;
Passenger(String name,int age,String gender,long mobileNumber){
  this.name = name;
  this.age = age;
  this.gender = gender;
  this.mobileNumber = mobileNumber;
}
public String toString(){
  return name+" "+age+" "+gender+" "+mobileNumber;
}

}
class Bus{
private String busName;
private String busNumber;
private String departureBus;
private String destinationBus;
private Date departureTime;
private int availableSeats;

String Stops[] = new String[5];
float distanceOfStops[] = new float[5];
Bus(String busName,String busNumber,String departureBus,String destinationBus,Date departureTime,String[] Stops,float[] distanceOfStops,int availableSeats){
  this.busName = busName;
  this.busNumber = busNumber;
  this.departureBus = departureBus;
  this.destinationBus = destinationBus;
  this.departureTime = departureTime;
  this.availableSeats = availableSeats;
  this.Stops = Stops;
  this.distanceOfStops = distanceOfStops;
}
public String getBusName(){
  return busName;
}
public String getBusNumber(){
  return busNumber;
}
public String getDepartureBus(){
  return departureBus;
}
public String getDestinationBus(){
  return destinationBus;
}
public Date getDepartureTime(){
  return departureTime;
}
public void setAvailableSeats(int availableSeats){
  this.availableSeats = availableSeats;
}
public int getAvailableSeats(){
  return availableSeats;
}
public String[] getStops(){
  return Stops;
}
public float[] getDistanceOfStops(){
  return distanceOfStops;
}

}

class Reservation{
String reservationNumber;
Bus bus;
Passenger passenger;
String departureStop;
String destinationStop;
LocalDateTime registrationTime;
double ticketPrice;
Reservation(String reservationNumber,Bus bus,Passenger passenger,String departureStop,String destinationStop,LocalDateTime registrationTime,double ticketPrice){
  this.reservationNumber =reservationNumber;
  this.bus = bus;
  this.passenger = passenger;
  this.departureStop = departureStop;
  this.destinationStop = destinationStop;
  this.registrationTime = registrationTime;
  this.ticketPrice = ticketPrice;
}
public Bus getBus(){
  return bus;
}
public Passenger getPassenger(){
  return passenger;
}
public String getReservationNumber(){
  return reservationNumber;
}
public  String getDepartureStop(){
  return departureStop;
}
public  String getDestinationStop(){
  return destinationStop;
}
public  LocalDateTime getRegistrationTime(){
  return registrationTime;
}
public  double getTicketPrice(){
  return ticketPrice;
}
}

class BusReservationSystem{
List<Passenger> passengers = new ArrayList<>();
List<Bus> busses = new ArrayList<>();
List<Reservation> reservations = new ArrayList<>();
int registrationCounter=1;
Scanner sc = new Scanner(System.in);
//Adding bus
public void addBus(Bus bus){
  busses.add(bus);
}
public List<Bus> viewAllBusses(){
  return busses;
}

public Bus findBus(String busNumber){
  for(Bus bus : busses){
    if(busNumber.equalsIgnoreCase(bus.getBusNumber())){
      return bus;
    }
  }
  return null;
}
//make reservation
public void makeReservation(Passenger passenger ,Bus bus,String departureStop,String destinationStop,double ticketPrice){
  LocalDateTime registrationTime = LocalDateTime.now();
  Reservation reservation = new Reservation("RN"+registrationCounter++,bus,passenger,departureStop,destinationStop,registrationTime,ticketPrice);
  reservations.add(reservation);
  
  //System.out.println("Reservation Succesfull");
  bus.setAvailableSeats(bus.getAvailableSeats()-1);
}

public List<Reservation> viewAllReservations(){
  return reservations;
}
public Reservation findRegistrationNumber(String regNumber){
  for(Reservation reserv : reservations){
    if(regNumber.equalsIgnoreCase(reserv.getReservationNumber())){
      return reserv;
    }
  }
  return null;
}
//cancelling reservation
public void cancelReservation(Reservation cancelReservations){
  reservations.remove(cancelReservations);
  System.out.println("Reservation Cancelled Successfully");
  LocalDateTime cancellingTime = LocalDateTime.now();
  LocalDateTime registrationTime = cancelReservations.getRegistrationTime();
  Duration duration = Duration.between(registrationTime,cancellingTime);
  System.out.println(duration.getSeconds());
  if(duration.getSeconds()<3600){
     int refundPayment = (int)(cancelReservations.getTicketPrice()*90)/100;
    System.out.println(+refundPayment+" is refunded in your account");
  }
  else{
    int refundPayment = (int)(cancelReservations.getTicketPrice()*50)/100;
    System.out.println(+refundPayment+" is refunded in your account");
  }
  cancelReservations.getBus().setAvailableSeats(cancelReservations.getBus().getAvailableSeats()+1);
}
//Selecting departure Stop
public List selectDepartureStop(Bus bus){
  String[] departureStops = bus.getStops();
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
public List selectDestinationStop(Bus bus,Object stop){
  String[] destinationStops = bus.getStops();
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
public int calculatePayment(Bus bus,int departureStop,int destinationStop,int numSeats){
  float[] distances = bus.getDistanceOfStops();
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
//adding bus
public void addBus(){
  System.out.println("Enter the Bus Number : ");
  String busNumber = sc.nextLine();
  boolean found = false;
  for(Bus buss : busses){
    if(busNumber.equalsIgnoreCase(buss.getBusNumber())){
      found=true;
    }
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
    departureTime = sdf.parse(sc.nextLine());
  
  System.out.println("Enter the Available Seats of Bus : ");
  int availableSeats = sc.nextInt();
  System.out.print("Enter number of Stops : ");
  int numStops = sc.nextInt();
  
  String Stops[] = new String[numStops];
  Stops[0] = departureBus;
  Stops[Stops.length-1] = destinationBus;
  System.out.println("Enter the stops in between "+departureBus+" and "+destinationBus+"("+(numStops-2)+" Stops)");
  sc.nextLine();
  for(int i=1;i<numStops-1;i++){
    Stops[i] = sc.nextLine();
  }
  //System.out.println("Enter the Bus Name : ");
  float distanceOfStops[] = new float[numStops];
  distanceOfStops[0]=0;
  for(int i=1;i<numStops;i++){
    System.out.print("Enter "+Stops[i-1]+" to "+Stops[i]+" distance : ");
    distanceOfStops[i] = sc.nextFloat();
  }
  Bus bus = new Bus(busName,busNumber,departureBus,destinationBus,departureTime,Stops,distanceOfStops,availableSeats);
  busses.add(bus);
    System.out.println("Bus added successfully");
}
catch(Exception e){
  System.out.println(e.getMessage());
  }
}
else
 System.out.println("Bus already exit");
}
}

public class BusReservation7{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  BusReservationSystem brs = new BusReservationSystem();
  boolean bb =true;
  //SampleDateFormat dateTime = new SampleDateFormat();
  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
  try{
          Date departureTime1 = sdf.parse("21-08-2023 10:00");
          Date departureTime2 = sdf.parse("26-07-2023 14:30");
    String[] Stops1 ={"Vijayawada","Kodad ","Suryapeta","Choutuppal","Hyderabad"};
    float[] distanceOfStops1 = {0,100.9f,43.3f,88.2f,50f};
    
    String[] Stops2 ={"Hyderabad","Choutuppal","Suryapeta","Kodad","Vijayawada"};
    float[] distanceOfStops2 = {0,50f,88.2f,43.3f,100.9f};
  Bus bus1 = new Bus("ABC Travels","B001","Vijayawada","Hyderabad",departureTime1,Stops1,distanceOfStops1,40);
  Bus bus2 = new Bus("XYZ Travels","B002","Hyderabad","Vijayawada",departureTime2,Stops2,distanceOfStops2,45);
    brs.addBus(bus1);
    brs.addBus(bus2);
  }
  catch(Exception e){
    System.out.println(e.getMessage());
  }
  
  while(bb){
    System.out.println("*******Bus Reservation System*********");
    System.out.println("1.View All Busses");
    System.out.println("2.Make Reservation");
    System.out.println("3.View All Reservation");
    System.out.println("4.Cancel Reservation");
    System.out.println("5.Add Bus");
    System.out.println("6.Exit");
    System.out.print("Enter Your Choice (1-6) : ");
    int choice = sc.nextInt();
    switch(choice){
      case 1 : List<Bus> busses = brs.viewAllBusses();
               for(Bus bus : busses){
                 System.out.println(bus.getBusNumber()+"--"+bus.getBusName()+" ("+bus.getDepartureBus()+" to "+bus.getDestinationBus()+") on "+bus.getDepartureTime()+" "+bus.getAvailableSeats());
               }
        break;
      case 2 :System.out.print("Enter Bus Number : ");
        sc.nextLine();
        String busNum = sc.nextLine();
            Bus bus = brs.findBus(busNum);
          if(bus!=null){
          List departureStops = brs.selectDepartureStop(bus);
          if(departureStops!=null){
          String departureStop = (String)departureStops.get(0);
          List destinationStops = brs.selectDestinationStop(bus,departureStops.get(1));
          if(destinationStops!=null){
            String destinationStop = (String)destinationStops.get(0);
          if(destinationStop!=null){
            System.out.println("Enter number of seats want to book");
            int numSeats = sc.nextInt();
            sc.nextLine();
            List<Passenger> passengers = new ArrayList<>();
            if(bus.getAvailableSeats()>=numSeats){
              for(int i=0;i<numSeats;i++){
                System.out.println("Enter Passenger "+(i+1)+" Name :");
                String name = sc.nextLine();
                System.out.println("Enter Passenger "+(i+1)+" Gender :");
                String gender = sc.nextLine();
        
                System.out.println("Enter Passenger "+(i+1)+" age :");
                int age = sc.nextInt();
                System.out.println("Enter Passenger "+(i+1)+" Mobile Number :");
                long mobileNumber = sc.nextLong();
                Passenger passenger = new Passenger(name,age,gender,mobileNumber);
                passengers.add(passenger);
                //brs.makeReservation(passenger,bus,departureStop,destinationStop);
                
                sc.nextLine();
              }
              int stop1 = (int)departureStops.get(1);
              int stop2 = (int)destinationStops.get(1);
              int paymentPrice = brs.calculatePayment(bus,stop1,stop2,numSeats);
              System.out.println("-------------------------------");
              System.out.println("Yours Pyment Price is : "+paymentPrice);
              System.out.println("-------------------------------");
              boolean success = brs.selectPaymentOption();
              if(success){
                for(Passenger p : passengers){
                brs.makeReservation(p,bus,departureStop,destinationStop,paymentPrice/numSeats);
                }
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
      case 3:List<Reservation> reservation= brs.viewAllReservations();
        System.out.println("---- All Reservations are----");
        for(Reservation reserv : reservation){
         System.out.println("Registration Number : "+reserv.getReservationNumber()+", Bus : "+reserv.getBus().getBusName()+", ("+reserv.getDepartureStop()+"--"+reserv.getDestinationStop()+") , Passenger : "+reserv.getPassenger());
        }
        break;
      case 4 :
        sc.nextLine();
        System.out.println("Enter Registration Number to Cancel");
        String regNumber = sc.nextLine();
        Reservation cancelReservation = brs.findRegistrationNumber(regNumber);
        if(cancelReservation!=null){
          brs.cancelReservation(cancelReservation);
        }
        else{
          System.out.println("Registration Number is not found");
        }
        break;
      case 5 : brs.addBus();
        break;
      case 6 :
        bb=false;
    }
  }
}
}
