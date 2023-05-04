/*Leap year checker: Create an application that takes a year as input and checks if it's a leap tear.Use conditional statements to determine if the year is leap year based on the rules for determining leap years.*/
import java.util.Scanner;
public class Program6{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int year,r;
    System.out.println("enter the year");
    year = sc.nextInt();
    r = (year%4==0)&&(year%400||year%100!=0));
    switch(r)
      {
        case 0:
          System.out.println("leap year")
          break;
        case 1:
           System.out.println("not a leap year")
          break;
      }
  }
}