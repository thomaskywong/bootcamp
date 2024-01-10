package practisevolatile;

public class DemoShareResource2 {

  public static void main(String[] args) {
    
    // create an object that being accessed and race for data
    ShareResource2 resource = new ShareResource2();

    // define and create Runnable object for calling producer
    Runnable producer = () -> {
      for (int i = 0; i < 20_000; i++) {
          resource.producer();
      }
    };


    // define and create Runnable object for calling consumer
    Runnable consumer = () -> {
        for (int i = 0; i < 10_000; i++) {
          resource.consumer();
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

