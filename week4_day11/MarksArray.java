//program to declare and initialize the array elements and printing the array elements 
import java.util.Scanner;
public class MarksArray{
  public static void main(String[] args){
    IntArray ia = new IntArray();
    ia.isArray();
  }
}
class IntArray{
  public void isArray(){
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[6];
    System.out.println("enter elements of the array :");
    for(int i=0;i<marks.length;i++)
      marks[i] = sc.nextInt();
    System.out.println("elements we entered are :");
    for(int j=0;j<marks.length;j++)
      System.out.println(marks[j]);
  }
}