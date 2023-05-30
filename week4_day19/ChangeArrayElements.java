/*You are working on a project that involves analyzing data from sensors installed on a wind turbine. The data is stored in an array, and you have noticed that the data has a periodic pattern that repeats every n data points, where n is a positive integer. To better analyze the data, You need to shift the elements in the array to the left by m positions, such that the first m elements are moved to the end of the array, and the remaining elements are shifted to the left by m positions, such that the original mth element becomes the first element in the new array.
 
Implement a Java program to achieve above?
 
Input Format
 
The input consists of Three lines  
 
The first line contains integer n, where n is the length of the array (1 ≤ n ≤ 10^5)  
 
The Second line contains n space-separated integers a1, a2, ..., an representing the array of integers (-10^9 ≤ ai ≤ 10^9).
 
The Third line contains integer  m(1 ≤m ≤ 10^5),
 
Output Format
 
The output is the modified Array satisfying the above requirements.
 
Sample Input1 :
 
10
 
1 2 3 4 5 6 7 8 9 10
 
4
 
Sample Output1:
 
5 6 7 8 9 10 1 2 3 4
 
Sample Input2 :
 
10
 
1 2 3 4 5 6 7 8 9 10
 
2
 
Sample Output2
 
3 4 5 6 7 8 9 10 1 2*/

import java.util.Scanner;
public class ChangeArrayElements{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ChangeArray zp = new ChangeArray();
    int n,m;
    System.out.println("enter number of elements");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    System.out.println("enter m value");
    m = sc.nextInt();
    zp.changeElements(arr,m);
  }
}
class ChangeArray{
  public void changeElements(int[] a,int m){
    int[] b = new int[a.length];
    for(int i=0;i<b.length;i++){
      if(i<m){
        b[(i+b.length)-m] = a[i];
      }
      else{
        b[i-m]= a[i];
      }
    }
    for(int j=0;j<b.length;j++)
      System.out.print(b[j]+" ");
  }
}