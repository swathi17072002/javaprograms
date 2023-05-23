// WAP to search all occurrences of a character in given string.
import java.util.Scanner;
public class AllOccurencesOfChar{
  public static void main(String[] args){
    AllOccurence ao = new AllOccurence();
    ao.findIndex();
  }
}
class AllOccurence{
  public void findIndex(){
    char character;
    boolean found =false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    System.out.println("Enter a character");
    char ch = sc.next().charAt(0);
    int c=0;
    for(int i=0;i<str.length();i++){
      character = str.charAt(i);
      if(ch==character){
        found = true;
        c++;
        if(c==1)
          System.out.println("All occurences of character "+ch+" is at the indexes :");
        
      System.out.println(i);
        
      }
    }
    if(found==false)
      System.out.println(ch+" is not found in string ");
  }
}
