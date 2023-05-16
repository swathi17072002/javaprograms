//WAP to find power of a number using for loop.
import java.util.Scanner;
public class PowerOfNumber{
  public static void main(String[] args){
    Power p = new Power();
    Scanner sc = new Scanner(System.in);
    int n,power,result;
    System.out.println("enter n value");
    n = sc.nextInt();
    System.out.println("enter power");
    power = sc.nextInt();
    result = p.powerOfNum(n,power);
    System.out.println(n+" power "+power+" is "+result);
  }
}
class Power{
  public int powerOfNum(int num,int p){
    int i,r=1;
    for(i=1;i<=p;i++){
      r=r*num;
    }
    return r;
  }
}