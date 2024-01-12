package practisedownload;

public class DemoDownload {

  public static void show() {

    File file = new File();

    Runnable download = new DownloadFile(file);

    Thread thread1 = new Thread(download);
    Thread thread2 = new Thread(download);
    Thread thread3 = new Thread(download);

    thread1.start();
    thread2.start();
    thread3.start();
    
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    try {
      thread1.interrupt();
      thread2.interrupt();
      thread3.interrupt();
      thread1.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Downloaded byte: " + file.getDownloadedBytes());

  }

  public static void main(String[] args) {
    DemoDownload.show();
  }
  
}
