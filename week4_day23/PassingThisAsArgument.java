class Test{
  int x;
  int y;
  Test(int x,int y){
    this.x = x;
    this.y = y;
    System.out.println("before swapping x : "+this.x+" y : "+this.y);
    add(this);
    System.out.println("after swapping x : "+this.x+" y : "+this.y);
    System.out.println();
  }
  public void add(Test obj){
   obj.x = obj.x + 2;
    obj.y = obj.y + 3;
  }
}
 class PassingThisAsArgument{
   public static void main(String[] args){
   Test t1 = new Test(10,20);
   Test t2 = new Test(30,40);
 }
 }