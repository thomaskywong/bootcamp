package practisevolatile;

import java.util.concurrent.atomic.AtomicInteger;

public class ShareResource2 {

  private AtomicInteger data;

  public ShareResource2() {
    this.data = new AtomicInteger(0);
  }

  public void producer() {
    this.data.incrementAndGet();
  }

  public synchronized void consumer()  {
    this.data.decrementAndGet();
  }

  public int getData() {
    return this.data.intValue();
  }
 
}
