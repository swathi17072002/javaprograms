/*Create a base class called Animal with a method makeSound(). Derive three classes Dog, Cat, and Cow from Animal. Implement the makeSound() method in each derived class to make a different sound (e.g., "Woof", "Meow", "Moo"). Use polymorphism to create an array of Animal objects and call the makeSound() method on each object.*/
import java.util.Scanner;
class Animal{
  public void makeSound(){
    System.out.println("Animal makes the sound");
  }
}
class Cat extends Animal{
  String sound = "Meow";
  public void makeSound(){
    System.out.println("********Cat*********");
    System.out.println("It makes the sound like "+sound);
    
  }
}
class Dog extends Animal{
  String sound = "Woof";
  public void makeSound(){
    System.out.println("********Dog*********");
    System.out.println("It makes the sound like "+sound);
    
  }
}
class Cow extends Animal{
  String sound = "Moo";
  public void makeSound(){
    System.out.println("********Cow*********");
    System.out.println("It makes the sound like "+sound);
    
  }
}
public class Polymorphism2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Animal animal[] = new Animal[3];
    animal[0] = new Cat();
    animal[1] = new Dog();
    animal[2] = new Cow();
    animal[0].makeSound();
    animal[1].makeSound();
    animal[2].makeSound();
  }
}