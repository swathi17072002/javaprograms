//write a java program to find whether matrix is symmetric or not
import java.util.Scanner;
public class Symmetric_Matrix_Array{
  public static void main(String[] args){
    Symmetric_Matrix sm = new Symmetric_Matrix();
    sm.checkSymmetric();
      }
}
class Symmetric_Matrix{
  public void checkSymmetric(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows of matrix");
    int m = sc.nextInt();
    System.out.println("enter number of columns of matrix");
    int n = sc.nextInt();
    if(m==n){
    int a[][] = new int[m][n];
    int t[][] = new int[m][n];
    int count=0;
   
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
    System.out.println("Transpose matrix is");
    for(int i=0;i<t.length;i++){
      for(int j=0;j<t[0].length;j++)
        System.out.print(t[i][j]+"\t");
      System.out.println();
    }
    for(int i=0;i<t.length;i++){
      for(int j=0;j<t[0].length;j++){
        if(a[i][j]==t[i][j])
          count++;
      }
  }
      if(count==(m*n))
        System.out.println("matrix a is symmetrix");
      else
        System.out.println("matrix a is not symmetrix");

  }
  else
      System.out.println("It is not a symmetrix matrix");
  }
}