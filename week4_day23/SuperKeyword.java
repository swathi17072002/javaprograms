class Person{
  String name;
  int age;
  String gender;
  Person(String name1,int age1,String gender1){
    name = name1;
    age = age1;
    gender = gender1;
  }
  public void display(){
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
    super.display();
    System.out.println("id :"+id+"\nofficeName : "+officeName);
  }
}
class Manager extends Employee{
  Manager(String name,int age,String gender,int id,String officeName){
    super(name,age,gender,id,officeName);
      }
  }
  
public class SuperKeyword{
  public static void main(String[] args){
    Manager m1 = new Manager("swathi",20,"female",11,"xyz");
    m1.displayEmployee();
  }
}