// WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
class SumOddNum{
  public void sum(){
    Scanner sc = new Scanner(System.in);
    int num,i,sum;
    System.out.println("enter number");
    num = sc.nextInt();
    if(num<=0)
      System.out.println("enter positive number only");
    else{
      for(i=1,sum=0;i<=num;i=i+2)
        {
          sum = sum+i;
        }
      System.out.println("sum is "+sum);
    }
  }
}
public class SumOfOddNumbers{
  public static void main(String[] args){
    SumOddNum son = new SumOddNum();
    son.sum();
  }
}