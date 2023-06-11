//multilevel inheritence
class Person{
  String name;
  int age;
  String gender;
}
class Employee extends Person{
  int id;
  String officeName;
  public void displayEmployee(){
    System.out.println("employee details : ");
  }
}
class Manager extends Employee{
  Manager(String name,int age,String gender,int id,String officeName){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.id = id;
    this.officeName = officeName;
      }
  
  public void display(){
    System.out.println("name : "+name+"\nage : "+age+"\ngender : "+gender+"\nid : "+id+"\nofficeName : "+officeName);
  }
  }
  
class MultiLevelInheritence{
  public static void main(String[] args){
    Manager m1 = new Manager("swathi",20,"female",11,"xyz");
    m1.displayEmployee();
    m1.display();
  }
}