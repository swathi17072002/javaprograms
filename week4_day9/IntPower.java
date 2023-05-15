//Write a Java program to check if a given integer is a power of 2 or not, using only co nditional statements don't use loops
import java.util.Scanner;
public class IntPower{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    if(num<=0){
      System.out.println(num+" is a not power of 2");
    }
      else if((num &(num-1))==0){
      System.out.println(num+ "is a power of 2");
    }
    else{
     System.out.println(num+" is a not power of 2"); 
    }
  }
}