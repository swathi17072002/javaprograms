//WAP to print multiplication table of any number.
import java.util.Scanner;
class PrintMulTable{
  public void mulTable(){
    Scanner sc= new Scanner(System.in);
    int n,r,i=1;
    System.out.println("enter n value");
    n = sc.nextInt();
    System.out.println("enter r value");
    r = sc.nextInt();
    while(i<=r){
      System.out.println(n+"*"+i+"="+(n*i));
      i++;
    }
  }
}
public class Program2{
public static void main(String[] args){
  PrintMulTable pmt = new PrintMulTable();
  pmt.mulTable();
}
}