package practiseconfinement;

public class DownloadFile {
  
  private byte data;
  private int sourceIndex;



  public DownloadFile() {
    this.data = 0;
    this.sourceIndex = 0;
  }

  public void download() {
    this.sourceIndex = DemoDownload.getIndex().getAndIncrement();
    this.data = DemoDownload.source[this.sourceIndex];
  }


  
  public byte getData() {
    return this.data;
  }

  public int getSourceIndex() {
    return this.sourceIndex;
  } 

}