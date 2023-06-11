import java.util.Scanner;

class Person{
  String name;
  int age;
  String gender;
  Person(String name1,int age1,String gender1){
    name = name1;
    age = age1;
    gender = gender1;
  }
  public void displayEmployee(){
    System.out.println("employee details : ");
     System.out.println("name : "+name+"\nage : "+age+"\ngender : "+gender);
}
}
class Employee extends Person{
  int id;
  String officeName;
  Employee(String name1,int age1,String gender1,int id1,String officeName1){
    super(name1,age1,gender1);
    id = id1;
    officeName = officeName1;
  }
  public void displayEmployee(){
    super.displayEmployee();
     System.out.println("id : "+id+"\nofficeName : "+officeName);
    System.out.println();
  }
}
public class ArrayOfObjects{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     Employee emp[] = new Employee[3];
    for(int i=0;i<3;i++){
      System.out.println("enter employee name");
      String name1 =sc.nextLine();
      System.out.println("enter employee age");
      int age1 = sc.nextInt();
      System.out.println("enter employee id");
      int id1 = sc.nextInt();
      sc.nextLine();
      System.out.println("enter employee gender");
      String gender1 = sc.nextLine();
      System.out.println("enter employee officename");
      String officeName1 = sc.nextLine();
      emp[i] = new Employee(name1,age1,gender1,id1,officeName1);
    }
    for(int i=0;i<3;i++){
    emp[i].displayEmployee();
    }
  }
}