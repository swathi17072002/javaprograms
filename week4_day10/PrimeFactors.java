//WAP to find all prime factors of a number.
import java.util.Scanner;
public class PrimeFactors{
  public static void main(String[] args){
    CheckFactor cf = new CheckFactor();
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("enter number");
    n = sc.nextInt();
    cf.findFactor(n);
  }
}
class CheckFactor{
  public void findFactor(int num){
    int i;
    for(i=1;i<=num;i++){
      if(num%i==0){
        int j,nf=0;
    for(j=1;j<=i;j++)
        if(i%j==0)
          nf=nf+1;
      if(nf==2)
        System.out.println(i);
      }
    }
  }
}