interface Student1{
  String name1 ="Varsha";
  void read();
  void write();
}
interface Student2{
  String name2 ="Harika";
  void play();
  void eat();
}
class Student implements Student1,Student2{
  public void read(){
    System.out.println(name1+" can read the books");
  }
  public void write(){
    System.out.println(name1+" can write the notes");
  }
  public void play(){
    System.out.println(name2+" can play games");
  }
  public void eat(){
    System.out.println(name2+" can eat");
  }
}
public class InterfaceExample2{
  public static void main(String[] args){
    Student s = new Student();
    s.read();
    s.write();
    s.play();
    s.eat();
  }
}