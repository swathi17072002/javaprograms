class Employee{
  String name;
  int id;
  double salary;
  public void printDetails(){
    System.out.println("name : "+name);
    System.out.println("id : "+id);
    System.out.println("salary : "+salary);
  }
}
public class Example1{
  public static void main(String[] args){
    Employee e1 = new Employee();
    e1.name = "swathi";
    e1.id = 1;
    e1.salary = 25000;
    e1.printDetails();
    Employee e2 = new Employee();
    e2.name = "srinivas";
    e2.id = 2;
    e2.salary = 30000;
    e2.printDetails();
    Employee e3 = new Employee();
    e3.name = "varsha";
    e3.id = 3;
    e3.salary = 20000;
    e3.printDetails();
  }
}
