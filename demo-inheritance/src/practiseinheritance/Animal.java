package practiseinheritance;

public abstract class Animal {

  // Share common attributes
  private String name;
  private int age;

  // Abstract class cannot instantiate an object, but the constructor can be called.
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Commonly used methods coding in parent class
  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // abstract method that enforce child class to define by itself
  // no implementation in abstract method
  public abstract boolean eat();

  public abstract boolean sleep();

  // public method that can be overriden by child class 
  // will not be called if overriden by child class
  public void sound() {
    System.out.println("Animal's sound.");
  }

  public final void fight() {
    System.out.println(this.name + " is fighting!");
  }

  public static void doSomething() {
    System.out.println("Animal do something.");
  }
  
}
