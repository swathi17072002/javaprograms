//WAP to find last occurrence of a character in a given string.
import java.util.Scanner;
public class LastOccurenceOfChar{
  public static void main(String[] args){
    LastOccurence lo = new LastOccurence();
    lo.findIndex();
  }
}
class LastOccurence{
  public void findIndex(){
    char character;
    boolean found =false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    System.out.println("Enter a character");
    char ch = sc.next().charAt(0);
    for(int i=str.length()-1;i>=0;i--){
      character = str.charAt(i);
      if(ch==character){
        found = true;
      System.out.println("last occurence of "+ch+" is at index "+i);
        break;
      }
    }
    if(found==false)
      System.out.println(ch+" is not found in string ");
  }
}
