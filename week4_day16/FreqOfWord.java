//write a java program to find the frequency of each word in a string
import java.util.Scanner;
public class FreqOfWord{
  public static void main(String[] args){
    FrequencyOfWord fow = new FrequencyOfWord();
    fow.findFrequency();
  }
}
class FrequencyOfWord{
  public void findFrequency(){
    Scanner sc = new Scanner(System.in);
    int count;
    System.out.println("enter string");
    String str = sc.nextLine();
    String[] s1 = str.split(" ");
    boolean visited[] = new boolean[s1.length];
    for(int i=0;i<s1.length;i++){
      if(visited[i]==true)
        continue;
      else{
        count=1;
        for(int j=i+1;j<s1.length;j++){
          if(s1[i].equals(s1[j])){
            count++;
            visited[j]=true;
          }
        }
      }
      System.out.println(s1[i]+"\t"+count);
    }
  }
}