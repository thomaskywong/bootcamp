import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

  public static void main(String[] args) throws InterruptedException {

    List<String> vector = new Vector<>();

    List<String> arrayList = new ArrayList<>();


    Runnable vectorAdd = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        vector.add("x");
      }
    };

    Runnable arrayAdd = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        arrayList.add("x");
      }
    };

    Thread thread1 = new Thread(vectorAdd);
    Thread thread2 = new Thread(vectorAdd);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException ex) {

    }

    Thread thread3 = new Thread(arrayAdd);
    Thread thread4 = new Thread(arrayAdd);

    thread3.start();
    thread4.start();

    try {
      thread3.join();
      thread4.join();
    } catch (InterruptedException ex) {

    }
    System.out.println("ArrayList size = " + arrayList.size());
    System.out.println("Vector size = " + vector.size());


  }


}


