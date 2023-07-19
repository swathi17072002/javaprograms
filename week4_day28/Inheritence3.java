/*Inheritence
  Create a base class called Animal with properties name and sound and a method makeSound(). Derive two classes Cat and Dog from Animal. Implement the makeSound() method in each derived class to print the specific sound made by a cat or dog.
*/
import java.util.Scanner;
class Animal{
  String name;
  String sound;
  public void makeSound(){
    System.out.println("Animal makes the sound");
  }
}
class Cat extends Animal{
  Cat(String name,String sound){
    this.name = name;
    this.sound = sound;
  }
  public void makeSound(){
    System.out.println("********Cat*********");
    System.out.println("It makes the sound like "+sound);
    
  }
}
class Dog extends Animal{
  Dog(String name,String sound){
    this.name = name;
    this.sound = sound;
  }
  public void makeSound(){
    System.out.println("********Dog*********");
    System.out.println("It makes the sound like "+sound);
    
  }
}
public class Inheritence3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Cat c1 = new Cat("cat","meow");
    Dog d1 = new Dog("dog","bow");
    c1.makeSound();
    d1.makeSound();
  }
}