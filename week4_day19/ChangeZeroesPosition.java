/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 
Note that you must do this in-place without making a copy of the array.
 
 
Example 1:
 
Input: nums = [0,1,0,3,12] 
Output: [1,3,12,0,0]*/
import java.util.Scanner;
public class ChangeZeroesPosition{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ZeroesPosition zp = new ZeroesPosition();
    int n;
    System.out.println("enter number of elements");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    zp.changeZeroes(arr);
  }
}
class ZeroesPosition{
  public void changeZeroes(int[] a){
    int temp,count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]!=0)
        continue;
      else{
        for(int j=i+1;j<a.length;j++){
          if(a[j]!=0){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            break;
          }
        }
      }
    }
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
  }
}