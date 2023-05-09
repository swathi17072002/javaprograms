/*Write a Java program that prompts the user to enter their weight in kilograms and height in meters, and calculates their body mass index (BMI) using conditional statements and you need to print underweight,healthy ,overweight and obessity according to the following
    bmi <18                underweight
    bmi >=18 and bmi<25    healthy
    i>=25 and bmi<30     overweight
    bmi>=30              obessity*/
import java.util.Scanner;
 class BMIClass{
  public void bmi() {
    Scanner sc = new Scanner(System.in);
    double height,weight,bmi;
    System.out.println("enter your height in metres");
    height = sc.nextDouble();
    System.out.println("enter your weight in kilograms");
    weight = sc.nextDouble();
    bmi = (weight/(height*height));
    if (bmi<18)
      System.out.println("you are underweight");
    else if ( bmi<25)
      System.out.println("you are healthy");
    else if (bmi<30)
      System.out.println("you are overweight");
    else
      System.out.println("you are obessity");
  }
}
public class CalBMI{
public static void main(String[] args){
  BMIClass bc = new BMIClass();
  bc.bmi();
}
}