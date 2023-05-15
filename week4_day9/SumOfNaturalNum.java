//WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
import java.lang.Math;
class SumNaturalNum{
  public void sum(){
    Scanner sc = new Scanner(System.in);
    int num,i=1,sum=0;
    System.out.println("enter number");
    num = sc.nextInt();
    if(num<=0)
      System.out.println("enter positive number only");
    else{
      do
        {
          sum=sum+i;
          i++;
        }while(i<=num);
      System.out.println("sum is "+sum);
    }
  }
}

public class SumOfNaturalNum{
  public static void main(String[] args){
    SumNaturalNum snn = new SumNaturalNum();
    snn.sum();
  }
}