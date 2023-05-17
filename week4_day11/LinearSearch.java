//program to find key element in the array
import java.util.Scanner;
public class LinearSearch{
  public static void main(String[] args){
    Search s = new Search();
    s.isKey();
   }
}

class Search{
  public void isKey(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements ");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++)
      arr[i]= sc.nextInt();
    System.out.println("enter key to search");
    int key = sc.nextInt();
    boolean found=false;
    for(int i=0;i<n;i++){
      if(key==arr[i]){
        found=true;
        System.out.println(key+" is found,which is at position "+(i+1));
        break;
      }
    }
    if(found==false)
      System.out.println(key+" is not in the array ");
    }
  }
