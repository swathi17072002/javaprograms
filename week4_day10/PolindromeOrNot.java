//WAP to check whether a number is palindrome or not.
import java.util.Scanner;

public class PolindromeOrNot{
  public static void main(String[] args){
    Polindrome p = new Polindrome();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter the positive integer");
    n = sc.nextInt();
    boolean b = p.isPolindrome(n);
    if(b)
      System.out.println(n+" is a polindrome number");
    else
      System.out.println(n+" is not a polindrome number");
  }
}
class Polindrome{
  public boolean isPolindrome(int num){
    int digit,rev_number=0;
    int dup_num=num;
    while(num!=0)
      {
        digit = num%10;
        rev_number = (rev_number*10)+digit;
        num = num/10;
      }
      if(dup_num==rev_number)
        return true;
      else
        return false;
  }
}