import java.util.Scanner;
class Employee{
  private String empName;
  private int empId;
  private String empOrganization;
  public void setEmpName(String name){
    empName = name;
  }
  public void setEmpId(int id){
    empId = id;
  }
  public void setEmpOrganization(String org){
    empOrganization = org;
  }
  public String getEmpName(){
    return empName;
  }
  public int getEmpId(){
    return empId;
  }
  public String getEmpOrganization(){
    return empOrganization;
  }
  
}
public class EncapsilationExample{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Employee emp1 = new Employee();
    emp1.setEmpName("Swathi");
    emp1.setEmpId(411);
    emp1.setEmpOrganization("xyz");
    System.out.println("------Employee details------");
    System.out.println("Employee name : "+emp1.getEmpName());
    System.out.println("Employee id : "+emp1.getEmpId());
    System.out.println("Employee name : "+emp1.getEmpOrganization());
  }
}