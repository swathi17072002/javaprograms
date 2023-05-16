//WAP to count number of digits in a number.
import java.util.Scanner;
public class NumberOfDigits{
  public static void main(String[] args){
    CountDigits cd = new CountDigits();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter n value");
    n = sc.nextInt();
    int count = cd.noOfDigits(n);
    System.out.println("number of digits in "+n+" is "+count);
  }
}
class CountDigits{
  public int noOfDigits(int num){
    int digit,c=0;
    while(num!=0){
      c++;
      num = num/10;
    }
    return c;
  }
}