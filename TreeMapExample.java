package collectionsconcepts;
import java.util.*;
class Student{
  String name;
  int id;
  Student(String name,int id){
    this.name = name;
    this.id = id;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public String toString(){
    return name+" "+id;
  }
}
class Comp1 implements Comparator<Student>{
public int compare(Student o1, Student o2) {
    return o2.getId()-o1.getId();
}
}
class TreeMapExample{
  public static void main(String[] args){
    Map<Student,String> m = new TreeMap<>(new Comp1());
    Student s1 = new Student("Swathi",4);
    Student s2 = new Student("Swetha",3);
    Student s3 = new Student("Madhavi",2);
    Student s4 = new Student("Varsha",5);
    Student s5 = new Student("Harika",1);
    m.put(s1,"A");
    m.put(s2,"C");
    m.put(s3,"E");
    m.put(s4,"D");
    m.put(s5,"B");
   Set entries = m.entrySet();
    for(Object ob : entries){
      Map.Entry o = (Map.Entry)ob;
      System.out.println(o.getKey()+"-->"+o.getValue());
    }
  }
}
