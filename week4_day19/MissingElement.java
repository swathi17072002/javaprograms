/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 
 
Example 1:
 
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
 
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:
 
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/
import java.util.Scanner;
public class MissingElement{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Missing_Element me = new Missing_Element();
    int n;
    System.out.println("enter number of elements");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    me.findMissingElement(arr);
  }
}

class Missing_Element{
  public void findMissingElement(int[] a){
    int actual_sum = 0;
    int expected_sum = 0;
    for(int i=0;i<a.length;i++)
      actual_sum = actual_sum+a[i];
    for(int i=0;i<=a.length;i++){
      expected_sum = expected_sum+i;
    }
    int missing_element = expected_sum - actual_sum;
    System.out.println("missing element is :"+missing_element);
  }
}