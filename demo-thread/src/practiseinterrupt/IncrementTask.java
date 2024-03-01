// package practiseinterrupt;

public class IncrementTask implements Runnable {

  @Override
  public void run(){
    SharedData data = new SharedData();

    for (int i = 0; i < 10; i++) {
      if (Thread.currentThread().isInterrupted()) {
        return;
      }
      data.increment();

      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
      
      System.out.println("sum=" + data.getSum());
    }
    System.out.println("Completed");
  }
}
