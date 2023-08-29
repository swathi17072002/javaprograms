//write the program to print all the polindrome words in a string
import java.util.Scanner;
public class CheckPolindromeOfEachWord{
  public static void main(String[] args){
    CheckPolindrome_OfWord lw = new CheckPolindrome_OfWord();
    lw.findPolindromeWord();
  }
}

class CheckPolindrome_OfWord{
  public void findPolindromeWord(){
    String word ="";
    //String rev_word ="";
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
      if(rev_word.equals(word))
        System.out.println(word);
    }
  }
}