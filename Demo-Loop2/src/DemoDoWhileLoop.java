public class DemoDoWhileLoop {

  public static void main(String[] args) {
    
    int j = 0;


    // do while loop. execute at least once
    do {
      System.out.println("Do-While Loop");
    } while (j < 0);
    
    // Exercise
    j = 0;
    while (++j < 5) {
      System.out.println("While Loop: j = " + j);
    }
    System.out.println();

    j = 0;
    do {
      System.out.println("Do-While Loop: j = " + (j+1) );
    } while (++j < 4);


    // j = 1
    // j = 2
    // j = 3
    // j = 4
    System.out.println();
    j = 0;
    do {
      System.out.println("Do-While Loop: j = " + ++j );
    } while (j < 4);

  }
  
}
