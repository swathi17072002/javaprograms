/*Create a program that maintains an array of Student objects. Each Student object should have a studentId, studentName, rollNo, mobileNumber, marks, and address. 
The program should allow the user to input the data for each student dynamically with validations. After inputting the data for five students, the program should display the data for all five students.
 
1.studentId should be a unique id and id should contains 5-digit number only.
2.Name should contain only letters and should be between 2 and 30 characters long.
3.rollNo should be a positive integer.
4.Mobile should contains only 10 digits and should starts with 9 or 8 or 7 or 6.
5.Marks should be a positive integer, and should a two digits number.
6.Address should be between 5 and 100 characters long.
To complete this task, you'll need to write Java code that includes the following:
Define the Student class with the required fields (studentId, studentName, RollNo, mobileNumber, marks, and address) and create setter and getter methods.
1.Create an array of Student objects with a length of 5.
2.Prompt the user to input the data for each student dynamically.
3.Store the inputted data in the corresponding Student object in the array.
4.Display the data for all five students after all data has been inputted.
 
Here's an example input and output for the program: 
----------------------------------------------------------- 
Sample Input: 
------- 
Enter how many students do you want to add : 2
 
Enter data for student 1: 
Student ID: 12345 
Name: John Smith 
Roll number: 101 
Mobile: 934637673 
Marks: 87.5 
Address: 123 Main St, Anytown USA 
 
Enter data for student 2: 
Student ID: 56784 
Name: Jane Doe 
Roll number: 102 
Mobile: 928972973 
Marks: 92.0 
Address: 456 Elm St, Anytown USA
 
Output: 
-------- 
Student ID: 12345
Name: John Smith 
Roll number: 101 
Mobile: 934637673
Marks: 87.5 
Address: 123 Main St, Anytown USA 
 
Student ID: 56784
Name: Jane Doe 
Roll number: 102 
Mobile:  928972973 
Marks: 92.0 
Address: 456 Elm St, Anytown USA */

import java.util.Scanner;
class Student{
  private long studentId;
  private String studentName;
  private int rollNo;
  private long mobileNumber;
  private double marks; 
  private String address;

  //setter methods
  public void setStudentId(long id1){
    studentId = id1;
  }
  public void setStudentName(String name1){
    studentName = name1;
  }
  public void setRollNo(int rollNo1){
    rollNo = rollNo1;
  }
  public void setMobileNumber(long mobileNumber1){
    mobileNumber = mobileNumber1;
  }
  public void setMarks(double marks1){
    marks = marks1;
  }
  public void setAddress(String address1){
    address = address1;
  }
  //getter methods
  public long getStudentId(){
    return studentId;
  }
  public String getStudentName(){
    return studentName;
  }
  public int getRollNo(){
    return rollNo;
  }
  public long getMobileNumber(){
    return mobileNumber;
  }
  public double getMarks(){
    return marks;
  }
  public String getAddress(){
    return address;
  }
}
public class StudentDetails{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Student stud[] = new Student[5];
    for(int i=0;i<5;i++){
      stud[i] = new Student();
      System.out.println("Enter data for student "+(i+1));
      System.out.println("Student ID: ");
      long id1 = sc.nextLong();
      stud[i].setStudentId(id1);
      sc.nextLine();
      System.out.println("Name: ");
      String name1 = sc.nextLine();
      stud[i].setStudentName(name1);
      System.out.println("Roll number: ");
      int rollNo1 = sc.nextInt();
      stud[i].setRollNo(rollNo1);
      System.out.println("Mobile: ");
      long mobileNumber1 = sc.nextLong();
      stud[i].setMobileNumber(mobileNumber1);
      System.out.println("Marks: ");
      double marks1 = sc.nextDouble();
      stud[i].setMarks(marks1);
      sc.nextLine();
      System.out.println("Address: ");
      String address1 = sc.nextLine();
      stud[i].setAddress(address1);
      
    }
    for(int i=0;i<5;i++){
      System.out.println();
      System.out.println("Student ID: "+stud[i].getStudentId());
      System.out.println("Name: "+stud[i].getStudentName());
      System.out.println("Roll number: "+stud[i].getRollNo());
      System.out.println("Mobile: "+stud[i].getMobileNumber());
      System.out.println("Marks: "+stud[i].getMarks());
      System.out.println("Address: "+stud[i].getAddress());
    }
  }
}