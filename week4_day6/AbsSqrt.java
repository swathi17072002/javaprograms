/*write a java program to read two integers and calculate absolute value ,square root of two integers*/
import java.util.Scanner;
import java.lang.Math;
class FindAbsSqrt{
  public void absolSqrt() {
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    double sqrt_num1,sqrt_num2;
    System.out.println("enter the num1 and num2 values");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    System.out.println("absolute value of "+num1+" is "+(Math.abs(num1)));
    System.out.println("absolute value of "+num2+" is "+(Math.abs(num2)));
    sqrt_num1 = Math.sqrt(num1);
    sqrt_num2 = Math.sqrt(num2);
    System.out.println("sruare root of "+num1+" is "+sqrt_num1);
    System.out.println("sruare root of "+num2+" is "+sqrt_num2);
  }
}
public class AbsSqrt{
  public static void main(String[] args){
    FindAbsSqrt fas = new FindAbsSqrt();
    fas.absolSqrt();
  }
}