package src;

import java.text.NumberFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomicInteger {

  AtomicInteger atomicInteger;

  public DemoAtomicInteger() {
    atomicInteger = new AtomicInteger(0);
  }

  public AtomicInteger getAtomicInteger() {
    return this.atomicInteger;
  }

  public static void main(String[] args) {
    
    DemoAtomicInteger demoAtomicInteger = new DemoAtomicInteger();

    NumberFormat formatter = NumberFormat.getNumberInstance();

    //int result = demoAtomicInteger.atomicInteger.incrementAndGet();
    // System.out.println(result);

    Runnable atomicIntegerIncreament = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        demoAtomicInteger.atomicInteger.incrementAndGet();
      }
    };

    Thread thread1 = new Thread(atomicIntegerIncreament);
    Thread thread2 = new Thread(atomicIntegerIncreament);
    Thread thread3 = new Thread(atomicIntegerIncreament);

    thread1.start();
    thread2.start();
    thread3.start();


    try {
      thread1.join();
      thread2.join();
      thread3.join();

    } catch (InterruptedException ex) {
      
    }

    System.out.println( formatter.format(demoAtomicInteger.atomicInteger.get()) );



  }
  
}
