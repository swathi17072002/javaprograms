//write the java program to find the largest polindrome word in a string
import java.util.Scanner;
public class Largest_Polindrome_Word{
  public static void main(String[] args){
    Largest_Polindrome lp = new Largest_Polindrome();
    lp.findPolindromeWord();
  }
}

class Largest_Polindrome{
  public void findPolindromeWord(){
    String larg_polindrome ="";
    int length=0;
    String word ="";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str = sc.nextLine();
    String words[] = str.split(" ");
    for(int i=0;i<words.length;i++){
        String rev_word ="";
      word = words[i];
      for(int j=word.length()-1;j>=0;j--){
        rev_word =rev_word+word.charAt(j);
      }
      if(rev_word.equals(word)){
        if(length<word.length())
        {
            length=word.length();
            larg_polindrome =word;
        }
      }
    }
    System.out.println("largest polindrome word is "+larg_polindrome);
  }
}