class Person{
  String name;
  String gender;
}
class Student extends Person{
  String clgName;
  Student(String s,String g,String n){
    name = s;
    gender = g;
    clgName = n;
  }
}
class Employee extends Person{
  String officeName;
  Employee(String s,String g,String n){
    name = s;
    gender = g;
    officeName = n;
  }
}
public class Inheritence1{
  public static void main(String[] args){
    Student s1 = new Student("swathi","female","Avanthi");
    Employee e1 = new Employee("srinivas","male","tcs");
    System.out.println("student details :");
    System.out.println("student name :"+s1.name);
    System.out.println("student gender :"+s1.gender);
    System.out.println("student college name :"+s1.clgName);
    System.out.println();
    System.out.println("employee details :");
    System.out.println("employee name :"+e1.name);
    System.out.println("employee gender :"+e1.gender);
    System.out.println("employee office name :"+e1.officeName);
  }
}