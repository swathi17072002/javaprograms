//WAP to find highest frequency character in a string.
import java.util.Scanner;
public class Highest_Frequency_Main{
  public static void main(String[]args){
    Highest_Frequency call=new Highest_Frequency();
    call.frequency();
  }
}
class Highest_Frequency{
  public void frequency(){
    Scanner sc=new Scanner(System.in);
    char character,hf_char=' ';
    int count=0,hf_count=0;
    System.out.println("Enter a string");
    String str = sc.nextLine();
    boolean visited[]=new boolean[str.length()];
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
      if(hf_count<count){
        hf_count=count;
       hf_char = str.charAt(i);
      
    }
  }
     System.out.println("highest frequency character is "+hf_char);
}
}
