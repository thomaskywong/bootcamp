

import java.util.function.Predicate;

// Wrong example (we should not use a class to implements Predicate)
// Instead, we should use Lambda expression for implementing Predicate interface
public class Person implements Predicate<Integer>{ 

  private int age;

  @Override
  public boolean test(Integer t) {
    this.age = t;
    return this.age >= 18;
  }
  
  

}
