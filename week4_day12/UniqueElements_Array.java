//WAP to print all unique elements in the array.
import java.util.Scanner;
public class UniqueElements_Array{
  public static void main(String[] args){
    UniqueElements ue = new UniqueElements();
    ue.findUniqueElements();
      }
}
class UniqueElements{
  public void findUniqueElements(){
    Scanner sc = new Scanner(System.in);
    int count;
    System.out.println("enter number of elements ");
    int n=sc.nextInt();
    int arr[] = new int[n];
    int visited[] = new int[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    System.out.println("unique elements are :");
    for(int i=0;i<n;i++){
      if(visited[i]!=0){
        continue;
      }
      else{
        count =1;
        for(int j=i+1;j<n;j++){
          if(arr[i]==arr[j]){
            count++;
            visited[j]=1;
          }
        }
      }
      if(count==1)
        System.out.println(arr[i]+"\t");
    }
  }
}