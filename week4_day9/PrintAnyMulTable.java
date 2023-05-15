//WAP to print multiplication table of any number.
import java.util.Scanner;
class PrintMulTable{
  public void mulTable(){
    Scanner sc = new Scanner(System.in);
    int n,range,i=1;
    System.out.println("enter n value");
    n = sc.nextInt();
    System.out.println("enter range value");
    range = sc.nextInt();
    if(n<1 || range<1)
      System.out.println("enter positive number and positive range only");
    else{
      do{
         System.out.println(n+" * "+i+" = "+(n*i));
        i++;
       }while(i<=range);
     }
  }
}
public class PrintAnyMulTable{
  public static void main(String[] args){
    PrintMulTable pmt = new PrintMulTable();
    pmt.mulTable();
  }
}