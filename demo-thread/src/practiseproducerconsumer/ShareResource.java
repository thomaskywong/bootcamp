package practiseproducerconsumer;

public class ShareResource {

  private boolean hasData;
  private volatile int data;

  public ShareResource() {
    this.hasData = false;
    this.data = 0;
  }

  public synchronized void producer() throws InterruptedException {
    while (hasData) {
      wait();
    }
    this.data += 2;
    hasData = true;
    notify();
  }

  public synchronized void consumer() throws InterruptedException {
    while (!hasData) {
      wait();
    }
    this.data -= 1;
    hasData = false;
    notify();
  }

  public int getData() {
    return this.data;
  }

  public boolean getHasData() {
    return this.hasData;
  }
  
}
