//WAP to take an array that reads an array of integers and print all the prime factors of numbers of that array
import java.util.Scanner;
public class PrimeFactorsNum_Array{
  public static void main(String[] args){
    PrimeFactors_Array ia = new PrimeFactors_Array();
    ia.isPerfectArray();
  }
}
class PrimeFactors_Array{
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
          for(int j=1;j<=marks[i];j++){
            if(marks[i]%j==0){
              int nf=0;
              for(int k=1;k<=j;k++){
                if(j%k==0){
                  nf=nf+1;
                }
              }
              if(nf==2)
                System.out.println(j+" ");
            }
            
          }
       System.out.println();
      }
      
    }
  }