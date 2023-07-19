/*Nikhil, the founder of “Pine Tree” company wished to design an Event Management System that would let its Customers plan and host events seamlessly via an online platform.
As a part of this requirement, Nikhil wanted to write a piece of code for his company’s Amphi Event Management System that will display customized welcome messages by taking Customers’ name as input. Help Nikhil on the task.
Input Format:
First line of the input is a string that corresponds to a Customer’s name. Assume that the maximum length of the string is 50.
Output Format:
Output should display the welcome message along with the Customer’s name.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter your name
Beena
Hello Beena ! Welcome to Amphi Event Management System*/
import java.util.Scanner;
public class EventManagementSystem{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.nextLine();
    if(name.length()<=50){
      System.out.println("Hello "+name+" ! Welcome to Amphi Event Management System");
    }
    else{
      System.out.println("String consist of maximum 50 characters");
    }
  }
}