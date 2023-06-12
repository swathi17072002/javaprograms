import java.util.Scanner;
class Student{
  String name;
  int id;
  String branch;
  static String college = "Avanthi";

  public void setName(String name1){
    name = name1;
  }
  public void setId(int id1){
   id = id1;
  }
  public void setBranch(String branch1){
    branch = branch1;
  }
  /*public void setCollege(String college1){
    college = college1;
  }*/
  
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public String getBranch(){
    return branch;
  }
  public String getCollege(){
    return college;
  }
}

public class GetterAndSetterMethods{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of students");
    int n = sc.nextInt();
    Student stud[] = new Student[n];
    for(int i=0;i<n;i++){
      stud[i] = new Student();
      
      sc.nextLine();
      System.out.println("Enter name :");
      String name1 = sc.nextLine();
      stud[i].setName(name1);
      System.out.println("Enter id :");
      int id1 = sc.nextInt();
      stud[i].setId(id1);
      sc.nextLine();
      System.out.println("Enter branch :");
      String branch1 = sc.nextLine();
      stud[i].setBranch(branch1);
      /*System.out.println("Enter college :");
      String college1 = sc.nextLine();*/
      //stud[i] = new Student();
    }
    for(int i=0;i<n;i++){
      System.out.println("------Student "+(i+1)+" details------");
      System.out.println("name : "+stud[i].getName());
      System.out.println("id : "+stud[i].getId());
      System.out.println("branch : "+stud[i].getBranch());
      System.out.println("college : "+stud[i].getCollege());
      System.out.println();
    }
  }
}
