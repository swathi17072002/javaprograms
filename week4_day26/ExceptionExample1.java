import java.util.Scanner;
import java.io.*;
public class ExceptionExample1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    try{
    PrintWriter p = new PrintWriter("test.txt");
    System.out.println(arr[6]);     
    }
    catch(FileNotFoundException e){
      System.out.println("File Not Found Exception");
      System.out.println("Checked Exception");
      System.out.println(e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array Index Out Of Bounds Exception");
      System.out.println("Unchecked Exception");
      System.out.println(e.getMessage());
    }
    finally{
      System.out.println("finally block");
    }
  }
}