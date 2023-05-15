/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
public static void main(String[] args){
/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
Scanner sc=new Scanner(System.in);
/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
  System.out.println("Enter a value ");
  int a=sc.nextInt();
  System.out.println("Enter b value ");
  int b=sc.nextInt();
   System.out.println("Enter c value ");
  int c=sc.nextInt();
  System.out.println("Enter d value ");
  int d=sc.nextInt();
  System.out.println("Enter e value ");
  int e=sc.nextInt();
  System.out.println("Enter f value ");
  int f=sc.nextInt();
  System.out.println("Enter g value ");
  int g=sc.nextInt();
  System.out.println("Enter h value ");
  int h=sc.nextInt();
  System.out.println("Enter i value ");
  int i=sc.nextInt();
  System.out.println("Enter j value ");
  int j=sc.nextInt();
//calculate difference,product,division,increment and remainder
int difference = a-b;
int product = c*d;
int division = e/f;
int increment = ++g;
int decrement = --h;
int remainder = i%j;
//print appropriate result for all operations
System.out.println("a - b = "+difference);
System.out.println("c * d = "+product);
System.out.println("e / f = "+division);
System.out.println("++g = "+increment);
System.out.println("--h = "+decrement);
System.out.println("i%j = "+remainder);
}
}