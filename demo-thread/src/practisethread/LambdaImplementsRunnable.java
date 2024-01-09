package practisethread;

public class LambdaImplementsRunnable {

  public static void main(String[] args) {
    
    // Define and create Runnable object
    Runnable task = () -> {
      System.out.println("Runnable task by Lambda expression.");
      try {
        Thread.sleep(3000);
      } catch(InterruptedException ex) {
        System.out.println(ex.getMessage());
      }
      System.out.println("Lambda expression task ends.");

      // Quiz style 
      Thread thread2 = new Thread(() -> System.out.println("Runnable object is instantiated by Lambda."));
      thread2.start();
    };

    // Create Thread Object
    Thread thread1 = new Thread(task);

    // Call start()
    thread1.start();

  }
  
}
