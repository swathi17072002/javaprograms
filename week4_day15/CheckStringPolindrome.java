//WAP to check whether a string is palindrome or not.
import java.util.Scanner;
public class CheckStringPolindrome{
  public static void main(String[] args){
    CheckPolindrome cp = new CheckPolindrome();
    cp.ispolindrome();
  }
}
class CheckPolindrome{
  public void ispolindrome(){
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String s1 = sc.nextLine();
    String s2="";
    for(j=(s1.length()-1);j>=0;j--){
      s2 = s2+s1.charAt(j);
    }
  if(s1.equals(s2))
    System.out.println(s1+" is polindrome");
  else
    System.out.println(s1+" is not polindrome");
  }
}