/*Given an integer n, return the number of prime numbers that are strictly less than n.
 
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.*/
import java.util.Scanner;
public class CountPrime{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Count_Prime cp = new Count_Prime();
    int n;
    System.out.println("enter n value");
    n = sc.nextInt();
    cp.countPrime(n);
  }
}
class Count_Prime{
  public void countPrime(int n){
    int count=0;
    for(int i=1;i<n;i++){
      int nf=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          nf = nf+1;
        }
      }
      if(nf==2)
        count++;
    }
    System.out.println(count);
  }
}