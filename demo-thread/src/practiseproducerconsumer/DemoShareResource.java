package practiseproducerconsumer;

public class DemoShareResource {

  public static void main(String[] args) {
    
    // create an object that being accessed and race for data
    ShareResource resource = new ShareResource();

    // define and create Runnable object for calling producer
    Runnable producer = () -> {
      for (int i = 0; i < 10_000; i++) {
        try {
          resource.producer();
        } catch (InterruptedException ex) {
          System.out.println(ex.getMessage());
        }
      }
    };

    // define and create Runnable object for calling consumer
    Runnable consumer = () -> {
        for (int i = 0; i < 10_000; i++) {
        try {
          resource.consumer();
        } catch (InterruptedException ex) {
          System.out.println(ex.getMessage());
        }
      }
    };

    // create two threads. One is for running producer. Another is for running consumer
    Thread producerThread = new Thread(producer);   
    Thread consumerThread = new Thread(consumer);

    // starts two threads
    producerThread.start();
    consumerThread.start();

    try {
      producerThread.join();
      consumerThread.join();
    } catch ( InterruptedException ex) {
      System.out.println(ex.getMessage());
    }

    System.out.println(resource.getData());

  }
  
}
