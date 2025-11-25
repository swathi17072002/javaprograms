package collectionsconcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args){
	    Set<Integer> s1 = new LinkedHashSet<>();
	    s1.add(10);
	    s1.add(20);
	    System.out.println(s1.add(40));
	    System.out.println("s1 :"+s1);
	    LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
	    s2.add(1);
	    s2.add(2);
	    s2.add(30);
	    System.out.println("s2 :"+s2);
	    s2.addAll(s1);
	    System.out.println("UNION of s1 and s2 : "+s2);
	    s1.retainAll(s2);
	    System.out.println("s1 INTERSECTION s2 : "+s1);
	    System.out.println("s1 SUBSET s2 : "+s2.containsAll(s1));
	    System.out.println("s2 SUBSET s1 : "+s1.containsAll(s2));
	    System.out.println("s1 :"+s1);
	    System.out.println("s2 :"+s2);
	    s1.removeAll(s2);
	    System.out.println("s1 difference s2 : "+s1);
	    s2.removeAll(s1);
	    System.out.println("s2 difference s1 : "+s2);
	    System.out.println("***remove method***");
	    s2.remove(1);
	    System.out.println("s2 :"+s2);
	    System.out.println("***clear method***");
	    s2.clear();
	    System.out.println("s2 :"+s2);
	    System.out.println("***iterator method***");
	    Iterator itr = s2.iterator();
	    while(itr.hasNext()){
	      System.out.println(itr.next());
	    }
	     
	  }
}
