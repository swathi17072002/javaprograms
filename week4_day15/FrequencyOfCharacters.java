//program to find the frequency of characters in a string
import java.util.Scanner;
public class FrequencyOfCharacters{
  public static void main(String[] args){
    FrequencyOfChar foc = new FrequencyOfChar();
    foc.findFreq();
  }
}
class FrequencyOfChar{
  public void findFreq(){
    int count;
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String s1 = sc.nextLine();
    //char[] str = s1.toCharArray();
    boolean visited[] = new boolean[s1.length()];
    for(int i=0;i<s1.length();i++){
      ch = s1.charAt(i);
      if(visited[i]==true)
        continue;
      else{
      count=1;
      for(int j=i+1;j<s1.length();j++){
        if(s1.charAt(i)==s1.charAt(j)){
          count++;
          visited[j]=true;
        }
      }
      }
      System.out.println(ch+" "+count);
    }
  }
}