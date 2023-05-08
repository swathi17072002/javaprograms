/*Given two non-negative integers low and high,find the count of odd numbers between low and high (inclusive). use conditional statements only(not loops)*/

import java.util.Scanner;
public class Program4{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int low ,high,count=0;
    System.out.println("enter low value");
    low = sc.nextInt();
    System.out.println("enter high value");
    high = sc.nextInt();
    if(low%2!=0 && high%2!=0 || low%2!=0 && high%2==0|| low%2==0 && high%2!=0)
      count = ((high-low)/2)+1;
    else
      count = ((high-low)/2);
    System.out.println("number of odd numbers are "+count);
  }
}