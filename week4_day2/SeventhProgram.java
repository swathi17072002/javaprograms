//program to read the income and age and display the true if income is greaterthan or equals to 50000 and age is greaterthan or equals to 20
import java.util.Scanner;

public class SeventhProgram {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double income;
    int age;
    System.out.println("enter the income and age");
    income = sc.nextDouble();
    age = sc.nextInt();
    if (income>=50000 && age>=20)
    {
      System.out.println("Both conditions are true");  
    } 
    else {
      System.out.println("atleast one of the two conditions is false"); 
    }
  }
}