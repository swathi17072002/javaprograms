package collectionsconcepts;
import java.util.*;
class Employee implements Comparable<Employee>{
String name;
int id;
double salary;
Employee(String name,int id,double salary){
  this.name = name;
  this.id = id;
  this.salary = salary;
}
public String toString(){
  return name+" "+id+" "+salary;
}
public int compareTo(Employee e) {
	return this.id-e.id;
}
}
class ComparableExample{
public static void main(String[] args){
  TreeSet<Employee> al = new TreeSet<>();
  Employee e1 = new Employee("swetha",2,30000);
  Employee e2 = new Employee("swathi",1,40000);
  Employee e3 = new Employee("varsha",3,25000);
  al.add(e1);
  al.add(e2);
  al.add(e3);
  for(Employee ee : al){
    System.out.println(ee);
    }
}
}
