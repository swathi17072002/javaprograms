//WAP on assignment operators

import java.util.Scanner;
public class Program2 {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,c,d,e;
    System.out.println("enter a value");      
    a = sc.nextInt();
    System.out.println("value of a is :"+a);
    b = a++;
    System.out.println("value of b is :"+b);
    c = ++a;
    System.out.println("value of c is :"+c);
    d = a--;
    System.out.println("value of d is :"+d);
    e = --a;
    System.out.println("value of e is :"+e);
  }
}
    
