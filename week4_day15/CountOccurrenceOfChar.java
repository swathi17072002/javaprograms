//WAP to count occurrences of a character in given string.
import java.util.Scanner;
public class CountOccurrenceOfChar{
  public static void main(String[] args){
    CountOccurrence co = new CountOccurrence();
    co.countOccurrence();
  }
}
class CountOccurrence{
  public void countOccurrence(){
    char character;
    int count=0;
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
        count++;
      }
    }
    System.out.println(ch+" is occure in "+count+" times");
  }
}
