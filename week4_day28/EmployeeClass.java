import java.util.Scanner;
class Employee{
  String name;
  int id;
  int age;
  double salary;
  Employee(String name1,int id1,int age1,double salary1){
    name = name1;
    id = id1;
    age = age1;
    salary = salary1;
  }
  void display(){
    System.out.println("name : "+name);
    System.out.println("id : "+id);
    System.out.println("age : "+age);
    System.out.println("salary : "+salary);
    
  }
}
class EmployeeClass{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name");
    String name = sc.nextLine();
    System.out.println("Enter id");
    int id = sc.nextInt();
    System.out.println("Enter age");
    int age = sc.nextInt();
    System.out.println("Enter salary");
    double salary = sc.nextDouble();
    Employee e1 = new Employee(name,id,age,salary);
    e1.display();
  }
}