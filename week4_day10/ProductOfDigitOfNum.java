//WAP to calculate product of digits of a number.
import java.util.Scanner;

public class ProductOfDigitOfNum{
  public static void main(String[] args){
    ProductOfDigit pod = new ProductOfDigit();
    Scanner sc = new Scanner(System.in);
    int n,product;
    System.out.println("enter the positive integer");
    n = sc.nextInt();
    product = pod.findProduct(n);
      System.out.println("product of digit of number "+n+" is "+product);
  }
}
class ProductOfDigit{
  public int findProduct(int num){
    int digit,prod=1;
    while(num!=0)
      {
        digit = num%10;
        prod = prod*digit;
        num = num/10;
      }
     return prod;
  }
}