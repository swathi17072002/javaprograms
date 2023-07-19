/*Create a base class called Shape with a method calculateArea(). Derive three classes Rectangle, Circle, and Triangle from Shape. Implement the calculateArea() method in each derived class to calculate the area of the respective shape. Use polymorphism to create an array of Shape objects and call the calculateArea() method on each object.*/
import java.util.Scanner;
class Shape{
  void calculateArea(){
    System.out.println("Area of shape is calculated");
  }
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
public class Polymorphism1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Shape shape[] = new Shape[3];
    System.out.println("Enter length and breadth of the Rectangle");
    float length = sc.nextFloat();
    float breadth = sc.nextFloat();
    System.out.println("Enter radius of the Circle");
    float radius = sc.nextFloat();
    System.out.println("Enter height and base of the Triangle");
    float height = sc.nextFloat();
    float base = sc.nextFloat();
    
    shape[0] = new Rectangle(length,breadth);
    shape[1] = new Circle(radius);
    shape[2] = new Triangle(height,base);
    
    shape[0].calculateArea();
    shape[1].calculateArea();
    shape[2].calculateArea();
  }
}