import java.util.Scanner;
class Employee{
  String name;
  int id;
  double salary;
  Employee(String name,int id,double salary){
    this.name = name;
    this.id = id;
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
public class Example4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Employee emp[] = new Employee[3];
    String name;
    int id;
    double salary;
    for(int i=0;i<3;i++){
      System.out.println("enter name");
      name = sc.nextLine();
      System.out.println("enter id");
      id = sc.nextInt();
      System.out.println("enter salary");
      salary = sc.nextDouble();
      sc.nextLine();
      emp[i] = new Employee(name,id,salary);
      
    }
    for(int i=0;i<3;i++){
      System.out.println("employee "+(i+1)+" details are :");
      System.out.println("name : "+emp[i].getName());
      System.out.println("id : "+emp[i].getId());
      System.out.println("salary : "+emp[i].getSalary());
    }
  }
}
   