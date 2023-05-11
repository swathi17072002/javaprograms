//assume that there are 500,200 and 100 notes are there in the ATM. write a java program to find the minimum number of notes to be dispensed for the requested amount using conditionals only . do not use loops

import java.util.Scanner;
class Notes{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int notes;
int min_notes=0;
System.out.println("enter the amount");
notes=sc.nextInt();
min_notes=sc.nextInt();
if(amount>=500)
{
notes=amount%500;
min_notes=min_notes+notes;
}
else if(amount>=200)
{
notes=amount%200;
min_notes=min_notes+notes;
}
else if(amount>=100)
{
notes=amount%100;
min_notes=min_notes+notes;
}
System.out.println("min_notes are"+min_notes);
}
}