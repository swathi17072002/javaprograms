//program to illustrate super() constructor
 
class Employee {
  String eid; // instance variables
  String ename;
  String eaddr;
 Employee(String eid1, String ename1, String eaddr1){
    eid=eid1;
    ename=ename1;
    eaddr=eaddr1;
 }
  Employee() 
  {
    System.out.println("superclass constructor");
  }
 
  public void getEmpDetails() // instance method
  {
    System.out.println("Employee Id :" + eid);
    System.out.println("Employee name :" + ename);
    System.out.println("Employee Address :" + eaddr);
  }
}
 
class Manager extends Employee {
  int managerid;
  
  Manager(String eid1, String ename1, String eaddr1, int id) {
    // calling the super class constructor
    //super(eid1, ename1, eaddr1);
    managerid = id;
    //super(eid1, ename1, eaddr1);
    /*eid=eid1;
    ename=ename1;
    eaddr=eaddr1;*/
 
  }
 
  public void getManagerDetails() { 
    System.out.println("manager Details");
    System.out.println("-----------------");
    getEmpDetails();
    System.out.println("managerid:" + managerid);
  }
}
 
class Accountant extends Employee {
  Accountant(String eid1, String ename1, String eaddr1) {
   // super(eid1, ename1, eaddr1);
    // super();
  }
 
  public void getAccountantDetails() {
    System.out.println("Accountant Details");
    System.out.println("--------------------");
    getEmpDetails();
  }
}
 
class SuperKeyword1 {
  public static void main(String[] args) {
    Manager m = new Manager("E-111", "AAA", "Hyd", 3);
    m.getManagerDetails();
    System.out.println();
   // Accountant acc = new Accountant("E-222", "BBB", "Hyd");
   // acc.getAccountantDetails();
  }
}