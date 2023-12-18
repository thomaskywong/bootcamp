import java.util.Arrays;
import java.util.Objects;

public class Cat {

  private String name;

  private int age;

  private final Eye[] eyes = new Eye[2]; // final the object reference.

  public Cat(String name, int age, String eye1Color, String eye2Color) {
    this.name = name;
    this.age = age;
    this.eyes[0] = new Eye(eye1Color);
    this.eyes[1] = new Eye(eye2Color);
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public Eye[] getEyes() {
    return this.eyes;
  }

  // Override .equals() from Object class
  @Override   // Override shall match return type and signature
  public boolean equals(Object obj) {
    // Step 1: See they are the same object (same address)
    if (this == obj) {    // Since same object, should be true
      return true;
    }

    // Step 2: See if tested object is the instanceof the same class (CAT). Cast to CAT if true 
    if (!(obj instanceof Cat)){ // if obj is NOT instanceof CAT, should be false
      return false;
    }
    // if (!(obj.getClass() == this.getClass())) {
    //   return false;
    // }

    Cat cat = (Cat) obj;

    // Step 3: see if attributes between two CAT objects are the same. return boolean
    // return this.getName().equals(cat.getName()) 
    //   && this.getAge() == cat.getAge();
    return Objects.equals(cat.getAge(), this.age)
        && Objects.equals(cat.getName(), this.name)       // compare single object
        && Arrays.equals(cat.getEyes(), this.eyes);       // compare array of object
  }

  // .hashCode() -> represent object address
  // @Override
  // public int hashCode() {
  //   return Objects.hash(this.name, this.age, this.eyes); // hash value of a series of atrtribute
  // }

  @Override
  public int hashCode() {
    return Objects.hash( this.name, this.age, Arrays.deepHashCode(this.eyes));
  }

  public static void main(String[] args) {

    Cat cat1 = new Cat("Tommy", 1, "GREEN", "GREEN");
    Cat cat2 = new Cat("Tommy", 1, "GREEN", "GREEN");
    Cat cat3 = new Cat("Tommy", 1, "GREEN", "BLUE");
    Cat cat4 = new Cat("Jerry", 1, "YELLO", "YELLO");


    System.out.println(cat1.equals(cat1)); // true, same object
    System.out.println(cat1.equals(cat2)); // true, same attribute values
    System.out.println(cat1.equals(cat3)); // false, different attribute values
    System.out.println(cat3.equals(cat4)); // false, different attribute
    System.out.println(cat1.hashCode());
    System.out.println(cat2.hashCode());
  }

}
