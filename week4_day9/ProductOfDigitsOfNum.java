//WAP to calculate product of digits of a number.
import java.util.Scanner;
class ProductOfDigits{
  public void product(){
    Scanner sc = new Scanner(System.in);
    int n,digit,prod=1;
    System.out.println("enter n value");
    n = sc.nextInt();
    int dup_n = n;
    if(n<=0)
        System.out.println("enter positive number only");
    else{
      do{
        digit = n%10;
        prod = prod*digit;
        n = n/10;
      }while(n>0);
      System.out.println("product of digits of "+dup_n+" is "+prod);
    }
  }
}
public class ProductOfDigitsOfNum{
  public static void main(String[] args){
    ProductOfDigits pod = new ProductOfDigits();
    pod.product();
  }
}