// package practiseinterrupt;

public class SharedData {

  private double sum;

  public SharedData() {
    this.sum = 0.0d;
  }

  public double getSum() {
    return this.sum;
  }

  public synchronized void increment() {
    this.sum += 1.0d;
  }

  public synchronized void decrement() {
    this.sum -= 0.5d;
  }
  
  
}
