//WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
class SumEvenNum{
  public void sum(){
    Scanner sc = new Scanner(System.in);
    int num,i=0,sum=0;
    System.out.println("enter number");
    num = sc.nextInt();
    if(num<=0)
      System.out.println("enter positive number only");
    else{
      do
        {
          sum = sum+i;
          i=i+2;
        }while(i<=num);
      System.out.println("sum is "+sum);
    }
  }
}
public class SumOfEvenNum{
  public static void main(String[] args){
    SumEvenNum sen = new SumEvenNum();
    sen.sum();
  }
}