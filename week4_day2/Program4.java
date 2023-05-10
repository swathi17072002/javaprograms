//WAP on bitwise operators

import java.util.Scanner;
public class Program4 {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("enter the values of a and b");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println(" a&b :"+(a&b));
    System.out.println(" a|b :"+(a|b));
    System.out.println(" a^b :"+(a^b));
    System.out.println(" ~a :"+(~a));
    System.out.println(" a<<2 :"+(a<<2));
    System.out.println(" a>>3 :"+(a>>3));
  }
}
