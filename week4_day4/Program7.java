 //WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter the number");
      n = sc.nextInt();
      int count = n;
      while(count>=1)
        {
          System.out.println(count);
          count--;
        }
    }
}