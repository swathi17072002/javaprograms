//WAP to take an array that reads an array of integers and print all the armstrong numbers of that array
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNum_Array{
  public static void main(String[] args){
    Armstrong_Array ia = new Armstrong_Array();
    ia.isArmstrongArray();
  }
}
class Armstrong_Array{
  public void isArmstrongArray(){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number of elements");
    n=sc.nextInt();
    int marks[] = new int[n];
    System.out.println("enter elements of the array :");
    for(int i=0;i<marks.length;i++)
      marks[i] = sc.nextInt();
     for(int i=0;i<marks.length;i++){
          int num=marks[i],num1=marks[i];
          int digit,c=0;
          while(num!=0){
            c++;
            num=num/10;
          }
         int p,sum=0;
          while(num1!=0){
            digit = num1%10;
            p=(int)(Math.pow(digit,c));
            sum = sum+p;
            num1 = num1/10;
          }
       if(sum==marks[i])
         System.out.println(marks[i]);
       
      }
      
    }
  }