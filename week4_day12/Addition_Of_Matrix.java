import java.util.Scanner;
public class Addition_Of_Matrix{
  public static void main(String[] args){
    Addition_Matrix am = new Addition_Matrix();
    am.sumOfTwoMatrices();
      }
}
class Addition_Matrix{
  public void sumOfTwoMatrices(){
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
  
    System.out.println("enter 1st array elements");
    for(int i=0;i<a.length;i++)
      for(int j=0;j<a[i].length;j++)
        a[i][j] = sc.nextInt();
    System.out.println("enter 2nd array elements");
    for(int i=0;i<b.length;i++)
      for(int j=0;j<b[i].length;j++)
        b[i][j] = sc.nextInt();
    if((m==p) && (n==q))
    {
      int c[][] = new int[m][n];
    for(int i=0;i<b.length;i++)
      for(int j=0;j<b[i].length;j++)
        c[i][j] = a[i][j]+b[i][j];
      
     System.out.println("addition matrix is");
      for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++)
        System.out.print(c[i][j]+"\t");
        System.out.println();
      }
   }
  else
    System.out.println("Addition is not possible");
  }
}