//write a java program to find sum of first digit and last digit of a positive integer
import java.util.Scanner;
class SumFirstLast{
  public void sum(){
    Scanner sc = new Scanner(System.in);
    int n,digit,sum=0,count=0;
    System.out.println("enter n value");
    n = sc.nextInt();
    int dup_n = n;
      do{
          digit = n%10;
          count++;
          n = n/10;
      }while(n>0);
      int first_digit =dup_n/((int)(Math.pow(10,(count-1))));
      int last_digit = dup_n%10;
      sum= first_digit+last_digit;
      System.out.println("sum of first and last digit of "+dup_n+" is "+sum);
  }
}
public class SumOfFirstDigitAndLastDigit{
  public static void main(String[] args){
    SumFirstLast sfl = new SumFirstLast();
    sfl.sum();
  }
}
        