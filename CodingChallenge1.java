import java.util.*;

public class CodingChallenge1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the message to encrypt:");
    String message= sc.nextLine();
    String en_message ="";
    for(int i=0;i<message.length();i++){
      en_message = en_message+(char)(message.charAt(i)+3);
    }
    System.out.println("Encrypted Message: : "+en_message);
  }
}
  