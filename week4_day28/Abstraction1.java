/*Create an abstract class called Animal with an abstract method makeSound(). Derive two classes Dog and Cat from Animal. Implement the makeSound() method in each derived class to make a different sound. Use abstraction to ensure that the makeSound() method is implemented in each derived class.*/
import java.util.Scanner;
abstract class Animal{
  abstract public void makeSound();
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
public class Abstraction1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Cat cat = new Cat();
    Dog dog = new Dog();
    cat.makeSound();
    dog.makeSound();
  }
}