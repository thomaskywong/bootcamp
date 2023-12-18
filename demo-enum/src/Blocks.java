public class Blocks {

  private static String str = "Original value";

  private int value = 10;

  // static block
  // initialize static variables before main()
  static{
    System.out.println("1. Start of Static Block, " + str);
    str = "New value";
    System.out.println("2. End of Static Block, " + str);
  }

  // instance block
  {
    System.out.println("4. Start of instance Block, " + value);
    this.value = 20;
    System.out.println("5. End of Static Block, " + value);
  }

  public static void main(String[] args) {
    Blocks b1 = new Blocks();
  }
  
}
