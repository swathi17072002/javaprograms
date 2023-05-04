// WAP to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;
public class Program3{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("enter the number");
    num = sc.nextInt();
    if (num%5==0 && num%11==0)
    {
      System.out.println("number is divisible by 5 and 11");
    }
    else
    {
       System.out.println("number is not divisible by 5 and 11");
    }
  }
}