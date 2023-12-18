package practiseinheritance;

public class DemoAnimal {

  public static void main(String[] args) {
    // Animal a1 = new Animal("Tom", 0); // abstract class. cannot instantiate

    // Cat object c1 without name and age, but
    Cat c1 = new Cat(CatBreed.AMERICAN_SHORTHAIR, 0);
    Cat c2 = new Cat(CatBreed.HONGKONG_SHORTHAIR, 3);
    Cat c3 = new Cat(CatBreed.HONGKONG_SHORTHAIR, 3);

    c1.setName("Jerry");
    c2.setName("Ama");
    c3.setName("JunRung");

    Dog d1 = new Dog(DogBreed.CHIHUAHUA, 0, "Tommy");
    Dog d2 = new Dog(DogBreed.HUSKY, 3, "Thomas");
    Dog d3 = new Dog(DogBreed.PUG, 3, "Thomas");
    Dog d4 = new Dog(DogBreed.PUG, 3, "Thomas");

    d1.sleep();
    d1.eat();
    d1.sound();
    d1.fight();

    Animal a2 = d2; // upcast
    a2.sound(); // call Dog's method. Polymophism!!!
    a2.fight();

    c1.sleep();
    c1.eat();
    c1.sound();
    c1.fight(); // parent's method is called.

    Animal a1 = c2; // upcast
    a1.sound(); // call Cat's method. Polymophism!!!
    a1.fight(); // parent's method is called. method is not overriden by child class

    Cat.doSomething();
    Animal.doSomething();

    // Should use Class' name to call static method
    c2.doSomething(); // will call Cat's static method
    a1.doSomething(); // will call Animal's static method

  }


}

