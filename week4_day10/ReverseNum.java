//WAP to enter a number and print its reverse.
import java.util.Scanner;

public class ReverseNum{
  public static void main(String[] args){
    Reverse r = new Reverse();
    Scanner sc = new Scanner(System.in);
    int n,rev_num;
    System.out.println("enter the positive integer");
    n = sc.nextInt();
    rev_num = r.findReverse(n);
      System.out.println("reverse num of "+n+" is "+rev_num);
  }
}
class Reverse{
  public int findReverse(int num){
    int digit,rev_number=0;
    while(num!=0)
      {
        digit = num%10;
        rev_number = (rev_number*10)+digit;
        num = num/10;
      }
     return rev_number;
  }
}