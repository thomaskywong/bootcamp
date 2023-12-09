public class PractiseStringBuilder {

  public static void main(String[] args) {

    StringBuilder str = new StringBuilder("");

    // Concatenating Numbers
    for (int i = 0; i < 10; i++) {
      str.append(String.valueOf(i)).append(" ");
    }
    System.out.println(str.toString());

    StringBuilder str2 = new StringBuilder("Hello World!");

    // insert " Little" at index 5
    str2.insert(5, " Little");
    System.out.println(str2.toString()); // Hello Little World!

    str2.delete(12, 18); // remove string from index 12 up to 17 (before index 18)
    System.out.println(str2.toString()); // Hello Little!

    System.out.println(str2.charAt(4)); // displace str2's index 4 character 'o'

    str2.deleteCharAt(0); // remove str character at index 0
    System.out.println(str2.toString()); // ello Little!

    str2.insert(0, "H");
    System.out.println(str2.toString()); // Hello Little!

    str2.setCharAt(12, '?');
    System.out.println(str2.toString()); // Hello Little?

    str2.replace(6, 13, "World!"); // replace StringBuilder from index 6 up to index 12 (before index 13)
    System.out.println(str2.toString()); // Hello

    StringBuilder str3 = new StringBuilder("Hello"); // reverse str3 order
    str3.reverse(); // olleH
    System.out.println(str3);

    System.out.println(str3.length()); // length of str3 = 5

    System.out.println(str3.substring(1)); // substring from index 1 to the end - olleH
    System.out.println(str3.substring(1, 3)); // substring from index 1 up to index 2 (before index 3)

    // StringBuilder str5 = StringBuilder.valueOf("xxx"); //StringBuilder.valueOf("xx") does not exist
    // System.out.println(str5.toString());


    // .equals (DO NOT USE equals to for comparison. Use .compareTo)
    StringBuilder str5 = new StringBuilder("abc");
    StringBuilder str6 = new StringBuilder("abc");

    System.out.println(str5.equals(str6)); // false, since compare address

    // .compareTo()
    System.out.println(str5.compareTo(str6) == 0); // true

  }


}
