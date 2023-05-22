//write a java program to find the largest, second largest and third largest element of the one dimensional array
import java.util.Scanner;
public class FirstSecoondThirdLargest{
  public static void main(String[] args){
    FST_Array am = new FST_Array();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements in an array");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
    am.sortArray(arr);
  }
}

class FST_Array{
  public void sortArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      int temp;
      for(int j=i+1;j<arr.length;j++){
      if(arr[i]<arr[j]){
        temp=arr[j];
        arr[j] =arr[i];
        arr[i] = temp;
      }
    }
      
    }
    System.out.println("First largest element in an array is "+arr[0]);
    System.out.println("Second largest element in an array is "+arr[1]);
    System.out.println("Third largest element in an array is "+arr[2]);
  }
}