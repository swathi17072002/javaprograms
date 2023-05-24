//write a java program to find the frequency of characters of last word of a string
import java.util.Scanner;
public class FreqOfLast{
  public static void main(String[] args){
    FreqOfCharecter foc = new FreqOfCharecter();
    foc.findFrequency();
  }
}
class FreqOfCharecter{
  public void findFrequency(){
    Scanner sc = new Scanner(System.in);
    int count;
    System.out.println("enter string");
    String str = sc.nextLine();
    boolean visited[] = new boolean[str.length()];
    String[] words = str.split(" ");
    String l_Word = words[words.length-1];
    for(int i=0;i<l_Word.length();i++){
      if(visited[i]==true)
        continue;
      else{
        count=1;
        for(int j=i+1;j<l_Word.length();j++){
          if(l_Word.charAt(i)==l_Word.charAt(j)){
            visited[j]=true;
            count++;
          }
        }
          
      }
      System.out.println("frequency of "+l_Word.charAt(i)+" is "+count);
    }
  }
}