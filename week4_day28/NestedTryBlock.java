import java.util.Scanner;
public class NestedTryBlock{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
      int arr[] = {1,2,3,4};
      try{
        System.out.println(arr[6]);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception Caught1");
      }
      int a = arr[0]/0;
      System.out.println(a);
    }
    catch(ArithmeticException e){
      System.out.println("Exception Caught2");
    }
    }
  
  }
