//program to read the name,age ,percentage and display the name,age and percentage
import java.util.Scanner;

public class SixthProgram {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    float percentage;
    System.out.println("enter the name");
    name=sc.nextLine();
    System.out.println("enter the age");
    age=sc.nextInt();
    System.out.println("enter the percentage");
    percentage=sc.nextFloat();
    System.out.println("entered name is "+name);
    System.out.println("entered age is "+age);
    System.out.println("entered percentage is "+percentage);
  }
}
    
