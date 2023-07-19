/*Inheritence
  Create a base class called Person with properties name and age. Derive a class Student from Person with an additional property grade. Implement a method displayInfo() in the Person class to display the name and age, and override the displayInfo() method in the Student class to display the name, age, and grade.*/
import java.util.Scanner;
class Person{
  String name;
  int age;
  void displayInfo(){
    System.out.println("name : "+name);
    System.out.println("age : "+age);
  }
}
class Student extends Person{
  char grade;
  Student(String name,int age,char grade){
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
  void displayInfo(){
    super.displayInfo();
    //System.out.println("name : "+name);
    //System.out.println("age : "+age);
    System.out.println("grade : "+grade);
  }
}
public class Inheritence4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name");
    String name = sc.nextLine();
    System.out.println("Enter the age");
    int age = sc.nextInt();
    System.out.println("Enter the grade");
    char grade = sc.next().charAt(0);
    Student s1 = new Student(name,age,grade);
    s1.displayInfo();
  }
}
