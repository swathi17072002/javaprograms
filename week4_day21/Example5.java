import java.util.Scanner;
public class Example5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   System.out.println("enter string");
    String str = sc.nextLine();
    String rev_str ="";
    for(int i=str.length()-1;i>=0;i--){
      rev_str = rev_str+str.charAt(i);
    }
    System.out.println(rev_str);
  }
}