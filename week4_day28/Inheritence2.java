/*Inheritence
  Create a base class called Vehicle with properties color and fuelType and a method startEngine(). Derive two classes Car and Motorcycle from Vehicle. Implement the startEngine() method in each derived class to print a message indicating the vehicle type and engine start.*/
import java.util.Scanner;
class Vehicle{
  String color;
  String fuelType;
  Vehicle(String color,String fuelType){
    this.color = color;
    this.fuelType = fuelType;
  }
  public void startEngine(){
    
  }
}
class Car extends Vehicle{
  static boolean startEngine;
  Car(String color,String fuelType){
    super(color,fuelType);
  }
 public static void startEngine(boolean startEngine1){
     startEngine = startEngine1;
  }
  public boolean getStartEngine(){
    return startEngine;
  }
  public void displayCarDetails(){
    System.out.println("Type of the vehicle : Car");
    System.out.println("Engine start : "+getStartEngine());
  }
}
class Motorcycle extends Vehicle{
  static boolean startEngine;
  Motorcycle(String color,String fuelType){
    super(color,fuelType);
  }
  public static void startEngine(boolean startEngine1){
     startEngine = startEngine1;
  }
  public boolean getStartEngine(){
    return startEngine;
  }
  public void displayMotorcycleDetails(){
    System.out.println("Type of the vehicle : MotorCycle");
    System.out.println("Engine start : "+getStartEngine());
  }
}
public class Inheritence2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the colour of the car");
    String color1 = sc.nextLine();
    System.out.println("enter the fuelType of the car");
    String fuelType1 = sc.nextLine();
    System.out.println("enter the startEngine of the car");
    boolean startEngine1 = sc.nextBoolean();
    Car c1 = new Car(color1,fuelType1);
    Car.startEngine(startEngine1);

    sc.nextLine();
    System.out.println("enter the colour of the Motorcycle");
    String color2 = sc.nextLine();
    System.out.println("enter the fuelType of the Motorcycle");
    String fuelType2 = sc.nextLine();
    System.out.println("enter the startEngine of the Motorcycle");
    boolean startEngine2 = sc.nextBoolean();
    Motorcycle.startEngine(startEngine2);
    Motorcycle m1 = new Motorcycle(color2,fuelType2);

    c1.displayCarDetails();
    m1.displayMotorcycleDetails();
  }
}
 