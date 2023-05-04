//program to find the greatest number of two numbers
import java.util.Scanner;
public class Program3 {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3;
    System.out.println("enter the values of a and b");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = (num1>num2)?num1:num2;
    System.out.println("greatest number of "+num1+" and "+num2+" is "+num3);
  }
}