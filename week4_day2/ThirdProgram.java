//program to find the simple intrest
import java.util.Scanner;

public class ThirdProgram {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float principal,time,rate_of_intrest,simple_intrest;
    System.out.println("enter the principal,time and rate of intrest ");
    principal=sc.nextFloat();
    time=sc.nextFloat();
    rate_of_intrest=sc.nextFloat();
    //calculating the simple intrest
    simple_intrest=(principal*time*rate_of_intrest)/100;
    System.out.println("simple intrest is "+simple_intrest);
  }
}