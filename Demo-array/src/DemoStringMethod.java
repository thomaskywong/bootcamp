public class DemoStringMethod {
  public static void main(String[] args) {
    String str = "hello world!";
    
    // check if the string is empty
    // .isEmpty()
    if (str.isEmpty()){
      System.out.println("The string is empty.");
    } else {
      System.out.println("The string: " + str);
    }
    
    // check the length of the string
    // .length()
    System.out.println("The length is " + str.length());

    // print even index of the string
    // .charAt(i) 
    // return character from string at index i
    for (int i = 0; i < str.length(); ++i){
      if ( i % 2 == 0)
        System.out.println("index = " + i + ", " +str.charAt(i));
    }

    // extract partial string from original string
    // .substring(i, j)
    // returns string "starts from" index i , "ends before" index j or "ends at j-1"
    String str2 = "";
    System.out.println("str = " + str);
    System.out.println("str.substring(2, 5);");
    System.out.println("Extract string starts from index 2, ends at index 5-1 = 4");
    str2 = str.substring(2, 5);   // substring starts from index 2, ends at index 5-1 = 4
    System.out.println(str2);      
    System.out.println();
    System.out.println("str.substring(0)");
    System.out.println(str.substring(0));     // .substring(0) means whole string
    System.err.println();

    //.trim()   return string with white space being 'trimmed' at the beginning and the end
    str = "   Hello World!   ";

    System.out.println("str = " + str);
    System.out.println("str2 = str.trim()");
    str2 = str.trim();
    System.out.println("str2 = " + str2);
    System.out.println();

    // .toUpperCase()
    // capitalize all letters
    String str1 = "hellO WOrld!";
    System.out.println("str1 = " + str1);
    System.out.println("str2 = str1.toUpperCase();");
    str2 = str1.toUpperCase();
    System.out.println("str2 = " + str2);
    System.out.println();

    // .toLowerCase()
    // lower case all letters
    str1 = "hellO WOrld!";
    System.out.println("str1 = " + str1);
    System.out.println("str2 = str1.toLowerCase();");
    str2 = str1.toLowerCase();
    System.out.println("str2 = " + str2);
    System.out.println();

    // .equals("xxx")
    // .equalsIgnoreCase("xxx")
    String str3 = "hello WORLD";
    System.out.println("str3 = " + str3);
    System.out.print("\"hello world\".equals(str3)   ->  ");
    System.out.println("hello world".equals(str3));

    System.out.print("\"hello world\".equalsIgnoreCase(str3)   ->");
    System.out.println("hello world".equalsIgnoreCase(str3));
    System.out.println();
    
    String str4 = "This is Thomas";
    System.out.println("hello world".equals(str4));
    System.out.println();

    // .startsWith("xxx")
    // check if the string starts with the given string
    System.out.println(str2);
    System.out.print("str2.startsWith(\"HELLO\")   ->   ");
    System.out.println(str2.startsWith("HELLO"));
    System.out.print("str2.startsWith(\"Hello\")  ->   ");
    System.out.println(str2.startsWith("Hello"));
    System.out.print("str2.startsWith(\"\")   ->   ");
    System.out.println(str2.startsWith(""));    // str2 starts from empty string

    // .endsWith("xxx")
    // check if the string ends with the given string
    System.out.println(str2);
    System.out.print("str2.endsWith(\"world!\")   ->   ");
    System.out.println(str2.endsWith("world!"));
    System.out.print("str2.endsWith(\"RLD!\")  ->   ");
    System.out.println(str2.endsWith("RLD!"));
    System.out.print("str2.endsWith(\"\")   ->   ");
    System.out.println(str2.endsWith(""));    // str2 ends with empty string
    System.out.println();
    
    // exercise
    String s3 = "1234567890";
    
    // try 2 String methods, and use &7 operator to check true / false
    // return true
    System.out.println(s3.endsWith("7890") && s3.startsWith("123"));
    System.out.println(s3.length() == 10 && "1234567890".equals(s3));
    
    // check charAt of the last index .length() - 1
    System.out.println("56".equals(s3.substring(4,6)) && s3.charAt(s3.length()-1) == '0');      
    System.out.println();

    // indexOf()
    System.out.println("s3 = " + s3);
    System.out.print("s3.indexOf('7')   ->  ");
    System.out.println(s3.indexOf('7'));      // what is the index of char '7'
    System.out.println();

    System.out.print("s3.indexOf('n')   ->  ");
    System.out.println(s3.indexOf('n'));      // return -1 if the char does not exist!
    System.out.println("Return -1 if the char or string does not exist.");
    System.out.println();

    System.out.println("s3 = \"" + s3 + "\"");
    System.out.println("s3.indexOf('7', 8)");
    System.out.println("Check if the char '7' can be found from index 8 (9th element)");
    System.out.print("s3.indexOf('7', 8)  ->   ");
    System.out.println(s3.indexOf('7', 8));   // check if char '7' exists in string starting from index 8
    System.out.println();

    System.out.println("s3 = \"" + s3 + "\"");
    System.out.println("Check if the char '7' can be found from index 6 (7th element)");
    System.out.print("s3.indexOf('7', 6)  ->   ");
    System.out.println(s3.indexOf('7', 6));   // check if char '7' exists in string starting from index 6
    System.out.println();

    // lastIndexOf('x')
    System.out.println(s3);
    System.out.println(s3.lastIndexOf('9'));    // return the index of the last occurance of '9'

    System.out.println(s3.lastIndexOf('h'));    // return the index of the last occurance of 'h'.
                                                // return -1 if not found

    // indexOf("xxx")
    System.out.println(s3);
    System.out.println(s3.indexOf("456"));    // return the index of the first occurance of "456"

    System.out.println(s3.indexOf("hello"));    // return the index of the first occurance of "hello".
     
    // lastIndexOf("xxx")
    System.out.println(s3);
    System.out.println(s3.lastIndexOf("456"));    // return the index of the last occurance of "456"

    System.out.println(s3.lastIndexOf("hello"));    // return the index of the last occurance of "hello".
  
    // lastIndexOf("xxx", index)
    System.out.println(s3.lastIndexOf("456", 5));    // return the index of the last occurance of "456" by READING BACKWORD from index 5 re
    System.out.println(s3.lastIndexOf("456", 3));    // return the index of the last occurance of "456" by READING BACKWORD from index 5 re
    System.out.println(s3.lastIndexOf("456", 2));    // return the index of the last occurance of "456" by READING BACKWORD from index 5 re
    System.out.println();

    String s5 = "ABabcxabcdef";
    System.out.println("s5 = \"" + s5 + "\"");
    System.out.println("s5.lastIndexOf(\"abc\") == 6");
    System.out.println("&& s5.endsWith(\"def\")");
    System.out.println("&& s5.indexOf(\"abc\") == 2");
    System.out.println("&& s5.startsWith(\"ABa\")");
    System.out.println("&& 5.length() > 10");
    System.out.println(s5.lastIndexOf("abc") == 6 
      && s5.endsWith("def")
      && s5.indexOf("abc") == 2
      && s5.startsWith("ABa")
      && s5.length() > 10 );        // return true
    System.out.println();

  // .concat(String2)
  // concatenate 2 strings
  String s6 = "abc";
  String s7 = "def";
  String s8 = s6.concat(s7);
  System.out.println(s8);
  System.out.println();

  // .contains("xxx")
  // check if the string contains "xxx"
  System.out.println("abcdef");
  System.out.print("s8.contains(\"bcd\")   -> ");
  System.out.println(s8.contains("bcd"));     // true
  System.out.print("s8.contains(\"bca\")   -> ");
  System.out.println(s8.contains("bca"));     // false

  String result = s5.toUpperCase();
  System.out.println(result);
  System.out.println("ABABCXABCDEF");
  String result2 = result.substring(3, 5);     // from index 3 to index 4, returns
  System.out.println(result2);                 // returns BC
  System.out.println();

  // Chain methods - call series of methods in chain
  System.out.println(s5.toUpperCase().substring(3,5));    // returns BC
  System.out.println();

  System.out.println(s5.toUpperCase().concat("@@@"));
  System.out.println(s5.toUpperCase().contains("XABC"));
  System.out.println(s5.concat("XXX"));
  System.out.println(s5.concat("XXX").substring(3,7));

  System.out.println(s5);
  System.out.println(s5.toUpperCase().substring(1,2).concat("ijk"));



  }  
}
