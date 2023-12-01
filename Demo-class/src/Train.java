public class Train {

  private String name;
  private int speed;
  private boolean isForward;
  final private int MAX_SPEED = 10;
  final private int MIN_SPEED = 0;

  public Train() {
    this.name = "";
    this.speed = 0;
    this.isForward = true;
  }

  public Train(String name) {
    this.name = name;
    this.speed = 0;
    this.isForward = true;
  }

  public void accelerate() {
    if (this.speed < MAX_SPEED) {
      System.out.println("Speeding up.");
      this.speed += 1;
    }   
  }

  public void decelerate() {
    if (this.speed > MIN_SPEED) {
      System.out.println("Slowing down.");
      this.speed -= 1;
    }
  }

  public void breaking() {
    System.out.println("Breaking...");
    this.speed = 0;
  }

  public int getSpeed() {
    return this.speed;
  }

  public void reverse() {
    if (this.speed > 0) {
      breaking();
    }
    System.out.println("Reverse direction.");
    this.isForward = !this.isForward;
  }

  public boolean getIsForward() {
    return this.isForward;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
 

}
