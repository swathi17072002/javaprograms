//program to find the sum of digits of positive integer
import java.util.Scanner;
class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int num,sum=0,digit;
      System.out.println("enter the number");
      num = sc.nextInt();
      while(num>0)
        {
          digit = num%10;
          sum = sum+digit;
          num = num/10;
          
        }
      System.out.println(sum);
    }
}
      
      