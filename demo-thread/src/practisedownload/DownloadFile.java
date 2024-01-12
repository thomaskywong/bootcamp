package practisedownload;

public class DownloadFile implements Runnable {

  File file;

  public DownloadFile(File file) {
    this.file = file;
  }

  @Override
  public void run() {

    System.out.println(Thread.currentThread().getName() + ": Download starts.");

    for (int i = 0; i < 100_000; i++) {
      if (Thread.currentThread().isInterrupted()) {
        System.out.println("Download interruped.");
        return;
      }
 
      this.file.download();
      System.out.println("Downloaded Byte: " + this.file.getDownloadedBytes());
    }

    System.out.println(Thread.currentThread().getName() + ": Download completed.");

  }

}
