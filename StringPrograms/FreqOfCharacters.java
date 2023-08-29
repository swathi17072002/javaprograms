//program to find the frequency of characters in a string
import java.util.Scanner;
public class FreqOfCharacters{
  public static void main(String[] args){
    FreqOfChar foc = new FreqOfChar();
    foc.findFreq();
  }
}
class FreqOfChar{
  public void findFreq(){
    int count;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String s1 = sc.nextLine();
    char[] str = s1.toCharArray();
    boolean visited[] = new boolean[str.length];
    for(int i=0;i<str.length;i++){
      if(visited[i]==true)
        continue;
      else{
      count=1;
      for(int j=i+1;j<str.length;j++){
        if(str[i]==str[j]){
          count++;
          visited[j]=true;
        }
      }
      }
      System.out.println(str[i]+" "+count);
    }
  }
}