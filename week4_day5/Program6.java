/*WAP to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.Scanner;
public class Program6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double basic_salary,hra,da,gross_salary;
    System.out.println("enter the basic salary of an employee");
    basic_salary = sc.nextDouble();
    if (basic_salary<=10000)
    {
      hra = (20*basic_salary)/100;
      da = (80*basic_salary)/100;
    }
    else if (basic_salary<=20000)
    {
      hra = (25*basic_salary)/100;
      da = (90*basic_salary)/100;
    }
    else
    {
      hra = (30*basic_salary)/100;
      da = (95*basic_salary)/100;
    }
    gross_salary = basic_salary+hra+da;
    System.out.println("gross salary of an employee is "+gross_salary);
  }
}
    