// findind the number of negative and posotive elements in an array
import java.util.Scanner;
public class PositiveNegativeElementsOfArray{
  public static void main(String[] args){
    ElementsOfArray eoa = new ElementsOfArray();
    eoa.findPosNeg();
  }
}
class ElementsOfArray{
  public void findPosNeg(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements ");
    int n=sc.nextInt();
    int p_count=0,n_count=0;
    double temp[] = new double[n];
    System.out.println("enter elements of array");
    for(int i=0;i<n;i++){
      temp[i]= sc.nextDouble();
    }
    for(int i=0;i<n;i++){
      if(temp[i]<0)
        n_count=n_count+1;
      else
        p_count=p_count+1;
      }
    System.out.println("number of positive numbers are "+p_count);
    System.out.println("number of negative numbers are "+n_count);
    }
  }
