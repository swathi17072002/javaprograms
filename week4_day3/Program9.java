/*Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.*/
import java.util.Scanner;
public class Program9{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int choice;
    float temp;
    System.out.println("enter your choice");
    System.out.println("1. Celsius");
    System.out.println("2. Fahrenheit");
    choice = sc.nextInt();
    System.out.println("enter the temperature according to choice");
    temp = sc.nextFloat();
    switch(choice)
      {
        case 1:
           System.out.println("temperature in Fahrenheit is :"+((temp*1.8)+32));
          break;
        case 2:
          System.out.println("temperature in  Celsius is :"+((temp-32)/1.8));
          break;
      }
  }
}