//write a java program to print a message there are duplicate elements are there in the array .otherwise print no duplicate elements in an array.
import java.util.Scanner;
public class Prog1_Test{
  public static void main(String[] args){
    Prog1 pp = new Prog1();
    pp.dupArray();
    
  }
}
class Prog1{
  public void dupArray(){
   Scanner sc = new Scanner(System.in);
    int n,c=0;
    System.out.println("enter number of elements ");
    n = sc.nextInt();
    int arr[] = new int[n];
    boolean visited[] = new boolean[n];
    System.out.println("enter elements of array ");
    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();
    for(int j=0;j<n;j++){
      if(visited[j]==true)
        continue;
     else{
       int count=1;
       for(int k=j+1;k<n;k++){
         if(arr[j]==arr[k]){
           count++;
           visited[k]=true;
         }
       }
       if(count>1){
        c++;
      System.out.println(arr[j]+" "+count);
     }
      /*if(count>1){
        c++;
      System.out.println(arr[i]+" "+count);*/
    
  }
    /*if(c==0)
      System.out.println("there is no duplicate elements in an array");*/
}
    if(c==0)
      System.out.println("there is no duplicate elements in an array");
  }
}