// WAP to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
class Program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n,count=1;
      System.out.println("enter the number");
      n = sc.nextInt();
      while(count<=n)
        {
          System.out.println(count);
          count++;
        }
    }
}