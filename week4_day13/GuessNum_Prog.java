/*Create a number guessing game where the computer generates a random number and the user has to guess it. if user Guess is incorrect, then give hints (weather the actual number is less than/ greater than guess number).*/
import java.util.Scanner;
import java.util.Random;
public class GuessNum_Prog{
  public static void main(String[] args) {
    Program c= new Program();
    c.test();
  }
}
  class Program{
    public void test(){
      Scanner sc =new Scanner(System.in);
    
      Random random= new Random();
      int guess;
     
      int randomnumber=random.nextInt(10);
     
        System.out.println("guess a number");
        guess=sc.nextInt();
        System.out.println("random number is:" +randomnumber);
       
        if(guess==randomnumber){
          System.out.println("you guessed the correct number");
        
        }
        else if(guess<randomnumber){
          System.out.println("the number is greater then guess number");
        }
        else {
          System.out.println("the number is less then guess number");
        }
       
    
    }
  }