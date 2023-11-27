public class DemoASCII {

  public static void main(String[] args) {
      // print ASCII code
      char ascii = 67;
      System.out.println(ascii);       // 67 -> 'C'

      int value = ascii;               // 67
      System.out.println(value == 67);      // 
      System.out.println(value == 'C');     // = value of 'C' -> true
      System.out.println(value > 65);       // true
      System.out.println(value < 65);       // false

      ascii = 48;
      System.out.println(ascii);            // 48 -> '0'
      ascii = 65;
      System.out.println(ascii);            // 65 -> 'A'
      ascii = 97;
      System.out.println(ascii);            // 97 -> 'a'

      String s1 = "abcdef";
      String s2 = "bananna";
      String s3 = "ABCDEF";
      String s4 = "acbdef";
      String s5 = "abcd";
      String s6 = "abcA";
      
      System.out.println(s2.compareTo(s1));       // b = 98, a = 97, returns b - a = 1
      System.out.println(s1.compareTo(s2));       // a = 97, b = 98, returns -1
      System.out.println(s3.compareTo(s1));       // A = 65, a = 97, returns 65 - 97 = -32
      System.out.println(s4.compareTo(s1));       // a = 97, a = 97, first character 'a' are the same. compare the second character
                                                  // c = 99, b = 98, second character returns 99 - 98 = 1
      
      System.out.println(s5.compareTo(s1));       // s5 is the substring(0) of s1, so compare the length.
                                                  // s5.length() = 4, and s1.length() = 6, so 4 - 6 -> -2
      System.out.println(s6.compareTo(s1));       // only the 4th character is different. A = 65, d = 100, 65 - 100 -> -35                                            
      
      System.out.println();
      char c1 = 0;
      for (int i = 0; i < 96; ++i) {
        c1 = (char) (i + 32);
        System.out.print(c1 + " ");
      }
  }
  
}
