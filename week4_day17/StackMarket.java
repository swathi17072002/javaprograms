/*You are working on a stock market analysis tool that helps investors analyze historical stock prices. This tool allows users to input an array of stock prices for a specific stock and identifies the minimum and maximum prices to help users make informed investment decisions.You are tasked with writing a program in Java to accomplish this.*/
import java.util.Scanner;
public class StackMarket{
  public static void main(String[] aggs){
    StackMarketPrices smp = new StackMarketPrices();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of stock prices");
    int n = sc.nextInt();
    double stockPrices[] = new double[n];
    System.out.println("enter stock prices");
    for(int i=0;i<n;i++)
      stockPrices[i] = sc.nextDouble();
    smp.minMaxStockPrices(stockPrices);
  }
}

class StackMarketPrices{
  public void minMaxStockPrices(double[] stock){
    double min = stock[0];
    double max = stock[0];
    for(int i=0;i<stock.length;i++){
      if(min>stock[i])
        min = stock[i];
      if(max<stock[i])
        max = stock[i];
    }
    System.out.println("minimum stock price is "+min);
    System.out.println("maximum stock price is "+max);
  }
}