package practisesynchronized;

import java.util.ArrayList;
import java.util.List;

public class DownloadFile {

  private List<Byte> downloadedData;
  private volatile int index;

  Object downloadLock = new Object();
  Object getIndexLock = new Object();

  public DownloadFile() {
    this.downloadedData = new ArrayList<>();
    this.index = 0;
  }

  // public synchronized void download() {
  // if (index < DemoDownload2.fileSize)
  // downloadedData.add(DemoDownload2.source.get(index++));
  // }

  // public synchronized int getIndex() {
  // return this.index;
  // }

  public void download() {
    synchronized (downloadLock) {
      if (index < DemoDownload2.fileSize)
        downloadedData.add(DemoDownload2.source.get(index++));
    }
  }

  public int getIndex() {
    int index;
    synchronized (getIndexLock) {
      index = this.index;
    }
    return index;
  }

  public List<Byte> getDownloadedData() {
    return this.downloadedData;
  }


}
