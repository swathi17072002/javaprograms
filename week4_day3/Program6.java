/*Leap year checker: Create an application that takes a year as input and checks if it's a leap tear.Use conditional statements to determine if the year is leap year based on the rules for determining leap years.*/
import java.util.Scanner;
public class Program6{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int year;
    System.out.println("enter the year");
    year = sc.nextInt();
    if (year%4==0)
         {
           if ( year%100==0)
            {
               if (year%400==0)
                {
                  System.out.println( "year is leap year");
                }
               else
                {
                   System.out.println("year is not a leap year");
                }
            }
           else
            {
                System.out.println( "year is leap year");
            }
         }
        else
         { 
           System.out.println("year is not a leap year");
         }
      }
  }