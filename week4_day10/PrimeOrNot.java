//write a java program to check whether a positive integer is prime or not
import java.util.Scanner;
public class PrimeOrNot{
  public static void main(String[] args){
    Prime p = new Prime();
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    n = sc.nextInt();
    if(n>0){
    boolean b = p.isPrime(n);
    if(b)
      System.out.println(n+" is a prime number");
    else
      System.out.println(n+" is not a prime number");
    }
    else
      System.out.println("enter positive number only");
  }
}
class Prime{
  public boolean isPrime(int num){
    int i,nf;
    for(i=1,nf=0;i<=num;i++)
      {
        if(num%i==0)
          nf = nf+1;
      }
    if(nf==2)
      return true;
    else
      return false;
  }
}