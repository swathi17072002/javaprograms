/*Write a program that takes in two integers as input and outputs their sum if both the integers are even. If both integers are odd, output their product. If one of the integers is odd and the other is even, output their difference*/
import java.util.Scanner;
public class Program8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1,n2;
    System.out.println("enter the n1 and n2 values");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    if (n1%2==0 && n2%2==0)
        System.out.println("sum is "+(n1+n2));
    if (n1%2!=0 && n2%2!=0)
        System.out.println("product is "+(n1*n2));
    if ((n1%2==0 && n2%2!=0) || (n1%2!=0 && n2%2==0))
        System.out.println("difference is "+(n1-n2));
  }
}