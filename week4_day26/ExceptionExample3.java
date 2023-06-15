import java.util.Scanner;
class InvalidAgeException extends Exception{
  InvalidAgeException(String msg){
    //super(msg);
  }
}
public class ExceptionExample3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age");
    try{
    int age = sc.nextInt();
      if(age<0){
        throw new InvalidAgeException("age is not negative");
      }
      else
      System.out.println("age is "+age);
    }
      catch(InvalidAgeException e){
      System.out.println("Checked Exception");
      System.out.println("Exception Caught : "+e.getMessage());
      }
    finally{
      System.out.println("Program executed successfully");
    }
  }
}