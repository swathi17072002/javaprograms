/*Create an abstract class called Employee with properties name and salary. Add an abstract method calculateBonus(). Derive two classes Manager and Developer from Employee. Implement the calculateBonus() method in each derived class to calculate the bonus based on the salary. Use abstraction to ensure that the calculateBonus() method is implemented in each derived class.*/
import java.util.Scanner;
abstract class Employee{
  String name;
  double salary;
  abstract double calculateBonus(double bonus,double salary);
}
class Manager extends Employee{
  Manager(String name1,double salary1){
    name = name1;
    salary = salary1;
  }
  double calculateBonus(double bonus,double salary){
    double bonusAmount = (bonus*salary)/100;
    return bonusAmount;
  }
  public void displayManagerDetails(double bonus){
    System.out.println("* * * * * Manager Details * * * * *");
    System.out.println("name : "+name);
    System.out.println("salary : "+salary);
    //double salary1 = salary;
    System.out.println("bonus : "+this.calculateBonus(bonus,this.salary));
  }
}
class Developer extends Employee{
  Developer(String name1,double salary1){
    name = name1;
    salary = salary1;
  }
  double calculateBonus(double bonus,double salary){
    double bonusAmount = (bonus*salary)/100;
    return bonusAmount;
  }
  public void displayDeveloperDetails(double bonus){
    System.out.println("* * * * * Developer Details * * * * *");
    System.out.println("name : "+name);
    System.out.println("salary : "+salary);
    //double salary1 = salary;
    System.out.println("bonus : "+this.calculateBonus(bonus,this.salary));
  }
}
public class Abstraction3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name of Manager");
    String name1 = sc.nextLine();
    System.out.println("Enter salary of Manager");
    double salary1 = sc.nextDouble();
    System.out.println("Enter bonus(percentage) of Manager");
    double bonus1 = sc.nextDouble();
    Manager m1 = new Manager(name1,salary1);

    sc.nextLine();
    System.out.println("Enter name of Developer");
    String name2 = sc.nextLine();
    System.out.println("Enter salary of Developer");
    double salary2 = sc.nextDouble();
    System.out.println("Enter bonus(percentage) of Developer");
    double bonus2 = sc.nextDouble();
    Developer d1 = new Developer(name2,salary2);

    m1.displayManagerDetails(bonus1);
    d1.displayDeveloperDetails(bonus2);
  }
}