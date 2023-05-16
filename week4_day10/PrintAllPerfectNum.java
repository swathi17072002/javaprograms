// WAP to print all Perfect numbers between 1 to n.
import java.util.Scanner;
public class PrintAllPerfectNum{
  public static void main(String[] args){
    CheckPerfect cp = new CheckPerfect();   
    Scanner sc = new Scanner(System.in);
    int n,i=1;
    System.out.println("enter the n value");
    n = sc.nextInt();
    for(i=1;i<=n;i++){
    boolean b = cp.isPerfect(i);
    if(b)
      System.out.println(i);
    }
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