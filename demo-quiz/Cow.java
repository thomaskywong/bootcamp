public class Cow extends Animal{

  //  this method has different signature. and no @Override. Not overriding parent's method
  
  void eat(String food) {
    System.err.println("[Cow] eating " + food + "...");
  }
}
