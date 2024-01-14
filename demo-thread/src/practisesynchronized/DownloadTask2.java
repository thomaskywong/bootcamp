package practisesynchronized;

public class DownloadTask2 implements Runnable {

  DownloadFile downloadFile;

  public DownloadTask2(DownloadFile downloadFile) {
    this.downloadFile = downloadFile;
  }

  @Override
  public void run() {
    int downloadedByte = downloadFile.getIndex();
    while (downloadedByte < DemoDownload2.fileSize) {
      // System.out.println("Downloaded Byte=" + downloadedByte);
      downloadFile.download();
      downloadedByte = downloadFile.getIndex();
    }
  } 
}
