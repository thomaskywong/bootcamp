public class Cat extends Animal {

  // Cat Class inherit all public attributes, and methods.
  // Cat class does not inherit constructor
  // 'age' attribute is inherited from parent class

  // by default, empty constructor by Java
  // if constructor is defined in Aminal class, explicit define of Cat constructor is required.
  // since no default empty 
  public Cat(int age) {
    super(age);
  }

  public static void main(String[] args) {
    Cat cat1 = new Cat(4);
    System.out.println(cat1.getAge());
    cat1.setAge(5);
    System.out.println(cat1.getAge());

  }

}