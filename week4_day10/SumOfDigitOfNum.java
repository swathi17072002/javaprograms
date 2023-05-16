// WAP to calculate sum of digits of a number.
import java.util.Scanner;

public class SumOfDigitOfNum{
  public static void main(String[] args){
    SumOfDigit sod = new SumOfDigit();
    Scanner sc = new Scanner(System.in);
    int n,sum;
    System.out.println("enter the positive integer");
    n = sc.nextInt();
    sum = sod.findSum(n);
      System.out.println("sum of digit of number "+n+" is "+sum);
  }
}
class SumOfDigit{
  public int findSum(int num){
    int digit,s=0;
    while(num!=0)
      {
        digit = num%10;
        s = s+digit;
        num = num/10;
      }
     return s;
  }
}