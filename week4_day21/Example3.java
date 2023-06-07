import java.util.Scanner;
class Employee{
  String name;
  int id;
  double salary;
  
}
public class Example3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Employee emp[] = new Employee[3];
    emp[0] = new Employee();
    emp[1] = new Employee();
    emp[2] = new Employee();
    for(int i=0;i<3;i++){
      System.out.println("enter employee name");
      emp[i].name = sc.nextLine();
      System.out.println("enter employee id");
      emp[i].id = sc.nextInt();
      System.out.println("enter employee salary");
      emp[i].salary = sc.nextDouble();
      sc.nextLine();
    }
    for(int i=0;i<3;i++){
      System.out.println("employee name : "+emp[i].name);
      System.out.println("employee id : "+emp[i].id);
      System.out.println("employee salary : "+emp[i].salary);
      System.out.println();
    }
  }
}