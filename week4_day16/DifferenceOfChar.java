//write a java program to find the difference between number of characters of first word and last word in a string
import java.util.Scanner;
import java.lang.Math;
public class DifferenceOfChar{
  public static void main(String[] args){
    DifferenceOfCharecter doc = new DifferenceOfCharecter();
    doc.findDifference();
  }
}
class DifferenceOfCharecter{
  public void findDifference(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str = sc.nextLine();
    String[] words = str.split(" ");
    int num1 = words[0].length();
    int num2 = words[words.length-1].length();
    int difference = Math.abs(num1-num2);
    System.out.println("difference between number of characters first and last words is "+difference);
  }
}