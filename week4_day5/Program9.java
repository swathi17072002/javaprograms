/*Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Program9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int age_in_year;
    System.out.println("enter the age in the format (yyyy-mm-dd)");
    String dateofbirthstring = sc.nextLine();
    LocalDate dateofbirth = LocalDate.parse(dateofbirthstring);
    LocalDate currentdate = LocalDate.now();
    Period age = Period.between(dateofbirth,currentdate);
    System.out.println("Your age is "+age.getYears()+" year "+age.getMonths()+" months "+age.getDays()+" days");
    age_in_year = age.getYears();
    if (age_in_year<18){
      System.out.println("You are a minor");
    }
    else{
      System.out.println("You are adult");
    }
  }
}
    