//write a java program to find transpose of the matrix
import java.util.Scanner;
public class TraceOf_Matrix_Array{
  public static void main(String[] args){
    TraceOf_Matrix tom = new TraceOf_Matrix();
    tom.findTraceOfMatrix();
      }
}
class TraceOf_Matrix{
  public void findTraceOfMatrix(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows of first matrix");
    int m = sc.nextInt();
    System.out.println("enter number of columns of first matrix");
    int n = sc.nextInt();
    int a[][] = new int[m][n];
    if(m==n){
    int t=0;
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++)
      for(int j=0;j<a[i].length;j++)
        a[i][j] = sc.nextInt();
    System.out.println("matrix a is");
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++)
        System.out.print(a[i][j]+"\t");
      System.out.println();
    }
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[0].length;j++)
        if(i==j)
          t=t+a[i][j];
    }
   System.out.println("trace of matrix a is "+t);
    }
    else
      System.out.println("it is not a square matrix");
  }
}
    
        