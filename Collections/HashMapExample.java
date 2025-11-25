package collectionsconcepts;

import java.util.*;
class HashMapExample{
  public static void main(String[] args){
    Map<Integer,String> m = new HashMap<>();
    m.put(6,"Swathi");
    m.put(2,"Swetha");
    m.put(2,"Anitha");
    m.put(3,null);
    m.put(null,"varsha");;
    System.out.println(m);

    Map<Integer,String> m1 = new HashMap<>();
    m1.put(3,"Swetha");
    m1.put(4,"Harika");
    m1.put(5,"Raj");
    m1.putAll(m);
    System.out.println(m1);
    m1.putIfAbsent(1,"Anil");
    System.out.println(m1.putIfAbsent(2,"Anil"));
    System.out.println(m1);
    System.out.println("If Key present : "+m1.get(6));
    System.out.println("If Key is not present : "+m1.get(7));
    System.out.println("If Key present : "+m1.getOrDefault(2,"Srinivas"));
    System.out.println("If Key is not present : "+m1.getOrDefault(7,"Anitha"));
    System.out.println(m1);
    System.out.println(m1.containsKey(7));//false
    System.out.println(m1.containsKey(4));//true
    System.out.println(m1.containsValue("swathi"));//false
    System.out.println(m1.containsValue("Swathi"));//true
    m1.replace(3,"Swetha");
    m1.replace(3,"Swetha","Lalitha");
    System.out.println(m1);
    m1.remove(2);
    System.out.println(m1);
    m1.remove(1,"Swetha");
    System.out.println(m1);
    System.out.println("Extracting Keys : "+m1.keySet());
    System.out.println("Extracting values : "+m1.values());
    System.out.println("Extracting both keys and values : "+m1.entrySet());
    for(Object ob : m1.entrySet()){
      Map.Entry obj = (Map.Entry)ob;
      System.out.println(obj.getKey()+"-->"+obj.getValue());
    }
  }
}
