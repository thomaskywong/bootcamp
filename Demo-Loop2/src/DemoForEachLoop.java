import java.util.Arrays;

public class DemoForEachLoop {

  public static void main(String[] args) {

    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer integer : integers) {
      System.out.println("integer = " + integer);
      integer = integer * -1;
      System.out.println("integer * -1 = " + integer);
      System.out.println();

    }
    System.out.println(Arrays.toString(integers));

    // System.out.println();
    // for (int j = 0; j < integers.length; j++) {
    // System.out.println("integers[j] = " + integers[j]);
    // }

    System.out.println();

    String str = "abc,def,ijk,xyz";
    String[] arr = str.split(",");

    System.out.println(str);
    System.out.println(Arrays.toString(arr));
    for (String token : arr) {
      System.out.println("token = " + token);
    }
    System.out.println();

    String str2 = "abcdefghijk";
    // obtain char array
    // String that contains char with odd value -> finalString
    System.out.println("Approach 1:");
    System.out.println(getOddIdx1(str2));
    
    

    // Approach 2:
    // use .charAt(), .concat()
    String str3 = "abcdefghijk";
    System.out.println("Approach 2:");
    // System.out.println(getEvenIdx(str3));
    System.out.println(getOddIdx(str3));
  }

  public static String getOddIdx1(String s) {

    char[] cArr = s.toCharArray();
    int newLength =
        cArr.length % 2 == 0 ? cArr.length / 2 : cArr.length / 2 + 1;
    char[] finalArray = new char[newLength];

    int index = 0;

    for (int i = 0; i < cArr.length; i++) {
      if (cArr[i] % 2 == 1) {
        finalArray[index++] = cArr[i];
      }
    }

    return String.valueOf(finalArray);

  }

  public static String getEvenIdx(String s) {
    String string = "";
    for (int i = 0; i < s.length(); i++) {
      int ascii = s.charAt(i);
      if (ascii % 2 == 0) {
        string = string + String.valueOf(s.charAt(i));
      }
    }
    return string;
  }

  public static String getOddIdx(String s) {
    String string = "";
    for (int i = 0; i < s.length(); i++) {
      int ascii = s.charAt(i);
      if (ascii % 2 == 1) {
        string = string + String.valueOf(s.charAt(i));
      }
    }
    return string;
  }

}
