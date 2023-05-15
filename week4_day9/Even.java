//finding sum of all even numbers from 1 to n
import java.util.Scanner;
 
public class Even {
  public static void main(String[] args) {
    EvenNumberChecker pc = new EvenNumberChecker();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();         //n-10 sum-2   i-3  3<=10
    int sum;
    int i;
    /*int sum=0;
    int i=1;
    while(i<=n){
      boolean b  = pc.isEven(i);     
      if(b)
        sum=sum+i;
      i=i+1;      
    }*/
 
    for(i=1,sum=0;i<=n;i++){
      boolean b= pc.isEven(i);
      if(b)
        sum=sum+i;
    }
    System.out.println(sum);
  }
}
 
class EvenNumberChecker {
  public boolean isEven(int number) {
    if (number % 2 == 0)
      return true;
    else
      return false;
  }
}