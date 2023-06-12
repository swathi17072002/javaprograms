interface Test1{
  int i=20;
  int j=10;
  void add();
  void subtract();
}
interface Test2{
  void multiplay();
  void division();
}
class Test3 implements Test1,Test2{
  public void add(){
    System.out.println("Addition is : "+(i+j));
  }
  public void subtract(){
    System.out.println("Subtraction is : "+(i-j));
  }
  public void multiplay(){
    System.out.println("Multiplication is : "+(i*j));
  }
  public void division(){
    System.out.println("Division is : "+(i/j));
  }
}
public class InterfaceExample{
  public static void main(String[] args){
    Test3 tt = new Test3();
    tt.add();
    tt.subtract();
    tt.multiplay();
    tt.division();
  }
}
