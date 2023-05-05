// WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n,count=1,sum=0;
      System.out.println("enter the number");
      n = sc.nextInt();
      while(count<=n)
        {
          sum = sum+count;
          count = count+2;
        }
      System.out.println("sum is "+sum);
    }
}