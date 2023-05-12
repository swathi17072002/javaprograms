/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000 else add "medium"*/
import java.util.Scanner;
import java.lang.Math;
public class Program3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float num;
    System.out.println("enter number");
    num = sc.nextFloat();
    if(num==0)
      System.out.println("zero");
    else if(num<0)
        System.out.println("negative");
    else
        System.out.println("positive");
    if((Math.abs(num))<1)
       System.out.println("small");
    else if((Math.abs(num))>1000000)
       System.out.println("large");
    else
      System.out.println("medium");
  }
}