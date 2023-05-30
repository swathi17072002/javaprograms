//write a java program to find the largest palindrome substring in a string
import java.util.Scanner;
public class LargestPolindromeSubstring{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    PolindromeSubstring ps = new PolindromeSubstring();
    System.out.println("enter string");
    String str = sc.nextLine();
    String long_pol_str = ps.isLargestPolindromeSubstring(str);
    System.out.println("longest polindrome substring is :"+long_pol_str);
  }
}
class PolindromeSubstring{
  public String isLargestPolindromeSubstring(String s){
    String lar_pol_substring="";
    int length=0;
    for(int i=0;i<s.length();i++){
      for(int j=i;j<s.length();j++){
        String rev="";
        for(int k=i;k<=j;k++){
          rev=s.charAt(k)+rev;
        }
        if(rev.equals(s.substring(i,j+1))){
          if(length<rev.length()){
            lar_pol_substring=s.substring(i,j+1);
            length = rev.length();
          }
        }
          
      }
    }
    return lar_pol_substring;
  }
}