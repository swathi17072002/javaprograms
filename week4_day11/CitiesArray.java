//program to declare and initialize the array elements with 5 city names and print that city names 
import java.util.Scanner;
public class CitiesArray{
  public static void main(String[] args){
    StringArray sa = new StringArray();
    String a[] = sa.cArray();
    System.out.println("cities we entered are :");
    for(int j=0;j<a.length;j++)
      System.out.print(a[j]+" ");
  }
}
class StringArray{
  public String[] cArray(){
    Scanner sc = new Scanner(System.in);
    String[] cities = new String[5] ;
    System.out.println("enter 5 cities :");
    for(int i=0;i<cities.length;i++)
      cities[i] = sc.next();
    /*System.out.println("cities we entered are :");
    for(int j=0;j<cites.length;j++)
      System.out.print(cites[j]+" ");*/
    return cities;
  }
}