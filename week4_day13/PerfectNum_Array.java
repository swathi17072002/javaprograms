//WAP to take an array that reads an array of integers and print all the perfect numbers of that array
import java.util.Scanner;
public class PerfectNum_Array{
  public static void main(String[] args){
    Perfect_Array ia = new Perfect_Array();
    ia.isPerfectArray();
  }
}
class Perfect_Array{
  public void isPerfectArray(){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number of elements");
    n=sc.nextInt();
    int marks[] = new int[n];
    System.out.println("enter elements of the array :");
    for(int i=0;i<marks.length;i++)
      marks[i] = sc.nextInt();
     for(int i=0;i<marks.length;i++){
       int sum=0;
          for(int j=1;j<marks[i];j++){
            if(marks[i]%j==0){
              sum=sum+j;
            }
            
          }
       if(sum==marks[i])
         System.out.println(marks[i]);
      }
      
    }
  }