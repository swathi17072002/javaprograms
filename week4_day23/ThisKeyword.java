//usage of these keyword in the constructor overloading.
import java.util.Scanner;
class Person{
  String name;
  int age;
  String gender;
  long mobileNumber;
  Person(String name,int age,String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  Person(String name,int age,String gender,long mobileNumber){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.mobileNumber = mobileNumber;
  }
  
}

public class ThisKeyword{
  public static void main(String[] args){
    Person p1 = new Person("Swathi",20,"Female");
    Person p2 = new Person("Srinivas",45,"Male",1234567890);
    System.out.println("name : "+p1.name);
    System.out.println("age : "+p1.age);
    System.out.println("gender : "+p1.gender);
    System.out.println("name : "+p2.name);
    System.out.println("age : "+p2.age);
    System.out.println("gender : "+p2.gender);
    System.out.println("mobilenumber : "+p2.mobileNumber);
  }
}
