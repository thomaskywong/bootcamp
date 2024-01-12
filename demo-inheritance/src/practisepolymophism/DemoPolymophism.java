public class DemoPolymophism {

  public static void main(String[] args) {
    
    // Animal smallCow1 = () -> System.out.println("[Animal] makes sound.");

    // Cow cow1 = new Cow();
    // Animal mediumCow1 = new Cow();

    // cow1.sound(); // [Cow] makes sound.
    // smallCow1.sound();  // [Animal] makes sound.

    // Cow bigCow1 = new Cow();
    // bigCow1.sound(smallCow1);   // [Animal] makes sound.
    // bigCow1.sound(mediumCow1);  // [Cow] makes sound.
    // bigCow1.sound(cow1);  // [Cow] makes sound

    // smallCow.sound(mediumCow);  // compilation error. Animal type pointer cannot call sound(Animal animal) method

    Animal cow = new Cow();
    cow.eat();  // [Cow] eating...;

    Animal smallCow = () -> System.out.println("[Animal] try to eat something...");
    smallCow.eat(); // [Animal] try to eat something...

    Cow bigCow = new Cow();
    bigCow.eat(smallCow); // [Animal] try to eat something...

   

    

  }
  
}
