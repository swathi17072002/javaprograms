//WAP to input week number and print week day.
import java.util.Scanner;
public class Program7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int week_num ;
    System.out.println("enter week number");
    week_num = sc.nextInt();
    switch(week_num)
      {
        case 1:
          System.out.println("Sunday");
          break;
        case 2:
          System.out.println("Monday");
          break;
        case 3:
          System.out.println("Tuesday");
          break;
        case 4:
          System.out.println("Wednesday");
          break;
        case 5:
          System.out.println("Thursday");
          break;
        case 6:
          System.out.println("Friday");
          break;
        case 7:
          System.out.println("Saturday");
          break;
        default:
          System.out.println("Invalid week number");
      }
  }
}