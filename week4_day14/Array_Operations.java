/*Menu based application on Array Operations: create an application which will display list of operations on array.
             --> Insert an element in first index 
             --> Insert an element in last index
             --> Insert an element in specified index
             --> Remove element from first index
             --> Remove element from last index
             --> Remove element from specified index*/
import java.util.Scanner;
public class Array_Operations{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Operations_Array opa = new Operations_Array();
    System.out.println("enter number of elements in an array");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
    boolean cc=true;
    while(cc){
    System.out.println();
    System.out.println("*********MENU************");
    System.out.println("1. Insert an element in first index ");
    System.out.println("2. Insert an element in last index");
    System.out.println("3. Insert an element in specified index");
    System.out.println("4. Remove element from first index");
    System.out.println("5. Remove element from last index");
    System.out.println("6. Remove element from specified index");
    int choice;
    System.out.println("enter your choice");
    choice = sc.nextInt();
    switch(choice){
      case 1 :
        int[] b1 = opa.insertFstIndex(arr);
        for(int i=0;i<b1.length;i++)
          System.out.print(b1[i]+" ");
        break;  
      case 2 :
        int[] b2 = opa.insertLastIndex(arr);
        for(int i=0;i<b2.length;i++)
          System.out.print(b2[i]+" ");
        break;  
      case 3 :
        int[] b3 = opa.insertSpecifiedIndex(arr);
        for(int i=0;i<b3.length;i++)
          System.out.print(b3[i]+" ");
        break;  
      case 4 :
        int[] b4 = opa.removeFstIndex(arr);
        for(int i=0;i<b4.length;i++)
          System.out.print(b4[i]+" ");
        break;
      case 5 :
        int[] b5 = opa.removeLastIndex(arr);
        for(int i=0;i<b5.length;i++)
          System.out.print(b5[i]+" ");
        break;
      case 6 :
        int[] b6 = opa.removeSpecifiedIndex(arr);
        for(int i=0;i<b6.length;i++)
          System.out.print(b6[i]+" ");
        break;
      default :
        System.out.println("Invalid choice");
        cc = false;
    }
      
    }
  }
}

class Operations_Array{
  Scanner s = new Scanner(System.in);
  public int[] insertFstIndex(int[] a){
    int[] b = new int[(a.length)+1];
    int i,j;
    System.out.println("enter element to insert at first index ");
    int ele = s.nextInt();
    for(i=a.length-1,j=i+1;i>=0;i--,j--){
        b[j]=a[i];
    }
    b[0] = ele;
    return b;
  }
  public int[] insertLastIndex(int[] a){
    int[] b = new int[(a.length)+1];
    int i,j;
    System.out.println("enter element to insert at last index ");
    int ele = s.nextInt();
    for(i=0;i<a.length;i++)
        b[i]=a[i];
    b[b.length-1] = ele;
    return b;
  }
  public int[] insertSpecifiedIndex(int[] a){
    int[] b = new int[(a.length)+1];
    int i,j;
    System.out.println("enter index to enter");
    int spec_index = s.nextInt();
    System.out.println("enter element to insert at "+spec_index);
    int ele = s.nextInt();
    for(i=0;i<a.length;i++){
        if(i<spec_index){
          b[i] = a[i];
        }
        if(i>=spec_index){
          b[i+1]=a[i];
        }
        b[spec_index]=ele;
  }
    return b;
  }
  public int[] removeFstIndex(int[] a){
    int[] b = new int[(a.length)-1];
    int i,j;
    for(i=1,j=0;i<a.length;i++,j++){
        b[j]=a[i];
    }
    return b;
  }
  public int[] removeLastIndex(int[] a){
    int[] b = new int[(a.length)-1];
    int i,j;
    for(i=0,j=0;i<a.length-1;i++,j++){
        b[j]=a[i];
    }
    return b;
  }
  public int[] removeSpecifiedIndex(int[] a){
    int[] b = new int[(a.length)-1];
    int i,j;
    System.out.println("enter index to remove element");
    int spec_index = s.nextInt();
    for(i=0;i<a.length-1;i++){
        if(i<spec_index){
          b[i] = a[i];
        }
        if(i>=spec_index){
          b[i]=a[i+1];
        }
  }
    return b;
  }
}