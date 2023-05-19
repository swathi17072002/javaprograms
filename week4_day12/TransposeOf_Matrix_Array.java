//write a java program to find transpose of the matrix
import java.util.Scanner;
public class TransposeOf_Matrix_Array{
  public static void main(String[] args){
    TransposeOf_Matrix tom = new TransposeOf_Matrix();
    tom.findTraceMatrix();
      }
}
class TransposeOf_Matrix{
  public void findTraceMatrix(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows of matrix");
    int m = sc.nextInt();
    System.out.println("enter number of columns of matrix");
    int n = sc.nextInt();
    int a[][] = new int[m][n];
    int t[][] = new int[n][m];
   
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
    
    for(int i=0;i<a.length;i++)
      for(int j=0;j<a[0].length;j++)
        t[j][i]=a[i][j];
    System.out.println("Transpose matrix a is");
    for(int i=0;i<t.length;i++){
      for(int j=0;j<t[0].length;j++)
        System.out.print(t[i][j]+"\t");
      System.out.println();
    }
  }

}
    
        