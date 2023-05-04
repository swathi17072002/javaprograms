//program to find the area of the rectangle
import java.util.Scanner;

public class SecondProgram {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float length,breadth,area;
    System.out.println("enter the length and breadth of the rectangle");
    length=sc.nextFloat();
    breadth=sc.nextFloat();
    area = (length*breadth);
    System.out.println("area of the rectangle is "+area);
  }
}
    