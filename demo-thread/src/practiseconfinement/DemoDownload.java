package practiseconfinement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;


public class DemoDownload {

  public static final int fileSize = 100_000;
  public static byte[] source = new byte[fileSize];
  private static AtomicInteger index;

  static {
    index = new AtomicInteger(0);
    Random random = new Random();
    for (int i = 0; i < source.length; i++) {
      DemoDownload.source[i] = (byte) random.nextInt(128);
    }
  }

  public static AtomicInteger getIndex() {
    return DemoDownload.index;
  }

  public static void main(String[] args) {
    int downloadSize = DemoDownload.fileSize;
    List<Thread> threads = new ArrayList<>(downloadSize);
    List<DownloadTask> downloads = new ArrayList<>(downloadSize);


    // List<Byte> downloadFile = new ArrayList<>(downloadSize);
    byte[] downloadFile = new byte[downloadSize];

    for (int i = 0; i < downloadSize; i++) {
      DownloadTask task = new DownloadTask(new DownloadFile());
      downloads.add(task);
      Thread thread = new Thread(task);
      thread.start();
      threads.add(thread);
    }

    for (Thread thread : threads) {
      try {
        thread.join();
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }


    // Without checking source index, sequence of downloading byte does not match with source index!
    // Not correct way!
    // downloadFile = downloads.stream()
    // .map(e -> e.getTask().getData())
    // .collect(Collectors.toList());

    // for (int i = 0; i < downloadSize; i++) {
    // System.out.println("source=" + DownloadFile.source[i] + ", download=" + downloadFile.get(i));
    // if (DownloadFile.source[i] != downloadFile.get(i)) {
    // System.out.println("Download Error! Data not match!");
    // break;
    // }
    // }

    // Write to download file array based on source index
    // Use AtomicInteger on index to ensure each task get an unique index key
    int sourceIndex;

    for (DownloadTask task : downloads) {
      sourceIndex = task.getFile().getSourceIndex();
      downloadFile[sourceIndex] = task.getFile().getData();
    }

    for (int i = 0; i < downloadSize; i++) {
      System.out.println("i= " + i + ", source=" + DemoDownload.source[i]
          + ", download=" + downloadFile[i]);
      if (DemoDownload.source[i] != downloadFile[i]) {
        System.out.println("Download Error! Data not match!");
        break;
      }
    }



  }
}


