import java.util.Scanner;
class Person{
  String name;
  int age;
  String gender;
  long mobileNumber;
  Person(String name,int age){
    this();
    this.name = name;
    this.age = age;
    System.out.println("double parametarized constructor");
  }
  Person(String name,int age,String gender,long mobileNumber){
    this(name,age);
    /*this.name = name;
    this.age = age;*/
    this.gender = gender;
    this.mobileNumber = mobileNumber;
    System.out.println("four parametarized constructor");
  }
  Person(){
    System.out.println("no-arg constructor");
  }
  
}

public class ThisInConstructorOverloading{
  public static void main(String[] args){
   // Person p1 = new Person("Swathi",20,"Female");
    Person p2 = new Person("Srinivas",45,"Male",1234567890);
    System.out.println("name : "+p2.name);
    System.out.println("age : "+p2.age);
    System.out.println("gender : "+p2.gender);
    System.out.println("mobilenumber : "+p2.mobileNumber);
  }
}
