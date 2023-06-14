import java.util.Scanner;
class ExceptionsExample{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[6];
    int num;
    try{
      System.out.println(arr[7]);
      System.out.println("Enter the number");
      num = sc.nextInt();
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("index value is out of range");
    }
      catch(Exception e){
        System.out.println("value is not matched with the datatype");
      }
    finally{
      System.out.println("finally block is executed");
    }
  }
}