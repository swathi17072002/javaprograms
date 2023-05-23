import java.util.Scanner;
public class CountAlphaDigSpecial{
  public static void main(String[] args){
    FindCount fc = new FindCount();
    fc.count();
  }
}
class FindCount{
  public void count(){
    Scanner sc = new Scanner(System.in);
    int alphaCount=0,digitCount=0,specialCount=0;
    System.out.println("enter a string");
    String s1 = sc.nextLine();
    for(int i=0;i<s1.length();i++){
      char ch = s1.charAt(i);
      if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
        alphaCount++;
      else if(ch>='0' && ch<='9')
        digitCount++;
      else
        specialCount++;
    }
    System.out.println("alphabet count is "+alphaCount);
    System.out.println("digit count is "+digitCount);
    System.out.println("special character count is "+specialCount);
  }
}