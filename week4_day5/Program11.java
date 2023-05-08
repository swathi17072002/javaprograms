/*Write a program that takes in a number as input and outputs whether it is a perfect square or not. Use conditional statements to implement this program*/
import java.util.Scanner;
import java.lang.Math;
public class Program11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num,dup_num;
    System.out.println("enter the number");
    num = sc.nextInt();
    double sq_root = Math.sqrt(num);
    dup_num = (int)sq_root;
    if(dup_num == sq_root)
      System.out.println(num+" is a perfect square number");
    else
      System.out.println(num+" is not a perfect square number");
  }
}
    
      
    
    