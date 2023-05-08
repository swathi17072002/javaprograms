//WAP to to check year is leap year or not

import java.util.Scanner;
public class Program1 {
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
                  System.out.println(year+" is a leap year");
                }
               else
                {
                  System.out.println(year+" is not a leap year");
                }
            }
           else
            {
              System.out.println(year+" is a leap year");
            }
         }
        else
         { 
           System.out.println(year+" is not a leap year");
         }
  }
}
    