// Java program to find duplicate elements of the array
// array elements 1,2,3,4,2,7,8,8,3,10,10
// Duplicate elements are 2,3,8,10
public class Duplicate_Elements_Array{
  public static void main(String[] args){
    Dup_Elements de = new Dup_Elements();
    de.findDupElements();
      }
}
class Dup_Elements{
  public void findDupElements(){
    int count;
    int arr[] = {1,2,3,4,2,7,8,8,3,10,10};
    int visited[] = new int[arr.length];
    System.out.println("duplicate elements are :");
    for(int i=0;i<arr.length;i++){
      if(visited[i]!=0){
        continue;
      }
      else{
        count =1;
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]==arr[j]){
            count++;
            visited[j]=1;
          }
        }
      }
      if(count>1)
        System.out.println(arr[i]+"\t");
    }
  }
}