//method overriding
class Test{
  int c;
  public int add(int i,int j){
    c =i+j;
    return c;
  }
  public void add(float i,float j,float k){
    System.out.println(i+j+k);
  }
}
class Test1 extends Test{
  public void add(int i,int j){
    //int k=10;
    //c =i+j+k;
    int c = super.add(i,j);
    System.out.println(c);
  }
}
public class MethodOverrding{
  public static void main(String[] args){
    Test1 t1 = new Test1();
    t1.add(10,20,30);
    t1.add(10,20);
  }
}