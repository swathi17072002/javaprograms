/*write a java program to reverse each word at its place in a string                                                           
    Sample input : Learning made easy at bitLabs
    Expected output : gninraeL edam ysae ta sbaLtib*/
import java.util.Scanner;
public class ReverseInItsPosition{
  public static void main(String[] args){
    ReverseInItsPost rp = new ReverseInItsPost();
    rp.findString();
  }
}
class ReverseInItsPost{
  public void findString(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string ");
    String s1 = sc.nextLine();
    String s2="";
    String[] words = s1.split(" ");
    for(int i=0;i<words.length;i=i+1){
      String word = words[i];
      String word_r="";
      for(int j=word.length()-1;j>=0;j--){
        word_r=word_r+word.charAt(j);
      }
      s2 = s2+word_r+" ";
    }
   System.out.print(s2);
  }
}
   