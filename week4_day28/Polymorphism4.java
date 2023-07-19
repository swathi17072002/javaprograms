/*Create a base class called Employee with a method calculateSalary(). Derive two classes Manager and Developer from Employee. Implement the calculateSalary() method in each derived class to calculate the salary based on the role (e.g., managers receive a fixed bonus, developers receive a salary based on hours worked). Use polymorphism to create objects of Manager and Developer and call the calculateSalary() method on each object.*/
import java.util.Scanner;
class Employee{
  String name;
  double salary;
  double calculateSalary(){
    return 0;
  }
}
class Manager extends Employee{
  double salary;
  Manager(String name1,double salary1){
    name = name1;
    salary = salary1;
  }
  
  double calculateSalary(){
    return salary;
    //System.out.println("Salary of the Manager is "+salary);
  }
  
  public void displayManagerDetails(){
    System.out.println("* * * * * Manager Details * * * * *");
    System.out.println("name : "+name);
    
    System.out.println("Salary : "+calculateSalary());
    
  }
}
class Developer extends Employee{
  int numOfHours;
  float salaryPerHour;
  Developer(String name1,int n,float salary){
    name = name1;
    numOfHours = n;
    salaryPerHour = salary;
  }
  double calculateSalary(){
    salary = salaryPerHour*numOfHours;
    return salary;
  }
  
  public void displayDeveloperDetails(){
    System.out.println("* * * * * Developer Details * * * * *");
    System.out.println("name : "+name);
    System.out.println("Salary : "+calculateSalary());
  }
}
public class Polymorphism4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Manager m1 = new Manager("Swathi",70000);
    Developer d1 = new Developer("Anusha",100,200);
    m1.displayManagerDetails();
    d1.displayDeveloperDetails();
  }
}