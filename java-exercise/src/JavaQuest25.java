/*
 * Question : Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 * 
*/
public class JavaQuest25 {
  public static void main(String[] args) {
    System.out.println(countWords("       ")); // 0
    System.out.println(countWords("")); // 0
    System.out.println(countWords("Hello")); // 1
    System.out.println(countWords("Hello, my name is John."));// 5
    System.out.println(countWords(" . "));// 1

  }

  public static int countWords(String s) {
    // code here ...
    if (s.isBlank()) {
      return 0;
    }

    s = s.trim();
    String[] result = s.split(" ");

    int count = 0;
    for (int i = 0; i < result.length; i++ ) {
      if (result[i].isEmpty()) {
        continue;
      }
      count++;
    }

    return count;
  }
}
