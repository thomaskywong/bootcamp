package practisethread;

public class CustomTask implements Runnable{

  @Override 
  public void run() {

    System.out.println("Custom Task running...");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println("Custom Task ends.");

  }
 
  public static void main(String[] args) {
    
    Thread customTask = new Thread(new CustomTask());
    customTask.start();

  }
}
