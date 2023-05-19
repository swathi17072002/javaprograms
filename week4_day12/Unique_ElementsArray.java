//Java program to find unique elements of the array
// array elements 1,2,3,4,2,2,4,4
// unique elements are 1,3
public class Unique_ElementsArray{
  public static void main(String[] args){
    Unique_Elements ue = new Unique_Elements();
    ue.findUniqueElements();
      }
}
class Unique_Elements{
  public void findUniqueElements(){
    int count;
    int arr[] = {1,2,3,4,2,2,4,4};
    int visited[] = new int[arr.length];
    System.out.println("unique elements are :");
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
      if(count==1)
        System.out.println(arr[i]+"\t");
    }
  }
}