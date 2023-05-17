import java.util.Scanner;
public class SumToKey{
  public static void main(String[] args){
    FindSumToKey fsk = new FindSumToKey();
    fsk.isSum();
      }
}
class FindSumToKey{
  public void isSum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements ");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++)
      arr[i]= sc.nextInt();
    System.out.println("enter key");
    int key = sc.nextInt();
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
       if(arr[i]+arr[j]==key){
         System.out.println(i+" "+j);
       }
      }
  }
}
}