//WAP to reverse the array elements through methods
import java.util.Scanner;
public class ReverseArray_Elements{
  public static void main(String[] args){
    ReverseArray ra = new ReverseArray();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements in an array");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
    int[] a1= ra.reverseArray(arr,n);
    System.out.println("array elements in reverse are ");
    for(int j=0;j<arr.length;j++)
      System.out.println(arr[j]+" ");
      }
}
class ReverseArray{
  public int[] reverseArray(int[] arr,int n){
    int i,j,temp;
    for(i=0,j=(n-1);i<j;i++,j--){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    return arr;
  }
}