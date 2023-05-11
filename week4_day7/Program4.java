/*write a java program to check whether number is a valid mobile number or not( A number is valid mobile  number if it contains 10 digits)(use  only conditionals)(don't use loops)*/
import java.util.Scanner;
class Program4{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  long m_number;
  System.out.println("enter number");
  m_number = sc.nextLong();
  if((m_number/1000000000)>=1 && (m_number/1000000000)<=9 )
      System.out.println(m_number+" is a valid mobile number");
  else
    System.out.println(m_number+" is not a valid mobile number");
}
}