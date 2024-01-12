package practiseinterrupt;

import java.util.Arrays;

public class PractiseInterrupt {

  public static void main(String[] args) {

    SharedData data = new SharedData();

    Runnable task1 = () -> {
      for (int i = 0; i < 10_000; i++) {
        if (Thread.currentThread().isInterrupted()) {
          System.out.println("Threads interrupted");
          return;
        }
        System.out.println(Thread.currentThread().getName());
        data.increment();
        // System.out.println("increment count=" + i);

      }
    };

    Runnable task2 = () -> {
      for (int i = 0; i < 10_000; i++) {
        if (Thread.currentThread().isInterrupted()) {
          System.out.println("Threads interrupted");
          return;
        }
        System.out.println(Thread.currentThread().getName());
        data.decrement();
        // System.out.println("decrement count=" + i);
      }
    };

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);

    thread1.start();
    thread2.start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }

    thread1.interrupt();
    thread2.interrupt();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }

    System.out.println("sum = " + data.getSum());
  }
}

// Runnable task3 = new IncrementTask();
// Runnable task4 = new DecrementTask();

// Thread thread3 = new Thread(task3);
// Thread thread4 = new Thread(task4);

// thread3.start();
// thread4.start();

// try {
// thread3.join();
// thread4.join();

// } catch (InterruptedException e) {
// e.printStackTrace();
// }

// //thread3.interrupted();
// Thread.interrupted();


// }

// }
