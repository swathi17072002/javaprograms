//Wap to find the distinct elements of an array
import java.util.Scanner;
public class DistinctElements_Array{
  public static void main(String[] args){
    DistinctElements de = new DistinctElements();
    de.findDistinctElements();
      }
}
class DistinctElements{
  public void findDistinctElements(){
    Scanner sc = new Scanner(System.in);
    int count;
    System.out.println("enter number of elements ");
    int n=sc.nextInt();
    int arr[] = new int[n];
    int visited[] = new int[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    System.out.println("distinct elements are :");
    for(int i=0;i<n;i++){
      if(visited[i]!=0){
        continue;
      }
      else{
        //count =1;
        System.out.println(arr[i]);
        for(int j=i+1;j<n;j++){
          if(arr[i]==arr[j]){
            //count++;
            visited[j]=1;
          }
        }
      }
    }
  }
}