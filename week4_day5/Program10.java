/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.X can be placed before L (50) and C (100) to make 40 and 90.C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
 
Example 1:
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Program10{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String roman_num = "";
    int num,r;
    System.out.println("enter the number");
    num = sc.nextInt();
    if (num>=1000)
    {
      int i=0;
      r = num/1000;
      while(i<r)
        {
          roman_num = roman_num+"M";
          i++;
        }
      num = num%1000;
    }
    if (num>=900)
    {
       roman_num = roman_num+"CM";
      num = num%900;
    }
   if (num>=500)
    {
      roman_num = roman_num+"D";
      num = num%500;
    }
    if (num>=400)
    {
      roman_num = roman_num+"CD";
      num = num%400;
    }
    if (num>=100)
    {
      int i=0;
      r = num/100;
      while(i<r)
        {
          roman_num = roman_num+"C";
          i++;
        }
      num = num%100;
    }
    if (num>=90)
    {
      roman_num = roman_num+"XC";
      num = num%90;
    }
    if (num>=50)
    {
      roman_num = roman_num+"L";
      num = num%50;
    }
    if (num>=40)
    {
      roman_num = roman_num+"XL";
      num = num%40;
    }
    if (num>=10)
    {
      int i=0;
      r = num/10;
      while(i<r)
        {
          roman_num = roman_num+"X";
          i++;
        }
      num = num%10;
    }
    if (num==9)
    {
      roman_num = roman_num+"IX";
      num = num%9;
    }
    if (num>=5)
    {
      roman_num = roman_num+"V";
      num = num%5;
    }
    if (num==4)
    {
       roman_num = roman_num+"IV";
       num = num%4;
    }
    if (num>0)
    {  
      int i=0;
      r = num/1;
      while(i<r)
        {
          roman_num = roman_num+"I";
          i++;
        }
    
    }
    System.out.println(roman_num);
    
  }
}