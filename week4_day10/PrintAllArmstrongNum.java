// WAP to print all Armstrong numbers between 1 to n.
import java.util.Scanner;
public class PrintAllArmstrongNum{
  public static void main(String[] args){
    CheckArmstrong ca = new CheckArmstrong();
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("enter number");
    n = sc.nextInt();
    for(i=1;i<=n;i++){
    boolean b = ca.isArmstrong(i);
    if(b)
      System.out.println(i);
    }
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