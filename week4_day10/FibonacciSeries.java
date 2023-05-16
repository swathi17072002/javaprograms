//WAP to print Fibonacci series up to n terms(0 1 1 2 3 5 8 13)
import java.util.Scanner;
class Fibonacci{
  public void generateFibSeries(){
    Scanner sc = new Scanner(System.in);
  int no_of_terms,num1=0,num2=1,next_num,count=2;
    System.out.println("enter the number of terms");
    no_of_terms=sc.nextInt();
    if(no_of_terms==1)
      System.out.println(num1);
    else if(no_of_terms==2){
      System.out.println(num1);
      System.out.println(num2);
    }
    else{
      System.out.println(num1);
      System.out.println(num2);
      while(count<no_of_terms)
        {
          next_num=num1+num2;
          System.out.println(next_num);
          num1=num2;
          num2=next_num;
          count++;
      
        }
    }
  }
  
}
public class FibonacciSeries{
  public static void main(String[] args){
    Fibonacci f = new Fibonacci();
    f.generateFibSeries();

  }   
}
    