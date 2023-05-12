//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places
import java.util.Scanner;
class FloatEqual{
  public void chekFloatEqual(){
    Scanner sc = new Scanner(System.in);
    float num1,num2;
    System.out.println("enter number1");
    num1 = sc.nextFloat();
    System.out.println("enter number2");
    num2 = sc.nextFloat();
    int x = (int)(num1*1000);
    int y = (int)(num2*1000);
    if(x==y)
      System.out.println("Same upto three decimals");
    else
      System.out.println("not Same upto three decimals");
  }
}
 public class TestFloatEqual{
  public static void main(String[] args){
    FloatEqual fe = new FloatEqual();
    fe.chekFloatEqual();
  }
}
    
    