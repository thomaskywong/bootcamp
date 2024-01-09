package practisethread;

public class CustomThread extends Thread {

  @Override
  public void run() {

    System.out.println("Running Custom Thread...");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println("Thread ends.");

  }

  public static void main(String[] args) {
    
    CustomThread customThread = new CustomThread();

    customThread.start();

  }


}
