//write a java program to check whether a character is digit or not

import java.util.Scanner;
class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch ;
        System.out.println("enter the character");
        ch = sc.next().charAt(0);
        if (ch>='0' && ch<='9')
        {
            System.out.println("entered character is a digit");
        }
        else
        {
            System.out.println("entered character is not a digit");
        }
    }
}