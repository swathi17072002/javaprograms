import java.util.Scanner;
public class PrimeNum_Array{
  public static void main(String[] args){
    Prime_Array ia = new Prime_Array();
    ia.isPrimeArray();
  }
}
class Prime_Array{
  public void isPrimeArray(){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number of elements");
    n=sc.nextInt();
    int marks[] = new int[n];
    System.out.println("enter elements of the array :");
    for(int i=0;i<marks.length;i++)
      marks[i] = sc.nextInt();
    for(int i=0;i<marks.length;i++){
      int nf=0;
      for(int j=1;j<=marks[i];j++){
          if(marks[i]%j==0)
            nf++;
        
      }
      if(nf==2)
        System.out.println(marks[i]);
    }
  }
}