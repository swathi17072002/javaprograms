//program on assignment operators

import java.util.Scanner;
public class Program1 {
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,variable;
    System.out.println("enter a value");      
    a = sc.nextInt();
    //assigning value using =
    variable = a;
    System.out.println("var using = : "+variable);
    //assigning value using +=
    variable += a;
    System.out.println("var using += :"+variable);
    //assigning value using -=
    variable -= a;
    System.out.println("var using -= :"+variable);
    //assigning value using *=
    variable *= a;
    System.out.println("var using *= : "+variable);
    //assigning value using /=
    variable /= a;
    System.out.println("var using /= :"+variable);
    //assigning value using %=
    variable %= a;
    System.out.println("var using %= :"+variable);
  }
}