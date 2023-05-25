/*write the method BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly
matched and each one is accounted for. Otherwise return 0. For example: if str is "(hello (world))", 
then the output should be 1, but if str is "((hello (world))" the the output should be 0
because the brackets do not correctly match up. Only "(" and ")" will be used as brackets. 
If str contains no brackets return 1.*/
 import java.util.Scanner;
 public class BracketMatcher{
     public static void main(String[] args){
         Bracket_Matcher bm = new Bracket_Matcher();
         Scanner sc  = new Scanner(System.in);
         System.out.println("enter string");
         String str = sc.nextLine();
         int b = bm.bracketMatcher(str);
         if(b==1)
         System.out.println("correct bracket matching");
         else
         System.out.println("not correct bracket matching");
     }
 }
 class Bracket_Matcher{
     public int bracketMatcher(String s1){
         char ch;
         int open_brackets=0,close_brackets=0;
         for(int i=0;i<s1.length();i++){
             ch = s1.charAt(i);
             if(ch=='(')
             open_brackets++;
             else if(ch==')')
             close_brackets++;
         }
         if(open_brackets==close_brackets)
         return 1;
         else
         return 0;
     }
 }