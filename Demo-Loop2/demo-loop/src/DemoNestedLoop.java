public class DemoNestedLoop {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) { // i = 0, 1, 2, 3, 4
      System.out.print("*");

    }
    System.out.println();

    for (int i = 0; i < 5; i++) { // i = 0, 1, 2, 3, 4 ...
      // System.out.print(" i = " + i);
      for (int j = 0; j < 5; j++) { // j = 0, 1, 2, 3 ...
        System.out.println(" i = " + i + ", j = " + j);
      }

    }
    System.out.println();

    for (int i = 0; i < 21; i++) { // i = 0, 1, 2, 3, 4...

      for (int j = 0; j < i + 1; j++) { // j = 0, 1, i
        if (!(j <= i))
          break;
        if (i % 2 == 0)
          continue;
        System.out.print(j + " ");
      }
      System.out.println();

    }

    for (int i = 0; i < 5; i++) {
      System.out.print("i = " + i);
      for (int j = 0; j < 5 + 1; j++) {
        if (i > 2 && j > 2)
          break;
        System.out.print(" j = " + j);
      }
      System.out.println();
    }

    // i < 5
    // j < 4
    // System.out.println() -> print and new line
    // System.out.print() -> print
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("i = " + i + ", j = " + j);
        System.out.println();
      }
    }

    System.out.println();
    // print **** per line
    // print 5 lines
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();

    // *****
    // ****
    // ***
    // **
    // *
    // Best practise. Avoid reverse counter.
    int length = 5;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();

    // nested loop
    // nested loop, 4 character in a row
    String string1 = "abcdefghijk";
    int index = 0;
    for (int i = 0; i < string1.length(); i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(string1.charAt(index));
        index++;
        if (!(index < string1.length()))
          break;
      }
      System.out.println();
      if (!(index < string1.length()))
        break;
    }

    System.out.println();
    // since there is no row and column concept, nested loop is not a must

    for (int i = 0; i < string1.length(); i++) {
      System.out.print(string1.charAt(i));
      if ((i + 1) % 4 == 0 && i != 0 || i == string1.length() - 1) {
        System.out.println();
      }
    }

    System.out.println();
    //
    int count = 0;
    for (int i = 0; i < string1.length(); i++) {
      System.out.print(string1.charAt(i));
      if (++count % 4 == 0 || i == string1.length() - 1) {
        System.out.println();
      }
    }

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {

      }
    }

    System.out.println();

    // two pattern example
    // *** *** *** *** *** ***
    // pattern 1: 6 groups
    // pattern 2: 3 stars per group
    for (int i = 0; i < 18; i++) {
      System.out.print("*");
      if ((i + 1) % 3 == 0) {
        System.out.print(" ");
      }
    }
    System.out.println("end");

    System.out.println();
    int len = 6;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("*");
      }
      if (i == len - 1)
        break;
      System.out.print(" ");
    }

    System.out.println("end");
    
    System.out.println();
    for (int i = 0; i < 6; i++) {
      if (i > 0)
        System.out.print(" ");

      for (int j = 0; j < 3; j++) {
        System.out.print("*");
      }

    }

    System.out.println("end");

  }

}
