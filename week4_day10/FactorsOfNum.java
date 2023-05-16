//WAP to find all factors of a number.
import java.util.Scanner;
public class FactorsOfNum{
  public static void main(String[] args){
    Factors f = new Factors();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter the number");
    n = sc.nextInt();
    f.findFactors(n);
  }
}
class Factors{
  public void findFactors(int num){
    int i=1;
    while(i<=num)
      {
        if(num%i==0)
          System.out.println(i);
        i++;        
      }
  }
}