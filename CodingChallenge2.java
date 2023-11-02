import java.util.*;

public class CodingChallenge2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements : ");
    int n = sc.nextInt();
    int stockPrices[] = new int[n];
    System.out.println("Enter the elements :");
    for(int i=0;i<n;i++){
        stockPrices[i] = sc.nextInt();
    }
    int maxProfit=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if((stockPrices[j]-stockPrices[i])>maxProfit){
          maxProfit = stockPrices[j]-stockPrices[i];
        }
      }
    }
    System.out.println("Max profit is : "+maxProfit);
  }
}