//WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n,count=1,sum=0;
      System.out.println("enter the number");
      n = sc.nextInt();
      while(count<=n)
        {
          sum = sum+count;
          count++;
        }
      System.out.println("sum is "+sum);
    }
}