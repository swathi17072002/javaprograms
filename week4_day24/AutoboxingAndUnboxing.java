public class AutoboxingAndUnboxing{
  public static void main(String[] args){
    boolean bl = true;
    char ch = 'S';
    byte b = 11;
    short s =411;
    int i = 1234;
    long l = 12345678;
    float f = 234;
    double d = 9800;

    //Autoboxing
    Boolean object_bl = bl;
    Character object_ch = ch;
    Byte object_b = b;
    Short object_s = s;
    Integer object_i = i;
    Long object_l = l;
    Float object_f = f;
    Double object_d = d;

    System.out.println("Boolean object : "+object_bl);
    System.out.println("Character object : "+object_ch);
    System.out.println("Byte object : "+object_b);
    System.out.println("Short object : "+object_s);
    System.out.println("Integer object : "+object_i);
    System.out.println("Long object : "+object_l);
    System.out.println("Float object : "+object_f);
    System.out.println("Double object : "+object_d);

    //Unboxing
    boolean booleanValue = object_bl;
    char charValue = object_ch;
    byte byteValue = object_b;
    short shortValue = object_s;
    int integerValue = object_i;
    long longValue = object_l;
    float floatValue = object_f;
    double doubleValue = object_d;

    System.out.println();
    System.out.println("Boolean value : "+booleanValue);
    System.out.println("Character value : "+charValue);
    System.out.println("Byte value : "+byteValue);
    System.out.println("Short value : "+shortValue);
    System.out.println("Integer value : "+integerValue);
    System.out.println("Long value : "+longValue);
    System.out.println("Float value : "+floatValue);
    System.out.println("Double value : "+doubleValue);
  }
}