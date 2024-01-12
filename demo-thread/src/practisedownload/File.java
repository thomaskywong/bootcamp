package practisedownload;

import java.util.concurrent.atomic.AtomicInteger;

public class File {

  private AtomicInteger downloadedBytes;


  public File() {
    this.downloadedBytes = new AtomicInteger(0);
  }

  public int getDownloadedBytes() {
    return downloadedBytes.get();
  }  
  
  
  public void download() {
    
    this.downloadedBytes.incrementAndGet();

  }

}
