//find average rating and max review for movie1.
import java.util.Scanner;
public class Movie_Review_Array{
  public static void main(String[] args){
    Movie_Review mr = new Movie_Review();
    mr.findAvgRating();
      }
}
class Movie_Review{
  public void findAvgRating(){
    Scanner sc = new Scanner(System.in);
    double sum=0,average;
    int review[][] = new int[3][4];
    System.out.println("enter array elements");
    for(int i=0;i<review.length;i++)
      for(int j=0;j<review[i].length;j++)
        review[i][j] = sc.nextInt();
    for(int i=0;i<review.length;i++){
      for(int j=0;j<review[i].length;j++)
        System.out.print(review[i][j]);
      System.out.println();
    }
      
    for(int i=0;i<review.length;i++)
      for(int j=0;j<review[i].length;j++)
        sum = sum+review[i][j];
    average = sum/12;
    System.out.println(" Average rating is "+average);
      
    int max=review[0][1];
        for(int i=1;i<review.length;i++){
          if(max<review[i][1])
            max = review[i][1];
        }
    System.out.println("max review of movie1 is "+max);
      }
}
        
    