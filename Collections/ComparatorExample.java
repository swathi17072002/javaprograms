package collectionsconcepts;
import java.util.*;
class Car{
	  String colour;
	  double price;
	  String modal;
	  Car(String colour,double price,String modal){
	    this.colour = colour;
	    this.price = price;
	    this.modal = modal;
	  }
	  public String toString(){
	    return colour+" "+price+" "+modal;
	  }
	  
	}
	class Comp implements Comparator<Car>{
	  public int compare(Car c1,Car c2){
	    return (int)(c1.price-c2.price);
	  }
	}
public class ComparatorExample {
	public static void main(String[] args){
	    TreeSet<Car> t = new TreeSet<Car>(new Comp());
	    Car c1 = new Car("Black",600000,"benz");
	    Car c2 = new Car("Red",800000,"amasider");
	    Car c3 = new Car("Blue",700000,"benz123");
	    Car c4 = new Car("white",100000,"nano");
	    t.add(c1);
	    t.add(c2);
	    t.add(c3);
	    t.add(c4);
	    for(Car c : t){
	      System.out.println(c);
	    }
	  }
}
