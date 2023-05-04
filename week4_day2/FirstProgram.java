import java.util.Scanner;

public class FirstProgram {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("enter the values of a and b");
    a=sc.nextInt();
    b=sc.nextInt();
    //printing addition of two numbers
    System.out.println("a + b ="+(a+b));
    //printing subtraction of two numbers
    System.out.println("a - b ="+(a-b));
    //printing multiplication of two numbers
    System.out.println("a * b ="+(a*b));
    //printing division of two numbers
    System.out.println("a / b ="+(a/b));
  }
}