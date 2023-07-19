/*Create a base class called Vehicle with a method drive(). Derive two classes Car and Motorcycle from Vehicle. Implement the drive() method in each derived class to print a specific driving message. Create a function called testDrive() that takes a Vehicle object as a parameter and calls the drive() method on it. Demonstrate polymorphism by passing both a Car object and a Motorcycle object to the testDrive() function.*/
import java.util.Scanner;
class Vehicle{
  void drive(){
    
  }
}
class Car extends Vehicle{
  void drive(){
    System.out.println("Driving is done by stering");
  }
  void testDrive(Vehicle c1){
    c1.drive();
  }
}
class Motorcycle extends Vehicle{
  void drive(){
    System.out.println("Driving is done by handle");
  }
  void testDrive(Motorcycle m2){
    m2.drive();
  }
}
public class Polymorphism3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Vehicle vehicle[] = new Vehicle[2];
    vehicle[0] = new Car();
    vehicle[1] = new Motorcycle();
    vehicle[0].testDrive(vehicle[0]);
    vehicle[1].testDrive(vehicle[1]);
  }
}