public class PractiseASCII {

  public static void main(String[] args) {

    // Important ASCII values:
    // '0' = 48; '9' = 57; '9' - '0' = 9
    // 'A' = 65; 'Z' = 90; 'Z' - 'A' = 25; 'A' - 'a' = -32
    // 'a' = 97; 'z' = 122; 'z' - 'a' = 25; 'a' - 'A' = 32
    // char on keyboard ASCII 0 - 127 (0000_0000 to 0111_1111)
    // total ASCII value 0 - 65535 (16 bits)

    int ascii = 65;
    char c1 = (char) ascii;
    System.out.println(c1); // 'A'

    int int1 = 'a'; // auto cast
    System.out.println(int1); // 97

    int int2 = 'a' + 25;
    System.out.println(int2); // 'a' + 25 = 122
    char c2 = (char) int2; // 'z'
    System.out.println(c2);

    // .compareTo() method on wrapper class
    // <, <=, ==, =>, >, != on primitive char
    // return the difference value between two chars
    // ASCII 'A' = 65, ASCII 'b' = 98, so 'A' < 'b'
    char char1 = 'z';
    char char2 = 'b';
    char char3 = 'A';

    if (char1 == char3) {
      System.out.println(char1 + " is the same as " + char2);
    } else if (char1 < char3) {
      System.out.println(char1 + " comes before " + char2);
    } else {
      System.out.println(char1 + " comes after " + char2);
    }
    System.out.println();

    // auto box
    Character c4 = 'A';
    Character c5 = 'Z';
    Character c6 = 'a';

    if (c4.compareTo(c5) == 0) {
      System.out.println(c4 + " is the same as " + c5);
    } else if (c4.compareTo(c5) < 0) {
      System.out.println(c4 + " comes before " + c5);
    } else {
      System.out.println(c4 + " comes after " + c5);
    }


    if (c4.equals(c5))
      System.out.println("Two chars are the same.");
    else
      System.out.println("Two chars are different");

  }

}


