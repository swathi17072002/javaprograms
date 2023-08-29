/*You are tasked with creating a program that validates a user's password based on a specific pattern. The pattern requires the password to meet the following criteria:
 
The password must be at least eight characters long.
The password must contain at least one uppercase letter.
The password must contain at least one lowercase letter.
The password must contain at least one digit.
The password must contain at least one special character from the set: !@#$%^&*()-_+=
*/
import java.util.Scanner;
public class CheckValidPsd{
  public static void main(String[] args){
    CheckValidOrNot cv = new CheckValidOrNot();
    cv.checkPassword();
  }
}
class CheckValidOrNot{
  public void checkPassword(){
    Scanner sc = new Scanner(System.in);
    char ch;
    System.out.println("enter password");
    String psd = sc.nextLine();
    boolean u_letter=false,l_letter=false,digit=false,spe_char=false;
    if((psd.length())>=8){
      for(int i=0;i<psd.length();i++){
        ch = psd.charAt(i);
        if(ch>='A' && ch<='Z')
          u_letter=true;
        else if(ch>='a' && ch<='z')
          l_letter=true;
        else if(ch>='0' && ch<='9')
          digit=true;
        else{
          if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')' || ch=='-' || ch=='_' || ch=='+' || ch=='=')
          spe_char=true;
        }
      }
      if(u_letter && l_letter && digit && spe_char)
        System.out.println("password is valid");
      else
        System.out.println("not valid password");
    }
    else
      System.out.println("not valid password");
  }
}