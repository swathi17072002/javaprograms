//WAP to find reverse of a string.
import java.util.Scanner;
public class ReverseString{
  public static void main(String[] args){
    FindReverseString frs = new FindReverseString();
    frs.reverse();
  }
}
class FindReverseString{
  public void reverse(){
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String s1 = sc.nextLine();
    String s2="";
    for(j=(s1.length()-1);j>=0;j--){
      s2 = s2+s1.charAt(j);
    }
  System.out.println(s2);
  }
}