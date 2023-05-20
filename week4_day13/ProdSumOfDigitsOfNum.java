//write a java program to find the difference between sum of the digits and product of the digits of a positive integer
import java.util.Scanner;
public class ProdSumOfDigitsOfNum{
  public static void main(String[] args){
    ProdSumOfDigits psd = new ProdSumOfDigits();
    psd.findProdSum();
  }
}
class ProdSumOfDigits{
  public void findProdSum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter positive integer");
    int n = sc.nextInt();
    int digit,sum=0,product=1;
    while(n>0){
      digit = n%10;
      product = product*digit;
      sum =sum+digit;
      n = n/10;
    }
    int difference = product - sum;
    System.out.println("difference between product and sum of the digits of the number is "+difference);
  }
}