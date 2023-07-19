/*Create a class called Employee with private properties name, position, and salary. Implement public methods to get the employee's name and position and set the employee's salary. Use encapsulation to ensure that the salary can only be modified through the defined method.*/
import java.util.Scanner;
class Employee{
  private String name;
  private String position;
  double salary;
  public void setName(String name1){
    name = name1;
  }
  public void setPosition(String position1){
    position = position1;
  }
  public void setSalary(double salary1){
    salary = salary1;
  }
  public String getName(){
    return name;
  }
  public String getPosition(){
    return position;
  }
  public double getSalary(){
    return salary;
  }
}
public class Encapsulation5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Employee emp = new Employee();
    System.out.println("Enter the Name of Employee");
    emp.setName(sc.nextLine());
    System.out.println("Enter the Position of Employee");
    emp.setPosition(sc.nextLine());
    System.out.println("Enter the Salary of Employee");
    emp.setSalary(sc.nextDouble());

    System.out.println("Name of the Employee : "+emp.getName());
    System.out.println("Position of the Employee : "+emp.getPosition());
    System.out.println("Salary of the Employee : "+emp.getSalary());
  }
}