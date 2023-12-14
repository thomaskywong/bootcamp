public class Bus implements Vehicle{


  private int speed;

  private int capacity;

  public static final int MAX_SPEED = 100;

  public Bus() {

  }

  // private constractor. 
  private Bus(int speed, int capacity) {
    this.speed = speed;
    this.capacity = capacity;
  }

  // static of() method
  public static Bus doubleDeckBus() {
    return new Bus(0, 150); 
  }

  public static Bus singleDeckBus() {
    return new Bus(0, 70); 
  }

  // getter
  public int getSpeed() {
    return this.speed;
  }

  public int getCapacity() {
    return this.capacity;
  }
 
  @Override
  public boolean test() {
    return false;
  }

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
    return this.speed > Bus.MAX_SPEED;
  }


}
