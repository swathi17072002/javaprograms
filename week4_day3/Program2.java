/*Write the java program to check whether the entered character is alphabet or digit or specal symbol*/
import java.util.Scanner;
public class Program2{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println("entered character");
    ch=ch=sc.next().charAt(0);
    if ((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z'))
      System.out.println("entered character is alphabet");
    else if (ch<=0 && ch>=9)
      System.out.println("entered character is digit");
    else 
      System.out.println("entered character is special symbol");
        
  }
}