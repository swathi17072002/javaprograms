/*Write a Java program that prompts the user to enter three numbers and finds the maximum and minimum values.*/
import java.util.Scanner;
public class Program5{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3,maximum,minimum;
    System.out.println("enter the values of number1,number2 and number3");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();
    maximum = ((num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3));
    System.out.println("maximum value is "+maximum);
    minimum = ((num1<num2)?((num1<num3)?num1:num3):((num2<num3)?num2:num3));
    System.out.println("minimum value is "+minimum);
  }
}