import java.util.Scanner;
class PrintWeekNo{
  public void printWeek(){
    Scanner sc = new Scanner(System.in);
    int week_num;
    System.out.println("enter week number");
    week_num = sc.nextInt();
    switch(week_num){
      case 1 :System.out.println("Sunday");
        break;
      case 2 :System.out.println("Monday");
        break;
      case 3 :System.out.println("Tuesday");
        break;
      case 4 :System.out.println("Wednesday");
        break;
      case 5 :System.out.println("Thuesday");
        break;
      case 6 :System.out.println("Friday");
        break;
      case 7 :System.out.println("Saturday");
        break;
      default:System.out.println("Invalid week number");
        
    }
  }
}
public class WeekNumber{
  public static void main(String[] args){
    PrintWeekNo pw = new PrintWeekNo();
    pw.printWeek();
  }
} 