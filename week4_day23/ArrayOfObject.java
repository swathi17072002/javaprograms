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
  public void displayDancer(){
    System.out.println("Dancer details : ");
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

class Dancer extends Person{
  String expertDance;
  Dancer(String name1,int age1,String gender1,String expertDance1){
    super(name1,age1,gender1);
    expertDance = expertDance1;
  }
  public void displayDancer(){
    super.displayDancer();
     System.out.println("expertDance : "+expertDance);
    System.out.println();
  }
}

public class ArrayOfObject{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     Employee emp[] = new Employee[2];
     Dancer dan[] = new Dancer[2];
    for(int i=0;i<2;i++){
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
    for(int i=0;i<2;i++){
      System.out.println("enter Dancer name");
      String name1 =sc.nextLine();
      System.out.println("enter Dancer age");
      int age1 = sc.nextInt();
      sc.nextLine();
      System.out.println("enter Dancer gender");
      String gender1 = sc.nextLine();
      System.out.println("enter Dancer expertDance");
      String expertDance1 = sc.nextLine();
      dan[i] = new Dancer(name1,age1,gender1,expertDance1);
    }
    for(int i=0;i<2;i++){
    emp[i].displayEmployee();
    }
    for(int i=0;i<2;i++){
    dan[i].displayDancer();
    }
  }
}