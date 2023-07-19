/*Create a class called Person with private properties name and age. Implement public getter and setter methods to access and modify these properties. Use encapsulation to protect the internal state of the Person object.*/
import java.util.Scanner;
class Person{
  private String name;
  private int age;
  public void setName(String name1){
    name = name1;
  }
  public void setAge(int age1){
    age = age1;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
}
public class Encapsulation1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Person p1 = new Person();
    System.out.println("Enter name");
    p1.setName(sc.nextLine());
    System.out.println("Enter age");
    p1.setAge(sc.nextInt());

    System.out.println("Name : "+p1.getName());
    System.out.println("Age : "+p1.getAge());
  }
}