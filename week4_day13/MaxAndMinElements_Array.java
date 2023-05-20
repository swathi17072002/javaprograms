//write a java program to find the maximum and minimum element of two dimensional array along with index values
import java.util.Scanner;
public class MaxAndMinElements_Array{
  public static void main(String[] args){
    MaxMinElements mr = new MaxMinElements();
    mr.findMinMax();
      }
}
class MaxMinElements{
  public void findMinMax(){
    Scanner sc = new Scanner(System.in);
    int r,c;
    int max_r=0,max_c=0,min_r=0,min_c=0;
    System.out.println("enter number of rows");
      r = sc.nextInt();
    System.out.println("enter number of columns");
      c = sc.nextInt();
    int arr[][] = new int[r][c];
    System.out.println("enter array elements");
    for(int i=0;i<arr.length;i++)
      for(int j=0;j<arr[i].length;j++)
        arr[i][j] = sc.nextInt();
    int max = arr[0][0];
    int min = arr[0][0];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(max<arr[i][j]){
          max=arr[i][j];
          max_r=i;
          max_c=j;
        }
        if(min>arr[i][j]){
          min=arr[i][j];
          min_r=i;
          min_c=j;
        }
      }
    }
    System.out.println("maximum array element is "+max+" which is at row index "+max_r+" and column index "+max_c);
    System.out.println("minimum array element is "+min+" which is at row index "+min_r+" and column index "+min_c);
  }
}