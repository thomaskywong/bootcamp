package StringBuilder;

public class AppendStringBuffer implements Runnable {

  StringBuffer stringBuffer;

  public AppendStringBuffer(StringBuffer stringBuffer) {
    this.stringBuffer = stringBuffer;
  }

  @Override
  public void run() {
    //
    for (int i = 0; i < 10_000; i++) {
      this.stringBuffer.append("x");
    }

 
  }
  
  
}
