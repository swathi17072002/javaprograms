class Student{
  String name;
  int id;
  String branch;
  public void setName(String name){
    this.name = name;
  }
  public void setId(int id){
    this.id = id;
  }
  public void setBranch(String branch){
    this.branch = branch;
  }
  public String getName(){
    return this.name;
  }
  public int getId(){
    return this.id;
  }
  public String getBranch(){
    return this.branch;
  }
}
public class Example2{
  public static void main(String[] args){
    Student s1 = new Student();
    s1.setName("swathi");
    s1.setId(411);
    s1.setBranch("ECE");
    System.out.println("name is "+s1.getName());
    System.out.println("id is "+s1.getId());
    System.out.println("branch is "+s1.getBranch());

    Student s2 = new Student();
    s2.setName("swetha");
    s2.setId(412);
    s2.setBranch("ECE");
    System.out.println("name is "+s2.getName());
    System.out.println("id is "+s2.getId());
    System.out.println("branch is "+s2.getBranch());
  }
}