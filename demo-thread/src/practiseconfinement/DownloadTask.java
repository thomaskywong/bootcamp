package src.practiseconfinement;

public class DownloadTask implements Runnable {

  private DownloadFile file;

  public DownloadTask(DownloadFile file) {
    this.file = file;
  }

  @Override
  public void run() {
    this.file.download();   
  }

  public DownloadFile getFile() {
    return this.file;
  }

}
