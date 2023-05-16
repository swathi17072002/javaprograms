// WAP to check whether a number is Armstrong number or not.
import java.util.Scanner;
public class ArmstrongOrNot{
  public static void main(String[] args){
    CheckArmstrong ca = new CheckArmstrong();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number");
    n = sc.nextInt();
    boolean b = ca.isArmstrong(n);
    if(b)
      System.out.println(n+" is a armstrong number");
    else
      System.out.println(n+" is not a armstrong number");
  }
}

class CheckArmstrong{
  public boolean isArmstrong(int num){
    int digit,sum=0,count=0,power_of_digit;
    int dup_num=num;
    while(num!=0)
      {
        count++;
        num=num/10;
      }
    num=dup_num;
    while(num!=0)
      {
        digit=num%10;
        power_of_digit =(int) Math.pow(digit,count);
        sum=sum+power_of_digit;
        num=num/10;
      }
    if(dup_num==sum)
      return true;
    else
      return false;
  }
}