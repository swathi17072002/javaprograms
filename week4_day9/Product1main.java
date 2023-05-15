import java.util.Scanner;
class Product1{
  public void product(){
    Scanner sc= new Scanner(System.in);
    int n,product,last_digit,first_digit;
    System.out.println("enter the num");
    n=sc.nextInt();
    last_digit=n%10;
    do{
      first_digit=n%10;
      n=n/10;
    }while(n>0);
    product=first_digit*last_digit;
    System.out.println(product);
  }
}
public class Product1main{
  public static void main(String [] args){
    Product1 a = new Product1();
    a.product();
  }
}