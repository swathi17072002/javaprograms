//WAP to check whether a number is Perfect number or not.
import java.util.Scanner;
public class PerfectOrNot{
  public static void main(String[] args){
    CheckPerfect cp = new CheckPerfect();   
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter the n value");
    n = sc.nextInt();
    boolean b = cp.isPerfect(n);
    if(b)
      System.out.println(n+" is a perfect number");
    else
      System.out.println(n+" is not a perfect number");
  }
}
class CheckPerfect{
  public boolean isPerfect(int num){
    int i=1,sum=0;
    int dup_num = num;
    while(i<num)
      {
        if(num%i==0)
          sum = sum+i;
        i++;
      }
    if(dup_num == sum)
      return true;
    else
      return false;
  }
}