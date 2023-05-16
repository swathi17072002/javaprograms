// WAP to find first and last digit of a number.
import java.util.Scanner;
class FindFirstLast{
  public void firstLastDigit(int num){
    int digit,count=0;
    int dup_n = num;
      do{
          digit = num%10;
          count++;
          num = num/10;
      }while(num>0);
      int first_digit =dup_n/((int)(Math.pow(10,(count-1))));
      int last_digit = dup_n%10;
      System.out.println("first digit is "+first_digit);
      System.out.println("last digit is "+last_digit);
    
  }
}
public class FindFirstAndLastDigitOfNum{
  public static void main(String[] args){
    FindFirstLast ffl = new FindFirstLast();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter n value");
    n = sc.nextInt();
    ffl.firstLastDigit(n);
  }
}