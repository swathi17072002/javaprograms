//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places
import java.util.Scanner;
public class Program4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float num1,num2,difference;
    System.out.println("enter number1");
    num1 = sc.nextFloat();
    System.out.println("enter number2");
    num2 = sc.nextFloat();
    difference = num1-num2;
    if((Math.abs(difference))<0.001)
      System.out.println("same upto three numbers");
    else
       System.out.println("not same upto three numbers");
  }
}