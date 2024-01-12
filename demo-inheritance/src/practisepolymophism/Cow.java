public class Cow implements Animal{

  // public void sound() {
  //   System.out.println("[Cow] makes sound.");
  // }
  
  // public void sound(Animal animal) {
  //   animal.sound();
  // }

  public void eat() {
    System.out.println("[Cow] eating...");
  }

  public void eat(Animal a) {
    a.eat();
  }
  
}
