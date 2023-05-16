//WAP to find frequency of each digit in a given integer.
import java.util.Scanner;
public class FrequencyOfDigit{
  public static void main(String[] args){
    Frequency f = new Frequency();
    Scanner sc = new Scanner(System.in);
    int n,digit;
    System.out.println("enter the number");
    n = sc.nextInt();
    System.out.println("enter the digit to check frequency");
    digit = sc.nextInt();
    int freq = f.checkFrequency(n,digit);
    System.out.println("frequency of digit "+digit+" in number "+n+"  is "+freq);
  }
}
class Frequency{
  public int checkFrequency(int num,int d){
     int count=0;
    while (num > 0) 
      {
        if (num % 10 == d)
            count++;
        num = num / 10;
    }
    return count;
}
}
    