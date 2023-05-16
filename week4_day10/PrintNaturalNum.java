// WAP to print all natural numbers from 1 to n. -     using while loop
import java.util.Scanner;
class NaturalNum{
public void pritNatNum(int num){
  int count=1;
  while(count<=num)
    {
      
      System.out.println(count);
      count++;
    }
}
}
public class PrintNaturalNum{
  public static void main(String[] args){
    NaturalNum nn = new NaturalNum();
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter n");
    n = sc.nextInt();
    nn.pritNatNum(n);
  }
}