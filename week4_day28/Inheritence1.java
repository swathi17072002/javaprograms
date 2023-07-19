/*Inheritence
Create a base class called Shape with a method calculateArea(). Derive two classes Rectangle and Circle from Shape. Implement the calculateArea() method in each derived class to calculate the area of the rectangle and circle, respectively.*/
import java.util.Scanner;
class Shape{
  public void calculateArea(){
    System.out.println("***************area**************");
  }
}
class Rectangle extends Shape{
  float length;
  float breadth;
  Rectangle(float length,float breadth){
    this.length = length;
    this.breadth = breadth;
  }
  public void calculateArea(){
    super.calculateArea();
    System.out.println("area of the Rectangle is "+(length*breadth));
  }
}
class Circle extends Shape{
  float radius;
  Circle(float radius){
    this.radius = radius;
  }
  public void calculateArea(){
    super.calculateArea();
    System.out.println("area of the circle is "+(3.14f*radius*radius));
  }
}
public class Inheritence1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle");
    float length = sc.nextFloat();
    System.out.println("Enter the breadth of the rectangle");
    float breadth = sc.nextFloat();
    System.out.println("Enter the radius of the circle");
    float radius = sc.nextFloat();
    Rectangle r = new Rectangle(length,breadth);
    Circle c = new Circle(radius);
    r.calculateArea();
    c.calculateArea();
  }
}
