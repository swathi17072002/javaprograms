// WAP to print all Prime numbers between 1 to n.
import java.util.Scanner;
public class PrintAllPrimeNumber{
  public static void main(String[] args){
    Prime p = new Prime();
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("enter n value");
    n = sc.nextInt();
    for(i=1;i<=n;i++){
    boolean b = p.isPrime(i);
      if(b)
        System.out.println(i);
    }
    }
  }

    class Prime{
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