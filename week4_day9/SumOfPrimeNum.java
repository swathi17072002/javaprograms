//write a java program to find sum of all prime numbers from 1 to n
import java.util.Scanner;
public class SumOfPrimeNum{
  public static void main(String[] args){
    Prime p = new Prime();
    int n,i,sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    n = sc.nextInt();
    for(i=1,sum=0;i<=n;i++){
      boolean b = p.isPrime(i);
      if(b)
        sum=sum+i;
    }
    System.out.println("sum of prime numbers from 1 to "+n+" is "+sum);
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