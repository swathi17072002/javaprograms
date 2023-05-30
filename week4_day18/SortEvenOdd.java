//We need to sort the even numbers of array elements at first then odd numbers
import java.util.Scanner;
public class SortEvenOdd{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    Sort_Even_Odd seo = new Sort_Even_Odd();
    System.out.println("enter number of elements");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
    System.out.println("Before sorting array elements are ");
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
    seo.sort(a);
    System.out.println();
    System.out.println("After sorting array elements are ");
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}
class Sort_Even_Odd{
  public void sort(int[] a){
    int even_c=0;
    int temp,j=-1;
    //finding number of even numbers and separating even and odd numbers
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
        even_c++;
        j++;
        temp = a[j];
        a[j] = a[i];
        a[i] = temp;
      }
    }
    int t;
    //sorting even numbers
    for(int m=0;m<even_c;m++){
      for(int n=m+1;n<even_c;n++){
        if(a[m]>a[n]){
          t=a[n];
        a[n] = a[m];
        a[m] = t;
      }
    }
    }
    //sorting odd numbers
     for(int x=even_c;x<a.length;x++){
      for(int y=x+1;y<a.length;y++){
        if(a[x]>a[y]){
          t=a[y];
        a[y] = a[x];
        a[x] = t;
      }
    }
     }
  }
}
    

  