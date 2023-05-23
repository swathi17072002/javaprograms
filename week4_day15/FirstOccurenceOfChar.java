//WAP to find first occurrence of a character in a given string.
import java.util.Scanner;
public class FirstOccurenceOfChar{
  public static void main(String[] args){
    FirstOccurence fo = new FirstOccurence();
    fo.findIndex();
  }
}
class FirstOccurence{
  public void findIndex(){
    char character;
    boolean found =false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    System.out.println("Enter a character");
    char ch = sc.next().charAt(0);
    for(int i=0;i<str.length();i++){
      character = str.charAt(i);
      if(ch==character){
        found = true;
      System.out.println("first occurence of "+ch+" is at index "+i);
        break;
      }
    }
    if(found==false)
      System.out.println(ch+" is not found in string ");
  }
}
