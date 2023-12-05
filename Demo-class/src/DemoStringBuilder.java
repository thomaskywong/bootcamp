public class DemoStringBuilder {

  public static void main(String[] args) {


    // concat +=, .concat()
    // create new object literal
    String x = "abc";
    x += "def";
    x = x.concat("def");
    System.out.println(x);

    // StringBuilder. Class that contains String attribe
    // pass by reference
    StringBuilder y = new StringBuilder("abc");
    y.append("def").append("ghi");
    System.out.println(y.toString());

    // while loop -> counter
    // 123 456 789 1011112
    // use append
    // String s = "123 456 789 1011112";
    StringBuilder nums = new StringBuilder(""); // ""
    System.out.println(String.valueOf(nums));

    int counter = 5;
    int num = 0;

    while (counter-- > 0) {
      for (int i = 0; i < 3; i++) {
        nums.append(++num);
        System.out.println(nums.toString());
      }

      if (counter > 0)
        nums.append(" ");

    }

    System.out.println(nums.toString() + "end");

    /// aaa bbb ccc
    StringBuilder chars = new StringBuilder("");
    counter = 5;
    char count = 'a';
    while (counter-- > 0) {

      for (int i = 0; i < 3; i++) {
        chars.append(count);
        System.out.println(chars.toString());
      }
      count++;

      if (counter > 0)
        chars.append(" ");

    }

    System.out.println(chars.toString());

    System.out.println(chars.reverse().toString()); // reverse the StringBuilder
    System.out.println(chars.toString());

    System.out.println(chars.insert(4, "bootcamp").toString()); // insert given string at the given index
    System.out.println(chars.delete(0, 6).toString()); // delete String from startIndex to endIndex

    System.out.println(chars.replace(0, 6, "aaa ").toString()); // replace string from startIndex to up beforeIndex (exclusive)

    System.out.println();


    // .toString()
    StringBuilder s = new StringBuilder("abc");
    String str01 = s.toString();
    System.out.println(str01);
    System.out.println();

    // .equals() . use toString() to convert to String
    System.out.println(".equals()");
    StringBuilder s1 = new StringBuilder("abc");
    StringBuilder s2 = new StringBuilder("abc");
    System.out.println(s1.equals(s2)); // false. compare address
    System.out.println(s1.toString().equals(s2.toString())); // true
    System.out.println();

    // .compareTo()
    System.out.println(".compareTo()");
    System.out.println(s1.compareTo(s2) == 0); // true

    // Remark:
    // == operator, same as .equals()
    System.out.println(s1 == s2); // false. Since 2 different objects
    System.out.println();

    // .isEmpty()
    System.out.println("s1: " + s1.toString());
    System.out.println("s1.isEmpty()");
    System.out.println(s1.isEmpty()); // false
    System.out.println();
    
    // .charAt()
    System.out.println(".charAt()");
    System.out.println(s1.charAt(1)); // s1 is "abc", s1.charAt(1) = 'b'


    // StringBuilder str = new StringBuilder("");

    // str.append('H').append("ello");
    // System.out.println(str);


  }
}
