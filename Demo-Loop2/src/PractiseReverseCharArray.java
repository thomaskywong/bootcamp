import java.util.Arrays;

public class PractiseReverseCharArray {
  public static void main(String[] args) {

    String str = "abcdefg";

    // call method
    System.out.println(reverse(str));

    // test case
    System.out.println("Approach 1:");
    System.out.println(reverse(""));          // ""
    System.out.println(reverse("efg"));       // gfe
    System.out.println(reverse("abcd"));      // dcba
    System.out.println(reverse("vwxyz"));      // zyx
    System.out.println();

    // test case
    System.out.println("Approach 2:");
    System.out.println(reverse2(""));          // ""
    System.out.println(reverse2("efg"));       // gfe
    System.out.println(reverse2("abcd"));      // dcba
    System.out.println(reverse2("vwxyz"));      // zyx
    System.out.println();

    // test case
    System.out.println("Approach 3:");
    System.out.println(reverse3(""));          // ""
    System.out.println(reverse3("efg"));       // gfe
    System.out.println(reverse3("abcd"));      // dcba
    System.out.println(reverse3("vwxyz"));      // zyx
  }


  public static String reverse(String s) {

    char[] arr = s.toCharArray();
    char[] newArr = new char[s.length()];

    System.out.println("Original string: " + s);
    
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[arr.length - 1 - i];
    }

    return String.valueOf(newArr);
  }

  public static String reverse2(String s) {
    char[] arr = s.toCharArray();
    
    System.out.println("Original string: " + s);
    

    for (int i = 0; i < arr.length / 2; i++) {
      char temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i -1] = temp;
    }

    return String.valueOf(arr);
  }

  public static String reverse3(String s) {

    System.out.println("Original string: " + s);
    String s2 = "";

    for (int i = 0; i < s.length(); i++) {
      s2 = s2 + String.valueOf(s.charAt(s.length()-1-i));
    }

    return s2;
  }
}
