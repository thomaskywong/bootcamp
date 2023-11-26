public class PractiseNextedForLoop {
  public static void main(String[] args) {
    int max = 10;
    int location = 0;
    boolean isForward = true;

    for (int i = 0; i < 2 * max - 1; i++) {
      System.out.print("|");
      for (int j = 0; j < max; j++) {
        if (j == location) {
          System.out.print("@");
        } else
          System.out.print("*");
      }
      if (isForward)
        location++;
      else 
        location--;
      
      if (isForward == true && location == max - 1){
        isForward = false;
      } else if (isForward == false && location == 0) {
        isForward = true;
      }
      System.out.print("|");
      System.out.println();
    }
    // if (isForward == true && location == max) {
    // System.out.println();
    // isForward = false;
    // }
    // else if (isForward == false && location == 0) {
    // System.out.println();
    // isForward = true;
    // }
    // if (isForward == true)
    // location++;
    // else
    // location--;
    // }

  }
}
