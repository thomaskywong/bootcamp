public class AnimalFarm {

  // Polymophism + Overloading (Not overriding)
  public static void main(String[] args) {
    
    Animal cow = new Cow();   // Compile-time / runtime
    // compile time: cow object can access which methods

    // Cow object has 2 method: eat() from parent class, and eat(String) from child class
    cow.eat();
    // cow object reference is Animal -> can call parent's method .eat(), 
    // but since .eat(String) is not available in Animal class, thus not overriden by Cow class
    // therefore .eat(String) in Cow class cannot be called by polymophism

    // Compile time: check the type of reference and see which method can be called
    // run time: find the object (right side) being pointed by object reference (left side)

    // System.out.println(cow.eat("sushi"));  // compile error: Animal class has no eat(String) method

    Animal cow2 = new Animal();
    // System.out.println(cow2.eat("sushi"));
    cow2.eat();

    Cow cow3 = new Cow();
    cow3.eat("grasses");
  }
  
}
