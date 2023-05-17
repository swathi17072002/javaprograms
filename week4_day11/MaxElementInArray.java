//write a java program to find the max temperature in a week
import java.util.Scanner;
public class MaxElementInArray{
  public static void main(String[] args){
    MaxElement me = new MaxElement();
    double Temp[]= new double[7];
    double max = me.isMax(Temp);
    System.out.println("maximum temperature is "+max);
  }
}
class MaxElement{
  public double isMax(double[] Temp){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the temperatures");
    for(int i=0;i<7;i++){
      Temp[i] = sc.nextDouble();
    }
    double max= Temp[0];
    for(int i=0;i<7;i++){
      if(max < Temp[i])
        max=Temp[i];
    }
    return max; 
  }
}