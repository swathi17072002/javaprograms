/*Write a Java program that prompts the user to enter three numbers and finds the maximum and minimum values.*/
import java.util.Scanner;
public class Program4{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3;
    System.out.println("enter the values of number1,number2 and number3");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();
    if ((num1>num2) && (num1>num3))
      System.out.println(num1+" is a maximum number");
    else if ((num2>num1) && (num2>num3))
      System.out.println(num2+" is a maximum number");
    else 
      System.out.println(num3+" is a maximum number");
    if ((num1<num2) && (num1<num3))
      System.out.println(num1+" is a minimum number");
    else if ((num2<num1) && (num2<num3))
      System.out.println(num2+" is a minimum number");
    else 
      System.out.println(num3+" is a minimum number");
  }
}
    
    
    