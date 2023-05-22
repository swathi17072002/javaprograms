/*write a java program to read the array elements and then display the following menu.1. find the sum of array elements2. find the maximum and minimum elements3. reverse the array elements 4. find the prime elements of the array. now read the choice from the user and perform appropriate action*/
import java.util.Scanner;
public class Array_Methods{
  public static void main(String[] args){
    Methods_Array ma = new Methods_Array();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements in an array");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
    System.out.println("*********MENU************");
    System.out.println("1. find the sum of array elements");
    System.out.println("2. find the maximum and minimum elements");
    System.out.println("3. reverse the array elements");
    System.out.println("4. find the prime elements of the array");
    int choice;
    System.out.println("enter your choice");
    choice = sc.nextInt();
    switch(choice){
      case 1 : 
        int s = ma.sum(arr);
        System.out.println("sum of the array elements is "+s);
        break;
      case 2:
        int max = ma.maximum(arr);
        int min = ma.minimum(arr);
        System.out.println("maximum element is "+max+" minimum element is "+min);
        break;
      case 3 :
        int[] a1 = ma.reverseArray(arr,n); 
        System.out.println("array elements in reverse are ");
        for(int j=0;j<arr.length;j++)
          System.out.println(arr[j]+" ");
        break;
      case 4 :
        for(int i=0;i<arr.length;i++){
          boolean b = ma.isPrime(arr[i]);
        if(b)
          System.out.println(arr[i]);
        }
        break;
      default :
        System.out.println("Invalid choice");
      }
        
    
  }
}
class Methods_Array{
  public int sum(int a[]){
    int s=0;
    for(int i=0;i<a.length;i++)
      s = s+a[i];
    return s;
  }
  public int maximum(int a[]){
    int max;
    max = a[0];
    for(int i=1;i<a.length;i++)
      if(max<a[i]){
        max = a[i];
      }
    return max;
  }
  public int minimum(int a[]){
    int min;
    min = a[0];
    for(int i=1;i<a.length;i++)
      if(min>a[i]){
        min = a[i];
      }
    return min;
  }
  public int[] reverseArray(int[] arr,int n){
    int i,j,temp;
    for(i=0,j=(n-1);i<j;i++,j--){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    return arr;
  }
  public boolean isPrime(int num){
    if(num<=1)
      return false;
    else{
      for(int j=2;j<num;j++)
        if(num%j==0)
          return false;
      return true;
    }
  }
}