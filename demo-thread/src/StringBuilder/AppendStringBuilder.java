package StringBuilder;

public class AppendStringBuilder implements Runnable{

  StringBuilder stringBuilder;

  public AppendStringBuilder(StringBuilder stringBuilder) {
    this.stringBuilder = stringBuilder;
  }

  @Override
  public void run() {
    //
    for (int i = 0; i < 10_000; i++) {
      this.stringBuilder.append("x");
    }
  }
  
}
