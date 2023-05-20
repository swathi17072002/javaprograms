//write a java program to find multiplication of two matrices
import java.util.Scanner;
public class MulOf_Two_Matrices_Array{
  public static void main(String[] args){
    MulOf_Two_Matrices am = new MulOf_Two_Matrices();
    am.mulOfTwoMatrices();
      }
}
class MulOf_Two_Matrices{
  public void mulOfTwoMatrices(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows of first matrix");
    int m = sc.nextInt();
    System.out.println("enter number of columns of first matrix");
    int n = sc.nextInt();
    System.out.println("enter number of rows of second matrix");
    int p = sc.nextInt();
    System.out.println("enter number of columns of second matrix");
    int q = sc.nextInt();
    int a[][] = new int[m][n];
    int b[][] = new int[p][q];
    if(n==p){
      int c[][] = new int[m][q];
    System.out.println("enter 1st array elements");
    for(int i=0;i<m;i++)
      for(int j=0;j<n;j++)
        a[i][j] = sc.nextInt();
    System.out.println("enter 2nd array elements");
    for(int i=0;i<p;i++)
      for(int j=0;j<q;j++)
        b[i][j] = sc.nextInt();
    
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
         c[i][j]=0;
        for(int k=0;k<n;k++)
          c[i][j] += (a[i][k]*b[k][j]);
      }
    }
      System.out.println("multiplication matrix is");
     for(int i=0;i<m;i++){
      for(int j=0;j<q;j++)
        System.out.print(c[i][j]+"\t"); 
       System.out.println();
     }
    }
    else
      System.out.println("multiplication is not possible");
  }
}

          
    