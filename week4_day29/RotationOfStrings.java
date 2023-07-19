
/*Question 6: 

Scenario: You are given two strings, s1 and s2, each containing only lowercase letters. Your task is to determine if s2 is a rotation of s1. s2 is a rotation of s1, so the function returns true otherwise false 

Question: Write a Java program that checks if one string is a rotation of another. Implement a logical approach using strings to determine the rotation. 

Sample Input: 

 String s1 = "abcd"; 

String s2 = "cdab"; 

 Sample Output: 

 Is s2 a rotation of s1? true 

Hint: 

Consider the string "abcd". If we rotate it by one position to the left, we get "bcda". If we continue rotating it, we get "cdab", "dabc", and finally, if we rotate it by one more position to the left, we get back to the original string "abcd". */
import java.util.Scanner;
public class RotationOfStrings{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    FindRotation fr = new FindRotation();
    boolean found =false;
    System.out.println("enter string 1 :");
    String s1 = sc.nextLine();
    System.out.println("enter string 2 :");
    String s2 = sc.nextLine();
    for(int m=1;m<s1.length();m++){
      String ss = fr.rotate(s1,m);
      if(ss.equals(s2)){
        found = true;
        System.out.println("true");
        break;
      }
    }
    if(!found)
      System.out.println("false");
  }
}
class FindRotation{
  public String rotate(String s1,int m){
    String s2 = "";
    for(int i=m;i<s1.length();i++){
        s2 = s2+s1.charAt(i);
      }
    for(int i=0;i<m;i++){
        s2 = s2+s1.charAt(i);
      }
    return s2;
    
    }
  }
