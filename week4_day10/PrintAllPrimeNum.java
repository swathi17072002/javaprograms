//write a java program to print all prime numbers from 1 to n where n is an integer 
import java.util.Scanner;
public class PrintAllPrimeNum{
  public static void main(String[] args){
    PrimeOrNot pon = new PrimeOrNot();
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("enter n value");
    n = sc.nextInt();
    for(i=1;i<=n;i++){
    boolean b = pon.isPrime(i);
      if(b)
      System.out.println(i);
    }
    }
  }

    class PrimeOrNot{
      public boolean isPrime(int num){
    if(num<=1)
      return false;
    else{
      int i;
    for(i=2;i<num;i++)
        if(num%i==0)
          return false;
      return true;
    }
  }
    }
    