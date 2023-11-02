import java.util.*;
public class CodingChallenge4{
public static int longestImprovement(int[] student_progress){
  int longest_Improvement=0;
  int i,j;
  for(i=0,j=i+1;i<student_progress.length-1;i++){
    if(student_progress[i]>student_progress[j]){
      longest_Improvement++;
    }
    else{
      longest_Improvement=0;
    }
  }
  return longest_Improvement;
}
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int student1_progress[] ={78, 80, 85, 89, 92, 94, 96, 91, 92, 94};
    int student2_progress[] ={65, 70, 68, 75, 78, 82, 88, 87, 90, 93};
    int student3_progress[] ={88, 80, 85, 82, 90, 92, 95, 96, 98, 94};
    int longest_improvement_of_student1 = longestImprovement(student1_progress);
    System.out.println(" For Student 1, the longest continuous improvement sequence has a length of "+longest_improvement_of_student1);
    int longest_improvement_of_student2 = longestImprovement(student2_progress);
    System.out.println(" For Student 1, the longest continuous improvement sequence has a length of "+longest_improvement_of_student2);
    int longest_improvement_of_student3 = longestImprovement(student3_progress);
    System.out.println(" For Student 1, the longest continuous improvement sequence has a length of "+longest_improvement_of_student3);
  }
}
  