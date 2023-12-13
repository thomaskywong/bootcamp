public class Taxi implements Vehicle { // Class Signature

  private int speed;

  private int capacity;

  public static final int MAX_SPEED = 100;

  public Taxi() {

  }

  // private Taxi(int speed) {
  //   this.speed = speed;
  // }

  // private constractor. 
  private Taxi(int speed, int capacity) {
    this.speed = speed;
    this.capacity = capacity;
  }

  // static of() method
  public static Taxi small() {
    return new Taxi(0, 4); 
  }

  public static Taxi big() {
    return new Taxi(0, 5); 
  }

  // getter
  public int getSpeed() {
    return this.speed;
  }

  // public int getCapacity() {
  //   return this.capacity;
  // }

  // setter (is setter necessary?)
  // speed can be modifed by interface methods
  // Constructor assign capacity when the Taxi object is instantiated

  // public void setCapacity(int capacity) {
  //   this.capacity = capacity;
  // }

  @Override // let the compiler to ensure the implementation of interface
  public boolean start() {
    if (isOn()) {
      return false;
    }
    ++this.speed;
    return true;
  }

  @Override
  public boolean stop() {
    if (isStopped()) {
      return false;
    }
    this.speed = 0;
    return true;
  }

  @Override
  public boolean accelerate() {
    if (isStopped())
      return false;

    ++this.speed;
    if (isOverMaxSpeed()) {
      this.speed = Taxi.MAX_SPEED;
    }
    return true;
  }

  @Override
  public boolean brake() {
    if (isStopped()) {
      return false;
    }

    --this.speed;
    return true;
  }

  public boolean isOn() {
    return this.speed > 0;
  }

  public boolean isStopped() {
    return this.speed <= 0;
  }

  public boolean isOverMaxSpeed() {
    return this.speed > Taxi.MAX_SPEED;
  }

}
