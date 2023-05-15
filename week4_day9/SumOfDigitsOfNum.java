// WAP to calculate sum of digits of a number.
import java.util.Scanner;
class SumOfDigits{
  public void sum(){
    Scanner sc = new Scanner(System.in);
    int n,digit,sum=0;
    System.out.println("enter n value");
    n = sc.nextInt();
    int dup_n = n;
    if(n<=0)
        System.out.println("enter positive number only");
    else{
      do{
        digit = n%10;
        sum = sum+digit;
        n = n/10;
      }while(n>0);
      System.out.println("sum of digits of "+dup_n+" is "+sum);
    }
  }
}
public class SumOfDigitsOfNum{
  public static void main(String[] args){
    SumOfDigits sod = new SumOfDigits();
    sod.sum();
  }
}