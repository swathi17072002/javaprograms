//WAP to find highest frequency character in a string.
import java.util.Scanner;
public class LowestFreqChar{
  public static void main(String[] args){
    LowestFreq lf = new LowestFreq();
    lf.lowestFreqChar();
  }
}
class LowestFreq{
  public void lowestFreqChar(){
    char character,lf_char=' ';
    int count=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    int lf_count = str.length();
    boolean visited[] = new boolean[str.length()];
    for(int i=0;i<str.length();i++){
      if(visited[i]==true)
        continue;
      else{
        count=1;
      for(int j=i+1;j<str.length();j++){
      if(str.charAt(i)==str.charAt(j)){
        visited[j]=true;
        count++;
      }
      }
    }
      if(lf_count>count){
        lf_count=count;
       lf_char = str.charAt(i);
      
    }
  }
     System.out.println("lowest frequency character is "+lf_char);
}
}
