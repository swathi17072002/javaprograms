class Teacher{
  String name;
  static String profession = "Teaching";
  static String collegeName ="Avanthi";
  void does(){
    //System.out.println("----Teaching-----");
    System.out.println("Profession : "+profession+"\nCollege Name : "+collegeName);
  }
}
class TechnicalTeacher extends Teacher{
  static String mainSub = "Coding";
  TechnicalTeacher(String name1){
    name = name1;
  }
  void does(){
    System.out.println("Name : "+name);
    super.does();
    System.out.println("main subject : "+mainSub);
  }
}
class SoftSkillTeacher extends Teacher{
  static String mainSub = "SoftSkill";
  SoftSkillTeacher(String name1){
    name = name1;
  }
  void does(){
    System.out.println("Name : "+name);
    super.does();
    System.out.println("main subject : "+mainSub);
  }
}

public class HierarchicalInheritence{
  public static void main(String[] args){
    TechnicalTeacher tt = new TechnicalTeacher("Swathi");
    SoftSkillTeacher st = new SoftSkillTeacher("pavan");
    tt.does();
    System.out.println();
    st.does();
  }
}