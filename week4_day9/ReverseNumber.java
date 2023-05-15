//WAP to enter a number and print its reverse.
import java.util.Scanner;
class ReverseNum{
  public void findRevNum(){
    Scanner sc = new Scanner(System.in);
    int n,digit,rev=0;
    System.out.println("enter n value");
    n = sc.nextInt();
    int dup_n = n;
    if(n<=0)
        System.out.println("enter positive number only");
    else{
      do{
        digit = n%10;
        rev = (rev*10)+digit;
        n = n/10;
      }while(n>0);
      System.out.println("reverse number of "+dup_n+" is "+rev);
    }
  }
}

public class ReverseNumber{
  public static void main(String[] args){
    ReverseNum rn = new ReverseNum();
    rn.findRevNum();
  }
}