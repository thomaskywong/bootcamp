public class Cat {

  private String name;

  private int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

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
    return this.getName().equals(cat.getName()) 
      && this.getAge() == cat.getAge();
  }

  public static void main(String[] args) {
    
    Cat cat1 = new Cat("Tommy", 1);
    Cat cat2 = new Cat("Tommy", 1);
    Cat cat3 = new Cat("Tommy", 3);
    Cat cat4 = new Cat("Jerry", 3);

    System.out.println(cat1.equals(cat2));  // true
    System.out.println(cat1.equals(cat3));  // false
    System.out.println(cat3.equals(cat4));  // false




  }

}
