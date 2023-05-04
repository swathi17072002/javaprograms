/* WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F */
import java.util.Scanner;
public class Program1 {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int physics, chemistry, biology,mathematics , computer;
    float total_marks, percentage;
    System.out.println("enter the marks obtained in Physics, Chemistry, Biology,Mathematics and Computer");
    physics=sc.nextInt();
    chemistry=sc.nextInt();
    biology=sc.nextInt();
    mathematics=sc.nextInt();
    computer=sc.nextInt();
    total_marks =(physics+chemistry+biology+mathematics+computer);
    percentage = total_marks/5;
    System.out.println("percentage is " + percentage);
    if (percentage>=90)
      System.out.println("Grade A");
    else if (percentage>=80)
      System.out.println("Grade B");
    else if (percentage>=70)
      System.out.println("Grade C");
    else if (percentage>=60)
      System.out.println("Grade D");
    else if (percentage>=40)
      System.out.println("Grade E");
    else
      System.out.println("Grade F");
  }
}