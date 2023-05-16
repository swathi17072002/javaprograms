// WAP to print all alphabets from a to z. - using while loop
class AlphabetMain{
public void alphabets(){
  char ch= 'a';
  while(ch>='a' && ch<='z')
    {
      System.out.println(ch);
      ch++;
    }
}
}
public class PrintAlphabets{
  public static void main(String[] args){
    AlphabetMain am = new AlphabetMain();
    am.alphabets();
  }
}