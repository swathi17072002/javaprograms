//WAP to print all ASCII character with their values.
class CharAndAscii{
  public void printCharAscii(){
    char ch;
    int asciiValue ;
    for(ch='a';ch<=122;ch++){
      asciiValue = ch;
    System.out.print(ch+" - "+asciiValue+" , ");
    }
    System.out.println();
      for(ch='A';ch<=90;ch++){
      asciiValue = ch;
    System.out.print(ch+" - "+asciiValue+" , ");
    }
  }
}
public class CharAscii{
  public static void main(String[] args){
    CharAndAscii caa = new CharAndAscii();
    caa.printCharAscii();
  }
}
  