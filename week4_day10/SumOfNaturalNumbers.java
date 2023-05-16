//WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
class SumNaturalNum{
  public void sum(){
    Scanner sc = new Scanner(System.in);
    int num,i,sum=0;
    System.out.println("enter number");
    num = sc.nextInt();
    if(num<=0)
      System.out.println("enter positive number only");
    else{
      for(i=1;i<=num;i++)
        {
          sum=sum+i;
        }
      System.out.println("sum is "+sum);
    }
  }
}
public class SumOfNaturalNumbers{
  public static void main(String[] args){
    SumNaturalNum snn = new SumNaturalNum();
    snn.sum();
  }
}