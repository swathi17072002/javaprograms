public class PrintString{
  public static void main(String[] args){
    String s1 = "Swathi";
    String s2 = new String("Swathi");
    char[] ch = {'S','w','a','t','h','i'};
    String s3 = new String(ch);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}