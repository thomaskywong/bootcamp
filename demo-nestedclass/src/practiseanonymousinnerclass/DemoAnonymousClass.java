public class DemoAnonymousClass {

  public static void main(String[] args) {
    int count1 = 0;
    // Actions interface
    Actions task1 = new Actions() {

      int count2 = 0;

      public void read() {
        System.out.println("Count=" + count2);
      }

      public void run() {
        // count1 += 10; // cannot access outside variable!
        count2++;
      }

    };

    task1.run();
    task1.run();

    task1.read();

  }

}
