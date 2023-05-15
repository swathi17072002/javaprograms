// WAP to calculate sum of digits of a number.
import java.util.Scanner;
class SumOfDigits{
  public void sum(){
    Scanner sc = new Scanner(System.in);
    int n,digit,sum;
    System.out.println("enter n value");
    n = sc.nextInt();
    int dup_n = n;
    if(n<=0)
        System.out.println("enter positive number only");
    else{
      for(sum=0;n>0;n=n/10){
        digit = n%10;
        sum = sum+digit;
      }
      System.out.println("sum of digits of "+dup_n+" is "+sum);
    }
  }
}
public class SumOfDigitsOfNumber{
  public static void main(String[] args){
    SumOfDigits sod = new SumOfDigits();
    sod.sum();
  }
}