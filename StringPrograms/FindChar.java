
//WAP to read string and character and find the index of the character in a string
import java.util.Scanner;
public class FindChar{
  public static void main(String[] args){
    IndexChar ioc = new IndexChar();
    ioc.findIndex();
  }
}
class IndexChar{
  public void findIndex(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    System.out.println("Enter a character");
    char ch = sc.next().charAt(0);
    int index = str.indexOf(ch);
if(index==-1)
  System.out.println(ch+" is not found in string "+str);
else
  System.out.println(ch+" is found in string "+str+" which is at index "+index);
}
}