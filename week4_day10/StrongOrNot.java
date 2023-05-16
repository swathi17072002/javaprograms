//WAP to check whether a number is Strong number or not.
import java.util.Scanner;
public class StrongOrNot{
  public static void main(String[] args){
    Strong s = new Strong();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter n value");
    n = sc.nextInt();
      boolean b = s.isStrong(n);
      if(b)
        System.out.println(n+" is a strong number");
     else
        System.out.println(n+" is not a strong number");
    
  }
}

class Strong{
    public boolean isStrong(int num){
      int digit,sum=0;
      int dup_num=num;
    while(num!=0)
      {
        digit = num%10;
        int j=1,factorial=1;
        while(j<=digit)
          {
            factorial = factorial*j;
            j++;
          }
        sum = sum+factorial;
        num = num/10;
      }
      if(sum==dup_num)
        return true;
      else
        return false;
          
    }
}