public class SharedResource {

  private boolean hasData = false; // Shared Resource or Shared Data

  // 1. both 2 threads starts at the same time. hasData = false
  // 2. produce() while loop (not fulfill) -> produce data -> notify
  // 3. hasData = true. Produer calls notify(), consumer thread standby
  // 4. Once producer wait(), key released. Consumer starts thread. hasData = true that is modified by producer. while loop (not fulfill) -> consume data -> notify
  // 5. hasData = false. Consumer calls notify(), producer thread standby
  // 6. Once consumer wait(), key released. Producer starts thread. hasData = false that is modified by consumer. d

  // notify() - notify another thread to standby
  // wait() - wait thread, and release key (lock) to another thread


  // If nothing, produce(0)
  public synchronized void produce() throws InterruptedException {
    System.out.println("Producer starts.");
    while (hasData) {
      System.out.println("Producer wait.");
      System.out.println();
      wait(); // wait until notify being received
    }
    System.out.print("Thread Id = " + Thread.currentThread().getId());
    System.out.println(", Thread name = " + Thread.currentThread().getName());
    System.out.println("Producing data...");
    Thread.sleep(2000);
    hasData = true;
    System.out.println("Data produced.");
    notify(); // notify consumer thread to proceed
    System.out.println("Producer ends.");
  }

  // if something, consume()
  // if hasData -> does not consume()
  public synchronized void consume() throws InterruptedException {
    System.out.println("Consumer starts.");
    while (!hasData) {
      System.out.println("Consumer wait.");
      System.out.println();
      wait(); // wait until notify being received
    }
    System.out.print("Thread Id = " + Thread.currentThread().getId());
    System.out.println(", Thread name = " + Thread.currentThread().getName());
    System.out.println("Consuming data...");
    Thread.sleep(2000);
    hasData = false;
    System.out.println("Data consumed.");
    notify(); // notify producer thread to proceed
    System.out.println("Consumer ends.");
  }

  public static void main(String[] args) {

    SharedResource shareResource = new SharedResource();

    Runnable produceData = () -> {
      while (true) {
        try {
          shareResource.produce();
        } catch (InterruptedException ex) {

        }
      }
    };

    Runnable consumeData = () -> {
      while (true) {
        try {
          shareResource.consume();
        } catch (InterruptedException ex) {

        }
      }
    };

    Thread producer = new Thread(produceData);
    Thread consumer = new Thread(consumeData);
    
    producer.start();
    consumer.start();


  }

}
