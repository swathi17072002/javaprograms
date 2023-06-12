//program on method overriding
class Student{
  String name;
  int id;
  String branch;
  public void printDetails(){
    System.out.println("Student name : "+name);
    System.out.println("Student id : "+id);
    System.out.println("Student branch : "+branch);
  }
}
class Student1 extends Student{
  String college;
  Student1(String name,int id,String branch,String college){
    this.name = name;
    this.id = id;
    this.branch = branch;
    this.college = college;
  }
  
  //override
  public void printDetails(){
    super.printDetails();
    System.out.println("Student college : "+college);
  }
}

public class MethodOverriding1{
  public static void main(String[] args){
    Student1 s1 = new Student1("Swathi",411,"ECE","Avanthi");
    s1.printDetails();
  }
}