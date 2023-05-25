/*write a java program that returns the longest word in the string.If there are two or more words that are the same length, return the first word from the string with that length. Words may also contain numbers, for example "Hello world123 567"*/
import java.util.Scanner;
public class Longest_Word{
  public static void main(String[] args){
    LongestWord lw = new LongestWord();
    lw.findLongestWord();
  }
}

class LongestWord{
  public void findLongestWord(){
    int longest_length = 0,longest;
    String long_word="";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str = sc.nextLine();
    String words[] = str.split(" ");
    for(int i=0;i<words.length;i++){
      longest = words[i].length();
      if(longest_length<longest)
      {
        longest_length=longest;
        long_word=words[i];
      }
    }
    System.out.println("longest word is "+long_word+" with length "+longest_length);
  }
}