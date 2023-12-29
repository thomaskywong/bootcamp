public class Father implements Driver {

  public void drive() {
    System.out.println("Father is driving...");
  }
  

  public static void main(String[] args) {
    
    // Class implements interface. the class object can be pointed by interface type pointer
    Driver driver1 = new Father();
    driver1.drive();

    // demo anonymous inner class
    Driver driver2 = new Driver(){
      @Override 
      public void drive() {
        System.out.println("Anonymous class object is driving...");
      }
    };

    driver2.drive();
  }

}
