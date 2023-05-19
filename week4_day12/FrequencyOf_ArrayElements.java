//find frequency of array elements
import java.util.Scanner;
public class FrequencyOf_ArrayElements{
  public static void main(String[] args){
    Frequency_Array fay = new Frequency_Array();
    fay.findFrequency();
      }
}
class Frequency_Array{
  public void findFrequency(){
    Scanner sc = new Scanner(System.in);
    int count;
    System.out.println("enter number of elements ");
    int n=sc.nextInt();
    int arr[] = new int[n];
    int visited[] = new int[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    System.out.println("element\t\tcount");
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
      System.out.println(arr[i]+"\t\t"+count);
    }
  }
}