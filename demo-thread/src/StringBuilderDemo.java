import StringBuilder.AppendStringBuffer;
import StringBuilder.AppendStringBuilder;

public class StringBuilderDemo {

  public static void main(String[] args) {
    

    // StringBuilder
    // StringBuilder sb = new StringBuilder();
    // sb.append("hello").append(" world");

    // StringBuffer
    // if share String with different threads, use StringBuffer with synchroized method
    // StringBuffer sbf = new StringBuffer();
    // sbf.append("hello").append(" world");
    // System.out.println(sbf.toString());

    // StringBuider vs StringBuffer

    // StringBuilder
    StringBuilder sb1 = new StringBuilder("");
    //Runnable task1 = new AppendStringBuilder(sb1);

    Runnable task1 = () -> {
      for (int i = 0; i < 10_000; i++) 
        sb1.append("x");
    };

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task1);

    
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException ex) {
        // System.out.println(ex.getMessage());
    } 

    System.out.println(sb1.length());  // 20000? NO! lenght=others

    // StringBuffer
    StringBuffer sbf1 = new StringBuffer("");

    Runnable task2 = () -> {
      for (int i = 0; i < 10_000; i++) {
        sbf1.append("x");
      }
    };

    
    Thread thread3 = new Thread(task2);
    Thread thread4 = new Thread(task2);

    thread3.start();
    thread4.start();
    
    try {
      thread3.join();
      thread4.join();
    } catch (InterruptedException ex) {
      System.out.println(ex.getMessage());
    }

    System.out.println(sbf1.length());  // 20000? YES


  }
  
}
