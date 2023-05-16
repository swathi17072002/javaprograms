// WAP to calculate factorial of a number.
import java.util.Scanner;

public class FactorialOfNum{
  public static void main(String[] args){
    FindFactorial ff = new FindFactorial();
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("enter the num");
    num = sc.nextInt();
    int fact_num=ff.factorial(num);
    System.out.println("factorial of "+num+" is "+fact_num);
  }
}
class FindFactorial{
  public int factorial(int n){
    int fact=1,i=1;
    while(i<=n)
      {
        fact = fact*i;
        i++;
      }
    return fact;
  }
}