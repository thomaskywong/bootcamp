package practiseinheritance;

import java.util.Objects;

public class Dog extends Animal {

  DogBreed breed;

  public Dog(DogBreed breed, int age, String name ) {
    super(name, age);
    this.breed = breed;
  }

  public DogBreed getBreed() {
    return this.breed;
  }

  @Override
  public boolean eat() {
    System.out.println("Eating beef.");
    return true;
  }

  @Override
  public boolean sleep() {
    System.out.println("Sleeping on floor.");
    return true;
  }

  @Override
  public void sound() {
    System.out.println("Wow Wow...");
  }

  @Override
  public String toString() {
    return "Breed: " + this.breed // Dog's method
        + ", Age: " + this.getAge() // Animal's method (Parent)
        + ", Name: " + this.getName(); // Animal's method (Parent)
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Dog)) { // check if obj is an instance of Cat
      return false;
    }
    Dog dog = (Dog) obj; // downcast from Object to Cat

    // check if all attributes are equals
    return Objects.equals(dog.getBreed(), this.breed)
        && Objects.equals(dog.getAge(), this.getAge())
        && Objects.equals(dog.getName(), this.getName());

  }

  @Override
  public int hashCode() {
    return Objects.hash(this.breed, this.getAge(), this.getName());
  }

  public static void main(String[] args) {
    Dog d1 = new Dog(DogBreed.CHIHUAHUA, 0, "Tommy");
    Dog d2 = new Dog(DogBreed.HUSKY, 3, "Thomas");
    Dog d3 = new Dog(DogBreed.PUG, 3, "Thomas");
    Dog d4 = new Dog(DogBreed.PUG, 3, "Thomas");


    System.out.println(d1.getName()); // Tommy, parent's method,
    System.out.println(d2.getAge()); // 3, parent's method,
    System.out.println(d3.getBreed()); // HONGKONG_SHORTHAIR, child method

    d1.setName("Jerry"); // parent's method
    System.out.println(d1.getName()); // Jerry, parent's method
    System.out.println(d2.equals(d3)); // false
    System.out.println(d4.equals(d3)); // true

    System.out.println(d1.hashCode());
    System.out.println(d2.hashCode()); 
    System.out.println(d3.hashCode()); 
    System.out.println(d4.hashCode()); 
 
    d1.sleep();
    d1.eat();
    d1.sound();   
    d1.fight();

    Animal a2 = d1; // upcast 
    a2.sound();   // call Dog's method. Polymophism!!!

  }
}
