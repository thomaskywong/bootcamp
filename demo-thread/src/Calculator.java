public class Calculator {

  int x;

  // Multi-thread environment encounter atomic problem (read-write issue on share resource)
  // 

  public synchronized void increment() {
    this.x++;
  }

  public void increment2() {
    this.x++;
  }

  public synchronized void decrement() {
    this.x--;
  }

  public static void main(String[] args) {
    
    // Example 1: Synchronized method on multi-thread
    Calculator calculator = new Calculator();

    Thread vincent = new Thread(() -> {
      for (int i= 0; i < 100_000; i++) {
        calculator.increment();
      }
    });
    
    Thread oscar = new Thread(() -> {
      for (int i= 0; i < 100_000; i++) {
        calculator.increment();
      }
    });

    calculator.x = 0;

    vincent.start();
    oscar.start();

    try {
      vincent.join();
      oscar.join();
    } catch (InterruptedException ex) {

    }

    System.out.println("Synchroized method by multi thread");
    System.out.println("calculator.x=" + calculator.x);

    // Example 2: non-synchronized method
    // Calculator calculator2 = new Calculator();

    Thread vincent2 = new Thread(() -> {
      for (int i= 0; i < 100_000; i++) {
        calculator.increment2();
      }
    });
    
    Thread oscar2 = new Thread(() -> {
      for (int i= 0; i < 100_000; i++) {
        calculator.increment2();
      }
    });

    calculator.x = 0;

    vincent2.start();
    oscar2.start();

    try {
      vincent2.join();
      oscar2.join();
    } catch (InterruptedException ex) {

    }
 
    System.out.println("Non-synchroized method by multi thread");
    System.out.println("calculator.x=" + calculator.x);

    // Example 3: Synchronized methods (multiple methods being synchronized)
    Thread vincent3 = new Thread(() -> {
      for (int i= 0; i < 100_000; i++) {
        calculator.increment();
      }
    });

    Thread oscar3 = new Thread(() -> {      
      for (int i= 0; i < 100_000; i++) {
        calculator.decrement();
      }
    });

    calculator.x = 0;
    
    vincent3.start();
    oscar3.start();

    try {
      vincent2.join();
      oscar3.join();
    } catch (InterruptedException ex) {

    }

    System.out.println("Synchroized multiple methods by multi thread");
    System.out.println("calculator.x=" + calculator.x);

  }
  
}
