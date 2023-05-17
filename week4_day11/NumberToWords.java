//WAP to enter a number and print it in words.
import java.util.Scanner;
public class NumberToWords{
  public static void main(String[] args){
    NumberWords nw = new NumberWords();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter n value");
    n = sc.nextInt();
    nw.convertNumToWords(n);
  }
}
class NumberWords{
  public void convertNumToWords(int num){
    
    int digit,d,rev_num=0;
    int dup_num=num;
    while(num>0){
      digit = num%10;
      rev_num=(rev_num*10)+digit;
      num = num/10;
    }
    while(rev_num>0){
      d = rev_num%10;
      switch(d){
        case 0:System.out.print("Zero ");
          break;
        case 1:System.out.print("One ");
          break;
        case 2:System.out.print("Two ");
          break;
        case 3:System.out.print("Three ");
          break;
        case 4:System.out.print("Four ");
          break;
        case 5:System.out.print("Five ");
          break;
        case 6:System.out.print("Six ");
          break;
        case 7:System.out.print("Seven ");
          break;
        case 8:System.out.print("Eight ");
          break;
        case 9:System.out.print(" Nine ");
          break;
      }
      rev_num = rev_num/10;
    }
    
  }
}