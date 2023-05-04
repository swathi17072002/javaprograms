//program to swap two number without using third variable
import java.util.Scanner;

public class FifthProgram {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2,temp;
    System.out.println("enter num1 and num2 values ");
    num1=sc.nextInt();
    num2=sc.nextInt();
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
    System.out.println("value of num1 after swapping is "+num1);
    System.out.println("value of num2 after swapping is "+num2);
    
  }
}
    