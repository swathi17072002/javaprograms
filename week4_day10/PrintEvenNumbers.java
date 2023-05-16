//WAP to print all even number between 1 to 100.
class CheckEven{
  public boolean isEven(int j){
    if(j%2==0)
      return true;
    else
      return false;
  }
}
public class PrintEvenNumbers{
  public static void main(String[] args){
    CheckEven cen = new CheckEven();
    int i;
    for(i=1;i<=100;i++){
    boolean b = cen.isEven(i);
      if(b)
        System.out.println(i);
    }
  }
}