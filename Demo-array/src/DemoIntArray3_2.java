import java.util.Arrays;

public class DemoIntArray3_2 {

  public static void main(String[] args) {

    // Approach 1
    String s = "abcabcabcabcabc";
    char[] arr5 = new char[s.length()]; // create an array with its size the same as the length of the string

    for (int i = 0; i < s.length(); i++) // use for-loop to assign each letter into the array one-by-by
      arr5[i] = s.charAt(i);

    System.out.println(s);
    System.out.println(Arrays.toString(arr5));

    // Approach 2
    char[] arr6 = s.toCharArray();

    System.out.println(Arrays.toString(arr6));

    // replace a -> c in String
    char[] arr7 = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        arr7[i] = 'c';
      } else {
        arr7[i] = s.charAt(i);
      }
    }
    System.out.println(Arrays.toString(arr7));

    String s2 = ""; // Declare an empty string
    for (int i = 0; i < arr7.length; i++){ // concatenate each elecment of char array into string
    s2 += arr7[i];
    }


    System.out.println(s2);

    // String.valueOf(xxx)
    // Array to String method
    String s3 = String.valueOf(arr7);
    System.out.println(s3);

    System.out.println(String.valueOf(1));
    System.out.println(String.valueOf(1.0d));
    System.out.println(String.valueOf(1.0f));
    System.out.println(String.valueOf(1L));
    System.out.println(String.valueOf(new char[] {'a', 'b'}));  // ab
    System.out.println(String.valueOf((byte) 127));
    System.out.println(String.valueOf(new int[] {1, 2, 3}));    // NOT OK. return address

    // .replace('x', 'y')
    // replace character 'x' by 'y'

    System.out.println();
    System.out.println(s2);
    String s5 = s2.replace('c', 'x');     // replace 'c' by 'x' in string
    System.out.println(s5);

    String s6 = s2.replace("cb", "abcb");   // replace "cb" by "abcb" in string
    System.out.println(s6);


  }

}

