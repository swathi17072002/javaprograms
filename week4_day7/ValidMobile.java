/*write a java program to check whether number is a valid mobile number or not( A number is valid mobile  number if it contains 10 digits)(use  only conditionals)(use loops)*/
import java.util.Scanner;
class ValidMobile{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  long m_number ,count=0;
  System.out.println("enter number");
  m_number = sc.nextLong();
  long mobile_number = m_number;
  while(m_number!=0)
    {
       count=count+1;
       m_number = m_number/10;
    }
  if(count==10)
  System.out.println(mobile_number+" is a valid mobile number");
  else
    System.out.println(mobile_number+" is not a valid mobile number");
}
}