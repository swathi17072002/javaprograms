//WAP to print all odd number between 1 to 100.
class CheckOdd{
  public boolean isOdd(int j){
    if(j%2!=0)
      return true;
    else
      return false;
  }
}
public class PrintOddNumbers{
  public static void main(String[] args){
    CheckOdd cod = new CheckOdd();
    int i;
    for(i=1;i<=100;i++){
    boolean b = cod.isOdd(i);
      if(b)
        System.out.println(i);
    }
  }
}