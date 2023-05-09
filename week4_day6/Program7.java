/*Write a Java program that prompts the user to enter three numbers and finds the maximum and minimum values.*/
import java.util.Scanner;
import java.lang.Math;
public class Program7{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3,maximum,minimum;
    System.out.println("enter the values of number1,number2 and number3");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();
    maximum = Math.max(Math.max(num1,num2),num3);
    minimum = Math.min(Math.min(num1,num2),num3);
    System.out.println("maximum number is "+maximum);
    System.out.println("minimum number is "+minimum);
  }
}
    
    