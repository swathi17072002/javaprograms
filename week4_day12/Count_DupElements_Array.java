//WAP to count total number of duplicate elements in an array
import java.util.Scanner;
public class Count_DupElements_Array{
  public static void main(String[] args){
    Count_DupElements cde = new Count_DupElements();
    cde.countDupElements();
      }
}
class Count_DupElements{
  public void countDupElements(){
    Scanner sc = new Scanner(System.in);
    int count,dup_count=0;
    System.out.println("enter number of elements ");
    int n=sc.nextInt();
    int arr[] = new int[n];
    int visited[] = new int[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    System.out.println("duplicate elements are :");
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
      if(count>1)
        dup_count = dup_count+1;
    }
    System.out.println("number of duplicate elements are "+dup_count);
  }
}