
import java.util.Scanner;
public class CountVowelsConsonants{
  public static void main(String[] args){
    VowelsConsonants vc = new VowelsConsonants();
    vc.count();
  }
}
class VowelsConsonants{
  public void count(){
    char ch;
    int vowelCount=0,consonantCount=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    for(int i=0;i<str.length();i++){
      ch = str.charAt(i);
      if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'||  ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' )
        vowelCount++;
      else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        consonantCount++;
    }
    System.out.println("vowel count is "+vowelCount);
    System.out.println("consonant count is "+consonantCount);
  }
}