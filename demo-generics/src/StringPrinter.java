public class StringPrinter {

  private String x;

  public StringPrinter(String x) {
    this.x = x;
  }

  public String getX() {
    return this.x;
  }

  @Override
  public String toString() {
    return this.x;
  }

  public static void main(String[] args) {
    StringPrinter sp = new StringPrinter("hello");
    System.out.println(sp);
  }
  
}
