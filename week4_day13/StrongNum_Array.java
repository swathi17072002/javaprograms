//WAP to take an array that reads an array of integers and print all the Strong numbers of that array
import java.util.Scanner;
public class StrongNum_Array{
  public static void main(String[] args){
    Strong_Array ia = new Strong_Array();
    ia.isStrongArray();
  }
}
class Strong_Array{
  public void isStrongArray(){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number of elements");
    n=sc.nextInt();
    int marks[] = new int[n];
    System.out.println("enter elements of the array :");
    for(int i=0;i<marks.length;i++)
      marks[i] = sc.nextInt();
     for(int i=0;i<marks.length;i++){
          int digit;
        int sum=0;
      int dup_num=marks[i];
    while(dup_num!=0)
      {
        digit = dup_num%10;
        int k=1,factorial=1;
        while(k<=digit)
          {
            factorial = factorial*k;
            k++;
          }
        sum = sum+factorial;
        dup_num = dup_num/10;
      }
      if(sum==marks[i])
        System.out.println(marks[i]);
      }
      
    }
  }