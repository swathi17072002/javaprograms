/*Write a Java program that prompts the user to enter their age and prints out the number of years left until they can retire (assuming retirement age is 65)*/
import java.util.Scanner;
public class Program3{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age;
    System.out.println("enter age");
    age = sc.nextInt();
    if(age<65)
      System.out.println("You will be retire after "+(65-age)+" years");
    else
      System.out.println("You are already retired ");
  }
}
      