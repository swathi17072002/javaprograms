//You are a software developer working on a student grade analysis program. Your task is to develop a program that allows users to enter the grades for each student and perform various operations, such as calculating the average grade, finding the highest and lowest grades, and determining the number of students who passed or failed based on a pass mark of 50. 

//

//Sample Input and Output: 

//

//Welcome to the Student Grade Analyzer! 

//

//Enter the number of students: 5 

//

//Enter the grades for each student: 

//

//Student 1: 85 

//

//Student 2: 90 

//

//Student 3: 76 

//

//Student 4: 68 

//

//Student 5: 92 

//

// 

//

//Average Grade: 82.2 

//

//Highest Grade: 92 

//

//Lowest Grade: 68 

//

//Passing Grade: 70 

//

//Number of students who passed: 3 

//

//Number of students who failed: 2 

//

//Thank you for using the Student Grade Analyzer!
import java.util.Scanner;
public class StudentGradeAnalysis{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Student Grade Analyzer! ");
    System.out.println("Enter the number of students: ");
    int n = sc.nextInt();
    int stud[] = new int[n];
    System.out.println("Enter grades of each Student");
    for(int i=0;i<n;i++){
      stud[i] = sc.nextInt();
    }
    double sum=0;
    for(int i=0;i<n;i++){
      sum = sum+stud[i];
    }
    double average = sum/n;
    int highestGrade = stud[0];
    for(int i=0;i<n;i++){
      if(highestGrade<stud[i]){
        highestGrade=stud[i];
      }
    }
    int lowestGrade = stud[0];
    for(int i=0;i<n;i++){
      if(lowestGrade>stud[i]){
        lowestGrade=stud[i];
      }
    }
    System.out.println("Enter the passing grade");
    int passGrade = sc.nextInt();
    int pass=0,fail=0;
    for(int i=0;i<n;i++){
      if(passGrade>stud[i]){
        fail++;
      }
      if(passGrade<=stud[i]){
        pass++;
      }
    }
    System.out.println("Average Grade : "+average);
    System.out.println("Highest Grade : "+highestGrade);
    System.out.println("Lowest Grade : "+lowestGrade);
    System.out.println("Number of students who passed: "+pass);
    System.out.println("Number of students who failed: "+fail);
    System.out.println("Thank you for using the Student Grade Analyzer!");
  }
}