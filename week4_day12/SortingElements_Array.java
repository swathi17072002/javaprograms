//write a java program to sort the elements of one dimensional
import java.util.Scanner;
public class SortingElements_Array{
  public static void main(String[] args){
    Sorting_Array am = new Sorting_Array();
    am.sortArray();
      }
}
class Sorting_Array{
  public void sortArray(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements in an array");
    int n=sc.nextInt();
    int temp;
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
    //temp=arr[0];
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
      if(arr[i]>arr[j]){
        temp=arr[j];
        arr[j] =arr[i];
        arr[i] = temp;
      }
    }
      
    }
    for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
  }
}