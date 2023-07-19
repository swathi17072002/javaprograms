/*Create a class called Car with private properties make, model, and year. Implement public methods to get and set the car's make, model, and year. Use encapsulation to protect the internal state of the car object and allow controlled access to its properties.*/
import java.util.Scanner;
class Car{
  private String make;
  private String model;
  private int year;
  public void setMake(String make1){
    make = make1;
  }
  public void setModel(String model1){
    model = model1;
  }
  public void setYear(int year1){
    year = year1;
  }
  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public int getYear(){
    return year;
  }
}
public class Encapsulation4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Car car = new Car();
    System.out.println("Enter the make of the car");
    car.setMake(sc.nextLine());
    System.out.println("Enter the model of the car");
    car.setModel(sc.nextLine());
    System.out.println("Enter the year of car invented");
    car.setYear(sc.nextInt());

    System.out.println("make of the car : "+car.getMake());
    System.out.println("model of the car : "+car.getModel());
    System.out.println("year of car invented : "+car.getYear());
  }
}