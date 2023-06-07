import java.util.Scanner;
class Employee{
  String name;
  int id;
  double salary;
  void setName(String name){
    this.name = name;
  }
  void setId(int id){
    this.id = id;
  }
  void setSalary(double salary){
    this.salary = salary;
  }
  public String getName(){
    return name;
  }
   public int getId(){
    return id;
   }
 public double getSalary(){
    return salary;
 }
}
public class Example7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Employee emp[] = new Employee[3];
    for(int i=0;i<3;i++){
      emp[i] = new Employee();
      System.out.println("enter employee name");
      emp[i].setName(sc.nextLine());
      System.out.println("enter employee id");
      emp[i].setId(sc.nextInt());
      System.out.println("enter employee salary");
      emp[i].setSalary(sc.nextDouble());
      sc.nextLine();
    }
    for(int i=0;i<3;i++){
      System.out.println("employee "+(i+1)+" details are :");
      System.out.println("name is : "+emp[i].getName());
      System.out.println("id is : "+emp[i].getId());
      System.out.println("salary is : "+emp[i].getSalary());
      System.out.println();
    }
  }
}
    