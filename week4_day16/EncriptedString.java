//find Encryption of the given string
import java.util.Scanner;
public class EncriptedString{
  public static void main(String[] args){
    EncriptedStr es = new EncriptedStr();
    es.findString();
  }
}
class EncriptedStr{
  public void findString(){
    Scanner sc = new Scanner(System.in);
    char ch,charecter;
    System.out.println("enter string (in alphabets)");
    String s1 = sc.nextLine();
    String en_s1 = "";
    for(int i=0;i<s1.length();i++){
      ch = s1.charAt(i);
      if(ch>='a' && ch<='z'){
        if((ch+3)>122){
          charecter = (char)((ch+3)-26);
          en_s1 = en_s1+charecter;
        }
        else
          en_s1 = en_s1+(char)(ch+3);
      }
      else{
        if((ch+3)>90){
          charecter = (char)((ch+3)-26);
          en_s1 = en_s1+charecter;
        }
        else
          en_s1 = en_s1+(char)(ch+3);
      }
    }
    System.out.println(en_s1);
  }
}