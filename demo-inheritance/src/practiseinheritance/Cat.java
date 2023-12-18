package practiseinheritance;

import java.util.Objects;

public class Cat extends Animal {

  CatBreed breed;

  public Cat(CatBreed breed, int age) {
    super("", age);
    this.breed = breed;
  }

  public Cat(CatBreed breed, int age, String name) {
    super(name, age);
    this.breed = breed;
  }

  public CatBreed getBreed() {
    return this.breed;
  }

  // cannot override final method of parent
  // @Override
  // public void fight(){
  //    
  // }

  @Override
  public boolean eat() {
    System.out.println("Eating tuna fish.");
    return true;
  }

  @Override
  public boolean sleep() {
    System.out.println("Sleeping on sofa.");
    return true;
  }

  @Override     // shall use @Override even though the method is not abstract in parent's class
  public void sound() {
    super.sound();
    System.out.println("Meow Meow...");
  }

  @Override
  public String toString() {
    return "Breed: " + this.breed // Cat's method
        + ", Age: " + this.getAge() // Animal's method (Parent)
        + ", Name: " + this.getName(); // Animal's method (Parent)
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Cat)) { // check if obj is an instance of Cat
      return false;
    }
    Cat cat = (Cat) obj; // downcast from Object to Cat

    // check if all attributes are equals
    return Objects.equals(cat.getBreed(), this.breed)
        && Objects.equals(cat.getAge(), this.getAge())
        && Objects.equals(cat.getName(), this.getName());

  }

  @Override
  public int hashCode() {
    return Objects.hash(this.breed, this.getAge(), this.getName());
  }

  public static void doSomething() {
    System.out.println("Cat do something.");
  }

  public static void main(String[] args) {
    Cat c1 = new Cat(CatBreed.AMERICAN_SHORTHAIR, 0, "Tommy");
    Cat c2 = new Cat(CatBreed.HONGKONG_SHORTHAIR, 3, "Thomas");
    Cat c3 = new Cat(CatBreed.HONGKONG_SHORTHAIR, 3, "Thomas");

    System.out.println(c1.getName()); // Tommy, parent's method,
    System.out.println(c2.getAge()); // 3, parent's method,
    System.out.println(c3.getBreed()); // HONGKONG_SHORTHAIR, child method

    c1.setName("Jerry"); // parent's method
    System.out.println(c1.getName()); // Jerry, parent's method
    System.out.println(c2.equals(c3)); // true
    System.out.println(c1.hashCode()); // -657339438
    System.out.println(c2.hashCode()); // -693040378
    System.out.println(c3.hashCode()); // -693040378

    c1.sleep();
    c1.eat();
    c1.sound();   
    c1.fight();     // parent's method is called. 

    Animal a1 = c1; // upcast 
    a1.sound();   // call Cat's method. Polymophism!!!
    a1.fight();   // parent's method is called. method is not overriden by child class

  }

}


