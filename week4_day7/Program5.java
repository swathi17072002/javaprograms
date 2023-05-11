//write a java program to check whether number is a valid mobile number or not( A number is valid mobile  number if it contains 10 digits)(use  only conditionals)(don't use loops)
import java.util.Scanner;
import java.math.BigInteger;
class Mobile_Number{
  public void mobile(){
    long number,max,min;
    max=9999999999L;
    min=0000000001;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the mobile number");
    number=sc.nextLong();
    if(number>=min && number<=max){
      System.out.println("The given "+number+" is valid ");
    }
    else
      System.out.println("The given "+number+" is not valid ");
  }
}
class Program5{
  public static void main(String[] args){
    Mobile_Number call=new Mobile_Number();
    call.mobile();
  }
 }