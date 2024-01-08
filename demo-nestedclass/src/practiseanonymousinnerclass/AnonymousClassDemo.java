public class AnonymousClassDemo {
  public static void main(String[] args) {
    Parent parent = new Parent() {
      @Override 
      public void run() {
        System.out.println("Anonymous Class method...");
      }
    };

    parent.run();
  }
}
