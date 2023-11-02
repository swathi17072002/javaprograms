import java.util.*;
public class CodingChallenge5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of products :");
    int n = sc.nextInt();
    int productPrices[] = new int[n];
    System.out.println("Enter the Product prices");
    for(int i=0;i<n;i++){
      productPrices[i] = sc.nextInt(); 
    }
    System.out.println("Enter the Target Budget");
    int targetBudget = sc.nextInt();
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(productPrices[i]+productPrices[j]==targetBudget){
          System.out.println("("+productPrices[i]+" "+productPrices[j]+")");
        }
      }
    }
  }
}