/*Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.*/

import java.util.Scanner;
public class Program3{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float temp;
    char ch;
    System.out.println("enter celsius or fahenheit");
    ch = sc.next().charAt(0);
    if(ch=='c'|| ch=='C')
    {
      System.out.println("enter the celsius temperature");
      temp = sc.nextFloat();
      System.out.println("temperature in Fahrenheit is "+((temp*1.8)+32));
    }
    else if(ch=='f'|| ch=='F')
    {
      System.out.println("enter the Fahrenheit temperature");
      temp = sc.nextFloat();
      System.out.println("temperature in Celsius is "+((temp-32)/1.8));
    }
    else
       System.out.println("invalid character");
  }
}