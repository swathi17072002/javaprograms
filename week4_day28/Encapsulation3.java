/*Create a class called Student with private properties name, age, and grade. Implement public methods to get the student's name, set the student's age, and calculate the student's grade based on exam scores. Use encapsulation to control access to the private properties and maintain the integrity of the data.*/
import java.util.Scanner;
class Student{
  private String name;
  private int age;
  private char grade;
  public void setName(String name1){
    name = name1;
  }
  public String getName(){
    return name;
  }
  public void setAge(int age1){
    age = age1;
  }
  public int getAge(){
    return age;
  }
  public char calculateGrade(float avgExamScore){
    if(avgExamScore>=90)
      return 'A';
  
    else if(avgExamScore>=80)
      return 'B';
    else if(avgExamScore>=70)
      return 'C';
    else if(avgExamScore>=60)
      return 'D';
    else if(avgExamScore>=50)
      return 'E';
    else
      return 'F';
  }
}
public class Encapsulation3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student();
    System.out.println("Enter Name");
    s1.setName(sc.nextLine());
    System.out.println("Enter Age");
    s1.setAge(sc.nextInt());
    System.out.println("Enter Avgerage Exam Score");
    float avgExamScore = sc.nextFloat();

    System.out.println("********** Student Details **********");
    System.out.println("Name : "+s1.getName());
    System.out.println("Age : "+s1.getAge());
    System.out.println("Grade : "+s1.calculateGrade(avgExamScore));
  }
}