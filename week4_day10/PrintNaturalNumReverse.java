//WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
class NaturalNum{
public void pritReverse(int num){
  int count=num;
  while(count>=1)
    {
      
      System.out.println(count);
      count--;
    }
}
}
public class PrintNaturalNumReverse{
  public static void main(String[] args){
    NaturalNum nn = new NaturalNum();
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter n");
    n = sc.nextInt();
    nn.pritReverse(n);
  }
}