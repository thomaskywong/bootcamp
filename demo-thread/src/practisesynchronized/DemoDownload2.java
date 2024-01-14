package practisesynchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoDownload2 {

  public static int fileSize = 100_000;
  public static List<Byte> source = new ArrayList<>(fileSize);

  static {
    Random random = new Random();
    for (int i = 0; i < DemoDownload2.fileSize; i++) {
      source.add((byte) random.nextInt(128));
    }
  }

  public static int getFileSize() {
    return DemoDownload2.fileSize;
  }

  public static List<Byte> getSource() {
    return DemoDownload2.source;
  }

  public static void main(String[] args) {

    DownloadFile file = new DownloadFile();
    DownloadTask2 task = new DownloadTask2(file);

    List<Thread> threads = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      Thread thread = new Thread(task);
      threads.add(thread);
      thread.start();
    }

    for (Thread thread : threads) {

      try {
        thread.join();
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }

    }

    for (int i = 0; i < DemoDownload2.fileSize; i++) {
      System.out.println("i=" + i + ", source=" + source.get(i) + ", file="
          + file.getDownloadedData().get(i));
      if (source.get(i) != file.getDownloadedData().get(i)) {
        System.out.println("Download Error! Data not match!");
        break;
      }
    }

  }

}
