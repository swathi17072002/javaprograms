//WAP to find sum of all prime numbers between 1 to n.
import java.util.Scanner;
public class SumOfPrimeNumber{
  public static void main(String[] args){
    SumOfPrime sop = new SumOfPrime();
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("enter n value");
    n = sc.nextInt();
    int sum_of_prime=0,prime;
    for(i=1;i<=n;i++){
    prime = sop.isPrime(i);
      sum_of_prime = sum_of_prime+prime;
    }
    System.out.println("sum of prime numbers from 1 to "+n+" is "+sum_of_prime);
    }
  }

    class SumOfPrime{
      public int isPrime(int num){
    if(num==1)
      return 0;
    else{
      int i,nf=0;
    for(i=1;i<=num;i++)
        if(num%i==0)
          nf = nf+1;
      if(nf==2)
        return num;
      else
        return 0;
    }
  }
    }