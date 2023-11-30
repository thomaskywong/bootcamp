import java.util.Arrays;
import javax.swing.event.SwingPropertyChangeSupport;

public class PractiseStringMethod2 {

  public static void main(String[] args) {

    // .toCharArray()
    // converts a string into a char array
    // return a char array
    String s1 = String.valueOf("abcabcabcabc");
    char[] charArr = s1.toCharArray();
    System.out.println(s1);
    System.out.println("char[] arr = str.toCharArray()");
    System.out.println("arr = " + Arrays.toString(charArr));
    System.out.println();
    
    // .split(",")
    // Split a string, obtain tokens separated by ","
    // return a String array
    String s2 = String.valueOf("abc,def,ghi,jkl,mn");
    String[] stringArr2 = s2.split(",");
    System.out.println("str = " + s2);
    System.out.println("str.split(\",\")");
    System.out.println(Arrays.toString(stringArr2));

    // for each loop to show each element of array
    for (String str1 : stringArr2) {
      System.out.print(str1 + " ");
    }
    System.out.println();
    System.out.println();

    // .length()
    // returns int the length of the string
    String str2 = "Thomas";
    System.out.println("str = " + str2);
    System.out.println("str.length() = " + str2.length());
    System.out.println();

    // .charAt(i)
    // return character at the index i char of the string
    int index = 3;
    System.out.println("str = " + str2);
    System.out.println("index = " + index);
    System.out.println("str.charAt(index) = " + str2.charAt(index));
    System.out.println();

    // .isEmpty()
    // return boolean value if the string is an empty string
    String str3 = "";
    String str4 = " ";
    System.out.println("str = \"" + str3 + "\"");
    System.out.println("str.isEmpty() = " + str3.isEmpty());      // true
    System.out.println("str = \"" + str4 + "\"");
    System.out.println("str.isEmpty() = " + str4.isEmpty());      // false
    System.out.println();   

    // .isBlank()   
    // return boolean value if the string is an empty string
    str3 = "";
    str4 = " ";
    String str5 = "_";
    System.out.println("str = \"" + str3 + "\"");
    System.out.println("str.isBlank() = " + str3.isBlank());    // true
    System.out.println("str = \"" + str4 + "\"");
    System.out.println("str.isBlank() = " + str4.isBlank());    // true
    System.out.println("str = \"" + str5 + "\"");
    System.out.println("str.isBlank() = " + str5.isBlank());    // false
    System.out.println();  

    // .substring(startindex i)
    // extract a substring of the string starting from index i
    // return substring
    // for (int index = i; index < str.length(); index++ ) {
    String str6 = "Hello World";
    index = 6;
    String str7 = str6.substring(index);
    System.out.println("str = " + str6);
    System.out.println("startIndex = " + index);
    System.out.println("str.substring(startIndex) = " + str7);
    System.out.println();

    // .substring(startindex i, endindex j)
    // extract a substring of the string starting from index i to index j - 1
    // return substring
    // for (int index = i; index < j; index++ ) {
    String str8 = "This is Thomas.";
    int startIndex = 2;
    int endIndex = 10;
    String str9 = str8.substring(startIndex, endIndex);
    System.out.println("str = " + str8);
    System.out.println("startIndex = " + startIndex);
    System.out.println("endIndex = " + endIndex);
    System.out.println("str.substring(startIndex, endIndex) = " + str9);
    System.out.println();

    // .toLowerCase()
    // return string with all letter in lower case
    String str10 = "THIS is Thomas.";
    String str11 = str10.toLowerCase();
    System.out.println("str = " + str10);
    System.out.println("str.toLowerCase() = " + str11);
    System.out.println();

    // .toUpperCase();
    // return string with all letter in upper case
    str10 = "THIS is Thomas.";
    String str12 = str10.toUpperCase();
    System.out.println("str = " + str10);
    System.out.println("str.toUpperCase() = " + str12);
    System.out.println();

    // .replace(char x, char y)
    // replace char x by char y, 
    // return new String
    str10 = "This is Thomas.";
    char x = 'i';
    char y = 'o';
    String str13 = str10.replace(x, y);
    System.out.println("str = " + str10);
    System.out.println("str.replace('"+ x +"', '" + y + "');" );
    System.out.println(str13);
    System.out.println();

    String s3 = "Thomas";
    String s4 = "Constantine";
    System.out.println("str = " + str10);
    String str14 = str10.replace(s3, s4);
    System.out.println("str.replace(\""+ s3 +"\", \"" + s4 + "\");" );
    System.out.println(str14);
    System.out.println();

    // .contains(String s)
    // return boolean
    str10 = "This is Thomas.";
    String sContain1 = "is";
    String sContain2 = "was";
    System.out.println("str = " + str10);
    System.out.print("str.contains(\""+ sContain1 + "\") -> ");   //true
    System.out.println(str10.contains(sContain1));
    System.out.print("str.contains(\""+ sContain2 + "\") -> ");   // false
    System.out.println(str10.contains(sContain2));
    System.out.println();

    // .endsWith(String postfix)
    // return boolean 
    str10 = "This is Thomas.";
    String postfix1 = "Thomas";
    String postfix2 = "Thomas.";
    System.out.println("str = " + str10);
    System.out.print("str.endsWith(\""+ postfix1 + "\") -> ");   //false
    System.out.println(str10.endsWith(postfix1));
    System.out.print("str.endsWith(\""+ postfix2 + "\") -> ");   //true
    System.out.println(str10.endsWith(postfix2));
    System.out.println();

    // .startsWith(String prefix)
    // return boolean
    str10 = "This is Thomas.";
    String prefix1 = "This";
    String prefix2 = "That";
    System.out.println("str = " + str10);
    System.out.print("str.starsWith(\""+ prefix1 + "\") -> ");   //true
    System.out.println(str10.startsWith(prefix1));
    System.out.print("str.startsWith(\""+ prefix2 + "\") -> ");   //false
    System.out.println(str10.startsWith(prefix2));
    System.out.println();

    // .trim()
    str10 = "     This is Thomas.";
    System.out.println("str = " + str10);
    String str15 = str10.trim();
    System.out.println("str.trim()");
    System.out.println(str15);
    System.out.println();

    // .equals(String s)
    // return true of 2 strings are identical. return false otherwise
    str10 = "This is Thomas.";
    str11 = "This is Thomas.";
    str12 = "This is Tommy";
    System.out.println("str = " + str10);
    System.out.print("\"This Is Thomas.\".equals(str) -> ");
    System.out.println("This is Thomas.".equals(str10));
    System.out.println("str2 = " + str11);
    System.out.println("str2.equals(str) -> " + str11.equals(str10));
    System.out.println("str3 = " + str12);
    System.out.println("str3.equals(str) -> " + str12.equals(str10));
    System.out.println();

    // .equalsIgnoreCase(String s)
    str10 = "Thomas";
    str11 = "THOMAS";
    str12 = "thomas";
    System.out.println("str = " + str10);
    System.out.println("str2 = " + str11);
    System.out.println("str3 = " + str12);
    System.out.println("\"THOMAS\".equalsIgnoreCase(\"Thomas\"); -> " + "Thomas".equalsIgnoreCase("Thomas"));
    System.out.println("\"thomas\".equalsIgnoreCase(\"THOMAS\"); -> " + "thomas".equalsIgnoreCase("THOMAS"));
    System.out.println("str3.equalsIgnoreCase(str) -> " + str12.equalsIgnoreCase(str10));


    // .indexOf(char c)
    // .indexOf(int ascii)
    // return number of index if found. 
    // return -1 if not found.
    char c1 = 'o';
    char c2 = 'W';
    int ascii1 = 98;      // 'b'
    String str = "Thomas.";
    System.out.println("str = " + str);
    System.out.println("str.indexOf('" + c1 + "'); -> " + str.indexOf(c1));   // 2
    System.out.println("str.indexOf('" + c2 + "'); -> " + str.indexOf(c2));   // -1
    System.out.println("ascii = " + ascii1 + ", (char) ascii = " + (char) ascii1);
    System.out.println("str.indexOf(" + ascii1 + "); -> " + str.indexOf(ascii1));   // -1

    // .indexOf(String s)
    // return index of target string. return -1 if not found.
    // return number of startIndex if found.
    // return -1 if not found.
    str = "Thomas";
    String testString = "mas";
    System.out.println("str = " + str);
    System.out.println("testString = " + testString);
    System.out.println("str.indexOf(\"oma\") -> " + str.indexOf("oma") );           // return 2
    System.out.println("str.indexOf(\"xxx\") -> " + str.indexOf("xxx") );           // return -1, not found
    System.out.println("str.indexOf(testString) -> " + str.indexOf(testString) );   // return 3
    System.out.println();

   
    // .lastIndexOf(char c)
    // return the index of the last occurance of target string
    // return -1 if not found
    c1 = 'o';
    c2 = 'C';
    str = "Thomas Wong.";
    System.out.println("str = " + str);
    System.out.println("str.lastIndexOf('" + c1 + "'); -> " + str.lastIndexOf(c1));   // 8
    System.out.println("str.lastIndexOf('" + c2 + "'); -> " + str.lastIndexOf(c2));   // -1
    
    // .lastIndexOf(char c, int upToIndex)
    c1 = 'o';
    c2 = 'C';
    int upToIndex = 7;
    int upToIndex2 = 9;
    int upToIndex3 = 2;
    str = "Thomas Wong.";
    System.out.println("str = " + str);
    System.out.println("str.lastIndexOf('" + c1 + "', " + upToIndex + "); -> " + str.lastIndexOf(c1, upToIndex));     // 2
    System.out.println("str.lastIndexOf('" + c1 + "', " + upToIndex2 + "); -> " + str.lastIndexOf(c1, upToIndex2));   // 8
    System.out.println("str.lastIndexOf('" + c1 + "', " + upToIndex3 + "); -> " + str.lastIndexOf(c1, upToIndex3));   // 8
    
    
    // .lastIndexOf(String s)
    // .LastIndexOf(String s, int upToIndex)

    // .concat(String s)

    // .compareTo(String s)
    
    // String.valueOf( xxx )
    // Assign xxx to string
    // xxx can be any primitive types, wrapper class object or String
    Integer int0 = Integer.valueOf(15);
    String string0 = String.valueOf(int0);
    // System.out.println(string0);

    




  }
  
}
