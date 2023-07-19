/*Create an abstract class called Shape with an abstract method calculateArea(). Derive three classes Rectangle, Circle, and Triangle from Shape. Implement the calculateArea() method in each derived class to calculate the area of the respective shape. Use abstraction to ensure that the calculateArea() method is implemented in each derived class.*/
import java.util.Scanner;
abstract class Shape{
  abstract void calculateArea();
  }
class Rectangle extends Shape{
  float  length;
  float breadth;
  Rectangle(float length1,float breadth1){
    length = length1;
    breadth = breadth1;
  }
  void calculateArea(){
    System.out.println("Area of Rectangle is "+(length*breadth));
  }
}
class Circle extends Shape{
  float radius;
  Circle(float radius1){
    radius = radius1;
  }
  void calculateArea(){
    System.out.println("Area of Circle is "+(3.14f*radius*radius));
  }
}
class Triangle extends Shape{
  float height;
  float base;
  Triangle(float height1,float base1){
    height = height1;
    base = base1;
  }
   void calculateArea(){
    System.out.println("Area of Triangle is "+((base*height)/2));
  }
}
public class Abstraction2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length and breadth of the Rectangle");
    float length = sc.nextFloat();
    float breadth = sc.nextFloat();
    System.out.println("Enter radius of the Circle");
    float radius = sc.nextFloat();
    System.out.println("Enter height and base of the Triangle");
    float height = sc.nextFloat();
    float base = sc.nextFloat();
    
    Rectangle rectangle = new Rectangle(length,breadth);
    Circle circle = new Circle(radius);
    Triangle triangle = new Triangle(height,base);
    
    rectangle.calculateArea();
    circle.calculateArea();
    triangle.calculateArea();
  }
}