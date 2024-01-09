package practisethread;

public class PractiseJoinMethod {

  // Once a thread is created in main, the thread itself excute independently from main thread
  // main thread may ends before the thread
  // may cause runtime error if showing the final result of threads is required.
  // use .join() method to ensure the running of threads before next line execution.
  public static void main(String[] args) {


    Runnable task1 = () -> {
      System.out.println("task1 running...");
      try {
        Thread.sleep(2000); // 2000 ms
      } catch (InterruptedException ex) {
        System.out.println(ex.getMessage());
      }
      System.out.println("task1 ends.");
    };

    Runnable task2 = () -> {
      System.out.println("task2 running...");
      try {
        Thread.sleep(2000); // 2000 ms
      } catch (InterruptedException ex) {
        System.out.println(ex.getMessage());
      }
      System.out.println("task2 ends.");
    };

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);

    
    thread1.start();
    thread2.start();

    // Call join() method after start() method
    try{
      thread1.join();
      thread2.join();
    } catch (InterruptedException ex) {
      System.out.println(ex.getMessage());
    }



    System.out.println("Main thread ends.");

    /* Without .join()
     * Main thread ends. 
     * task1 running... 
     * task2 running... 
     * task1 ends. 
     *  ends.
     */

  }


}
